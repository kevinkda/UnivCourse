/*
 Navicat Premium Data Transfer

 Source Server         : Aliyun ECS MySQL
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : bj.kevinkda.cn:3306
 Source Schema         : temp

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 09/07/2020 01:39:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Tb_role
-- ----------------------------
DROP TABLE IF EXISTS `Tb_role`;
CREATE TABLE `Tb_role` (
  `Role_ID` int NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `Role_NAME` varchar(50) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`Role_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色信息表\n课程设计202007\n框架企业级应用';

-- ----------------------------
-- Records of Tb_role
-- ----------------------------
BEGIN;
INSERT INTO `Tb_role` VALUES (1, 'admin');
INSERT INTO `Tb_role` VALUES (2, 'sysadmin');
INSERT INTO `Tb_role` VALUES (3, 'user');
COMMIT;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `USER_ID` int NOT NULL COMMENT '用户ID自增',
  `USER_ACCOUNT` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '账号',
  `USER_PASSWORD` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `USER_REG_TIME` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '用户注册时间',
  `USER_CARD` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '身份证号',
  `USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '用户的名字',
  `USER_SEX` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='课程设计202007\n框架企业级应用';

-- ----------------------------
-- Records of tb_user
-- ----------------------------
BEGIN;
INSERT INTO `tb_user` VALUES (1, 'admin', '123', '1999-12-12 11:32:22', '420104198803210872', '林志玲', '女');
INSERT INTO `tb_user` VALUES (2, 'userKk', '123', '2005-10-11 12:32:22', '420104198703210872', '蔡依林', '女');
INSERT INTO `tb_user` VALUES (3, 'khj', '123', '2006-10-12 13:32:22', '420104198603210872', '林志颖', '男');
INSERT INTO `tb_user` VALUES (4, 'adm12', '123', '2000-09-12 14:32:22', '420104199903210872', '周杰伦', '男');
INSERT INTO `tb_user` VALUES (5, 'evo123', '123', '2007-08-12 16:32:22', '420104199303210872', '迪丽热巴', '女');
INSERT INTO `tb_user` VALUES (6, 'fufu123', '123', '2001-06-12 09:32:22', '420104199203210872', '小刚', '男');
INSERT INTO `tb_user` VALUES (7, 'mumu89', '123', '2008-05-12 07:32:22', '420104199503210872', '乌龙', '男');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
