# 创建 20200609_student 和 20200609_score 表
CREATE TABLE 20200609_student
(
    id         INT(10)     NOT NULL UNIQUE PRIMARY KEY,
    name       VARCHAR(20) NOT NULL,
    sex        VARCHAR(4),
    birth      YEAR,
    department VARCHAR(20),
    address    VARCHAR(50)
);
CREATE TABLE 20200609_score
(
    id     INT(10) NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT,
    stu_id INT(10) NOT NULL,
    c_name VARCHAR(20),
    grade  INT(10)
);
# 为 20200609_student 表和 20200609_score 表增加记录
INSERT INTO 20200609_student
VALUES (901, '张老大', '男', 1985, '计算机系', '北京市海淀区');
INSERT INTO 20200609_student
VALUES (902, '张老二', '男', 1986, '中文系', '北京市昌平区');
INSERT INTO 20200609_student
VALUES (903, '张三', '女', 1990, '中文系', '湖南省永州市');
INSERT INTO 20200609_student
VALUES (904, '李四', '男', 1990, '英语系', '辽宁省阜新市');
INSERT INTO 20200609_student
VALUES (905, '王五', '女', 1991, '英语系', '福建省厦门市');
INSERT INTO 20200609_student
VALUES (906, '王六', '男', 1988, '计算机系', '湖南省衡阳市');
INSERT INTO 20200609_score
VALUES (NULL, 901, '计算机', 98);
INSERT INTO 20200609_score
VALUES (NULL, 901, '英语', 80);
INSERT INTO 20200609_score
VALUES (NULL, 902, '计算机', 65);
INSERT INTO 20200609_score
VALUES (NULL, 902, '中文', 88);
INSERT INTO 20200609_score
VALUES (NULL, 903, '中文', 95);
INSERT INTO 20200609_score
VALUES (NULL, 904, '计算机', 70);
INSERT INTO 20200609_score
VALUES (NULL, 904, '英语', 92);
INSERT INTO 20200609_score
VALUES (NULL, 905, '英语', 94);
INSERT INTO 20200609_score
VALUES (NULL, 906, '计算机', 90);
INSERT INTO 20200609_score
VALUES (NULL, 906, '英语', 85);


# 查询student表的所有记录
select *
from `20200609_student`;

# 查询student表的第2条到4条记录
select *
from 20200609_student
limit 1,3;

# 从student表查询所有学生的学号（id）、姓名（name）和院系（department）的信息
select id, name, department
from 20200609_student;

# 从student表中查询计算机系和英语系的学生的信息
SELECT *
FROM 20200609_student
WHERE department IN ('计算机系', '英语系');

# 从student表中查询年龄18~22岁的学生信息
select year(now()) - birth
from 20200609_student;
select *
from 20200609_student
where year(now()) - birth between 18 and 22;

# 从student表中查询每个院系有多少人
select department, count(*)
from 20200609_student
group by department;

# 从score表中查询每个科目的最高分
select *
from 20200609_score;
select c_name, max(grade)
from 20200609_score
group by c_name;

# 查询李四的考试科目（c_name）和考试成绩（grade）
select stu.name, sc.c_name, sc.grade
from 20200609_student as stu,
     20200609_score as sc
where stu.id = sc.stu_id
  and stu.name = '李四';

# 用连接的方式查询所有学生的信息和考试信息
select *
from 20200609_student as stu,
     20200609_score as sc
where stu.id = sc.stu_id;
select stu.id, stu.name, stu.sex, stu.birth, stu.address, sc.c_name, sc.grade
from 20200609_student as stu,
     20200609_score as sc
where stu.id = sc.stu_id;

# 计算每个学生的总成绩
select sc.stu_id, sum(grade)
from 20200609_score as sc
group by sc.stu_id
order by sc.stu_id;

# 计算每个考试科目的平均成绩
select c_name, avg(grade)
from 20200609_score
group by c_name;

# 查询计算机成绩低于95的学生信息
select *
from 20200609_student
where id in (
    select stu_id
    from 20200609_score
    where c_name = '计算机'
      and grade < 95
);

# 查询同时参加计算机和英语考试的学生的信息
select *
from 20200609_student
where id in (
    select stu_id
    from 20200609_score
    where c_name = '计算机'
      and grade > 0
)
  and id in (
    select stu_id
    from 20200609_score
    where c_name = '英语'
      and grade > 0
);

# 将计算机考试成绩按从高到低进行排序
select *
from 20200609_score
where c_name = '计算机'
order by grade desc;

# 从student表和score表中查询出学生的学号，然后合并查询结果
# select *
# from 20200609_score as s
#          INNER JOIN 20200609_student as st
# where s.stu_id = st.id;
SELECT id
FROM 20200609_student
UNION
SELECT stu_id
FROM 20200609_score;

# 查询姓张或者姓王的同学的姓名、院系和考试科目及成绩
select stu.name, stu.department, sc.c_name, sc.grade
from 20200609_student as stu,
     20200609_score as sc
where stu.id = sc.stu_id
    and name like '张%'
   or name like '王%';

# 查询都是湖南的学生的姓名、年龄、院系和考试科目及成绩
select stu.name, stu.department, sc.c_name, sc.grade
from 20200609_student as stu,
     20200609_score as sc
where stu.id = sc.stu_id
  and stu.address like '湖南%';