--1.	创建计算机系（CS）的学生信息视图V_1。
create view V_1
as
select *
from Student
where Sdept = 'CS'

--2.	建立计算机系(CS)选修了1号课程的学生信息视图V_2。
create view V_2
as
select distinct Student.Sno, Student.Sname, Student.Ssex, Student.Sage, Student.Sdept
from Student, SC
where Sdept = 'CS' and SC.Cno = 1

--3.	建立计算机系选修了1号课程且成绩在90分以上的学生的视图V_3。
create view V_3
as
select Student.Sno, Student.Sname
from Student, SC
where Student.Sno = SC.Sno and Student.Sdept = 'CS' and SC.Cno = 1 and SC.Grade >= 90

--4.	定义一个反映学生学号，姓名，出生年份的视图V_4。
create view V_4
as
select Student.Sno, Student.Sname, YEAR(GETDATE())-Student.Sage '出生年份'
from Student

--5.	将学生的学号及其平均成绩定义为一个视图V_5。
create view V_5
as
select SC.Sno, AVG(SC.Grade) '平均成绩'
from SC
group by SC.Sno

--6.	创建计算机系(CS)学生的平均成绩视图V_6,包括学号和平均成绩
create view V_6
as
select SC.Sno, AVG(SC.Grade) '平均成绩'
from Student, SC
where Student.Sno = SC.Sno and Student.Sdept = 'CS'
group by SC.Sno

--7.	通过V_2视图查询计算机系选修了1号课程的学生姓名，性别，年龄。
create view V_7
as
--select distinct V_2.Sno, V_2.Sname, V_2.Ssex, V_2.Sage, V_2.Sdept
select distinct V_2.Sname, V_2.Ssex, V_2.Sage
from V_2
--where Sdept = 'CS' and SC.Cno = 1

--8.	在V_5视图中查询平均成绩在90分以上的学生学号和平均成绩。
create view V_8
as
select *
from V_5
where 平均成绩 >= 90

--9.	将计算机系学生视图V_1中学号98002的学生姓名改为“刘辰”。
UPDATE V_1
SET Sname = '刘辰'
WHERE Sno =  '98002'

--10.	向计算机系学生视图V_1中插入一个新的学生记录：95029，赵新，20岁
INSERT INTO
V_1(Sno, Sname, Sage, Sdept)
VALUES
('95029','赵新',20,'CS')

--11.	删除视图V_1中学号为95029的记录。
DELETE V_1
WHERE Sno = '95029'