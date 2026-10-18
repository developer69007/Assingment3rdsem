# Write your MySQL query statement below
SELECT e.name as Employee
FROM Employee as e , Employee as b
WHERE e.managerId=b.id
AND e.salary>b.salary;
