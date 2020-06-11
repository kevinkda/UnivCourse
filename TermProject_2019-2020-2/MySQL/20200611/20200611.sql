# 利用视图查询出对应的按照价格排序（从高到低的第2-4条数据）
CREATE VIEW `university`.`20200603_view_car` AS
SELECT 20200603_tb_car0.*
FROM 20200603_tb_car0
ORDER BY 20200603_tb_car0.CAR_Price DESC;

select `20200603_tb_car0`.`CAR_Id`      AS `CAR_Id`,
       `20200603_tb_car0`.`CAR_Name`    AS `CAR_Name`,
       `20200603_tb_car0`.`CAR_Date`    AS `CAR_Date`,
       `20200603_tb_car0`.`CAR_Service` AS `CAR_Service`,
       `20200603_tb_car0`.`CAR_Price`   AS `CAR_Price`,
       `20200603_tb_car0`.`CAR_Tax`     AS `CAR_Tax`
from `20200603_tb_car0`
order by `20200603_tb_car0`.`CAR_Price` desc;

select *
from 20200603_view_car
limit 1,3;

# 存储过程完成每个品牌的税的价格增长原汽车价格的百分之2
CREATE
    DEFINER = `kevin`@`%` PROCEDURE `20200611_up_car_price`(param1 int)
    SQL SECURITY INVOKER
BEGIN
    UPDATE 20200603_tb_car0 SET CAR_Price=CAR_Price * 1.02;
END;

call 20200611_up_car_price(0);

# 利用自定义函数得到宝马汽车的价格是多少(价格加税的)
create
    definer = kevin@`%` function `20200611_select_bwm_price`(arg1 int) returns bigint
begin
    -- todo: implement
    declare prisum int;
    select sum(CAR_Price) from `20200603_tb_car0` where CAR_Name = '宝马' into prisum;
    return prisum;
end;


# 完成一个将函数带入到存储过程的例子(某个值是通过函数来返回的)
create procedure 20200611_select_function(IN arg1 int)
begin
    select 20200611_select_bwm_price(0);
end;

call 20200611_select_function(0);