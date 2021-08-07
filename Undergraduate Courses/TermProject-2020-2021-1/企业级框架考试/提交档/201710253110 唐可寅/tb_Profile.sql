/*
 Navicat Premium Data Transfer

 Source Server         : Aliyun ECS MySQL
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : bj.kevinkda.cn:3306
 Source Schema         : university

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 23/09/2020 16:04:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_Profile
-- ----------------------------
DROP TABLE IF EXISTS `tb_Profile`;
CREATE TABLE `tb_Profile` (
  `Profile_ID` int NOT NULL AUTO_INCREMENT COMMENT '人员id',
  `Profile_Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '人员姓名',
  `Profile_Birthday` datetime NOT NULL COMMENT '人员年龄',
  `Profile_Gender` varchar(255) NOT NULL COMMENT '人员性别',
  `Profile_Career` varchar(255) NOT NULL COMMENT '人员职业',
  `Profile_Address` varchar(255) NOT NULL COMMENT '人员住所',
  `Profile_Mobile` varchar(11) NOT NULL COMMENT '人员手机号',
  PRIMARY KEY (`Profile_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_Profile
-- ----------------------------
BEGIN;
INSERT INTO `tb_Profile` VALUES (1, '张三', '1982-01-01 06:19:41', '男', '程序员', '玉桃园小区3号', '13718944477');
INSERT INTO `tb_Profile` VALUES (2, '李想', '1990-01-01 14:20:28', '女', '程序员', '玉桃区', '12900445631');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
