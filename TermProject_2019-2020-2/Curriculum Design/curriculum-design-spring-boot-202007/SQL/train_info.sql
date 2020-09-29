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

 Date: 07/07/2020 22:30:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for train_info
-- ----------------------------
DROP TABLE IF EXISTS `train_info`;
CREATE TABLE `train_info` (
  `train_no` varchar(50) NOT NULL COMMENT '车次编号',
  `start_station` varchar(50) NOT NULL COMMENT '始发站',
  `arrival_station` varchar(50) NOT NULL COMMENT '终点站',
  `start_time` varchar(50) NOT NULL COMMENT '出发时间',
  `arrival_time` varchar(50) NOT NULL COMMENT '到达时间',
  `type` varchar(50) NOT NULL COMMENT '车次类型',
  `runtime` varchar(50) NOT NULL COMMENT '运行时间',
  `mile` decimal(18,1) NOT NULL COMMENT '里程',
  PRIMARY KEY (`train_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='火车车次信息表';

-- ----------------------------
-- Records of train_info
-- ----------------------------
BEGIN;
INSERT INTO `train_info` VALUES ('2599', '北京北', '赤峰', '20:49', '07:05', '普快', '10:16', 1000.0);
INSERT INTO `train_info` VALUES ('D73', '北京', '长春', '14:28', '21:18', '动车', '6:50', 1000.0);
INSERT INTO `train_info` VALUES ('T9', '北京西', '重庆', '15:16', '15:43', '特快', '24:27', 1000.0);
INSERT INTO `train_info` VALUES ('Z17', '北京西', '武昌', '18:01', '04:06', '直达', '10:05', 1000.0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
