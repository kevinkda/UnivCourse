select *
from university.`20200603_tb_car`
where CAR_NAME like '%众%';


select *
from university.`20200603_tb_car`
where CAR_NAME like '[大小]众';


# 查出以'林'开头的女孩
select *
from `20200605_tb_employee`
where EMPLOYEE_NAME like '林%'
  and EMPLOYEE_SEX = '女';

# 查出包含'林'的员工且在湖北
select *
from `20200605_tb_employee`
where EMPLOYEE_NAME like '%林%'
  and EMPLOYEE_CITY like '湖北%';

# 查出公关部男性，名字包含'林'
select *
from `20200605_tb_employee`
where EMPLOYEE_DEPT = '公关部'
  and EMPLOYEE_SEX = '男'
  and EMPLOYEE_NAME not like '%林%';

insert into 20200605_tb_employee values (null,'张林','420104197809341235','湖北省荆州','研发部','女','1976-08-09');