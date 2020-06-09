select *,
       if(
               CAR_TAX != null and CAR_TAX >= 20,
               (CAR_TAX + CAR_PRICE) * 0.2,
               (CAR_PRICE + if(
                       CAR_TAX is null,
                       0,
                       CAR_TAX
                   )) * 0.1
           )
from `20200603_tb_car0`;