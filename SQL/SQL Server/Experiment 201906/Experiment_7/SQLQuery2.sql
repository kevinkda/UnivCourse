--对JXGL数据库进行查询，用子查询完成下列题。
--1.	查询未被选修的课程的课程名和学分。
select Course.Cname, Course.Ccredit
from Course
where Course.Cno not in (
	select DISTINCT SC.Cno
	from SC
)

--2.	查询“CS”系学生的选课信息。
select Student.Sno, Course.Cno, Course.Cname, Course.Ccredit, Course.Cpno
from Student, Course, SC
where Student.Sno = SC.Sno and Course.Cno = SC.Cno and Student.Sdept = 'CS'
group by Student.Sno, Course.Cno, Course.Cname, Course.Ccredit, Course.Cpno

--3.	查询不选1号课程的学生名字。
select Student.Sname
from Student
where Student.Sno not in (
	select Student.Sno
	from Student, SC
	where Student.Sno = SC.Sno and SC.Cno = 1
)

--4.	查询至少被2个学生选修的课程的课程名。
select Course.Cname
from Course, SC
where Course.Cno = SC.Cno
group by SC.Cno, Course.Cname
having COUNT(SC.Cno)>=2

--5.	查询计算机系（CS）选修了2门及以上课程的学生的学号。
select Student.Sno
from Student, SC
where Student.Sno = SC.Sno and Student.Sdept = 'CS'
group by Student.Sno
having COUNT(SC.Sno)>=2

--6.	查询与“钱横”在同一个系学习的学生信息。
select *
from Student
where Student.Sdept in (
	select Student.Sdept
	from Student
	where rtrim(Student.Sname) like '钱横'
)

--7.	查询选修了课程名为“数学分析”的学生学号、姓名和所在系。
select Student.Sno, Student.Sname, Student.Sdept
from Student, Course, SC
where Student.Sno = SC.Sno and Course.Cno = SC.Cno and Course.Cname = '数学分析'
--group by Student.Sno, Course.Cno, Course.Cname, Course.Ccredit, Course.Cpno

--8.	查询同时选修了“1”课程和“2”课程的学生的姓名。
select Student.Sname
from Student, SC SC1, SC SC2
where Student.Sno = SC1.Sno and Student.Sno = SC2.Sno and SC1.Cno = 1 and SC2.Cno = 2

--9.	查询至少选修了3门课程的学生的姓名。
select Student.Sname
from Student, SC
where Student.Sno = SC.Sno
group by Student.Sno, Student.Sname
having COUNT(SC.Sno)>=3

--10.	查询平均成绩在80分以上的学生的姓名。
select Student.Sname
from Student, SC
where Student.Sno = SC.Sno
group by Student.Sno, Student.Sname
having AVG(SC.Grade)>=80