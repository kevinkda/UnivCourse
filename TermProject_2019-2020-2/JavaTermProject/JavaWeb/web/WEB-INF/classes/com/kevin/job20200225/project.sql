-- 查询goods和carts的所有数据
select *
from university.carts,
     university.goods
where goods.strGoodsName = carts.strGoodsName;

-- 查询goods和carts表所有用户的数据
select carts.intSn,
       carts.strGoodsName,
       goods.strGoodsModel,
       goods.douGoodsPrice,
       carts.intItemQuantity,
       carts.strUserAccount
from university.carts,
     university.goods
where goods.strGoodsName = carts.strGoodsName;

-- 查询goods和carts表某用户的数据
select carts.intSn,
       carts.strGoodsName,
       goods.strGoodsModel,
       goods.douGoodsPrice,
       carts.intItemQuantity,
       carts.strUserAccount
from university.carts,
     university.goods
where goods.strGoodsName = carts.strGoodsName and carts.strUserAccount='user';