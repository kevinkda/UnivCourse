# 显示价格加上税的10%的新列显示
select *,
       if(CAR_TAX is null,
          0,
          (CAR_TAX + CAR_PRICE) * 0.1
           )
from `20200603_tb_car0`;

# 显示如果税不是空的，是本身，如果税是空，那么判断价格800以上%5,500-800 百分之七 其他百分之10% 这个位置的百分比是价格加税
select *,
       if(CAR_Tax is null,
          if(CAR_Price > 800,
             CAR_Price * 0.05,
             if(CAR_Price >= 500 and CAR_Price <= 800,
                CAR_Price * 0.08,
                CAR_Price * 0.1)
              ),
          CAR_Tax
           )
from `20200603_tb_car0`;

# 显示求出和比亚迪不同服务项中的最多的那个品牌是？
select CAR_Name, count(CAR_Service) 'COUNT'
from `20200603_tb_car0` F
where CAR_Service not in (
    select CAR_Service
    from `20200603_tb_car0` F
    where CAR_Name = '比亚迪'
)
group by CAR_Name
order by 'COUNT' desc
limit 0,1;

select CAR_Name, max(brand.COUNT)
from (
         select CAR_Name, count(CAR_Service) 'COUNT'
         from `20200603_tb_car0` F
         where CAR_Service not in (
             select CAR_Service
             from `20200603_tb_car0` F
             where CAR_Name = '比亚迪'
         )
         group by CAR_Name
     ) as brand;

select CAR_Name, max(CAR_Service)
from `20200603_tb_car0` F
where CAR_Service not in (
    select CAR_Service
    from `20200603_tb_car0` F
    where CAR_Name = '比亚迪'
);

select distinct CAR_Name
from `20200603_tb_car0`
where CAR_Service in (
    select max(CAR_Service)
    from `20200603_tb_car0`
    where CAR_Service not in (
        select CAR_Service
        from `20200603_tb_car0`
        where CAR_Name = '比亚迪'
    )
);

select *
from `20200603_tb_car0`;

# 如果税是空的，那么填充价格的10%,问填充的税高还是非填充的税高
select CAR_Id,
       CAR_Name,
       CAR_Date,
       CAR_Service,
       CAR_Price,
       ifnull(CAR_Tax, CAR_Price * 0.10) as CAR_Tax,
       if(
               (CAR_Tax / CAR_Price) > 0.1, '高',
               if((CAR_Tax / CAR_Price) < 0.1, '低', '等于')
           )                             as Tax_Per
from `20200603_tb_car0` car;