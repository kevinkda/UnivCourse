# 查出1992年4月份到1993年6月份的车型有哪些
select *
from 20200604_tb_car
where ORDER_TIME between '19920401' and '19930630';

# 超过了27年的订单有哪些
select (year(now()) - year(ORDER_TIME))
from `20200604_tb_car`;
select *
from `20200604_tb_car`
where (year(now()) - year(ORDER_TIME)) >= 27;

# 超过了9855天的订单有哪些
select to_days(now()) - to_days(ORDER_TIME)
from `20200604_tb_car`;
select *
from `20200604_tb_car`
where to_days(now()) - to_days(ORDER_TIME) > 9855;

# 求出在每个月的最后一天下的订单有哪些
select last_day(curdate());
select last_day(ORDER_TIME)
from `20200604_tb_car`;
select date(ORDER_TIME)
from `20200604_tb_car`;
select *
from `20200604_tb_car`
where date(ORDER_TIME) = last_day(ORDER_TIME);
