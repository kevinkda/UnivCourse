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


--对JXGL数据库进行查询。
--1.	查询选修2号课程的学生姓名。
select Sname
from SC
inner join Student
on Student.Sno = SC.Sno and Cno = '2'
group by Sname, Student.Sno

select Sname
from Student, SC
where Student.Sno = SC.Sno and Cno = '2'

--2.	查询钱横同学选修的课程号和分数
select Sname, Cno, Grade
from Student, SC
where Student.Sno = SC.Sno and Sname = '钱横'

--3.	查询CS系学生选修的课程号和分数
select SC.Sno, Cno, Grade
from Student, SC
where Student.Sno = SC.Sno and Sdept = 'CS'

--4.	查询选修了这样课程的学生学号，其直接先行课是5号课程。
select Sno
from SC
where Cno in
(
	select Cno
	from Course
	where Cpno=5
)

--5.	查询选修的课程成绩为90分以上的学生姓名与课程名和成绩。
select Student.Sname, SC.Sno, SC.Grade
from Student, SC
where Student.Sno = SC.Sno and SC.Grade >= 90

--6.	查询选修2号课程且成绩在90分以上的所有学生的学号、姓名。
select Student.Sname, SC.Sno
from Student, SC
where Student.Sno = SC.Sno and SC.Grade >= 90 and Cno = 2

--7.	查询每个学生的学号、姓名、选修的课程名及成绩。
select Student.Sno, Student.Sname, Course.Cname, SC.Grade
from Student, SC, Course
where Student.Sno = SC.Sno and Course.Cno = SC.Cno

--8.	查询性别为男、课程成绩及格的学生学号，姓名及课程号、成绩。
select Student.Sno, Student.Sname, SC.Cno, SC.Grade
from Student, SC
where Student.Sno = SC.Sno and Student.Ssex = '男'

--9.	查询平均成绩大于85分的学号、姓名、平均成绩。
select Student.Sno, Student.Sname, AVG(SC.Grade) '平均成绩'
from Student, SC
where Student.Sno = SC.Sno
group by Student.Sno, Student.Sname
having AVG(SC.Grade) >= 85

--10.	查询选修了数据库系统的学生的姓名及成绩。
select Student.Sname, SC.Grade
from Student, SC, Course
where Student.Sno = SC.Sno and Course.Cno = SC.Cno and Course.Cname = '数据库系统'

--11.	查询每个系的学生选修的1号课程的平均成绩，最高分，最低分，选课人数。
select AVG(SC.Grade) '平均成绩', MAX(SC.Grade) '最高分', MIN(SC.Grade) '最低分', COUNT(SC.Grade) '选课人数'
from Student, SC, Course
where Student.Sno = SC.Sno and Course.Cno = SC.Cno and Course.Cno = 1
group by Student.Sdept

--12.	查询同时选修了“1”课程和“2”课程的学生的姓名。（自身连接查询）
select Student.Sname
from Student
where Student.Sno in (
	select SC.Sno
	from SC
	where SC.Cno = 1 and SC.Sno in (
		select SC.Sno
		from SC
		where SC.Cno = 2
	)
)

select Student.Sname
from Student, SC SC1, SC SC2
where Student.Sno = SC1.Sno and Student.Sno = SC2.Sno and SC1.Cno = 1 and SC2.Cno = 2

--13.	查询至少选修了2门课程的学生的学生号。（自身连接）
select SC1.Sno
from SC SC1, SC SC2 
where SC1.Sno = SC2.Sno
group by SC1.Sno
having COUNT(SC1.Cno) >= 2

--14.	查询每门课程的先修课的先修课。（自身连接）
select Course2.Cpno
from Course Course1, Course Course2
where Course1.Cno = Course2.Cno
group by Course2.Cno, Course2.Cpno
