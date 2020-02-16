--1、	为student表的sname列创建索引。
CREATE INDEX indexStudentSname ON Student(Sname)

--2、	为student表按sname的升序，sage的降序建立索引。
CREATE INDEX indexStudentSnameSage ON Student(Sname ASC, Sage DESC)

--3、	根据course表的cname列降序创建唯一索引。
CREATE INDEX indexCourseCname ON Course(Cname DESC)

--4、	根据student表生成student1表，在student1表的sno列创建唯一聚集索引。
select *
into Student2
from Student
CREATE UNIQUE INDEX indexStudent2Sno ON Student2(Sno)

--5、	删除course表cname列上的索引。
DROP INDEX Course.indexCourseCname

--6、	使用存储过程查看student表上所有的索引。
EXEC sp_helpindex student
