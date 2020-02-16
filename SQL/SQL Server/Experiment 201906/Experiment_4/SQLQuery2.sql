--1、	查询学生总人数
select COUNT(Sno) '学生人数'
from Student

--2、	查询选修了课程的学生人数
select COUNT(distinct Sno) '选修学生人数'
from SC

--3、	计算1号课程的学生平均成绩
select AVG(Grade) '平均分'
from SC
where cno = 1

--4、	查询选修1号课程的学生最高分数
select MAX(Grade) '最高分'
from SC
where cno = 1

--5、	计算选修1号课程的学生人数、最高成绩、最低成绩及平均成绩
select COUNT(Sno) '学生人数', MAX(Grade) '最高分', MIN(Grade) '最低分', AVG(Grade) '平均分'
from SC
where cno = 1

--6、	求各个课程号及相应的选课人数
select COUNT(distinct Sno) '各个课程号选修学生人数'
from SC
group by Cno

--7、	查询选修了3门以上课程的学生学号
select Sno '选修了3门以上课程'
from SC
group by Sno
having COUNT(*) >= 3

select Sno '选修了3门以上课程'
from Student
where Sno in (
	select sc.Sno
	from SC
	group by SC.Sno
	having COUNT(*) >= 3
)

--8、	查询有3门以上课程是90分以上的学生的学号
select Sno '有3门以上课程是90分以上'
from SC
where Grade >= 90
group by Sno
having COUNT(*) >= 3

--9、	查询各专业的专业名及学生人数
select Sdept, COUNT(Sno) '各专业学生人数'
from Student
group by Sdept

--10、	查询平均成绩在80分以上的学生的学号及平均成绩
select Sno, AVG(Grade) '平均成绩'
from SC
--where AVG(Grade) >= 80
group by Sno
having AVG(Grade) >= 80

--11、	查询至少有2个人选修的课程的课程号，选课人数
select Cno, COUNT(Cno) '选课人数'
from SC
group by Cno
having COUNT(Cno) >= 2

--12、	查询选修了3号课程的学生的学号及其成绩，查询结果按分数降序排列
select Sno, Grade
from SC
where Cno = 3
order by Grade DESC
--where Cno = 3
--having Cno = 3

--13、	查询全体学生情况，查询结果按所在系的系号升序排列，同一系中的学生按年龄降序排列
select *
from Student
order by Sdept, Sage DESC