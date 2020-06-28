# 查询出订单表里面用户购买的商品数量最多的那个用户的信息资料
use university;
# 求出用户购买的商品数量最多的那个用户ID
select orderA.USER_ID
from `20200612_tb_order` orderA
group by orderA.USER_ID
order by orderA.USER_ID desc
limit 0,1;
# 求出用户的信息资料
select *
from `20200614_tb_user` user
where user.USER_ID = (
    select orderA.USER_ID
    from `20200612_tb_order` orderA
    group by orderA.USER_ID
    order by orderA.USER_ID desc
    limit 0,1
);


# 查询出商品的名称包含有面的商品在订单表中的总价是多少
use university;
# 查询出商品的名称包含有面的商品ID
select prod.PRODUCT_ID
from `20200614_tb_product` prod
where prod.PRODUCT_NAME like '%面%';
# 总价
select prod.PRODUCT_NAME,
       (prod.PRODUCT_PRICE * orderA.PRODUCT_COUNT) TOTAL_PRICE
from `20200614_tb_product` prod,
     `20200612_tb_order` orderA
where orderA.PRODUCT_ID = prod.PRODUCT_ID
  and prod.PRODUCT_NAME like '%面%';


# 查询出电器类卖的最不好的产品是哪个
use university;
# 查询电器类ID
select prod.PRODUCT_ID
from `20200614_tb_product` prod
where prod.PRODUCT_NAME = '电器类';
# 查询电器类商品ID
select prod.PRODUCT_ID
from `20200614_tb_product` prod
where PRODUCT_PARENT_ID = (
    select prod.PRODUCT_ID
    from `20200614_tb_product` prod
    where prod.PRODUCT_NAME = '电器类'
);
# 查询出电器类销量最不好的产品ID
select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT) SALE_COUNT
from `20200612_tb_order` orderA
where orderA.PRODUCT_ID in (
    select prod.PRODUCT_ID
    from `20200614_tb_product` prod
    where PRODUCT_PARENT_ID = (
        select prod.PRODUCT_ID
        from `20200614_tb_product` prod
        where prod.PRODUCT_NAME = '电器类'
    )
)
group by orderA.PRODUCT_ID
order by SALE_COUNT asc
limit 0,1;
# 求出产品信息
select prod.*
from `20200614_tb_product` prod,
     (
         select orderA.PRODUCT_ID, sum(orderA.PRODUCT_COUNT) SALE_COUNT
         from `20200612_tb_order` orderA
         where orderA.PRODUCT_ID in (
             select prod.PRODUCT_ID
             from `20200614_tb_product` prod
             where PRODUCT_PARENT_ID = (
                 select prod.PRODUCT_ID
                 from `20200614_tb_product` prod
                 where prod.PRODUCT_NAME = '电器类'
             )
         )
         group by orderA.PRODUCT_ID
         order by SALE_COUNT asc
         limit 0,1
     ) countA
WHERE prod.PRODUCT_ID = countA.PRODUCT_ID;


# 查询出用户的账号里面含有数字的有哪些
use university;
select user.*
from `20200614_tb_user` user
where user.USER_ACCOUNT regexp '[A-Za-z]*[\\d]+';
select user.*
from `20200614_tb_user` user
where user.USER_ACCOUNT regexp '[A-Za-z]*[0-9]+';


# 求出下订单表里面下订单在上午的订单量金额最大的是谁
use university;
# 求出上午下的订单
select orderA.USER_ID, orderA.PRODUCT_ID, orderA.PRODUCT_COUNT, orderA.ORDER_NUMBER
from `20200612_tb_order` orderA
where hour(orderA.ORDER_TIME) between 0 and 12;
# 求出上午下单的订单金额
select orderB.ORDER_NUMBER, (orderB.PRODUCT_COUNT * prod.PRODUCT_PRICE) TOTAL_PRICE
from `20200614_tb_product` prod,
     (
         select orderA.USER_ID, orderA.PRODUCT_ID, orderA.PRODUCT_COUNT, orderA.ORDER_NUMBER
         from `20200612_tb_order` orderA
         where hour(orderA.ORDER_TIME) between 0 and 12
     ) orderB
where prod.PRODUCT_ID = orderB.PRODUCT_ID
group by orderB.ORDER_NUMBER
;
# 计算上午下单的订单项目价格
select orderA.ORDER_NUMBER, (orderA.PRODUCT_COUNT * prod.PRODUCT_PRICE) ITEM_PRICE
from `20200614_tb_product` prod,
     `20200612_tb_order` orderA
where prod.PRODUCT_ID = orderA.PRODUCT_ID
  and hour(orderA.ORDER_TIME) between 0 and 12;
# 计算上午下单的订单价格
select ORDER_PRICE.ORDER_NUMBER, sum(ORDER_PRICE.ITEM_PRICE) TOTAL_PRICE
from (
         select orderA.ORDER_NUMBER, (orderA.PRODUCT_COUNT * prod.PRODUCT_PRICE) ITEM_PRICE
         from `20200614_tb_product` prod,
              `20200612_tb_order` orderA
         where prod.PRODUCT_ID = orderA.PRODUCT_ID
           and hour(orderA.ORDER_TIME) between 0 and 12
     ) ORDER_PRICE
