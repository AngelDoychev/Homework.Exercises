CREATE DATABASE `minions`;

CREATE TABLE `minions`.`minions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `minions`.`towns` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `minions`.`minions` 
ADD COLUMN `town_id` INT NOT NULL AFTER `age`;

ALTER TABLE `minions`.`minions` 
ADD CONSTRAINT `fk_minions_towns`
  FOREIGN KEY (`town_id`)
  REFERENCES `minions`.`towns` (`id`);

INSERT INTO `minions`.`towns` (`id`,`name`)VALUES
(1,'Sofia'), 
(2,'Plovdiv'), 
(3,'Varna');

INSERT INTO `minions`.`minions`(`id`, `name`, `age`, `town_id`)VALUES
(1, 'Kevin', 22, 1),
(2, 'Bob', 15, 3),
(3, 'Steward', 22, 2);

TRUNCATE `minions`.`minions`;

DROP TABLE `minions`.`minions`;

DROP TABLE `minions`.`towns`;

CREATE TABLE `minions`.`people` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NOT NULL,
  `picture` BLOB NULL,
  `height` DECIMAL(2) NULL,
  `weight` DECIMAL(2) NULL,
  `gender` VARCHAR(45) NOT NULL,
  `birthdate` DATE NOT NULL,
  `biography` LONGTEXT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `minions`.`people`(`id`, `name`, `picture`, `height`, `weight`, `gender`, `birthdate`, `biography`)VALUES
(1, 'Angel1', NULL, 1.75, 78.2, 'm', '1999-03-10', 'cool person'); 
(2, 'Angel2', NULL, 1.75, 78.2, 'm', '1999-03-10', 'cool person'); 
(3, 'Angel3', NULL, 1.75, 78.2, 'm', '1999-03-10', 'cool person'); 
(4, 'Angel4', NULL, 1.75, 78.2, 'm', '1999-03-10', 'cool person'); 
(5, 'Angel5', NULL, 1.75, 78.2, 'm', '1999-03-10', 'cool person'); 

CREATE TABLE `minions`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(30) NOT NULL,
  `password` VARCHAR(26) NOT NULL,
  `profile_picture` BLOB NOT NULL,
  `last_login_time` DATETIME(1) NOT NULL,
  `is_deleted` BOOL NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE);

ALTER TABLE `minions`.`users` 
DROP PRIMARY KEY,
ADD PRIMARY KEY (`id`, `username`);

ALTER TABLE `minions`.`users` 
CHANGE COLUMN `last_login_time` `last_login_time` DATETIME(1) NOT NULL DEFAULT NOW() ;

ALTER TABLE `minions`.`users` 
DROP PRIMARY KEY,
ADD PRIMARY KEY (`id`);

CREATE SCHEMA `movies` ;

CREATE TABLE `minions`.`directors` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `director_name` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `minions`.`genres` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ganre_name` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `minions`.`categories` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `minions`.`movies` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `director_id` INT NOT NULL,
  `copyright_year` YEAR(4) NOT NULL,
  `length` FLOAT NOT NULL,
  `ganre_id` INT NOT NULL,
  `category_id` INT NOT NULL,
  `ratings` FLOAT NOT NULL,
  `notes` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `minions`.`movies` 
ADD INDEX `fk_movies_directors_idx` (`director_id` ASC) VISIBLE;
;
ALTER TABLE `minions`.`movies` 
ADD CONSTRAINT `fk_movies_directors`
  FOREIGN KEY (`director_id`)
  REFERENCES `minions`.`directors` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
ALTER TABLE `minions`.`movies` 
ADD INDEX `fk_movies_categories_idx` (`category_id` ASC) VISIBLE;

ALTER TABLE `minions`.`movies` 
ADD CONSTRAINT `fk_movies_categories`
  FOREIGN KEY (`category_id`)
  REFERENCES `minions`.`categories` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
ALTER TABLE `minions`.`movies` 
ADD INDEX `fk_movies_ganres_idx` (`ganre_id` ASC) VISIBLE;

ALTER TABLE `minions`.`movies` 
ADD CONSTRAINT `fk_movies_ganres`
  FOREIGN KEY (`ganre_id`)
  REFERENCES `minions`.`genres` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

CREATE SCHEMA `car_rental` ;

CREATE TABLE `car_rental`.`categories` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `category` VARCHAR(45) NOT NULL,
  `daily_rate` FLOAT NOT NULL,
  `weekly_rate` FLOAT NOT NULL,
  `monthly_rate` FLOAT NOT NULL,
  `weekend_rate` FLOAT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `car_rental`.`cars` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `plate_number` VARCHAR(45) NOT NULL,
  `make` VARCHAR(45) NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `car_year` YEAR(4) NOT NULL,
  `category_id` INT NOT NULL,
  `doors` INT NOT NULL,
  `picture` BLOB NOT NULL,
  `car_contition` VARCHAR(45) NOT NULL,
  `available` BOOL NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `car_rental`.`employees` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `car_rental`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `driver_licence_numbe` VARCHAR(45) NOT NULL,
  `full_name` VARCHAR(45) NOT NULL,
  `adress` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `zip_code` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NOT NULL,
  `customerscol` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `car_rental`.`rental_orders` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `employee_id` INT NOT NULL,
  `customer_id` INT NOT NULL,
  `car_id` INT NOT NULL,
  `car_contition` VARCHAR(45) NOT NULL,
  `tank_level` INT NOT NULL,
  `kilometrage_start` INT NOT NULL,
  `kilometrage_end` INT NOT NULL,
  `total_kilometrage` INT NOT NULL,
  `start_date` DATE NOT NULL,
  `end_date` DATE NOT NULL,
  `total_days` INT NOT NULL,
  `rate_applied` FLOAT NOT NULL,
  `tax_rate` FLOAT NOT NULL,
  `order_status` VARCHAR(45) NOT NULL,
  `notes` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `car_rental`.`rental_orders` 
