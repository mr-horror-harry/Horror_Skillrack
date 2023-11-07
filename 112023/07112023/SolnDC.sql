SELECT branchname, sum(loanamount) 
FROM customer 
GROUP BY branchname 
ORDER BY SUM(loanamount) DESC