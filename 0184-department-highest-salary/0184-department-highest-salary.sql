# Write your MySQL query statement below
WITH RANKED_EMPLOYEE AS(SELECT d.name as Department ,e.name as Employee,e.salary,
DENSE_RANK()  OVER(PARTITION BY d.name ORDER BY e.salary DESC)as 'Salaryrnk'
FROM Employee as e
LEFT JOIN Department as d
ON d.id=e.departmentId
)
SELECT Department,Employee,Salary
FROM RANKED_EMPLOYEE
WHERE Salaryrnk =1;