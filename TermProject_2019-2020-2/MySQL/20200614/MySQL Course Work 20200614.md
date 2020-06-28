# MySQL Course Work 20200614



1. 查出用户的注册时间是10月份注册的用户购买了哪些产品(产品所有属性以及对应的产品属于哪个类型)

   ```mysql
   use university;
   
   # Plan A
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
   select prod.*
   from `20200614_tb_product` prod,
        `20200614_tb_user` user,
        `20200612_tb_order` orderA
   where user.USER_ID = orderA.USER_ID
     and orderA.PRODUCT_ID = prod.PRODUCT_ID
     and month(user.USER_REG_TIME) = 10;
   ```

1. 查出比食品类产品的平均价格高的产品(不包括食品类产品)购买过的用户有哪些

   ```mysql
   use university;
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
   ```

1. 求出订单表一个订单中至少买了两种不同的商品的用户详情

   ```mysql
   use university;
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
   ```

1. 按照年份（下单时间)来分组，求出订单表中最高的年份的订单总价是多少

   ```mysql
   use university;
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
   ```
   
1. 求出没有下过订单的用户有哪些

   ```mysql
   use university;
   select user.*
   from `20200614_tb_user` user
   where user.USER_ID not in (
       select distinct orderA.USER_ID
       from `20200612_tb_order` orderA
   );
   ```

1. 求出库存量在470以内的商品且用户没有购买过的商品有哪些?

   ```mysql
   use university;
   select *
   from `20200614_tb_product` prod
   where PRODUCT_ID not in (
       select distinct orderA.PRODUCT_ID
       from `20200612_tb_order` orderA
   )
     and prod.PRODUCT_TOTAL <= 470;
   ```

