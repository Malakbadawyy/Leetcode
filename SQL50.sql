-- SQL50
-- 1.Recyclable and Low Fat Products
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';
-- 2.Find Customer Referee
SELECT name FROM Customer
WHERE referee_id != 2 OR referee_id IS NULL;
-- 3.Big Countries
SELECT name, population, area FROM World
WHERE area >= 3000000  OR population >= 25000000;
-- 4.Article Views I
SELECT DISTINCT author_id as id FROM Views
WHERE author_id = viewer_id
ORDER BY author_id ASC;
-- 5.Invalid Tweets
SELECT tweet_id FROM Tweets
WHERE LENGTH(content)>15;
-- 6.Replace Employee ID With The Unique Identifier
SELECT unique_id , name FROM Employees 
LEFT JOIN EmployeeUNI ON Employees.id = EmployeeUNI.id;
-- 7.Product Sales Analysis I 
SELECT product_name , year , price
FROM Sales JOIN Product ON Sales.product_id = Product.product_id;
-- 8.Customer Who Visited but Did Not Make Any Transactions
SELECT v.customer_id, COUNT(*) AS count_no_trans
FROM Visits v LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;
-- 9. Rising Temperatures
SELECT today.id
FROM Weather yesterday 
CROSS JOIN Weather today

WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
;

-- 10.Average Time of Process per Machine 
SELECT 
    a1.machine_id,
    ROUND(AVG(a2.timestamp - a1.timestamp), 3) AS processing_time
FROM 
    Activity a1
JOIN 
    Activity a2 
    ON a1.machine_id = a2.machine_id 
    AND a1.process_id = a2.process_id 
    AND a1.activity_type = 'start' 
    AND a2.activity_type = 'end'
GROUP BY 
    a1.machine_id;
-- 11.Employee Bonus
SELECT e.name , bonus FROM Employee e Left JOIN Bonus b ON e.empId= b.empId
WHERE bonus < 1000 OR bonus IS NULL;