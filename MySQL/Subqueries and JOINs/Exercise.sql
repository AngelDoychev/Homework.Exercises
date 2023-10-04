-- Exercise 1
SELECT e.employee_id, e.job_title, a.address_id, a.address_text 
FROM employees AS e
JOIN addresses AS a
ON e.address_id = a.address_id
ORDER BY e.address_id
LIMIT 5;

-- Exercise 2
SELECT e.first_name, e.last_name, t.name, a.address_text 
FROM employees AS e
JOIN addresses AS a
ON e.address_id = a.address_id
JOIN towns AS t
on a.town_id = t.town_id
ORDER BY e.first_name, e.last_name
LIMIT 5;

-- Exercise 3
SELECT e.employee_id, e.first_name, e.last_name, d.name 
FROM employees AS e
JOIN departments AS d
ON e.department_id = d.department_id
WHERE d.name = 'Sales' 
ORDER BY e.employee_id DESC;

-- Exercise 4
SELECT e.employee_id, e.first_name, ROUND(e.salary, 2), d.name AS department_name
FROM employees AS e
JOIN departments AS d
ON e.department_id = d.department_id
WHERE salary > 15000
ORDER BY d.department_id DESC;

-- Exercise 5
SELECT e.employee_id, e.first_name
FROM employees AS e
LEFT JOIN employees_projects AS ep
ON e.employee_id = ep.employee_id
WHERE ep.project_id IS NULL
ORDER BY e.employee_id DESC
LIMIT 3;

-- Exercise 6
SELECT e.first_name, e.last_name, e.hire_date, d.name AS dept_name
FROM employees AS e
JOIN departments AS d
ON e.department_id = d.department_id
WHERE e.hire_date > 1999-01-01 AND d.name IN('Sales', 'Finance') 
ORDER BY e.hire_date;

-- Exercise 7
SELECT e.employee_id, e.first_name, p.name
FROM employees AS e
JOIN employees_projects AS ep
ON e.employee_id = ep.employee_id
JOIN projects AS p
ON ep.project_id = p.project_id
WHERE p.start_date > '2002-08-13' AND end_date IS NULL
ORDER BY e.first_name, p.name
LIMIT 5;

-- Exercise 8
SELECT e.employee_id, e.first_name, IF(YEAR(p.start_date) >= 2005, p.name = NULL, p.name) AS project_name
FROM employees AS e
JOIN employees_projects AS ep
ON e.employee_id = ep.employee_id
JOIN projects AS p
ON ep.project_id = p.project_id
WHERE e.employee_id = 24
ORDER BY p.name
LIMIT 5;

-- Exercise 9
SELECT e.employee_id, e.first_name, e.manager_id, m.first_name
FROM employees AS e
JOIN employees AS m
ON e.manager_id = m.employee_id
WHERE e.manager_id IN(3,7)
ORDER BY e.first_name;

-- Exercise 10
SELECT e.employee_id, concat_ws(' ', e.first_name, e.last_name) AS employee_name,
concat_ws(' ', m.first_name, m.last_name) AS manager_name, d.name AS department_name
FROM employees AS e
JOIN employees AS m
ON e.manager_id = m.employee_id
JOIN departments AS d
ON e.department_id = d.department_id
ORDER BY e.employee_id
LIMIT 5;

-- Exercise 11
SELECT AVG(salary) AS avg_salary
FROM employees
GROUP BY department_id
ORDER BY avg_salary
LIMIT 1; 

-- Exercise 12
SELECT c.country_code, m.mountain_range, p.peak_name, p.elevation
FROM countries AS c
JOIN mountains_countries AS mc
ON c.country_code = mc.country_code
JOIN mountains AS m
ON mc.mountain_id = m.id
JOIN peaks AS p
ON p.mountain_id = m.id
WHERE c.country_code = 'BG' AND p.elevation > 2835 
ORDER BY p.elevation DESC;

-- Exercise 13
SELECT mc.country_code, COUNT(m.id) AS mountain_range
FROM mountains AS m
JOIN mountains_countries AS mc
ON mc.mountain_id = m.id
WHERE mc.country_code IN('BG', 'RU', 'US')
GROUP BY country_code;

-- Exercise 14
SELECT c.country_name, r.river_name
FROM countries as c
LEFT JOIN countries_rivers as cr
ON cr.country_code = c.country_code
LEFT JOIN rivers as r
ON cr.river_id = r.id
WHERE c.continent_code = 'AF'
ORDER BY c.country_name
LIMIT 5;

-- Exercise 15
SELECT c.continent_code, c.currency_code,
COUNT(*) AS 'currency_usage'
FROM `countries` AS c
GROUP BY c.continent_code , c.currency_code
HAVING `currency_usage` > 1 
AND `currency_usage` = (
SELECT COUNT(*) AS cn
FROM `countries` AS c2
WHERE c2.continent_code = c.continent_code
GROUP BY c2.currency_code
ORDER BY cn DESC
LIMIT 1)
ORDER BY c.continent_code , c.continent_code;

-- Exercise 16
SELECT COUNT(c.country_name) AS country_count FROM countries AS c
WHERE c.country_code NOT IN
(SELECT country_code FROM mountains_countries)

-- Exercise 17
SELECT c.country_name, MAX(p.elevation) AS highest_peak_elevation, 
MAX(r.length) AS longest_river_length
FROM countries as c
JOIN mountains_countries AS mc
ON c.country_code = mc.country_code
JOIN mountains AS m
ON mc.mountain_id = m.id
JOIN peaks AS p
ON p.mountain_id = m.id
LEFT JOIN countries_rivers as cr
ON cr.country_code = c.country_code
LEFT JOIN rivers as r
ON cr.river_id = r.id
GROUP BY country_name
ORDER BY highest_peak_elevation DESC, longest_river_length DESC, c.country_name
LIMIT 5;

