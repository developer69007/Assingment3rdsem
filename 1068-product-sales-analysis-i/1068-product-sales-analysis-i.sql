# Write your MySQL query statement below
SELECT p.product_name,r.year,r.price
FROM Sales as r
LEFT JOIN Product as p
ON r.product_id=p.product_id;