1.Create table OS with column OS_ID and  OS_Name having primary key to OS_ID and insert following value in it :--

create table OS(OS_ID int not null auto_increment, OS_Name varchar(255) not null, primary key(OS_ID));

1) 
    create table os 
    (
        os_id int primary key auto_increment,
        os_name varchar(255) not null
    )

    mysql> desc os;
+---------+--------------+------+-----+---------+----------------+
| Field   | Type         | Null | Key | Default | Extra          |
+---------+--------------+------+-----+---------+----------------+
| os_id   | int          | NO   | PRI | NULL    | auto_increment |
| os_name | varchar(255) | NO   |     | NULL    |                |
+---------+--------------+------+-----+---------+----------------+


    insert into os (os_name)values
    ('Android'),
    ('IOS'),
    ('Windows');

mysql> select * from os;
+-------+---------+
| os_id | os_name |
+-------+---------+
|     1 | Android |
|     2 | IOS     |
|     3 | Windows |
+-------+---------+




-----------------------------------------------------------------------------------------------------------------------------

2.Create table Mobiles with column Mobile_id,Model_Name,Company,Company having primary key 

to Mobile_id and OS_ID must be Foreign Key Insert 

following value in it :--

create table Mobiles(Mobile_id int not null auto_increment,Model varchar(255) not null,Company varchar(255) not null,Price double not null,OS_ID int not null,primary key(Mobile_id),foreign key (OS_ID) references OS(OS_ID));

+-----------+-------------+----------+-------+-------+

| Mobile_id | Model       | Companyl | Price | OS_ID |

+-----------+-------------+----------+-------+-------+

|         1 | iPhone 13        | Apple      | 80000 |     2 |

|         2 | Note 10 Pro     | Redmi     | 18000 |     1 |

|         3 | Lumia 420        | Nokia      | 18000 |     3 |

|         4 | M30s                | Samsung | 18000 |     2 |

|         5 | A31                   | Oppo       | 11500 |     1 |

|         6 | Narzo               | RealMe    |  9000   |     1 |

+-----------+-------------+----------+-------+-------+


2)
    create table mobiles
    (   
        mobile_id int not null auto_increment,
        model varchar(255) not null,
        company varchar(255) not null,
        price double not null,
        os_id int not null,
        primary key(mobile_id),
        foreign key (os_id) references os(os_id)
        
    );

    desc mobiles;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| mobile_id | int          | NO   | PRI | NULL    | auto_increment |
| model     | varchar(255) | NO   |     | NULL    |                |
| company   | varchar(255) | NO   |     | NULL    |                |
| price     | double       | NO   |     | NULL    |                |
| os_id     | int          | NO   | MUL | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+

    insert into mobiles(model, company, price, os_id)
    values
    ('iPhone 13', 'Apple', 80000,2),
    ('Note 10 Pro','Redmi',18000,1),
    ('Lumia 420','Nokia',18000,3),
    ('M30s','Samsung',18000,2),
    ('A31','Oppo',11500,1),
    ('Narzo','RealMe',9000,1);
    
    select * from mobiles;
+-----------+-------------+---------+-------+-------+
| mobile_id | model       | company | price | os_id |
+-----------+-------------+---------+-------+-------+
|         1 | iPhone 13   | Apple   | 80000 |     2 |
|         2 | Note 10 Pro | Redmi   | 18000 |     1 |
|         3 | Lumia 420   | Nokia   | 18000 |     3 |
|         4 | M30s        | Samsung | 18000 |     2 |
|         5 | A31         | Oppo    | 11500 |     1 |
|         6 | Narzo       | RealMe  |  9000 |     1 |
+-----------+-------------+---------+-------+-------+

Q1)write a select command that will produce mobile details whose price is 18000(use in operator).-----------------(2marks)


    select * from mobiles 
    where price in (18000);

    select * from mobiles      where price= 18000;
+-----------+-------------+---------+-------+-------+
| mobile_id | model       | company | price | os_id |
+-----------+-------------+---------+-------+-------+
|         2 | Note 10 Pro | Redmi   | 18000 |     1 |
|         3 | Lumia 420   | Nokia   | 18000 |     3 |
|         4 | M30s        | Samsung | 18000 |     2 |
+-----------+-------------+---------+-------+-------+


