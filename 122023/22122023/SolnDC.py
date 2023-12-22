SELECT id, name, price, processor, storage, ram 
FROM laptop 
WHERE price<40000 AND processor='Core i5' AND storage='1TB' AND ram='8GB' 
ORDER BY id 