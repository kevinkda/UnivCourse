/*
 Navicat Premium Data Transfer

 Source Server         : Aliyun ECS MySQL
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : bj.kevinkda.cn:3306
 Source Schema         : university

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 01/06/2020 14:48:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `userId` int NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `userName` varchar(255) NOT NULL COMMENT '用户名',
  `userCard` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证，唯一约束',
  `userSex` varchar(1) DEFAULT NULL COMMENT '性别',
  `userHeight` double(5,2) DEFAULT NULL COMMENT '身高',
  PRIMARY KEY (`userId`) USING BTREE,
  UNIQUE KEY `userCard` (`userCard`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='MySQL Course\n20200601';

SET FOREIGN_KEY_CHECKS = 1;
