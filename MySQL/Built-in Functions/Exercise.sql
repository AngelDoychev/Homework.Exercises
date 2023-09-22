--Exercise 1
SELECT first_name, last_name FROM soft_uni.employees
WHERE lower(first_name) LIKE 'sa%'
ORDER BY employee_id;

--Exercise 2
SELECT first_name, last_name FROM soft_uni.employees
WHERE lower(last_name) LIKE '%ei%'
ORDER BY employee_id;

--Exercise 3
SELECT first_name FROM soft_uni.employees
WHERE department_id IN(3, 10)
AND YEAR(hire_date) >= 1995 
AND YEAR(hire_date) <= 2005
ORDER BY employee_id;

--Exercise 4
SELECT first_name, last_name FROM soft_uni.employees
WHERE job_title NOT LIKE '%engineer%'
ORDER BY employee_id;

--Exercise 5
SELECT name FROM soft_uni.towns
WHERE char_length(name) IN(5,6)
ORDER BY name;

--Exercise 6
SELECT town_id, name FROM soft_uni.towns
WHERE lower(left(name, 1)) IN('m', 'k', 'b', 'e')
ORDER BY name;

--Exercise 7
SELECT town_id, name FROM soft_uni.towns
WHERE lower(left(name, 1)) NOT IN('r', 'b', 'd')
ORDER BY name;

--Exercise 8
CREATE VIEW v_employees_hired_after_2000 
AS SELECT first_name, last_name
FROM soft_uni.employees
WHERE YEAR(hire_date) > 2000;
SELECT * FROM v_employees_hired_after_2000;

--Exercise 9
SELECT first_name, last_name FROM soft_uni.employees
WHERE char_length(last_name) = 5;

--Exercise 10
SELECT country_name, iso_code FROM geography.countries
WHERE (country_name) LIKE repeat('%A%', 3) 
ORDER BY iso_code;

--Exercise 11
SELECT peak_name, river_name, lower(concat(peak_name, substr(river_name, 2)))
AS mix FROM geography.peaks, geography.rivers
WHERE lower(right(peak_name, 1)) = lower(left(river_name, 1))
ORDER BY mix;

--Exercise 12
SELECT name, date_format(start, '%Y-%m-%d') AS start FROM diablo.games
WHERE year(start) IN(2011, 2012)
ORDER BY start, name
LIMIT 50;

--Exercise 13
SELECT user_name, substr(email, position('@' IN email) + 1) 
AS `Email Provider` FROM diablo.users
ORDER BY `Email Provider`, user_name;

--Exercise 14
SELECT user_name, ip_address FROM diablo.users
Where ip_address LIKE "___.1%.%.___"
ORDER BY user_name;

--Exercise 15
SELECT name AS game, 
CASE
WHEN hour(start) >=0 AND hour(start) < 12 THEN 'Morning'
WHEN hour(start) >=12 AND hour(start) < 18 THEN 'Afternoon'
WHEN hour(start) >=18 AND hour(start) < 24 THEN 'Evening'
END
AS `Part of the Day`,
CASE
WHEN duration <=3 THEN 'Extra Short'
WHEN duration >3 AND duration <= 6 THEN 'Short'
WHEN duration >6 AND duration <= 10 THEN 'Long'
ELSE 'Extra Long'
END 
AS Duration FROM diablo.games;

--Exercise 16
SELECT product_name, order_date, 
date_add(order_date, INTERVAL 3 DAY) AS pay_due,
date_add(order_date, INTERVAL 1 MONTH) AS deliver_due 
FROM orders.orders;