Q2)display all Mobile names in capital letters whoes name begin with letter N.-----------------(2marks)

    Select upper(model) from mobiles
    where model in (
    select model from mobiles
    where model like 'N%');

        -+--------------+
| upper(model) |
+--------------+
| NOTE 10 PRO  |
| NARZO        |
+--------------+


Q3)write a subquery to display data of Mobiles who has OS Android  (Use sub-query).---------------------------------------(2marks)


    select * from mobiles
    where os_id =1;

    +-----------+-------------+---------+-------+-------+
| mobile_id | model       | company | price | os_id |
+-----------+-------------+---------+-------+-------+
|         2 | Note 10 Pro | Redmi   | 18000 |     1 |
|         5 | A31         | Oppo    | 11500 |     1 |
|         6 | Narzo       | RealMe  |  9000 |     1 |
+-----------+-------------+---------+-------+-------+


Q4) display details of Mobiles in descending order of Company.--------------------------(2marks)

    select * from mobiles 
    order by company desc;

    +-----------+-------------+---------+-------+-------+
| mobile_id | model       | company | price | os_id |
+-----------+-------------+---------+-------+-------+
|         4 | M30s        | Samsung | 18000 |     2 |
|         2 | Note 10 Pro | Redmi   | 18000 |     1 |
|         6 | Narzo       | RealMe  |  9000 |     1 |
|         5 | A31         | Oppo    | 11500 |     1 |
|         3 | Lumia 420   | Nokia   | 18000 |     3 |
|         1 | iPhone 13   | Apple   | 80000 |     2 |
+-----------+-------------+---------+-------+-------+


Q5)Write a query to increase price 10% whose OS_id = 2, increase price 20% whose OS_id = 1 and other 30%. (Use only CASE)--formula((initial price*percent/100)+initial price).--------------------------(2marks)

    select model, (price*0.1) from mobiles
    where os_id=2
     union 
    select model, (price*0.2) from mobiles
    where os_id=1
    union
    select model, (price*0.3) from mobiles
    where os_id=3;

    <!-- select model,price,
case 
     when `Item-Name` = 'T-shirt' then price+( (price*10) /100 )
     when `Item-Name` = 'Jins' then price+( (price*50) /100 )
     when `Item-Name` = 'top' then price+( (price*5) /100 )
     else price
    end as new_price from table_name; -->

+-------------+-------------+
| model       | (price*0.1) |
+-------------+-------------+
| iPhone 13   |        8000 |
| M30s        |        1800 |
| Note 10 Pro |        3600 |
| A31         |        2300 |
| Narzo       |        1800 |
| Lumia 420   |        5400 |
+-------------+-------------+



Q6)display all Mobiles whose name begin with letter N and end with o.------------------------(2marks)

    select model from mobiles 
    where model like 'N%o';

+-------------+
| model       |
+-------------+
| Note 10 Pro |
| Narzo       |
+-------------+

Q7)Join two tables to Display the OS_ID, OS_NAME  where the count of OS is greater than 1(use join and having).--------------------------------(2marks)


    select os_id, os_name from mobiles, os
    where os.os_id = mobiles.os_id
    group by os_id
    having os_id >1;

 Stored Procedure

Q8)Write a stored procedure to check the given number is palindrome or not? 4M

create temp table with two fields num and status and Output Should be inserted into temp table like 

+------+-----------------------+

| num  | status                |

+------+-----------------------+

|  101 | num is pallindrom     |

|  123 | num is not pallindrom |


+------+-----------------------+

    create table sample 
    (
        num int,
        status varchar(30)
    )


delimitter //
declare


	n number;
	m number;
	temp number:=0;
	rem number;

begin
	n:=5432112345;
	m:=n;
	
	
	while n>0
	loop
		rem:=mod(n,10);
		temp:=(temp*10)+rem;
		n:=trunc(n/10);
	end loop; 
	
	if m = temp
	then
		dbms_output.put_line('true');
	else
		dbms_output.put_line('false');
	end if;
end; //

delimiter ;








