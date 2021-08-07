--1．以数据库原理实验五——学生选课库中，用Transact-SQL语句实现下列简单数据查询操作。
--1)	查询选修了计算机体系结构的学生的基本信息。
select S.Snum, S.Sname, S.Sage, S.Sex, S.Sphone, S.Dnum
from S, C, SC
where S.Snum = SC.Snum and C.Cnum = SC.Cnum and C.Cname = '计算机体系结构'

--2)	查询年龄比李勇小的学生的学号和成绩。
select DISTINCT SC.Snum, SC.Sroce
from S, SC
where S.Snum = SC.Snum and S.Sage < (
	select S.Sage
	from S
	where S.Sname = '李勇'
)
group by SC.Snum, SC.Sroce

--3)	查询其他系中比系编号为‘D1’的学生中年龄最小者要大的学生的信息。
select S.Snum, S.Sname, S.Sage, S.Sex, S.Sphone, S.Dnum
from S
where S.Dnum != 'D1' and S.Sage > (
	select MIN(S.Sage)
	from S
	where S.Dnum = 'D1'
)

--4)	查询其他系中比系编号为‘D3’的学生年龄都大的学生的姓名。
select S.Sname
from S
where S.Dnum != 'D3' and S.Sage > (
	select MAX(S.Sage)
	from S
	where S.Dnum = 'D3'
)

--5)	查询‘C1’课程的成绩高于70的学生姓名。
select S.Sname
from S, SC
where S.Snum = SC.Snum and SC.Cnum = 'C1' and SC.Sroce >= 70

--6)	查询‘C1’课程的成绩不高于70的学生姓名。
select S.Sname
from S, SC
where S.Snum = SC.Snum and SC.Cnum = 'C1' and SC.Sroce <= 70


--7)	查询没有选修的学生姓名。
select DISTINCT S.Sname
from S
where S.Snum not in (
	select SC.Snum
	from SC
)

--8)	查询学校开设的课程总数。
select COUNT(Cnum) '开设课程总数'
from C

--9)	查询选修两门及两门以上课程的学生姓名。
select S.Sname
from S, SC
where S.Snum = SC.Snum
group by S.Sname
having COUNT(SC.Snum) >= 2

--10)	查询开设的课程和选修该课程的学生的总成绩、平均成绩、最高成绩和最低成绩。
select SC.Cnum, SUM(SC.Sroce) '总成绩', AVG(SC.Sroce) '平均成绩', MAX(SC.Sroce) '最高成绩', MIN(SC.Sroce) '最低成绩'
from SC
group by Cnum

--11)	查询以‘DB’开头,且倒数第3个字符为‘s’的课程的详细情况；
select *
from C
where C.Cname like 'DB\_%s__'

--12)	查询名字中第2个字为‘阳’的学生姓名和学号及选修的课程号、课程名；
select S.Sname, S.Snum, C.Cnum, C.Cname
from S, C, SC
where S.Snum = SC.Snum and C.Cnum = SC.Cnum and S.Sname like '_阳%'

--13)	列出选修了‘数学’或者‘大学英语’的学生学号、姓名、所在院系、选修课程号及成绩；
select S.Snum, S.Sname, S.Dnum, SC.Cnum , SC.Sroce
from S, C, SC
where S.Snum = SC.Snum and C.Cnum = SC.Cnum and SC.Snum in (
	select SC.Snum
	from C, SC
	where C.Cnum = SC.Cnum and C.Cname = '数学' and C.Cname = '大学英语'
	group by SC.Snum
)
select S.Snum, S.Sname, S.Dnum, SC.Cnum , SC.Sroce
from S, SC
where S.Snum = SC.Snum and SC.Cnum in (
	select C.Cnum
	from C
	where  C.Cname = '数学' or C.Cname = '大学英语' 
)

--14)	查询缺少成绩的所有学生的详细情况；
select *
from S
where S.Snum not in (
	select SC.Snum
	from SC
)

--15)	查询与‘张力’(假设姓名唯一)年龄不同的所有学生的信息；
select *
from S
where S.Sage != (
	select S.Sage
	from S
	where S.Sname like '张力'
)

--16)	查询所选课程的平均成绩大于张力的平均成绩的学生学号、姓名及平均成绩；
select SC.Snum, S.Sname, AVG(SC.Sroce) '平均成绩'
from S, SC
where S.Snum = SC.Snum
group by SC.Snum, S.Sname
having AVG(SC.Sroce) > (
	select AVG(SC.Sroce)
	from S, SC
	where S.Snum = SC.Snum and S.Sname like '张力'
	group by SC.Snum, S.Sname
)

--17)	列出只选修一门课程的学生的学号、姓名、院系及成绩；
select S.Snum, S.Sname, S.Dnum, SUM(SC.Sroce) '成绩'
from S, SC
where S.Snum = SC.Snum
group by S.Snum, S.Sname, S.Dnum
having COUNT(SC.Cnum) = 1

--18)	查询选修“数据库”或“数据结构”课程的学生的基本信息；
select S.Snum, S.Sname, S.Sage, S.Sex, S.Sphone, S.Dnum
from S, C, SC
where S.Snum = SC.Snum and C.Cnum = SC.Cnum and C.Cname in ('数据库','数据结构')

select *
from S
where S.Snum in (
	select SC.Snum
	from SC
	where SC.Cnum in (
		select C.Cnum
		from C
		where C.Cname in ('数据库', '数据结构')
	)
)

--19)	列出所有被选修课程的详细情况，包括课程号、课程名、学号、姓名及成绩；
select SC.Cnum, C.Cname, S.Snum, S.Sname, SC.Sroce
from S, C, SC
where S.Snum = SC.Snum and C.Cnum = SC.Cnum and C.Cnum in (
	select C.Cnum
	from C, SC
	where SC.Cnum is not NULL
)

--20)	查询只被一名学生选修的课程的课程号、课程名；
select SC.Cnum, C.Cname
from S, C, SC
where S.Snum = SC.Snum and C.Cnum = SC.Cnum and SC.Snum in (
	select SC.Snum
	from S, SC
	where S.Snum = SC.Snum
	group by SC.Snum
	having COUNT(SC.Cnum) = 1
)

--21)	使用嵌套查询列出选修了“数据结构”课程的学生学号和姓名；
select S.Snum, S.Sname
from S, C, SC
where S.Snum = SC.Snum and C.Cnum = SC.Cnum and C.Cname = '数据结构'

--22)	列出与‘张力’在一个院系的学生的信息；
select * 
from S
where S.Dnum in (
	select S.Dnum
	from S
	where S.Sname = '张力'
)

--23)	使用集合查询列出CS系的学生以及性别为女的学生名单；
select * 
from S
where S.Dnum = 'CS' or S.Sex = '女'