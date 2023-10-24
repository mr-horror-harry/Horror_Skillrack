SELECT arrearscount, count(arrearscount) 
FROM student 
GROUP BY arrearscount 
ORDER BY arrearscount DESC