-- Exercise 1
SELECT e.employee_id,
CONCAT_WS(' ', e.first_name, e.last_name) AS 'full_name',
d.department_id, d.name AS 'department_name'
FROM `departments` AS d
INNER JOIN `employees` AS e ON e.employee_id = d.manager_id
ORDER BY e.employee_id
LIMIT 5;

-- Exercise 2
SELECT a.town_id, t.name AS 'town_name', a.address_text
FROM `addresses` AS a
JOIN `towns` AS t ON a.town_id = t.town_id
WHERE t.name IN ('San Francisco' , 'Sofia', 'Carnation')
ORDER BY t.town_id , a.address_id;

-- Exercise 3
SELECT e.employee_id, e.first_name,
e.last_name, e.department_id, e.salary
FROM `employees` AS e
WHERE IS NULL(e.manager_id);

-- Exercise 4
SELECT COUNT(e.employee_id) AS 'count'
FROM `employees` AS e
WHERE e.salary > (SELECT AVG(`salary`) FROM `employees`);
