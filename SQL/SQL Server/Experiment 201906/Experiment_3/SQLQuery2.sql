insert into Student values
('98001','钱横',18,'男','CS'),
('98002','王林',19,'女','CS'),
('98003','李民',20,'男','IS'),
('98004','赵三',16,'女','MA'),
('98005','欧阳勇',19,'男','MA'),
('98019','李四',18,'男','IS')

insert into Course values
(1,'数据库系统',5,4),
(2,'数学分析',NULL,2),
(3,'信息系统导论',1,3),
(4,'操作系统原理',6,3),
(5,'数据结构',7,4),
(6,'数据处理基础',NULL,4),
(7,'C语言',6,3)

insert into SC values
(98001,1,87),
(98001,2,67),
(98001,3,90),
(98002,2,95),
(98002,3,88),
(98004,2,Null)


select Sno,Sname
from Student

select Sname,Sno,Sdept
from Student

select *
from Student

select Sname, YEAR(GETDATE())-Sage as 出生年份
from Student

select Sname, YEAR(GETDATE())-Sage as 出生年份, LOWER(Sdept) as 所在系
from Student

select distinct Sno
from SC

select Sname,Sage
from Student
where Sage<=20

select Sname,Sdept,Sage
from Student
where Sage between 20 and 23

select Sname,Sdept,Sage
from Student
where Sage not between 20 and 23

select Sname,Ssex
from Student
where Sdept in ('IS','MA','CS')

select Sname,Ssex
from Student
where Sdept not in ('IS','MA','CS')

select *
from Student
where Sno='98001'

select *
from Student
where Sno in ('98001')

select Sno
from SC
where Grade>=90

select Sname,Sno,Sage
from Student
where Sname like '刘%'

select Sname
from Student
where Sname like '欧阳%'

select Sname,Sno
from Student
where Sname like '_阳%'

select Sname
from Student
where Sname not like '刘%'

select Sno,Cno
from SC
where Grade is null

select Sno,Cno
from SC
where Grade is not null





