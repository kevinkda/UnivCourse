# 查出用户的注册时间是10月份注册的用户购买了哪些产品(产品所有属性以及对应的产品属于哪个类型)
use university;
select orderA.PRODUCT_ID
from `20200614_tb_user` user,
     `20200612_tb_order` orderA
where user.USER_ID = orderA.USER_ID;
select orderA.PRODUCT_ID
from `20200614_tb_user` user,
     `20200612_tb_order` orderA
where user.USER_ID = orderA.USER_ID
  and month(user.USER_REG_TIME) = 10;

select user.USER_ID
from `20200614_tb_user` user
where month(user.USER_REG_TIME) = 10;

select *
from `20200614_tb_user` user
where month(user.USER_REG_TIME) = 10;

#  Plan A
select prod.*
from `20200614_tb_product` prod
where prod.PRODUCT_ID in (
    select orderA.PRODUCT_ID
    from `20200614_tb_user` user,
         `20200612_tb_order` orderA
    where user.USER_ID = orderA.USER_ID
      and month(user.USER_REG_TIME) = 10
);

# Plan B
select prod.PRODUCT_ID,
       prod.PRODUCT_NAME,
       prod.PRODUCT_PRICE,
       prod.PRODUCT_TOTAL,
       prod.PRODUCT_WAREHOUSING_TIME,
       prod.PRODUCT_PARENT_ID
from `20200614_tb_product` prod,
     `20200614_tb_user` user,
     `20200612_tb_order` orderA
where user.USER_ID = orderA.USER_ID
  and orderA.PRODUCT_ID = prod.PRODUCT_ID
  and month(user.USER_REG_TIME) = 10;
select prod.*
from `20200614_tb_product` prod,
     `20200614_tb_user` user,
     `20200612_tb_order` orderA
where user.USER_ID = orderA.USER_ID
  and orderA.PRODUCT_ID = prod.PRODUCT_ID
  and month(user.USER_REG_TIME) = 10;


# 查出比食品类产品的平均价格高的产品(不包括食品类产品)购买过的用户有哪些
use university;
# 查询食品类ID
select prod.PRODUCT_ID
from `20200614_tb_product` prod
where PRODUCT_NAME = '食品类';
# 查询食品类商品编号
select prod.PRODUCT_ID
from `20200614_tb_product` prod
where PRODUCT_PARENT_ID in (
    select prod.PRODUCT_ID
    from `20200614_tb_product` prod
    where PRODUCT_NAME = '食品类'
);
# 查询食品类商品的商品均价
select avg(prod.PRODUCT_PRICE)
from `20200614_tb_product` prod
where PRODUCT_PARENT_ID in (
    select prod.PRODUCT_ID
    from `20200614_tb_product` prod
    where PRODUCT_NAME = '食品类'
);
# 查询非食品类商品的商品ID
select prod.PRODUCT_ID
from `20200614_tb_product` prod
where PRODUCT_PARENT_ID not in (
    select prod.PRODUCT_ID
    from `20200614_tb_product` prod
    where PRODUCT_NAME = '食品类'
)
  and PRODUCT_PRICE > (
    select avg(prod.PRODUCT_PRICE)
    from `20200614_tb_product` prod
    where PRODUCT_PARENT_ID in (
        select prod.PRODUCT_ID
        from `20200614_tb_product` prod
        where PRODUCT_NAME = '食品类'
    )
);
# 查询用户信息
select user.*
from `20200614_tb_user` user,
     `20200612_tb_order` orderA
where user.USER_ID = orderA.USER_ID
  and orderA.PRODUCT_ID in (
    select prod.PRODUCT_ID
    from `20200614_tb_product` prod
    where PRODUCT_PARENT_ID not in (
        select prod.PRODUCT_ID
        from `20200614_tb_product` prod
        where PRODUCT_NAME = '食品类'
    )
      and PRODUCT_PRICE > (
        select avg(prod.PRODUCT_PRICE)
        from `20200614_tb_product` prod
        where PRODUCT_PARENT_ID in (
            select prod.PRODUCT_ID
            from `20200614_tb_product` prod
            where PRODUCT_NAME = '食品类'
        )
    )
);