group by ORDER_PRICE.ORDER_NUMBER
order by TOTAL_PRICE desc
limit 0,1;
# 求出用户信息
select distinct user.*
from `20200614_tb_user` user,
     `20200612_tb_order` orderA,
     (
         select ORDER_PRICE.ORDER_NUMBER, sum(ORDER_PRICE.ITEM_PRICE) TOTAL_PRICE
         from (
                  select orderA.ORDER_NUMBER, (orderA.PRODUCT_COUNT * prod.PRODUCT_PRICE) ITEM_PRICE
                  from `20200614_tb_product` prod,
                       `20200612_tb_order` orderA
                  where prod.PRODUCT_ID = orderA.PRODUCT_ID
                    and hour(orderA.ORDER_TIME) between 0 and 12
              ) ORDER_PRICE
         group by ORDER_PRICE.ORDER_NUMBER
         order by TOTAL_PRICE desc
         limit 0,1
     ) ORDER_PRICE
where user.USER_ID = orderA.USER_ID
  and orderA.ORDER_NUMBER = ORDER_PRICE.ORDER_NUMBER;


# 求出比调和油卖的好的产品是哪(是卖出的比较数量)
use university;
# 查询调和油ID
select prod.PRODUCT_ID
from `20200614_tb_product` prod
where prod.PRODUCT_NAME like '%调和油%';
# 查询调和油的销量
select orderA.PRODUCT_COUNT
from `20200612_tb_order` orderA
where orderA.PRODUCT_ID = (
    select prod.PRODUCT_ID
    from `20200614_tb_product` prod
    where prod.PRODUCT_NAME like '%调和油%'
);
# 求出比调和油卖的好的产品
select prod.*
from `20200614_tb_product` prod,
     `20200612_tb_order` orderA
where prod.PRODUCT_ID = orderA.PRODUCT_ID
  and orderA.PRODUCT_ID not in (
    select prod.PRODUCT_ID
    from `20200614_tb_product` prod
    where prod.PRODUCT_NAME like '%调和油%'
)
  and orderA.PRODUCT_COUNT > (
    select orderA.PRODUCT_COUNT
    from `20200612_tb_order` orderA
    where orderA.PRODUCT_ID = (
        select prod.PRODUCT_ID
        from `20200614_tb_product` prod
        where prod.PRODUCT_NAME like '%调和油%'
    )
);


# 求出用户的注册时间是在07之前的用户且用户不是订单中订单金额最少的那些用户
use university;
# 用户的注册时间是在07之前的用户
select userA.*
from `20200614_tb_user` userA
where year(USER_REG_TIME) < 2007;
# 计算订单价格
select ORDER_PRICE.ORDER_NUMBER, sum(ORDER_PRICE.ITEM_PRICE) TOTAL_PRICE
from (
         select orderA.ORDER_NUMBER, (orderA.PRODUCT_COUNT * prod.PRODUCT_PRICE) ITEM_PRICE
         from `20200614_tb_product` prod,
              `20200612_tb_order` orderA
         where prod.PRODUCT_ID = orderA.PRODUCT_ID
     ) ORDER_PRICE
group by ORDER_PRICE.ORDER_NUMBER
order by TOTAL_PRICE asc
limit 1,1000;
# 求出用户信息
select distinct userA.*
from `20200614_tb_user` userA,
     `20200612_tb_order` orderA,
     (
         select ORDER_PRICE.ORDER_NUMBER, sum(ORDER_PRICE.ITEM_PRICE) TOTAL_PRICE
         from (
                  select orderA.ORDER_NUMBER, (orderA.PRODUCT_COUNT * prod.PRODUCT_PRICE) ITEM_PRICE
                  from `20200614_tb_product` prod,
                       `20200612_tb_order` orderA
                  where prod.PRODUCT_ID = orderA.PRODUCT_ID
              ) ORDER_PRICE
         group by ORDER_PRICE.ORDER_NUMBER
         order by TOTAL_PRICE asc
         limit 1,1000
     ) TOTAL_PRICE
where userA.USER_ID = orderA.USER_ID
  and orderA.ORDER_NUMBER = TOTAL_PRICE.ORDER_NUMBER;


# 求出商品的入住时间在17年之后入住的商品卖的最好的(金额)男性用户是谁
use university;
# 商品的入住时间在17年之后入住的商品
select prodA.*
from `20200614_tb_product` prodA
where year(prodA.PRODUCT_WAREHOUSING_TIME) >= 2017;
# 男性用户
select userA.*
from `20200614_tb_user` userA
where userA.USER_SEX = '男';
# 计算2017年后入住的商品的订单项目金额
select prodA.PRODUCT_ID, prodA.PRODUCT_NAME, (prodA.PRODUCT_PRICE * orderA.PRODUCT_COUNT) PROD_PRICE
from `20200612_tb_order` orderA,
     `20200614_tb_product` prodA
where orderA.PRODUCT_ID = prodA.PRODUCT_ID
  and year(prodA.PRODUCT_WAREHOUSING_TIME) >= 2017;
# 计算2017年后入住的商品的订单金额
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
limit 0,1;
# 查询用户信息
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