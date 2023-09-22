--Exercise 1
SELECT title FROM book_library.books
WHERE title LIKE 'The%'
ORDER BY id;

--Exercise 2
SELECT REPLACE(title, 'The', '***') AS title FROM book_library.books
WHERE title LIKE 'The%'
ORDER BY id;

--Exercise 3
SELECT round(sum(cost), 2) AS sum_cost FROM book_library.books;

--Exercise 4
SELECT concat_ws(' ', first_name, last_name) AS `Full Name`,
datediff(died, born) AS `Days Lived` FROM book_library.authors;

--Exercise 5
SELECT title FROM book_library.books
WHERE title LIKE '%Harry Potter%'
ORDER BY id;
