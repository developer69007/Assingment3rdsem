# Write your MySQL query statement below
WITH ranked AS(SELECT id, salary,
DENSE_RANK()over(order by salary  DESC)AS rnk

from Employee)
SELECT(
SELECT salary 
FROM ranked
WHERE rnk=2
LIMIT 1
)AS SecondHighestSalary;