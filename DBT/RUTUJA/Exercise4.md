1)
select min(status) from S;

2)
select max(weight) from S;

3)
select avg(weight) from S;

4)
select `P#` , sum(qty) "Total Quantity" from SPJ
where `P#`='p1'
group by `P#`;

5)
select `P#`,
sum (qty) "Total Quantity" from SPJ 
group by `P#`;

6)
select `P#`,
avg (qty) "Total Quantity" from SPJ 
group by `P#`;

7)
select `P#` , 
max(qty) "Maximum Quantity" from SPJ 
group by `P#` 
having max(qty)>800;

8)
select Sname, 
count(Sname) from S 
group by Sname;

9)
select City,
count(Jname) from J
group by City; 

10)
COUNT(Staus)-> It returns count of columns where Status is not having a null value.
COUNT(*)-> It returns a count of total number of rows in the table.

11)
select Status , count(Status) "Count" from S group by Status;
