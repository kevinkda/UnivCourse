# MySQL Course Work 20200603

1. 将tb_car里面表的数据，一次性增加5条(写一个sql语句)

   ```mysql
   INSERT INTO 20200603_tb_car
   VALUES ('11', '奔驰', '2020-06-01', '200', '维修'),
          ('12', '奥迪', '2020-06-02', '300', '保养'),
          ('13', '大众', '2020-06-02', '320', '维修'),
          ('14', '宝马', '2020-06-02', '500', '保养'),
          ('15', '宝马', '2020-06-02', '400', '维修');
   ```
   

   
2. 将所有2019年6月份的数据每个汽车的价格增加100

   ```mysql
   UPDATE 20200603_tb_car
   SET CAR_PRICE = CAR_PRICE + 100
   WHERE CAR_ID IN (
       SELECT CAR_ID
       FROM (
                SELECT CAR_ID
                FROM 20200603_tb_car
                WHERE CAR_DATE LIKE '2019-06%'
            ) AS temp
   );
   ```

   

3. 查询出按照car_service分组后比平均价格还低的数据有哪些

   ```mysql
   
   ```

   