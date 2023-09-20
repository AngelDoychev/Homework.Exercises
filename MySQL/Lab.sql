--EXERCISE 1
SELECT * FROM employees
ORDER BY id;

--EXERCISE 2
SELECT CONCAT_WS(' ', `first_name`, `last_name`) AS full_name, job_title, salary FROM employees 
WHERE salary > 1000
ORDER BY id;

--EXERCISE 3
SELECT * FROM emplyees;
UPDATE employees
SET salary = salary + 100
WHERE job_title = 'Manager';

--EXERCISE 4
CREATE VIEW v_employees AS 
SELECT * FROM employees
ORDER BY salary DESC
LIMIT 1;

--EXERCISE 5
SELECT * FROM employees
WHERE department_id = 4 AND salary >=1000
ORDER BY id;

--EXERCISE 6
DELETE FROM employees
WHERE department_id IN (1,2);
SELECT * FROM employees
ORDER BY id;
