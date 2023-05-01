Exercise 1

0).
    show tables;
    select * from SEMP;
    select * from SDEPT;
    select * from S;
    select * from P;
    select * from J;
    drop table 


1). 
     mysql> create table SEMP
    (
        EMPNO CHAR(4),
        EMPNAME CHAR(20),
        BASIC FLOAT,
        DEPTNO CHAR(2),
        DEPTHEAD CHAR(4)
    );

2). 
    create table SDEPT
    (
        DEPTNO CHAR(2),
        DEPTNAME CHAR(15)
    );

3). 
    insert into SDEPT values 
        (10, 'Development'), 
        (20, 'Training');


    insert into SEMP values
            ('0001', 'SUNIL', 6000, '10', NULL),
            ('0002', 'HIREN', 8000, '20', NULL),
            ('0003', 'ALI', 4000, '10', '0001'),
            ('0004', 'GEORGE', 6000, NULL, '0002');


4).          

    CREATE TABLE S 
    (
        `S#` varchar(20),
        Sname varchar(20),
        Status int,
        City varchar(20)
    );

    CREATE TABLE P
    (
        `P#` varchar(20),
        Pname varchar(20),
        Color varchar(20),
        Weight float,
        City varchar(20)
    );

    CREATE TABLE J 
    (
        `J#` varchar(20),
        Jname varchar(20),
        City varchar(20)
    );

    create table SPJ
    (
        `S#` varchar(20),
        `P#`  varchar(20),
        `J#`  varchar(20),
        Qty int
    );



    insert into S (`S#`, Sname, status, city) values
        ('S1', 'Smith', 20, 'London'),
        ('S2', 'Jones', 10, 'Paris'),
        ('S3', 'Blake', 30, 'Paris'),
        ('S4', 'Clark', 20, 'London'),
        ('S5', 'Adams', 30, 'Athens');

    
    Insert into SPJ
        (`S#`,`P#`,`J#`,Qty)
        Values
        ('S1', 'P1', 'J1', 200),
        ('S1', 'P1', 'J4', 700),
        ('S2', 'P3', 'J1', 400),
        ('S2', 'P3', 'J2', 200),
        ('S2', 'P3',' J3', 200),
        ('S2', 'P3', 'J4', 500),
        ('S2', 'P3', 'J5', 600),
        ('S2', 'P3', 'J6', 400),
        ('S2', 'P3', 'J7', 800),
        ('S2', 'P5',' J2', 100),
        ('S3', 'P3', 'J1', 200),
        ('S3', 'P4', 'J2', 500),
        ('S4', 'P6', 'J3', 300),
        ('S4',' P6', 'J7', 300),
        ('S5', 'P2', 'J2', 200),
        ('S5',' P2', 'J4', 100),
        ('S5', 'P5', 'J5', 500),
        ('S5', 'P5', 'J7', 100),
        ('S5', 'P6', 'J2', 200),
        ('S5', 'P1', 'J4', 100),
        ('S5', 'P3', 'J4', 200),
        ('S5', 'P4', 'J4', 800),
        ('S5', 'P5', 'J4', 400),
        ('S5', 'P6', 'J4', 500);


    Insert into S (`S#`,Sname,Status,City) Values
        ('S1','Smith',20,'London'),
        ('S2','Jones',10,'Paris'),
        ('S3','Blake',30,'Paris'),
        ('S4','Clark',20,'London'),
        ('S5','Adams',30 ,'Athens');

    Insert into P (`P#`,Pname,Color,Weight,City) Values
        ('P1','Nut',' Red ',12 ,'London'),
        ('P2', 'Bolt', 'Green', 17, 'Paris'),
        ('P3', 'Screw', 'Blue', 17, 'Rome'),
        ('P4', 'Screw', 'Red', 14, 'London'),
        ('P5','Cam', 'Blue', 12, 'Paris'),
        ('P6' ,'Cog',' Red', 19, 'London');

    Insert into J (`J#`,Jname,City) Values
        ('J1',' Sorter', 'Paris'),
        ('J2', 'Punch','Rome'),
        ('J3', 'Reader', 'Athens'),
        ('J4',' Console',' Athens'),
        ('J5', 'Collator', 'London'),
        ('J6',' Terminal',' Oslo'),
        ('J7',' Tape',' London');

5). 
    select * from S;

6). 
    select `S#`, Sname from S; 

7). 
    select Pname, Color from P 
    where City = 'London';
    
8). 
    select Jname from J
    where City = 'London';

9). 
    select Jname from J
    where City = 'Paris' or 'Athens';

10). 
    select jname from J
    where City = 'Athens';

11). 
    select Pname  from P
    where Weight > 12 and weight < 13;
    
12). 
    select Sname from S
    where Status >= 20;    

13). 
    select Sname from S
    where City != 'Lundon';

14). 
    select City from S;

15). 
    select Weight * 1000 "Milligram",
    weight * 0.001 "Kilo Gram" from P;

