/*
Navicat MySQL Data Transfer

Source Server         : localtion
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2020-06-04 11:25:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `car1`
-- ----------------------------
DROP TABLE IF EXISTS `car1`;
CREATE TABLE `car1` (
  `CAR_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CAR_NAME` varchar(4) COLLATE utf8_icelandic_ci NOT NULL,
  `CAR_DATE` date DEFAULT NULL,
  PRIMARY KEY (`CAR_ID`),
  UNIQUE KEY `CAR_NAME` (`CAR_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of car1
-- ----------------------------
INSERT INTO `car1` VALUES ('1', '宝马', '2020-06-03');

-- ----------------------------
-- Table structure for `tb_car`
-- ----------------------------
DROP TABLE IF EXISTS `tb_car`;
CREATE TABLE `tb_car` (
  `CAR_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '默认汽车的主键int类型',
  `CAR_NAME` varchar(4) COLLATE utf8_icelandic_ci DEFAULT NULL COMMENT '汽车名字',
  `CAR_DATE` date DEFAULT NULL COMMENT '汽车生产日期',
  `CAR_PRICE` int(11) DEFAULT NULL,
  `PRICE` decimal(10,0) DEFAULT NULL,
  `CAR_SERVICE` varchar(255) COLLATE utf8_icelandic_ci DEFAULT NULL,
  `ORDER_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`CAR_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_car
-- ----------------------------
INSERT INTO `tb_car` VALUES ('1', '奔驰', '2020-06-01', '200', '124', '维修', '1992-04-12 12:12:08');
INSERT INTO `tb_car` VALUES ('2', '奥迪', '2020-06-02', '300', '268', '保养', '2020-06-03 10:41:15');
INSERT INTO `tb_car` VALUES ('3', '大众', '2020-06-02', '320', '268', '维修', '2020-06-03 10:41:15');
INSERT INTO `tb_car` VALUES ('4', '宝马', '2020-06-02', '500', '268', '保养', '2020-06-03 10:41:15');
INSERT INTO `tb_car` VALUES ('5', '宝马', '2020-06-02', '400', '268', '维修', '2020-06-03 10:41:15');
INSERT INTO `tb_car` VALUES ('6', '比亚迪', '2020-06-02', '400', '268', '清洗', '2020-06-03 10:41:15');
INSERT INTO `tb_car` VALUES ('7', '迈凯伦', '2020-06-03', '480', '340', '维修', '1992-04-12 12:12:08');
INSERT INTO `tb_car` VALUES ('8', 'GTR', '2020-06-03', '450', '320', '维修', '1993-06-12 09:11:08');

-- ----------------------------
-- Table structure for `tb_car1`
-- ----------------------------
DROP TABLE IF EXISTS `tb_car1`;
CREATE TABLE `tb_car1` (
  `CAR_ID` int(11) NOT NULL DEFAULT '0' COMMENT '默认汽车的主键int类型',
  `CAR_NAME` varchar(4) COLLATE utf8_icelandic_ci DEFAULT NULL COMMENT '汽车名字',
  `CAR_DATE` date DEFAULT NULL COMMENT '汽车生产日期',
  `CAR_PRICE` int(11) DEFAULT NULL,
  `CAR_SERVICE` varchar(255) COLLATE utf8_icelandic_ci DEFAULT NULL,
  `CAR_TAX` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_car1
-- ----------------------------
INSERT INTO `tb_car1` VALUES ('1', '奔驰', '2020-06-01', '200', '维修', '10');
INSERT INTO `tb_car1` VALUES ('2', '奥迪', '2020-06-02', '300', '保养', '15');
INSERT INTO `tb_car1` VALUES ('3', '大众', '2020-06-02', '320', '维修', null);
INSERT INTO `tb_car1` VALUES ('4', '宝马', '2020-06-02', '500', '保养', '16');
INSERT INTO `tb_car1` VALUES ('5', '三菱', '2020-06-02', '400', '维修', null);
INSERT INTO `tb_car1` VALUES ('6', '比亚迪', '2020-06-02', '400', '清洗', null);

-- ----------------------------
-- Table structure for `tb_car_info`
-- ----------------------------
DROP TABLE IF EXISTS `tb_car_info`;
CREATE TABLE `tb_car_info` (
  `CAR_INFO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CAR_INFO_CARD` varchar(20) COLLATE utf8_icelandic_ci NOT NULL,
  `CAR_INFO_TYPE` varchar(6) COLLATE utf8_icelandic_ci NOT NULL,
  `CAR_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`CAR_INFO_ID`),
  UNIQUE KEY `CAR_INFO_CARD` (`CAR_INFO_CARD`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_car_info
-- ----------------------------
INSERT INTO `tb_car_info` VALUES ('1', 'ESDF345', '进口', '1');
INSERT INTO `tb_car_info` VALUES ('2', 'ADF3145', '进口', '2');
INSERT INTO `tb_car_info` VALUES ('3', 'BHUF347', '进口', '3');

-- ----------------------------
-- Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `ORDER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ORDER_NUMBER` varchar(50) COLLATE utf8_icelandic_ci NOT NULL,
  `PRODUCT_ID` int(11) NOT NULL,
  `PRODUCT_COUNT` int(11) NOT NULL,
  `ORDER_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES ('1', 'qwrewer456456', '1', '2', '2020-06-01 09:26:16');
INSERT INTO `tb_order` VALUES ('2', 'etrt6772334wer', '2', '3', '2020-06-02 09:26:02');
INSERT INTO `tb_order` VALUES ('3', 'adsfsdf1234', '3', '2', '2020-06-04 09:26:33');
INSERT INTO `tb_order` VALUES ('4', 'chinasoft123', '1', '3', '2020-06-04 09:34:33');
INSERT INTO `tb_order` VALUES ('5', 'chinasoft123', '2', '2', '2020-06-04 09:34:36');
INSERT INTO `tb_order` VALUES ('6', 'chinasoft123', '3', '1', '2020-06-04 09:34:39');
INSERT INTO `tb_order` VALUES ('7', 'adsfsdf1234', '1', '2', '2020-06-04 10:31:00');

-- ----------------------------
-- Table structure for `tb_product`
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product` (
  `PRODUCT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PRODUCT_NAME` varchar(255) COLLATE utf8_icelandic_ci NOT NULL,
  `PRODUCT_PRICE` int(11) NOT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_product
-- ----------------------------
INSERT INTO `tb_product` VALUES ('1', '电蚊香片', '12');
INSERT INTO `tb_product` VALUES ('2', '洗脸盆', '5');
INSERT INTO `tb_product` VALUES ('3', '充电器', '8');
INSERT INTO `tb_product` VALUES ('4', '耳机', '23');

-- ----------------------------
-- Table structure for `tb_test`
-- ----------------------------
DROP TABLE IF EXISTS `tb_test`;
CREATE TABLE `tb_test` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(4) COLLATE utf8_icelandic_ci NOT NULL,
  `ENAME` char(4) COLLATE utf8_icelandic_ci NOT NULL,
  `ENUM` enum('F','M') COLLATE utf8_icelandic_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_test
-- ----------------------------
INSERT INTO `tb_test` VALUES ('4', 'aa', 'bb', 'F');
INSERT INTO `tb_test` VALUES ('5', 'aa1', 'bb1', 'M');
INSERT INTO `tb_test` VALUES ('6', 'aa1', 'bb1', 'M');
