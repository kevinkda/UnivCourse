/*
1、定义学生选课数据库，在学生选课库中使用数据导入的方式生成下面三张表。
S (Snum,Sname,Sex,Sage,Sphone,Dnum)
C (Cnum,Cname, Cfreq)
SC(Snum,Cnum,Score)
Snum表示学号,Sname表示姓名,Sex表示性别,Sage表示电话,Dnum表示系编号,Cnum表示课程号,Cname表示课程名,Cfreq表示学分,Score表示分数.
*/

create database Student_Course
	on
	  (
		name= Student_Course,
		filename = 'E:\University\SQL SERVER\实验\20190415\Student_Course.mdf',
		SIZE = 5,
		filegrowth=5
	  )
	log on
	  (
		name= Student_Course_Log,
		filename = 'E:\University\SQL SERVER\实验\20190415\Student_Course_Log.ldf',
		SIZE = 5,
		filegrowth=1
	  )

--use Student_Course
--go
create table S
(
	Snum char(4),
	Sname nchar(4),
	Sex nchar(1),
	Sage int,
	Sphone char(20),
	Dnum char(2),
	primary key(Snum)
)

--use Student_Course
create table C
(
	Cnum char(2),
	Cname nchar(10),
	Cfreq int,
	primary key(Cnum)
)

--use Student_Course
create table SC
(
	Snum char(4) foreign key references S(Snum),
	Cnum char(2) foreign key references C(Cnum),
	Sroce int check(Sroce between 0 and 100),
	primary key(Snum, Cnum)
)

insert into S values
('S001','王明','男',19,'86824571','D2'),
('S002','李勇','男',23,'89454321','D3'),
('S003','刘燕','女',21,'','D1'),
('S004','王萍','女',23,'','D1'),
('S005','王佳','男',24,'13098765892','D3'),
('S006','赵婷','女',20,'','D1')

insert into C values
('C1','数据库系统原理','4'),
('C2','C程序设计','4'),
('C3','计算机体系结构','3'),
('C4','自动控制原理','2'),
('C5','数据结构','4')

insert into SC values
('S001','C1',83),
('S001','C2',89),
('S001','C3',65),
('S001','C4',85),
('S001','C5',69),
('S002','C3',78),
('S002','C4',75),
('S005','C1',95),
('S004','C1',85),
('S005','C2',92),
('S005','C3',76)

--1)	查询系编号为‘D2’学生的基本信息（学号、姓名、性别、年龄）
select Snum, Sname, Sex, Sage
from S
where Dnum = 'D2'

--2)	查询学号为S006的学生的姓名
select Sname
from S
where Snum = 'S006'

--3)	查询成绩在60-85之间的学生的学号
select Snum
from SC
where Sroce between 60 and 85

--4)	查询所有姓王，并且姓名为两个字的学生的信息。
select *
from S
--group by Sname
--having Sname like '王_'
where rtrim(Sname) like '王_'

--5)	查询选修课程号为‘C1’且成绩非空的学生学号和成绩，成绩按150分制输出（每个成绩乘以系数1.5）
select Snum, Sroce * 1.5 '成绩' 
from SC
--group by Cnum,Snum
--having Cnum = 'C1'
where Cnum = 'C1' and Sroce is not null

--6)	查询有选课记录的所有学生的学号，用DISTINCT限制结果中学号不重复
select DISTINCT Snum
from SC
--group by Cnum,Snum
--having Cnum = 'C1'
where Cnum is not null

--7)	查询选修课程‘C1’的学生学号和成绩，结果按成绩的升序排列，如果成绩相同则按学号的降序排列
select Snum, Sroce
from SC
--group by Cnum,Snum
--having Cnum = 'C1'
where Cnum = 'C1'
order by Sroce, Snum DESC

--8)	列出所有不姓刘的学生信息
select *
from S
--group by Sname
--having Sname like '王_'
where rtrim(Sname) not like '刘%'

--9)	列出姓“沈”且全名为3个汉字的学生；
select *
from S
--group by Sname
--having Sname like '王_'
where rtrim(Sname) like '沈__'

--10)	显示在1985年以后出生的学生的基本信息；
select *
from S
where (YEAR(GETDATE())-Sage) > 1985

--11)	查询出课程名含有“数据”字串的所有课程基本信息；
select *
from C
where Cname like '%数据%'

--12)	显示学号第八位或者第九位是1、2、3、4或者9的学生的学号、姓名、性别、年龄及院系；
select Snum, Sname, Sex, Sage, Dnum
from S
where Snum like '_______[1,2,3,4,9]%' or Snum like '________[1,2,3,4,9]%'

--13)	列出选修了‘C1’课程的学生，按成绩的降序排列；
select Snum, Sroce
from SC
where Cnum = 'C1'
order by Sroce DESC

--14)	列出同时选修“C1”号课程和“C2”号课程的所有学生的学号；
select Snum
from SC
where Cnum = 'C1' and Cnum = 'C2'

--15)	列出课程表中全部信息，按学分的升序排列；
select *
from C
order by Cfreq DESC

--16)	列出年龄超过平均值的所有学生名单，按年龄的降序显示；
select *
from S
where Sage>(
	select AVG(Sage)
	from S
)
order by Sage DESC

--17)	按照出生年份升序显示所有学生的学号、姓名、性别、出生年份及院系，在结果集中列标题分别指定为“学号，姓名，性别，出生年份，院系”；
select Snum '学号', Sname '姓名', Sex '性别', YEAR(GETDATE())-Sage '出生年份', Dnum '院系'
from S
order by YEAR(GETDATE())-Sage

--18)	按照课程号、成绩降序显示课程成绩在70-80之间的学生的学号、课程号及成绩；
select Snum, Cnum, Sroce
from SC
where Sroce between 70 and 80

--19)	显示学生信息表中的学生总人数及平均年龄，在结果集中列标题分别指定为“学生总人数，平均年龄”；
select COUNT(Snum) '学生总人数', AVG(Sage) '平均年龄'
from S

--20)	显示选修的课程数大于3的各个学生的选修课程数；
select Snum, COUNT(Cnum) '选修课程数'
from SC
group by Snum
having COUNT(Cnum) >= 3

--21)	按课程号降序显示选修各个课程的总人数、最高成绩、最低成绩及平均成绩；
select Cnum, COUNT(Snum) '总人数', MAX(Sroce) '最高成绩', MIN(Sroce) '最低成绩', AVG(Sroce) '平均成绩'
from SC
group by Cnum
order by Cnum DESC

--选做题：
--1)	显示平均成绩大于“S001”学生平均成绩的各个学生的学号、平均成绩；
select Snum, AVG(Sroce) '平均成绩'
from SC
where Sroce>(
	select AVG(Sroce)
	from SC
	where Snum = 'S001'
)
group by Snum

select Snum, AVG(Sroce) '平均成绩'
from SC
group by Snum
having AVG(Sroce)>(
	select AVG(Sroce)
	from SC
	where Snum = 'S001'
)

--2)	显示选修各个课程的及格的人数;
select Cnum, COUNT(Snum) '及格人数'
from SC
where Sroce between 60 and 100
group by Cnum

--3)	显示各个院系男女生人数，其中在结果集中列标题分别指定为“院系名称、性别,人数”
select Dnum '院系名称', Sex '性别', COUNT(Snum) '人数'
from S
group by Dnum, Sex
order by Dnum

--4)	列出有二门以上课程（含两门）不及格的学生的学号及该学生的平均成绩；
select Snum '学号', AVG(Sroce) '平均成绩'
from SC
where Sroce between 0 and 60
group by Snum
having COUNT(Cnum) >= 2