# 求出订单表一个订单中至少买了两种不同的商品的用户详情
use university;
# 查询同订单购买的商品ID数量计数，返回订单编号
select orderA.ORDER_NUMBER
from `20200612_tb_order` orderA
group by orderA.ORDER_NUMBER
having count(orderA.ORDER_NUMBER) >= 2
order by orderA.ORDER_NUMBER;
# 查询同订单购买不同的商品ID数量计数，返回订单编号
select orderA.ORDER_NUMBER
from `20200612_tb_order` orderA
group by orderA.ORDER_NUMBER
having count(distinct orderA.PRODUCT_ID) >= 2
order by orderA.ORDER_NUMBER;
# 查询用户信息
select user.*
from `20200614_tb_user` user,
     `20200612_tb_order` orderA
where user.USER_ID = orderA.USER_ID
  and orderA.ORDER_NUMBER in (
    select orderA.ORDER_NUMBER
    from `20200612_tb_order` orderA
    group by orderA.ORDER_NUMBER
    having count(distinct orderA.PRODUCT_ID) >= 2
    order by orderA.ORDER_NUMBER
);


# 按照年份（下单时间)来分组，求出订单表中最高的年份的订单总价是多少
use university;
# 获得信息表，包含：PRODUCT_ID、PRODUCT_COUNT、ORDER_TIME
select orderA.PRODUCT_ID, orderA.PRODUCT_COUNT, year(orderA.ORDER_TIME)
from `20200612_tb_order` orderA;
# 求出订单表中最高的年份的年号
select max(year(orderA.ORDER_TIME))
from `20200612_tb_order` orderA;
# select *
# from `20200612_tb_order` orderA
# #      ,
# #      `20200614_tb_product` prod
# # where orderA.PRODUCT_ID = prod.PRODUCT_ID
# #   and
# # group by orderA.ORDER_NUMBER
# having year(orderA.ORDER_TIME) = max(year(orderA.ORDER_TIME));

select orderA.ORDER_NUMBER, (orderB.PRODUCT_COUNT * prod.PRODUCT_PRICE) TOTAL_PRICE
from `20200614_tb_product` prod,
     `20200612_tb_order` orderA,
     (
         select orderA.PRODUCT_ID, orderA.PRODUCT_COUNT, year(orderA.ORDER_TIME) ORDER_YEAR
         from `20200612_tb_order` orderA
     ) orderB
where prod.PRODUCT_ID = orderA.PRODUCT_ID
  and orderA.PRODUCT_ID = orderB.PRODUCT_ID
  and orderB.ORDER_YEAR = (
    select max(year(orderA.ORDER_TIME))
    from `20200612_tb_order` orderA
);
# 计算订单每个项目的价格和订单年份
select orderA.ORDER_ID,
       orderA.ORDER_NUMBER,
       orderA.PRODUCT_ID,
       orderA.PRODUCT_COUNT,
       (prod.PRODUCT_PRICE * orderA.PRODUCT_COUNT) TOTAL_PRICE,
       year(orderA.ORDER_TIME)                     ORDER_YEAR
from `20200614_tb_product` prod,
     `20200612_tb_order` orderA
where prod.PRODUCT_ID = orderA.PRODUCT_ID
  and prod.PRODUCT_PRICE is not null;

select orderA.ORDER_NUMBER, sum(TOTAL_PRICE) ORDER_PRICE
from (
         select orderA.ORDER_ID,
                orderA.ORDER_NUMBER,
                orderA.PRODUCT_ID,
                orderA.PRODUCT_COUNT,
                (prod.PRODUCT_PRICE * orderA.PRODUCT_COUNT) TOTAL_PRICE,
                year(orderA.ORDER_TIME)                     ORDER_YEAR
         from `20200614_tb_product` prod,
              `20200612_tb_order` orderA
         where prod.PRODUCT_ID = orderA.PRODUCT_ID
           and prod.PRODUCT_PRICE is not null
     ) orderA
where orderA.ORDER_YEAR = (
    select max(year(orderA.ORDER_TIME))
    from `20200612_tb_order` orderA
)
group by orderA.ORDER_NUMBER
order by orderA.ORDER_NUMBER;


# 求出没有下过订单的用户有哪些
use university;
select user.*
from `20200614_tb_user` user
where user.USER_ID not in (
    select distinct orderA.USER_ID
    from `20200612_tb_order` orderA
);


# 求出库存量在470以内的商品且用户没有购买过的商品有哪些?
use university;
#  查询被购买过的商品ID
select distinct orderA.PRODUCT_ID
from `20200612_tb_order` orderA;
# 库存量在470以内的商品且用户没有购买过的商品信息
select *
from `20200614_tb_product` prod
where PRODUCT_ID not in (
    select distinct orderA.PRODUCT_ID
    from `20200612_tb_order` orderA
)
  and prod.PRODUCT_TOTAL <= 470;