CREATE TABLE filledbus AS 
(SELECT id, number, totalseats 
FROM bus 
WHERE totalseats=bookedseats)