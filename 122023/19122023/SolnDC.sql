SELECT id, name, odimatches, testmatches, t20imatches 
FROM player 
WHERE odimatches>10 AND testmatches>10 AND t20imatches>10 
ORDER BY name 