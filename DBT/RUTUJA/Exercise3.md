1)
select concat(upper(substr(Sname,1,1)),lower(substr(Sname,2))) from S;

2)
select upper(Sname) from S;

3)
select lower(Sname) from S;

4)
select lpad(Sname,25,' ') from S;

5)
select replace(Sname,'la','ro') from S;

6)
select replace(replace(Sname,'a','o'),'l','r') from S;

7)
select Sname,length(Sname) "Length Of Supplier Name" from S;

8)
select * from S where soundex(Sname) = soundex('Bloke');

9)
select Sname,
case
when Status=10 then 'Ten'
when Status=20 then 'Twenty'
when Status=30 then 'Thirty'
else 'Other'
end "Status"
from S;

10)
select dayname(sysdate()) from dual;




// 1) select substr(sname, 
