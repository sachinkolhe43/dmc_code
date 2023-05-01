1)
select 
S.Sname,SPJ.Qty from SPJ,S
where SPJ.`S#`=S.`S#`;

2)
select 
P.Pname,SPJ.Qty from SPJ,P
where P.`P#`=SPJ.`P#`;

3)
select 
J.Jname,SPJ.Qty from SPJ,J
where J.`J#`=SPJ.`J#`;

4)
select
S.Sname,P.Pname,J.Jname,SPJ.Qty from SPJ,S,P,J
where S.`S#`=SPJ.`S#` and P.`P#`=SPJ.`P#` and J.`J#`=SPJ.`J#`;

5)
select
S.Sname,P.Pname,J.Jname from S,P,J 
where S.City=P.City and P.City=J.City;

6)
select
P.Pname,SPJ.Qty from SPJ,P
where P.`P#`=SPJ.`P#` and color='Red';

7)
select
S.Sname,S.Status,SPJ.Qty from SPJ,S
where S.`S#`=SPJ.`S#` and S.Status=20;

8)
select
P.Pname,SPJ.Qty from SPJ,P
where P.`P#`=SPJ.`P#`and P.Weight>14


9)
select 
J.Jname,J.City from SPJ,J 
where J.`J#`=SPJ.`J#` and Qty > 500;

10)
select 
Pname,City from P
where Weight < 15;

11)
select ename,mgr from emp;
