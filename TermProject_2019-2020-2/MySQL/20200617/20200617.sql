# 求出商品的入住时间在17年之后入住的商品卖的最好的(金额)男性用户是谁
use university;
select distinct userA.*
from `20200614_tb_user` userA,
     `20200612_tb_order` orderA,
     (
         select ORDER_PRICE.PRODUCT_ID, SUM(ORDER_PRICE.PROD_PRICE) PROD_PRICE
         from (
                  select prodA.PRODUCT_ID, prodA.PRODUCT_NAME, (prodA.PRODUCT_PRICE * orderA.PRODUCT_COUNT) PROD_PRICE
                  from `20200612_tb_order` orderA,
                       `20200614_tb_product` prodA
                  where orderA.PRODUCT_ID = prodA.PRODUCT_ID
                    and year(prodA.PRODUCT_WAREHOUSING_TIME) >= 2017
              ) ORDER_PRICE
         group by ORDER_PRICE.PRODUCT_ID
         order by PROD_PRICE desc
         limit 0,1
     ) orderB
where userA.USER_ID = orderA.USER_ID
  and userA.USER_SEX = '男'
  and orderA.PRODUCT_ID = orderB.PRODUCT_ID;


# 查出比整体商品的平均单价高的商品在19年的订单中的总价是多少
use university;
# 求出商品单价
select avg(prodA.PRODUCT_PRICE)
from `20200614_tb_product` prodA;
# 比整体商品的平均单价高的商品
select prodA.PRODUCT_ID
from `20200614_tb_product` prodA
where prodA.PRODUCT_PRICE > (
    select avg(prodA.PRODUCT_PRICE)
    from `20200614_tb_product` prodA
);
# 计算每项商品售出件数 IN 2019
select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT)
from `20200612_tb_order` orderA
where year(orderA.ORDER_TIME) = 2019
group by orderA.PRODUCT_ID;
# 求出商品
select *
from (
         select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT)
         from `20200612_tb_order` orderA
         where year(orderA.ORDER_TIME) = 2019
         group by orderA.PRODUCT_ID
     ) ORDER_PROD_COUNT,
     (
         select prodA.PRODUCT_ID
         from `20200614_tb_product` prodA
         where prodA.PRODUCT_PRICE > (
             select avg(prodA.PRODUCT_PRICE)
             from `20200614_tb_product` prodA
         )
     ) UP_AVG_PROD
where UP_AVG_PROD.PRODUCT_ID = ORDER_PROD_COUNT.PRODUCT_ID;


# 查出比每个父类下面的子类的商品的平均价格低的商品男性用户购买的订单详情(用户账号，用户性别，商品名称)(商品单价，商品数量(购买),总金额,订单编号,下单时间)
use university;
# 求出每个父类的平均单价
select prodA.PRODUCT_PARENT_ID, avg(prodA.PRODUCT_PRICE) PARENT_AVG
from `20200614_tb_product` prodA
where prodA.PRODUCT_PARENT_ID > 0
group by prodA.PRODUCT_PARENT_ID;
# 比每个父类下面的子类的商品的平均价格低的商品
select prodA.PRODUCT_ID
from `20200614_tb_product` prodA,
     (
         select prodA.PRODUCT_PARENT_ID, avg(prodA.PRODUCT_PRICE) PARENT_AVG
         from `20200614_tb_product` prodA
         where prodA.PRODUCT_PARENT_ID > 0
         group by prodA.PRODUCT_PARENT_ID
     ) AVG_PARENNT
where AVG_PARENNT.PRODUCT_PARENT_ID = prodA.PRODUCT_PARENT_ID
  and prodA.PRODUCT_PRICE < AVG_PARENNT.PARENT_AVG;
# 查询男性用户购买的订单
select *
from `20200612_tb_order` orderA,
     `20200614_tb_user` userA
where userA.USER_ID = orderA.USER_ID
  and userA.USER_SEX = '男';
# (用户账号，用户性别，商品名称)(商品单价，商品数量(购买),总金额,订单编号,下单时间)
select userA.USER_ACCOUNT,
       userA.USER_SEX,
       prodA.PRODUCT_NAME,
       prodA.PRODUCT_PRICE,
       orderA.PRODUCT_COUNT,
       (orderA.PRODUCT_COUNT * prodA.PRODUCT_PRICE) ITEM_TOTAL_PRICE,
       orderA.ORDER_NUMBER,
       orderA.ORDER_TIME
from `20200612_tb_order` orderA,
     `20200614_tb_user` userA,
     `20200614_tb_product` prodA
