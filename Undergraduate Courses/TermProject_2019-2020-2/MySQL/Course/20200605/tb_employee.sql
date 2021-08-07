/*
Navicat MySQL Data Transfer

Source Server         : localtion
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2020-06-05 09:11:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_employee`
-- ----------------------------
DROP TABLE IF EXISTS `20200605_tb_employee`;
CREATE TABLE `tb_employee` (
  `EMPLOYEE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_NAME` varchar(255) COLLATE utf8_icelandic_ci DEFAULT NULL,
  `EMPLOYEE_CARD` varchar(255) COLLATE utf8_icelandic_ci DEFAULT NULL,
  `EMPLOYEE_CITY` varchar(255) COLLATE utf8_icelandic_ci DEFAULT NULL,
  `EMPLOYEE_DEPT` varchar(255) COLLATE utf8_icelandic_ci DEFAULT NULL,
  `EMPLOYEE_SEX` varchar(255) COLLATE utf8_icelandic_ci DEFAULT NULL,
  `EMPLOYEE_TIME` date DEFAULT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_icelandic_ci;

-- ----------------------------
-- Records of tb_employee
-- ----------------------------
INSERT INTO `20200605_tb_employee` VALUES ('1', '林志玲', '420104199809341235', '湖北省武汉市', '公关部', '女', '1998-02-02');
INSERT INTO `20200605_tb_employee` VALUES ('2', '林志炫', '420104198809341235', '湖北省襄阳市', '研发部', '男', '1996-03-02');
INSERT INTO `20200605_tb_employee` VALUES ('3', '张志林', '420104197809341235', '湖北省枣阳市', '研发部', '男', '1986-07-09');
INSERT INTO `20200605_tb_employee` VALUES ('4', '五小林', '420104197709341235', '湖南省长沙市', '后勤部', '男', '1976-09-09');
INSERT INTO `20200605_tb_employee` VALUES ('5', '小小美', '420104199909341235', '湖北省沙洋市', '研发部', '女', '1996-09-24');
INSERT INTO `20200605_tb_employee` VALUES ('6', '喜洋洋', '420104196909341235', '江西省南昌市', '研发部', '女', '1986-09-24');
