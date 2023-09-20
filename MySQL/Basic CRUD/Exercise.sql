--EXERCISE 1
SELECT * FROM `soft_uni`.`departments`
ORDER BY department_id;

--EXERCISE 2
SELECT `name` FROM `soft_uni`.`departments`
ORDER BY department_id;

--EXERCISE 3
SELECT `first_name`, `last_name`, `salary` FROM `soft_uni`.`employees`
ORDER BY employee_id;

--EXERCISE 4
SELECT `first_name`, `middle_name`, `last_name` FROM `soft_uni`.`employees`
ORDER BY employee_id;

--EXERCISE 5
SELECT CONCAT(`first_name`,'.', `last_name`, '@softuni.bg') AS full_email_address FROM `soft_uni`.`employees`;

--EXERCISE 6
SELECT salary FROM employees
ORDER BY employee_id;

--EXERCISE 7
SELECT * FROM employees
WHERE job_title = 'Sales Representative'
ORDER BY employee_id;

--EXERCISE 8
SELECT first_name, last_name, job_title FROM employees
WHERE salary >= 20000 AND salary <= 30000
ORDER BY employee_id;

--EXERCISE 9
SELECT CONCAT_WS(' ', first_name, middle_name, last_name)
AS `Full Name` 
FROM employees
WHERE salary IN(25000, 14000, 12500, 23600);

--EXERCISE 10
SELECT first_name, last_name FROM employees
WHERE manager_id IS NULL;

--EXERCISE 11
SELECT first_name, last_name, salary FROM employees
WHERE salary > 50000
ORDER BY salary DESC;

--EXERCISE 12
SELECT first_name, last_name FROM employees
ORDER BY salary DESC
LIMIT 5;

--EXERCISE 13
SELECT first_name, last_name FROM employees
WHERE department_id NOT IN(4);

--EXERCISE 14
SELECT * FROM employees
ORDER BY salary DESC, first_name, last_name DESC, middle_name;

--EXERCISE 15
CREATE VIEW v_employees_salaries 
AS SELECT first_name, last_name, salary FROM employees; 
SELECT * FROM v_employees_salaries;

--EXERCISE 16
CREATE VIEW v_employees_job_titles AS
SELECT CONCAT_WS(' ', first_name, middle_name, last_name) 
AS full_name, job_title
FROM employees;
SELECT * FROM v_employees_job_titles;

--EXERCISE 17
SELECT DISTINCT job_title FROM employees
ORDER BY job_title;

--EXERCISE 18
SELECT DISTINCT * FROM projects
ORDER BY start_date, name, project_id;

--EXERCISE 19
SELECT first_name, last_name, hire_date FROM employees
ORDER BY hire_date DESC
LIMIT 7;

--EXERCISE 20
UPDATE employees 
SET salary = salary * 1.12
WHERE department_id IN(1, 2, 4, 11);
SELECT salary FROM employees;

--EXERCISE 21
SELECT peak_name FROM geography.peaks
ORDER BY peak_name;

--EXERCISE 22
SELECT country_name, population FROM geography.countries
WHERE continent_code = 'EU'
ORDER BY population DESC, country_name
LIMIT 30;

--EXERCISE 23
SELECT country_name, country_code, 
IF(currency_code = 'EUR', 'Euro', 'Not Euro')
AS currency
FROM geography.countries
ORDER BY country_name;


--EXERCISE 24
SELECT name FROM diablo.characters
ORDER BY name;