where userA.USER_ID = orderA.USER_ID
  and prodA.PRODUCT_ID = orderA.PRODUCT_ID
  and userA.USER_SEX = '男'
  and orderA.PRODUCT_ID in (
    select prodA.PRODUCT_ID
    from `20200614_tb_product` prodA,
         (
             select prodA.PRODUCT_PARENT_ID, avg(prodA.PRODUCT_PRICE) PARENT_AVG
             from `20200614_tb_product` prodA
             where prodA.PRODUCT_PARENT_ID > 0
             group by prodA.PRODUCT_PARENT_ID
         ) AVG_PARENNT
    where AVG_PARENNT.PRODUCT_PARENT_ID = prodA.PRODUCT_PARENT_ID
      and prodA.PRODUCT_PRICE < AVG_PARENNT.PARENT_AVG
);


# 查出最近10年内用户购买的最多的商品是哪个
use university;
# 求当前年
select year(now());
# 求10年前年号
select year(now()) - 10;
# 求10年内的订单
select orderA.*
from `20200612_tb_order` orderA
where year(orderA.ORDER_TIME) between year(now()) - 10 and year(now())
group by orderA.PRODUCT_ID;
# 求10年内的订单的商品销售情况
select orderA.PRODUCT_ID,
       sum(orderA.PRODUCT_COUNT) SUM_PRODUCT_COUNT
from `20200612_tb_order` orderA
where year(orderA.ORDER_TIME) between year(now()) - 10 and year(now())
group by orderA.PRODUCT_ID
order by SUM_PRODUCT_COUNT desc;
# show商品信息
select *
from `20200614_tb_product` prodA,
     (
         select orderA.PRODUCT_ID,
                sum(orderA.PRODUCT_COUNT) SUM_PRODUCT_COUNT
         from `20200612_tb_order` orderA
         where year(orderA.ORDER_TIME) between year(now()) - 10 and year(now())
         group by orderA.PRODUCT_ID
         order by SUM_PRODUCT_COUNT desc
         limit 0,1
     ) SALE_COUNT
where prodA.PRODUCT_ID = SALE_COUNT.PRODUCT_ID;


# 查询出库存量不足400的产品且在19年卖的最好的产品是哪些
use university;
# 计算每项商品售出件数 IN 2019
select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT) SALE_COUNT
from `20200612_tb_order` orderA
where year(orderA.ORDER_TIME) = 2019
group by orderA.PRODUCT_ID
order by SALE_COUNT desc
limit 0,1;
# 出库存量不足400的产品
select *
from `20200614_tb_product` prodA
where prodA.PRODUCT_TOTAL < 400;
# 2019年卖的最好的产品
select prodA.*
from `20200614_tb_product` prodA,
     (
         select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT) SALE_COUNT
         from `20200612_tb_order` orderA
         where year(orderA.ORDER_TIME) = 2019
         group by orderA.PRODUCT_ID
         order by SALE_COUNT desc
         limit 0,1
     ) SALE_PROD
where prodA.PRODUCT_ID = SALE_PROD.PRODUCT_ID
  and prodA.PRODUCT_TOTAL < 400;


# 查询出含有电(包括父节点和子节点)的商品女性用户购买最多的产品是哪个
use university;
# 含有电的商品
select prodA.PRODUCT_ID
from `20200614_tb_product` prodA
where prodA.PRODUCT_NAME like '%电%';
# 商品销售计数
select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT) SALE_COUNT
from `20200612_tb_order` orderA,
     `20200614_tb_user` userA
where userA.USER_ID = orderA.USER_ID
  and userA.USER_SEX = '女'
group by orderA.PRODUCT_ID
order by SALE_COUNT desc;
# 含有电(包括父节点和子节点)的商品女性用户购买最多的产品ID
select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT) SALE_COUNT
from `20200612_tb_order` orderA,
     `20200614_tb_user` userA,
     `20200614_tb_product` prodA
where userA.USER_ID = orderA.USER_ID
  and prodA.PRODUCT_ID = orderA.PRODUCT_ID
  and userA.USER_SEX = '女'
  and prodA.PRODUCT_NAME like '%电%'
group by orderA.PRODUCT_ID
order by SALE_COUNT desc
limit 0,1;
# 查询产品信息
select *
from `20200614_tb_product` prodA,
     (
         select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT) SALE_COUNT
         from `20200612_tb_order` orderA,
              `20200614_tb_user` userA,
              `20200614_tb_product` prodA
         where userA.USER_ID = orderA.USER_ID
           and prodA.PRODUCT_ID = orderA.PRODUCT_ID
           and userA.USER_SEX = '女'
           and prodA.PRODUCT_NAME like '%电%'
         group by orderA.PRODUCT_ID
         order by SALE_COUNT desc
         limit 0,1
     ) WOMAN_UP_SALE
where prodA.PRODUCT_ID = WOMAN_UP_SALE.PRODUCT_ID;