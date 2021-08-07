# 查询与宝马服务项目不同的车型
select CAR_SERVICE
from university.`20200603_tb_car`
where CAR_NAME = '宝马';

select *
from `20200603_tb_car`
where CAR_SERVICE not in (
    select CAR_SERVICE
    from university.`20200603_tb_car`
    where CAR_NAME = '宝马'
);

# 复制表结构
create table 20200603_tb_car1 as
select *
from 20200603_tb_car
where 1 = 2;

# 合并两结果集，去重
select *
from 20200603_tb_car
union
select *
from 20200603_tb_car1;
# 合并两结果集，不去重
select *
from 20200603_tb_car
union all
select *
from 20200603_tb_car1;

# 订单详情 concat
select concat(
               '订单号:', CAR_ID,
               '-车名:', CAR_NAME,
               '-日期:', CAR_DATE,
               '-价格:', CAR_PRICE,
               '-服务:', CAR_SERVICE
           )
from `20200603_tb_car`;
# 订单详情 group_concat
select group_concat(
               CAR_ID,
               CAR_NAME,
               CAR_PRICE
           ) as 'info'
from `20200603_tb_car`;
select group_concat(
               '订单号:', CAR_ID,
               '-车名:', CAR_NAME,
               '-日期:', CAR_DATE,
               '-价格:', CAR_PRICE,
               '-服务:', CAR_SERVICE
           ) as 'info'
from `20200603_tb_car`;
select CAR_ID,
#        CAR_NAME,
#        CAR_DATE,
       group_concat(
               '订单号:', CAR_ID,
               '-车名:', CAR_NAME,
               '-日期:', CAR_DATE,
               '-价格:', CAR_PRICE,
               '-服务:', CAR_SERVICE
           ) as 'info'
from `20200603_tb_car`;

alter table `20200603_tb_car`
    add PRICE DECIMAL(5, 2);

select *
from `20200603_tb_car`
where YEAR(CAR_DATE) = '2019';

select *
from `20200603_tb_car`
where left(date_format(CAR_DATE, '%Y%m%d %h:%i:%s'), 4) = '2020';
select *
from `20200603_tb_car`
where left(date_format(CAR_DATE, '%Y%m%d %h:%i:%s'), 6) = '201906';


