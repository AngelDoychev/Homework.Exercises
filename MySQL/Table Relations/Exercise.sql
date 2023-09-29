-- Exercise 1
CREATE TABLE passports(
passport_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
passport_number VARCHAR(45) NOT NULL
);
CREATE TABLE people(
person_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
first_name VARCHAR(45) NOT NULL,
salary DECIMAL(10, 2) NOT NULL,
passport_id INT NOT NULL UNIQUE,
CONSTRAINT fk_people_passports
FOREIGN KEY (passport_id) REFERENCES passports(passport_id)
);
INSERT INTO passports (passport_id, passport_number)
VALUES (101, 'N34FG21B'),
(102, 'K65LO4R7'), 
(103, 'ZE657QP2');
INSERT INTO people (person_id, first_name, salary, passport_id)
VALUES (1, 'Roberto', 43300, 102),
(2, 'Tom', 56100, 103),
(3, 'Yana', 60200, 101);

-- Exercise 2
CREATE TABLE manufacturers(
manufacturer_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL, 
established_on DATE NOT NULL
);
CREATE TABLE models(
model_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL, 
manufacturer_id INT NOT NULL
);
INSERT INTO manufacturers (manufacturer_id, `name`, established_on)
VALUES (1, 'BMW', '1916-01-03'), 
(2, 'Tesla', '2003-01-01'),
(3, 'Lada', '1966-01-05');
INSERT INTO models (model_id, `name`, manufacturer_id)
VALUES (101, 'X1', 1),
(102, 'i6', 1),
(103, 'Model S', 2),
(104, 'Model X', 2),
(105, 'Model 3', 2),
(106, 'Nova', 3);
ALTER TABLE models
ADD CONSTRAINT fk_models_manufacturers
FOREIGN KEY (manufacturer_id) 
REFERENCES manufacturers(manufacturer_id);

-- Exercise 3
CREATE TABLE students(
student_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL
);
CREATE TABLE exams(
exam_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL
);
CREATE TABLE students_exams(
exam_id INT NOT NULL,
student_id INT NOT NULL,
CONSTRAINT pk_students_exams
PRIMARY KEY(exam_id, student_id)
);
INSERT INTO exams (exam_id, `name`)
VALUES (101, 'Spring MVC'),
(102, 'Neo4j'),
(103, 'Oracle 11g');
INSERT INTO students (student_id, `name`)
VALUES (1, 'Mila'),
(2, 'Toni'),
(3, 'Ron');
INSERT INTO students_exams (student_id, exam_id)
VALUES (1, 101),
(1, 102),
(2, 101),
(3, 103),
(2, 102),
(2, 103);
ALTER TABLE students_exams
ADD CONSTRAINT fk_students
FOREIGN KEY (student_id)
REFERENCES students(student_id),
ADD CONSTRAINT fk_exams
FOREIGN KEY (exam_id)
REFERENCES exams(exam_id);

-- Exercise 4
CREATE TABLE teachers(
teacher_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
manager_id INT
);
INSERT INTO teachers (teacher_id, `name`, manager_id)
VALUES (101, 'John', NULL),
(102, 'Maya', 106),
(103, 'Silvia', 106),
(104, 'Ted', 105),
(105, 'Mark', 101),
(106, 'Greta', 101);
ALTER TABLE teachers
ADD CONSTRAINT fk_teachers_managers
FOREIGN KEY (manager_id)
REFERENCES teachers(teacher_id);

-- Exercise 5
CREATE TABLE cities(
city_id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL
);
CREATE TABLE customers(
customer_id INT(11) PRIMARY KEY NOT NULL,
`name` VARCHAR(50) NOT NULL,
birthday DATE,
city_id INT(11) NOT NULL,
CONSTRAINT fk_customers_cities
FOREIGN KEY (city_id)
REFERENCES cities(city_id)
);
CREATE TABLE orders(
order_id INT(11) PRIMARY KEY NOT NULL,
customer_id INT(11) NOT NULL,
CONSTRAINT fk_orders_customers
FOREIGN KEY (customer_id)
REFERENCES customers(customer_id)
);
CREATE TABLE item_types(
item_type_id INT(11) PRIMARY KEY NOT NULL,
`name` VARCHAR(50) NOT NULL
);
CREATE TABLE items(
item_id INT(11) PRIMARY KEY NOT NULL,
customer_id INT(11) NOT NULL,
`name` VARCHAR(50) NOT NULL, 
item_type_id INT(11) NOT NULL,
CONSTRAINT fk_itemtypes_items
FOREIGN KEY (item_type_id)
REFERENCES item_types(item_type_id)
);
CREATE TABLE order_items(
order_id INT(11)NOT NULL,
item_id INT(11)NOT NULL,
CONSTRAINT pk_orders_items
PRIMARY KEY(order_id, item_id),
CONSTRAINT fk_orders
FOREIGN KEY (order_id)
REFERENCES orders(order_id),
CONSTRAINT fk_items
FOREIGN KEY (item_id)
REFERENCES items(item_id)
);

-- Exercise 6
CREATE TABLE subjects(
subject_id INT(11) PRIMARY KEY NOT NULL,
subject_name VARCHAR(50) NOT NULL
);
CREATE TABLE students(
student_id INT(11) PRIMARY KEY NOT NULL,
student_number VARCHAR(12) NOT NULL,
student_name VARCHAR(50) NOT NULL,
major_id INT(11) NOT NULL
);
CREATE TABLE agenda(
subject_id INT(11) NOT NULL,
student_id INT(11) NOT NULL, 
CONSTRAINT pk_subjects_students
PRIMARY KEY(subject_id, student_id),
CONSTRAINT fk_subjects
FOREIGN KEY (subject_id)
REFERENCES subjects(subject_id),
CONSTRAINT fk_students
FOREIGN KEY (student_id)
REFERENCES students(student_id)
);
CREATE TABLE majors(
majors_id INT(11) PRIMARY KEY NOT NULL,
`name` VARCHAR(50) NOT NULL,
CONSTRAINT fk_majors_students
FOREIGN KEY (major_id)
REFERENCES students(major_id)
);
CREATE TABLE payments(
payment_id INT(11) PRIMARY KEY NOT NULL,
payment_date DATE NOT NULL, 
payment_amount DECIMAL(8,2) NOT NULL, 
student_id INT(11) NOT NULL, 
CONSTRAINT fk_payments_students
FOREIGN KEY (student_id)
REFERENCES students(student_id)
);


-- Exercise 7
-- DID IN MYSQL

-- Exercise 8
-- DID IN MYSQL



