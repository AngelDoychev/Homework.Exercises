-- Prep
CREATE SCHEMA airlines_db;
USE airlines_db;

-- Exercise 1
CREATE TABLE countries(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(30) NOT NULL UNIQUE,
description TEXT, 
currency VARCHAR(5) NOT NULL
);
CREATE TABLE airplanes(
id INT PRIMARY KEY AUTO_INCREMENT,
model VARCHAR(50) NOT NULL UNIQUE,
passengers_capacity INT NOT NULL,
tank_capacity DECIMAL(19,2) NOT NULL,
cost DECIMAL(19,2) NOT NULL
);
CREATE TABLE passengers(
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
country_id INT NOT NULL,
CONSTRAINT fk_passengers_countries
FOREIGN KEY (country_id)
REFERENCES countries(id)
);
CREATE TABLE flights(
id INT PRIMARY KEY AUTO_INCREMENT,
flight_code VARCHAR(30) NOT NULL UNIQUE,
departure_country INT NOT NULL,
destination_country INT NOT NULL,
airplane_id INT NOT NULL,
has_delay BOOLEAN,
departure DATETIME,
CONSTRAINT fk_departures_countries
FOREIGN KEY (departure_country)
REFERENCES countries(id),
CONSTRAINT fk_destinations_countries
FOREIGN KEY (destination_country)
REFERENCES countries(id), 
CONSTRAINT fk_flights_airplanes
FOREIGN KEY (airplane_id)
REFERENCES airplanes(id)
);
CREATE TABLE flights_passengers(
flight_id INT, 
passenger_id INT, 
CONSTRAINT fk_flights_passengers
FOREIGN KEY (flight_id)
REFERENCES passengers(id), 
CONSTRAINT fk_passengers_flights
FOREIGN KEY (passenger_id)
REFERENCES flights(id)
);

-- Exercise 2
INSERT INTO airplanes (model, passengers_capacity, tank_capacity, cost) SELECT 
CONCAT(REVERSE(first_name),'797'), CHAR_LENGTH(last_name) * 17,
id * 790, 
CHAR_LENGTH(first_name) * 50.6
FROM passengers
WHERE id <= 5;

-- Exercise 3
UPDATE flights
SET airplane_id = airplane_id + 1
WHERE departure_country = 22;

-- Exercise 4
DELETE FROM flights
WHERE id NOT IN(SELECT flight_id FROM flights_passengers);

-- Exercise 5
SELECT * FROM airplanes
ORDER BY cost DESC, id DESC;

-- Exercise 6
SELECT flight_code, departure_country, airplane_id, departure FROM flights
WHERE YEAR(departure) = 2022
ORDER BY airplane_id, flight_code
LIMIT 20;

-- Exercise 7
SELECT CONCAT(UPPER(SUBSTRING(last_name,1 , 2)), country_id) AS flight_code,
CONCAT_WS(' ', first_name, last_name) AS full_name,
country_id FROM passengers
WHERE id NOT IN(SELECT passenger_id FROM flights_passengers)
ORDER BY country_id;

-- Exercise 8
SELECT c.`name`, c.currency, COUNT(*) AS booked_tickets FROM flights_passengers AS fp
JOIN flights AS f 
ON fp.flight_id = f.id
JOIN countries AS c
ON f.destination_country = c.id
GROUP BY c.name
HAVING COUNT(*) > 19
ORDER BY booked_tickets DESC;


-- Exercise 9
SELECT flight_code, departure, CASE
WHEN (TIME(departure) >= '05:00:00' AND TIME(departure) < '12:00:00') 
THEN 'Morning'
WHEN (TIME(departure) >= '12:00:00' AND TIME(departure) < '17:00:00') 
THEN 'Afternoon'
WHEN (TIME(departure) >= '17:00:00' AND TIME(departure) < '21:00:00') 
THEN 'Evening'
ELSE 'Night' 
END
AS day_part FROM flights
ORDER BY flight_code DESC;

-- Exercise 10
DELIMITER ###
CREATE FUNCTION udf_count_flights_from_country(given_country VARCHAR(50))
RETURNS INT
DETERMINISTIC
BEGIN
DECLARE result INT;
SET result := (SELECT COUNT(*) FROM flights AS f
JOIN countries AS c
ON f.departure_country = c.id
WHERE c.name = given_country
GROUP BY c.name);
RETURN result;
END ###
DELIMITER ;

-- Exercise 11
DELIMITER ###
CREATE PROCEDURE udp_delay_flight(given_code VARCHAR(50))
BEGIN
UPDATE flights
SET has_delay = true,
departure = ADDTIME(departure, '00:30:00')
WHERE flight_code = given_code; 
END ###
DELIMITER ;
CALL udp_delay_flight('ZP-782');


