SELECT id, name, bloodgroup 
FROM person 
WHERE (weight > 50) AND (age BETWEEN 19 AND 64) 
ORDER BY id