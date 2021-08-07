# MySQL Course Work 20200605

1. 查询出订单表在2020年6月份的订单的总价是多少

   ```mysql
   # TYPE A
   select ORDER_ID,
          PRODUCT_COUNT * PRODUCT_PRICE Total_Price
   from `20200605_tb_order` orderA,
        `20200605_tb_product` product
   where orderA.PRODUCT_ID = product.PRODUCT_ID
     and ORDER_TIME between '20200601' and '20200630';
   # TYPE B
   select ORDER_ID,
          PRODUCT_COUNT * PRODUCT_PRICE Total_Price
   from `20200605_tb_order` orderA,
        `20200605_tb_product` product
   where orderA.PRODUCT_ID = product.PRODUCT_ID
     and left(date_format(ORDER_TIME, '%Y%m%d %h:%i:%s'), 6) = '202006';
   ```
   
   
   
2. 查询出订单表高于2020年6月份的订单的分别有哪些

   ```mysql
   # 查询出订单总价高于202006订单均价的订单信息
   select *
   from `20200605_tb_order`
   where ORDER_ID in (
       select ORDER_ID
       from `20200605_tb_order` orderA,
            `20200605_tb_product` product
       where orderA.PRODUCT_ID = product.PRODUCT_ID
         and left(date_format(ORDER_TIME, '%Y%m%d %h:%i:%s'), 6) = '202006'
         and (PRODUCT_PRICE * PRODUCT_COUNT) > (
           select avg(PRODUCT_PRICE * PRODUCT_COUNT)
           from `20200605_tb_order` orderA,
                `20200605_tb_product` product
           where orderA.PRODUCT_ID = product.PRODUCT_ID
             and left(date_format(ORDER_TIME, '%Y%m%d %h:%i:%s'), 6) = '202006'
       )
   );
   ```

   

3. 查询出产品卖的最不好的是哪个产品

   ```mysql
   # 未卖出的商品
   select *
   from `20200605_tb_product`
   where PRODUCT_ID not in (
       select PRODUCT_ID
       from `20200605_tb_order`
   );
   # 已卖出的商品销量差的
   select *
   from `20200605_tb_product`
   where PRODUCT_ID in (
       select PRODUCT_ID
       from 20200605_tb_order
       where PRODUCT_COUNT = (
           select min(PRODUCT_COUNT)
           from 20200605_tb_order
       )
   );
   # 未卖出的商品和已卖出的商品销量差的
   select *
   from `20200605_tb_product`
   where PRODUCT_ID not in (
       select PRODUCT_ID
       from `20200605_tb_order`
   )
      or PRODUCT_ID in (
       select PRODUCT_ID
       from 20200605_tb_order
       where PRODUCT_COUNT = (
           select min(PRODUCT_COUNT)
           from 20200605_tb_order
       )
   );
   ```

   

4. 思考题---查询出高于每个订单的产品的平均价格有哪些订单(这个订单的总价除以数量)

   ```mysql
   select *
   from `20200605_tb_order`
   where PRODUCT_ID in (
       select orderA.PRODUCT_ID
    from `20200605_tb_order` orderA,
            `20200605_tb_product` product
       where orderA.PRODUCT_ID = product.PRODUCT_ID
         and PRODUCT_COUNT * PRODUCT_PRICE / PRODUCT_COUNT > (
           select avg(PRODUCT_COUNT * PRODUCT_PRICE / PRODUCT_COUNT)
           from `20200605_tb_order` orderA,
                `20200605_tb_product` product
           where orderA.PRODUCT_ID = product.PRODUCT_ID
       )
   );
   ```
   
   