ADD INDEX `fk_rental_orders_cars_idx` (`car_id` ASC) VISIBLE;
;
ALTER TABLE `car_rental`.`rental_orders` 
ADD CONSTRAINT `fk_rental_orders_cars`
  FOREIGN KEY (`car_id`)
  REFERENCES `car_rental`.`cars` (`id`);

ALTER TABLE `car_rental`.`rental_orders` 
ADD INDEX `fk_rental_cars_customers_idx` (`customer_id` ASC) VISIBLE;
;
ALTER TABLE `car_rental`.`rental_orders` 
ADD CONSTRAINT `fk_rental_cars_customers`
  FOREIGN KEY (`customer_id`)
  REFERENCES `car_rental`.`customers` (`id`);

ALTER TABLE `car_rental`.`rental_orders` 
ADD INDEX `fk_rental_orders_emplyees_idx` (`employee_id` ASC) VISIBLE;
;
ALTER TABLE `car_rental`.`rental_orders` 
ADD CONSTRAINT `fk_rental_orders_emplyees`
  FOREIGN KEY (`employee_id`)
  REFERENCES `car_rental`.`employees` (`id`);

CREATE SCHEMA `soft_uni` ;

CREATE TABLE `soft_uni`.`towns` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `soft_uni`.`addresses` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `addresses_text` VARCHAR(45) NOT NULL,
  `town_id` INT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `soft_uni`.`departments` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `soft_uni`.`employees` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `middle_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `job_title` VARCHAR(45) NOT NULL,
  `department_id` INT NOT NULL,
  `hire_date` DATE NOT NULL,
  `salary` FLOAT NOT NULL,
  `address_id` INT NOT NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `soft_uni`.`employees` 
ADD INDEX `fk_employees_addresses_idx` (`address_id` ASC) VISIBLE;
;
ALTER TABLE `soft_uni`.`employees` 
ADD CONSTRAINT `fk_employees_addresses`
  FOREIGN KEY (`address_id`)
  REFERENCES `soft_uni`.`addresses` (`id`);

ALTER TABLE `soft_uni`.`employees` 
ADD INDEX `fk_employees_departments_idx` (`department_id` ASC) VISIBLE;
;
ALTER TABLE `soft_uni`.`employees` 
ADD CONSTRAINT `fk_employees_departments`
  FOREIGN KEY (`department_id`)
  REFERENCES `soft_uni`.`departments` (`id`);

ALTER TABLE `soft_uni`.`addresses` 
ADD INDEX `fk_addresses_towns_idx` (`town_id` ASC) VISIBLE;
;
ALTER TABLE `soft_uni`.`addresses` 
ADD CONSTRAINT `fk_addresses_towns`
  FOREIGN KEY (`town_id`)
  REFERENCES `soft_uni`.`towns` (`id`);

INSERT INTO `soft_uni`.`departments` (`id`, `name`) VALUES ('1', 'Software Development'),
('2', 'Engineering'),
('3', 'Quality Assurance'),
('4', 'Sales'),
('5', 'Marketing');

INSERT INTO `soft_uni`.`employees`(`id`,  `first_name`, `middle_name`, `last_name`, `job_title`, `department_id`, 
`hire_date`, `salary`, `address_id`)VALUES
(1, 'Ivan', 'Ivanov', 'Ivanov', '.NET Developer', 1, 01-02-2013, 3500.00),
(2, 'Petar', 'Petrov', 'Petrov', 'Senior Engineer', '2', 02-03-2004, 4000.00),
(3, 'Maria', 'Petrova', 'Ivanov', 'Intern', 3, 28-08-2016, 525.25),
(4, 'Georgi', 'Terziev', 'Ivanov', 'CEO', 4, 09-12-2007, 3000.00),
(5, 'Peter', 'Pan', 'Pan', 'Intern', 5, 28-08-2016, 599.88);

SELECT * FROM `towns`;
SELECT * FROM `departments`;
SELECT * FROM `employees`;

SELECT * FROM `towns`
ORDER BY `name`;

SELECT * FROM `departments`
ORDER BY `name`;

SELECT * FROM `employees`
ORDER BY `salary` DESC;

SELECT `first_name`, `last_name`, `job_title`, `salary` FROM `employees`;

UPDATE `employees`
SET `salary`=`salary` * 1.1;
SELECT `salary` FROM `employees`;

UPDATE `payments`
SET `tax_rate`=`tax_rate` * 0.97;
SELECT `tax_rate` FROM `payments`;
