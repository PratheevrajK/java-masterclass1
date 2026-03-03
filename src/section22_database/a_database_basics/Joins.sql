-- DDL
CREATE TABLE departments (
  dept_id   INT PRIMARY KEY,
  dept_name VARCHAR(50)
);

CREATE TABLE employees (
  emp_id    INT PRIMARY KEY,
  emp_name  VARCHAR(50),
  dept_id   INT  -- nullable: some employees may be unassigned
);

-- Data inserts
INSERT INTO departments (dept_id, dept_name) VALUES
  (10, 'Engineering'),
  (20, 'Sales'),
  (30, 'HR');

INSERT INTO employees (emp_id, emp_name, dept_id) VALUES
  (1, 'Asha', 10),
  (2, 'Ben', 10),
  (3, 'Chitra', 20),
  (4, 'Dev', NULL),   -- no department
  (5, 'Eve', 99);     -- references non-existent department

-- Select test
select * from employees;
select * from departments;

-- Joins

-- INNER JOIN - Keeps only the matching rows on both sides.
select * from employees e INNER JOIN departments d ON e.dept_id = d.dept_id; -- 3 rows
select * from employees e INNER JOIN departments d ON e.dept_id = d.dept_id and d.dept_id=10; -- 2 rows

-- LEFT JOIN - Keeps all rows from the left table, whether they match or not. Unmatched right-side columns are NULL.
select * from employees e LEFT JOIN departments d ON e.dept_id = d.dept_id; -- 5rows

	-- If you add a WHERE d.dept_name = 'Engineering' after the join, you’ll filter out the NULLs and lose the “outer” effect
	SELECT e.emp_id, e.emp_name, d.dept_name FROM employees e LEFT JOIN departments d ON e.dept_id = d.dept_id WHERE d.dept_name = 'Engineering'; -- 2 rows

	-- Keep all employees, but only show dept_name when it's Engineering.
	SELECT e.emp_id, e.emp_name, d.dept_name FROM employees e LEFT JOIN departments d ON e.dept_id = d.dept_id AND d.dept_name = 'Engineering'; -- 5 rows

-- RIGHT JOIN - Keeps all rows from the right table, whether they match or not. Unmatched left-side columns are NULL.
select * from employees e RIGHT JOIN departments d ON e.dept_id = d.dept_id; -- 4rows
-- Tip: Anything you can do with RIGHT JOIN can be rewritten as a LEFT JOIN by swapping table order. Many teams standardize on LEFT JOIN for readability.

-- FULL/OUTER JOIN - Keeps all rows from both sides. Matches when possible; otherwise, the missing side is NULL.
-- select * from employees e OUTER JOIN departments d ON e.dept_id = d.dept_id; -- 6 rows PostgreSQL supports OUTER JOIN.
-- MySQL does not support FULL OUTER JOIN natively. Use UNION of LEFT and RIGHT joins:
SELECT e.emp_id, e.emp_name, d.dept_name FROM employees e LEFT JOIN departments d ON e.dept_id = d.dept_id 
UNION
select e.emp_id, e.emp_name, d.dept_name from employees e RIGHT JOIN departments d ON e.dept_id = d.dept_id; -- 6 rows

-- CROSS JOIN - Cartesian product: every row on the left pairs with every row on the right. No join condition.
select * from employees e CROSS JOIN departments d; -- 15 rows



