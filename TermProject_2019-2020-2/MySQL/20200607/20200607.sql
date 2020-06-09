# 查询出以美字为结尾的用户有哪些
select *
from 20200605_tb_employee
where employee_name like '%美';

# 查询出出生在是湖北省的用户有哪些
select *
from 20200605_tb_employee
where employee_city like '湖北省%';

# 找出属于研发部的男性用户且名字长度是3的用户有哪些
select *
from 20200605_tb_employee
where employee_name like '___'
  and employee_dept = '研发部'
  and employee_sex = '男';


# 查询出所有的数据要求增加1项是employeeAccount是admin@在加上你的名字
select *,
       lpad(employee_name, (char_length(employee_name) + 6), 'admin@') 'employeeAccount'
from 20200605_tb_employee;

# 查询出年龄在30-50范围之间的员工且不属于湖北省的员工有哪些
select *
from 20200605_tb_employee
where (substring(now(), 1, 4) - substring(EMPLOYEE_CARD, 7, 4)) -
      (substring(EMPLOYEE_CARD, 11, 4) - date_format(now(), '%m%d') > 0) >= 30
  and (substring(now(), 1, 4) - substring(EMPLOYEE_CARD, 7, 4)) -
      (substring(EMPLOYEE_CARD, 11, 4) - date_format(now(), '%m%d') > 0) <= 50
  and employee_city not like '湖北省%';

# 查询以张字为开头的用户且属于研发部的员工有哪些
select *
from 20200605_tb_employee
where employee_dept = '研发部'
  and employee_name like '张%';