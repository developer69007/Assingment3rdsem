# Write your MySQL query statement below
SELECT a.name,b.bonus
FROM Employee as a
Left join Bonus as b
on a.empId=b.empId
Where b.bonus<1000 or b.bonus is null;