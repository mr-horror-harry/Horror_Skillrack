SELECT id, title, attendeescount 
FROM event 
WHERE active=True AND type='TECH' AND attendeescount>50 
ORDER BY id 