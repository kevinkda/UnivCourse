# 一次性插入5条数据
INSERT INTO 20200603_tb_car
VALUES ('11', '奔驰', '2020-06-01', '200', '维修'),
       ('12', '奥迪', '2020-06-02', '300', '保养'),
       ('13', '大众', '2020-06-02', '320', '维修'),
       ('14', '宝马', '2020-06-02', '500', '保养'),
       ('15', '宝马', '2020-06-02', '400', '维修');

# 一次性插入5条201906数据
INSERT INTO 20200603_tb_car
VALUES ('21', '奔驰', '2019-06-01', '200', '维修'),
       ('22', '奥迪', '2019-06-02', '300', '保养'),
       ('23', '大众', '2019-06-02', '320', '维修'),
       ('24', '宝马', '2019-06-02', '500', '保养'),
       ('25', '宝马', '2019-06-02', '400', '维修');

# 查询汽车
SELECT *
FROM 20200603_tb_car;

# 查询汽车信息
SELECT *
FROM 20200603_tb_car_info;

# 查询2019年6月份汽车
SELECT *
FROM 20200603_tb_car
WHERE CAR_DATE LIKE '2019-06%';

# 查询2019年6月份汽车ID
SELECT CAR_ID
FROM 20200603_tb_car
WHERE CAR_DATE LIKE '2019-06%';

# 将CAR_ID=21的数据每个汽车的价格增加100
UPDATE 20200603_tb_car
SET CAR_PRICE = CAR_PRICE + 100
WHERE CAR_ID = 21;

# 将所有2019年6月份的数据每个汽车的价格增加100
UPDATE 20200603_tb_car
SET CAR_PRICE = CAR_PRICE + 100
WHERE CAR_ID LIKE '2019-06%';

UPDATE 20200603_tb_car
SET CAR_PRICE = CAR_PRICE + 100
WHERE CAR_ID IN (
    SELECT CAR_ID
    FROM 20200603_tb_car
    WHERE CAR_DATE LIKE '2019-06%'
);

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

# 查询出按照car_service分组后比平均价格还低的数据有哪些

# 计数
SELECT COUNT(*)
FROM `20200603_tb_car` F
GROUP BY CAR_SERVICE;
# 计算平均值
SELECT AVG(CAR_PRICE)
FROM `20200603_tb_car` F
GROUP BY CAR_SERVICE;
# 按类型计算平均值
SELECT CAR_SERVICE AS 'TYPE', AVG(CAR_PRICE) AS 'SERVICE'
FROM `20200603_tb_car` F
GROUP BY CAR_SERVICE;
# 分组排序
SELECT *
FROM 20200603_tb_car
GROUP BY CAR_SERVICE, CAR_ID
ORDER BY CAR_SERVICE;
# car_service分组后比平均价格还低的数据
SELECT *
FROM `20200603_tb_car` F
WHERE (
        CAR_SERVICE = '保养'
        AND CAR_PRICE < (
        SELECT AVG(CAR_PRICE)
        FROM `20200603_tb_car` F
        WHERE CAR_SERVICE = '保养'
        GROUP BY CAR_SERVICE
    ))
   OR (
        CAR_SERVICE = '维修'
        AND CAR_PRICE < (
        SELECT AVG(CAR_PRICE)
        FROM `20200603_tb_car` F
        WHERE CAR_SERVICE = '维修'
        GROUP BY CAR_SERVICE
    ))
   OR (
        CAR_SERVICE = '清洗'
        AND CAR_PRICE < (
        SELECT AVG(CAR_PRICE)
        FROM `20200603_tb_car` F
        WHERE CAR_SERVICE = '清洗'
        GROUP BY CAR_SERVICE
    ))
# GROUP BY CAR_SERVICE
ORDER BY CAR_SERVICE;