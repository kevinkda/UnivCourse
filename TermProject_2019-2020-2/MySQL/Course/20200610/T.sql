create procedure pro_car_data(in carName varchar(50))
begin
    select * from 20200603_tb_car0 where CAR_Name = carName;
end;

call pro_car_data('大众');