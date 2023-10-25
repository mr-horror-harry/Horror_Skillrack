CREATE TABLE selectedcandidate AS 
(SELECT name, marks 
FROM candidate 
WHERE marks>=90)