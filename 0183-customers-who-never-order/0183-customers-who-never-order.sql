# Write your MySQL query statement below
SELECT  a.name as Customers
FROM Customers AS a
LEFT JOIN Orders AS b
    ON a.id = b.customerId
    WHERE  b.customerId is  null;