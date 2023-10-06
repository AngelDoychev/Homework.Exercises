-- Exercise 1
DELIMITER ###
CREATE PROCEDURE `usp_get_employees_salary_above_35000` ()
BEGIN
SELECT first_name, last_name FROM employees
WHERE salary > 35000
ORDER BY first_name, last_name, employee_id;
END ###
DELIMITER ;
CALL usp_get_employees_salary_above_35000;

-- Exercise 2
DELIMITER ###
CREATE PROCEDURE `usp_get_employees_salary_above`(given_salary DECIMAL(18, 4))
BEGIN
SELECT first_name, last_name FROM employees
WHERE salary >= given_salary
ORDER BY first_name, last_name, employee_id;
END ###
DELIMITER ;
CALL usp_get_employees_salary_above(45000);

-- Exercise 3
DELIMITER ###
CREATE PROCEDURE `usp_get_towns_starting_with`(given_string VARCHAR(45))
BEGIN
SELECT `name` AS town_name FROM towns
WHERE LOWER(`name`) LIKE CONCAT(given_string, '%')
ORDER BY `name`;
END ###
DELIMITER ;
CALL usp_get_towns_starting_with('b');

-- Exercise 4
DELIMITER ###
CREATE PROCEDURE `usp_get_employees_from_town`(given_town_name VARCHAR(45))
BEGIN
SELECT e.first_name, e.last_name FROM employees as e
JOIN addresses AS a
USING(address_id)
JOIN towns AS t
USING(town_id)
WHERE t.`name` = given_town_name
ORDER BY e.first_name, e.last_name, e.employee_id;
END ###
DELIMITER ;
CALL usp_get_employees_from_town('Sofia');

-- Exercise 5
DELIMITER ###
CREATE FUNCTION `ufn_get_salary_level`(salary_input DECIMAL(19,4))
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
DECLARE salary_level VARCHAR(20);
IF (salary_input < 30000) 
THEN SET salary_level := 'Low';
ELSEIF (salary_input < 50000) 
THEN SET salary_level := 'Average';
ELSE
SET salary_level := 'High';
END IF;
RETURN salary_level;
END ###
DELIMITER ;
SELECT salary, `ufn_get_salary_level`(salary) AS salary_level FROM employees;

-- Exercise 6
DELIMITER ###
CREATE PROCEDURE `usp_get_employees_by_salary_level`(level_input VARCHAR(20))
BEGIN
SELECT first_name, last_name FROM employees
WHERE `ufn_get_salary_level`(salary) = level_input
ORDER BY first_name DESC, last_name DESC;
END ###
DELIMITER ;
CALL usp_get_employees_by_salary_level('High');

-- Exercise 7
DELIMITER ###
CREATE FUNCTION ufn_is_word_comprised(set_of_letters VARCHAR(50), word VARCHAR(50))
RETURNS BIT
DETERMINISTIC
BEGIN
RETURN (SELECT word REGEXP(CONCAT('^[', set_of_letters, ']+$')));
END ###
DELIMITER ;
SELECT ufn_is_word_comprised('angel', 'an');

-- Exercise 8
DELIMITER ###
CREATE PROCEDURE usp_get_holders_full_name()
BEGIN
SELECT CONCAT_WS(' ', first_name, last_name) AS full_name FROM account_holders
ORDER BY full_name, id;
END ###
DELIMITER ;
SELECT ufn_is_word_comprised('angel', 'an');
CALL usp_get_holders_full_name();

-- Exercise 9
DELIMITER ###
CREATE PROCEDURE usp_get_holders_with_balance_higher_than(given_amount DECIMAL(14, 4))
BEGIN
SELECT h.first_name, h.last_name FROM account_holders as h
JOIN (SELECT * FROM accounts a
GROUP BY a.account_holder_id
HAVING SUM(a.balance) > given_amount) AS a
ON a.account_holder_id = h.id
ORDER BY h.id;
END ###
DELIMITER ;
CALL usp_get_holders_with_balance_higher_than(7000);

-- Exercise 10
DELIMITER ###
CREATE FUNCTION ufn_calculate_future_value(sum DECIMAL(18, 4), yearly_interest_rate double, number_of_years INT)
RETURNS DECIMAL(18, 4)
DETERMINISTIC
BEGIN
DECLARE result DECIMAL(18, 4);
SET result := sum * (POWER((1 + yearly_interest_rate), number_of_years));
RETURN result;
END ###
DELIMITER ;
SELECT ufn_calculate_future_value(1000, 0.5, 5);

-- Exercise 11
SELECT a.id AS account_id, h.first_name, 
h.last_name, 
a.balance, 
ufn_calculate_future_value(a.balance, interest_rate, 5) AS  balance_in_5_years
FROM accounts AS a
JOIN account_holders AS h
ON a.account_holder_id = h.id
WHERE a.id = given_id;
END ###
DELIMITER ;
CALL usp_calculate_future_value_for_account(1, 0.1);

-- Exercise 12
DELIMITER ###
CREATE PROCEDURE usp_deposit_money(account_id INT, money_amount DECIMAL(19, 4))
BEGIN
IF money_amount > 0 THEN
START TRANSACTION;
UPDATE `accounts` AS a 
SET a.balance = a.balance + money_amount
WHERE a.id = account_id;
IF (SELECT a.balance 
FROM `accounts` AS a 
WHERE a.id = account_id) < 0
THEN ROLLBACK;
ELSE COMMIT;
END IF;
END IF;
END ###
DELIMITER ;

-- Exercise 13
DELIMITER ###
CREATE PROCEDURE usp_withdraw_money(account_id INT, money_amount DECIMAL(19, 4))
BEGIN
IF money_amount > 0 THEN
START TRANSACTION;
UPDATE `accounts` AS a 
SET a.balance = a.balance - money_amount
WHERE a.id = account_id;
IF (SELECT a.balance 
FROM `accounts` AS a WHERE a.id = account_id) < 0
THEN ROLLBACK;
ELSE
COMMIT;
END IF;
END IF;
END ###
DELIMITER ;

-- Exercise 14
DELIMITER ###
CREATE PROCEDURE usp_transfer_money(from_account_id INT, to_account_id INT, amount DECIMAL(18, 4))
BEGIN
IF amount >= 0
AND (SELECT a.id FROM accounts AS a WHERE a.id = from_account_id) IS NOT NULL
AND (SELECT a.id FROM accounts AS a WHERE a.id = to_account_id) IS NOT NULL
THEN START TRANSACTION;
UPDATE accounts SET balance = balance - amount
WHERE a.id = from_account_id;
UPDATE accounts SET balance = balance + amount
WHERE a.id = to_account_id;
IF (SELECT balance FROM accounts WHERE a.id = from_account_id) < 0
THEN ROLLBACK;
ELSE COMMIT;
END IF;
END IF;
END ###
DELIMITER ;


