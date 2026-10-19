# Write your MySQL query statement below
SELECT w.id
FROM Weather as w
JOIN Weather as o
ON DateDiff(w.recordDate,o.recordDate)=1
Where w.temperature > o.temperature;