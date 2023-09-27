-- Exercise 1
SELECT department_id, COUNT(*) AS 'Number of employees' FROM employees
GROUP BY department_id
ORDER BY department_id, 'Number of employees';

-- Exercise 2
SELECT department_id, ROUND(AVG(salary), 2) AS 'Average salary' FROM employees
GROUP BY department_id
ORDER BY department_id;

-- Exercise 3
SELECT department_id, ROUND(MIN(salary), 2) AS `Min Salary` FROM employees
GROUP BY department_id
HAVING `Min Salary` > 800;

-- Exercise 4
SELECT COUNT(*) FROM products
WHERE category_id = 2 AND price > 8;

-- Exercise 5
SELECT category_id,
 ROUND(AVG(price), 2) AS `Average Price`,
 ROUND(MIN(price), 2) AS `Cheapest Product`,
 ROUND(MAX(price), 2) AS `Most Expensive Product`
 FROM products
 GROUP BY category_id;

