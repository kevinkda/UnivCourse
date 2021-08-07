/*1:查询出订单表里面用户购买的商品数量最多的那个用户的信息资料*/
use university;
select count(PRODUCT_COUNT) c, USER_ID userId
from tb_order
group by USER_ID
select max(A.c)
from (select count(PRODUCT_COUNT) c, USER_ID userId from tb_order group by USER_ID) A
select *
from (select count(PRODUCT_COUNT) c, USER_ID userId from tb_order group by USER_ID) K
where k.c = (select max(A.c) from (select count(PRODUCT_COUNT) c, USER_ID userId from tb_order group by USER_ID) A)

/*2查询出商品的名称包含有面的商品在订单表中的总价是多少*/
select PRODUCT_ID, PRODUCT_PRICE
from tb_product
where PRODUCT_NAME like '%面%'
  and PRODUCT_PARENT_ID != -100


/*3:查询出电器类卖的最不好的产品是哪个*/

/*4:查询出用户的账号里面含有数字的有哪些*/

/*5求出下订单表里面下订单在上午的订单量金额最大的是谁*/

/*6求出比调和油卖的好的产品是哪(是卖出的比较数量)*/

/*7求出用户的注册时间是在07之前的用户且用户不是订单中订单金额最少的那些用户*/

/*8求出商品的入住时间在17年之后入住的商品卖的最好的(金额)男性用户是谁*/