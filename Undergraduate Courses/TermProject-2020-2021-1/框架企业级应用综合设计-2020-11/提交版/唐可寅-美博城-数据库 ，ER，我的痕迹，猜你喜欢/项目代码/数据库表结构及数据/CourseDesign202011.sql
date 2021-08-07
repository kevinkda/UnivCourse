/*
 Navicat Premium Data Transfer

 Source Server         : Aliyun ECS MySQL
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : bj.kevinkda.cn:3306
 Source Schema         : CourseDesign202011

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 27/11/2020 00:44:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for amapDistrictTable
-- ----------------------------
DROP TABLE IF EXISTS `amapDistrictTable`;
CREATE TABLE `amapDistrictTable`
(
    `districtId` int NOT NULL AUTO_INCREMENT COMMENT '区域ID',
    `citycode`   varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci  DEFAULT NULL COMMENT '城市编码',
    `adcode`     int                                                           DEFAULT NULL,
    `name`       varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci  DEFAULT NULL COMMENT '行政区名',
    `polyline`   text CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci,
    `center`     varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci DEFAULT NULL COMMENT '边界坐标',
    `level`      varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci  DEFAULT NULL COMMENT '行政区级别',
    `parentId`   int NOT NULL COMMENT '上级行政区ID',
    PRIMARY KEY (`districtId`) USING BTREE,
    KEY `amapDistrictTable_adcode_index` (`adcode`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 4002
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_german2_ci COMMENT ='高德行政区化表';

-- ----------------------------
-- Records of amapDistrictTable
-- ----------------------------
BEGIN;
INSERT INTO `amapDistrictTable`
VALUES (282, NULL, 100000, '中华人民共和国', NULL, '116.3683244,39.915085', 'country', -100);
INSERT INTO `amapDistrictTable`
VALUES (283, NULL, 230000, '黑龙江省', NULL, '126.642464,45.756967', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (284, '0464', 230900, '七台河市', NULL, '131.015584,45.771266', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (285, '0464', 230903, '桃山区', NULL, '131.015848,45.771217', 'district', 284);
INSERT INTO `amapDistrictTable`
VALUES (286, '0464', 230921, '勃利县', NULL, '130.575025,45.751573', 'district', 284);
INSERT INTO `amapDistrictTable`
VALUES (287, '0464', 230902, '新兴区', NULL, '130.889482,45.794258', 'district', 284);
INSERT INTO `amapDistrictTable`
VALUES (288, '0464', 230904, '茄子河区', NULL, '131.071561,45.776587', 'district', 284);
INSERT INTO `amapDistrictTable`
VALUES (289, '0468', 230400, '鹤岗市', NULL, '130.277487,47.332085', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (290, '0468', 230422, '绥滨县', NULL, '131.860526,47.289892', 'district', 289);
INSERT INTO `amapDistrictTable`
VALUES (291, '0468', 230403, '工农区', NULL, '130.276652,47.331678', 'district', 289);
INSERT INTO `amapDistrictTable`
VALUES (292, '0468', 230407, '兴山区', NULL, '130.30534,47.35997', 'district', 289);
INSERT INTO `amapDistrictTable`
VALUES (293, '0468', 230402, '向阳区', NULL, '130.292478,47.345372', 'district', 289);
INSERT INTO `amapDistrictTable`
VALUES (294, '0468', 230404, '南山区', NULL, '130.275533,47.31324', 'district', 289);
INSERT INTO `amapDistrictTable`
VALUES (295, '0468', 230421, '萝北县', NULL, '130.829087,47.577577', 'district', 289);
INSERT INTO `amapDistrictTable`
VALUES (296, '0468', 230405, '兴安区', NULL, '130.236169,47.252911', 'district', 289);
INSERT INTO `amapDistrictTable`
VALUES (297, '0468', 230406, '东山区', NULL, '130.31714,47.337385', 'district', 289);
INSERT INTO `amapDistrictTable`
VALUES (298, '0458', 230700, '伊春市', NULL, '128.899396,47.724775', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (299, '0458', 230722, '嘉荫县', NULL, '130.397684,48.891378', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (300, '0458', 230726, '南岔县', NULL, '129.28246,47.137314', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (301, '0458', 230718, '乌翠区', NULL, '128.669859,47.726728', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (302, '0458', 230717, '伊美区', NULL, '128.907303,47.728171', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (303, '0458', 230719, '友好区', NULL, '128.84075,47.853778', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (304, '0458', 230751, '金林区', NULL, '129.429117,47.413074', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (305, '0458', 230723, '汤旺县', NULL, '129.571108,48.454651', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (306, '0458', 230724, '丰林县', NULL, '129.5336,48.290455', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (307, '0458', 230781, '铁力市', NULL, '128.030561,46.985772', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (308, '0458', 230725, '大箐山县', NULL, '129.020793,47.028397', 'district', 298);
INSERT INTO `amapDistrictTable`
VALUES (309, '0457', 232700, '大兴安岭地区', NULL, '124.711526,52.335262', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (310, '0457', 232701, '漠河市', NULL, '122.536256,52.972074', 'district', 309);
INSERT INTO `amapDistrictTable`
VALUES (311, '0457', 232722, '塔河县', NULL, '124.710516,52.335229', 'district', 309);
INSERT INTO `amapDistrictTable`
VALUES (312, '0457', 232721, '呼玛县', NULL, '126.662105,51.726998', 'district', 309);
INSERT INTO `amapDistrictTable`
VALUES (313, '0457', 232718, '加格达奇区', NULL, '124.126716,50.424654', 'district', 309);
INSERT INTO `amapDistrictTable`
VALUES (314, '0455', 231200, '绥化市', NULL, '126.99293,46.637393', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (315, '0455', 231226, '绥棱县', NULL, '127.111121,47.247195', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (316, '0455', 231283, '海伦市', NULL, '126.969383,47.460428', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (317, '0455', 231224, '庆安县', NULL, '127.510024,46.879203', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (318, '0455', 231221, '望奎县', NULL, '126.484191,46.83352', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (319, '0455', 231202, '北林区', NULL, '126.990665,46.634912', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (320, '0455', 231223, '青冈县', NULL, '126.112268,46.686596', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (321, '0455', 231222, '兰西县', NULL, '126.289315,46.259037', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (322, '0455', 231225, '明水县', NULL, '125.907544,47.183527', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (323, '0455', 231282, '肇东市', NULL, '125.991402,46.069471', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (324, '0455', 231281, '安达市', NULL, '125.329926,46.410614', 'district', 314);
INSERT INTO `amapDistrictTable`
VALUES (325, '0451', 230100, '哈尔滨市', NULL, '126.642464,45.756967', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (326, '0451', 230126, '巴彦县', NULL, '127.403602,46.081889', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (327, '0451', 230123, '依兰县', NULL, '129.565594,46.315105', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (328, '0451', 230128, '通河县', NULL, '128.747786,45.977618', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (329, '0451', 230127, '木兰县', NULL, '128.042675,45.949826', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (330, '0451', 230125, '宾县', NULL, '127.48594,45.759369', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (331, '0451', 230124, '方正县', NULL, '128.836131,45.839536', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (332, '0451', 230108, '平房区', NULL, '126.629257,45.605567', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (333, '0451', 230129, '延寿县', NULL, '128.331886,45.455648', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (334, '0451', 230183, '尚志市', NULL, '127.968539,45.214953', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (335, '0451', 230113, '双城区', NULL, '126.308784,45.377942', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (336, '0451', 230110, '香坊区', NULL, '126.667049,45.713067', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (337, '0451', 230102, '道里区', NULL, '126.612532,45.762035', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (338, '0451', 230184, '五常市', NULL, '127.15759,44.919418', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (339, '0451', 230112, '阿城区', NULL, '126.972726,45.538372', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (340, '0451', 230111, '呼兰区', NULL, '126.603302,45.98423', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (341, '0451', 230109, '松北区', NULL, '126.563066,45.814656', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (342, '0451', 230103, '南岗区', NULL, '126.652098,45.755971', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (343, '0451', 230104, '道外区', NULL, '126.648838,45.78454', 'district', 325);
INSERT INTO `amapDistrictTable`
VALUES (344, '0452', 230200, '齐齐哈尔市', NULL, '123.95792,47.342081', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (345, '0452', 230281, '讷河市', NULL, '124.882172,48.481133', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (346, '0452', 230225, '甘南县', NULL, '123.506034,47.917838', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (347, '0452', 230229, '克山县', NULL, '125.874355,48.034342', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (348, '0452', 230230, '克东县', NULL, '126.249094,48.03732', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (349, '0452', 230223, '依安县', NULL, '125.307561,47.890098', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (350, '0452', 230227, '富裕县', NULL, '124.469106,47.797172', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (351, '0452', 230207, '碾子山区', NULL, '122.887972,47.51401', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (352, '0452', 230204, '铁锋区', NULL, '123.973555,47.339499', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (353, '0452', 230203, '建华区', NULL, '123.955888,47.354494', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (354, '0452', 230208, '梅里斯达斡尔族区', NULL, '123.754599,47.311113', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (355, '0452', 230221, '龙江县', NULL, '123.187225,47.336388', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (356, '0452', 230202, '龙沙区', NULL, '123.957338,47.341736', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (357, '0452', 230206, '富拉尔基区', NULL, '123.638873,47.20697', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (358, '0452', 230205, '昂昂溪区', NULL, '123.813181,47.156867', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (359, '0452', 230231, '拜泉县', NULL, '126.091911,47.607363', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (360, '0452', 230224, '泰来县', NULL, '123.41953,46.39233', 'district', 344);
INSERT INTO `amapDistrictTable`
VALUES (361, '0456', 231100, '黑河市', NULL, '127.499023,50.249585', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (362, '0456', 231183, '嫩江市', NULL, '125.229904,49.177461', 'district', 361);
INSERT INTO `amapDistrictTable`
VALUES (363, '0456', 231102, '爱辉区', NULL, '127.497639,50.249027', 'district', 361);
INSERT INTO `amapDistrictTable`
VALUES (364, '0456', 231181, '北安市', NULL, '126.508737,48.245437', 'district', 361);
INSERT INTO `amapDistrictTable`
VALUES (365, '0456', 231124, '孙吴县', NULL, '127.327315,49.423941', 'district', 361);
INSERT INTO `amapDistrictTable`
VALUES (366, '0456', 231123, '逊克县', NULL, '128.476152,49.582974', 'district', 361);
INSERT INTO `amapDistrictTable`
VALUES (367, '0456', 231182, '五大连池市', NULL, '126.197694,48.512688', 'district', 361);
INSERT INTO `amapDistrictTable`
VALUES (368, '0453', 231000, '牡丹江市', NULL, '129.618602,44.582962', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (369, '0453', 231004, '爱民区', NULL, '129.601232,44.595443', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (370, '0453', 231081, '绥芬河市', NULL, '131.164856,44.396864', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (371, '0453', 231002, '东安区', NULL, '129.623292,44.582399', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (372, '0453', 231084, '宁安市', NULL, '129.470019,44.346836', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (373, '0453', 231086, '东宁市', NULL, '131.125296,44.063578', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (374, '0453', 231003, '阳明区', NULL, '129.634645,44.596328', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (375, '0453', 231025, '林口县', NULL, '130.268402,45.286645', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (376, '0453', 231085, '穆棱市', NULL, '130.527085,44.91967', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (377, '0453', 231005, '西安区', NULL, '129.61311,44.581032', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (378, '0453', 231083, '海林市', NULL, '129.387902,44.574149', 'district', 368);
INSERT INTO `amapDistrictTable`
VALUES (379, '0467', 230300, '鸡西市', NULL, '130.975966,45.300046', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (380, '0467', 230306, '城子河区', NULL, '131.010501,45.338248', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (381, '0467', 230304, '滴道区', NULL, '130.846823,45.348812', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (382, '0467', 230305, '梨树区', NULL, '130.697781,45.092195', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (383, '0467', 230303, '恒山区', NULL, '130.910636,45.213242', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (384, '0467', 230302, '鸡冠区', NULL, '130.974374,45.30034', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (385, '0467', 230307, '麻山区', NULL, '130.481126,45.209607', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (386, '0467', 230382, '密山市', NULL, '131.874137,45.54725', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (387, '0467', 230321, '鸡东县', NULL, '131.148907,45.250892', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (388, '0467', 230381, '虎林市', NULL, '132.973881,45.767985', 'district', 379);
INSERT INTO `amapDistrictTable`
VALUES (389, '0454', 230800, '佳木斯市', NULL, '130.361634,46.809606', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (390, '0454', 230881, '同江市', NULL, '132.510119,47.651131', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (391, '0454', 230826, '桦川县', NULL, '130.723713,47.023039', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (392, '0454', 230828, '汤原县', NULL, '129.904463,46.730048', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (393, '0454', 230805, '东风区', NULL, '130.403297,46.822476', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (394, '0454', 230803, '向阳区', NULL, '130.361786,46.809645', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (395, '0454', 230804, '前进区', NULL, '130.377684,46.812345', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (396, '0454', 230811, '郊区', NULL, '130.351588,46.80712', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (397, '0454', 230822, '桦南县', NULL, '130.570112,46.240118', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (398, '0454', 230883, '抚远市', NULL, '134.294501,48.364707', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (399, '0454', 230882, '富锦市', NULL, '132.037951,47.250747', 'district', 389);
INSERT INTO `amapDistrictTable`
VALUES (400, '0459', 230600, '大庆市', NULL, '125.11272,46.590734', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (401, '0459', 230604, '让胡路区', NULL, '124.868341,46.653254', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (402, '0459', 230605, '红岗区', NULL, '124.889528,46.403049', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (403, '0459', 230622, '肇源县', NULL, '125.081974,45.518832', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (404, '0459', 230606, '大同区', NULL, '124.818509,46.034304', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (405, '0459', 230623, '林甸县', NULL, '124.877742,47.186411', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (406, '0459', 230624, '杜尔伯特蒙古族自治县', NULL, '124.446259,46.865973', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (407, '0459', 230603, '龙凤区', NULL, '125.145794,46.573948', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (408, '0459', 230602, '萨尔图区', NULL, '125.114643,46.596356', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (409, '0459', 230621, '肇州县', NULL, '125.273254,45.708685', 'district', 400);
INSERT INTO `amapDistrictTable`
VALUES (410, '0469', 230500, '双鸭山市', NULL, '131.157304,46.643442', 'city', 283);
INSERT INTO `amapDistrictTable`
VALUES (411, '0469', 230502, '尖山区', NULL, '131.15896,46.642961', 'district', 410);
INSERT INTO `amapDistrictTable`
VALUES (412, '0469', 230522, '友谊县', NULL, '131.810622,46.775159', 'district', 410);
INSERT INTO `amapDistrictTable`
VALUES (413, '0469', 230506, '宝山区', NULL, '131.404294,46.573366', 'district', 410);
INSERT INTO `amapDistrictTable`
VALUES (414, '0469', 230505, '四方台区', NULL, '131.333181,46.594347', 'district', 410);
INSERT INTO `amapDistrictTable`
VALUES (415, '0469', 230503, '岭东区', NULL, '131.163675,46.591076', 'district', 410);
INSERT INTO `amapDistrictTable`
VALUES (416, '0469', 230523, '宝清县', NULL, '132.206415,46.328781', 'district', 410);
INSERT INTO `amapDistrictTable`
VALUES (417, '0469', 230524, '饶河县', NULL, '134.021162,46.801288', 'district', 410);
INSERT INTO `amapDistrictTable`
VALUES (418, '0469', 230521, '集贤县', NULL, '131.13933,46.72898', 'district', 410);
INSERT INTO `amapDistrictTable`
VALUES (419, NULL, 440000, '广东省', NULL, '113.280637,23.125178', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (420, '0754', 440500, '汕头市', NULL, '116.708463,23.37102', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (421, '0754', 440515, '澄海区', NULL, '116.76336,23.46844', 'district', 420);
INSERT INTO `amapDistrictTable`
VALUES (422, '0754', 440514, '潮南区', NULL, '116.423607,23.249798', 'district', 420);
INSERT INTO `amapDistrictTable`
VALUES (423, '0754', 440523, '南澳县', NULL, '117.027105,23.419562', 'district', 420);
INSERT INTO `amapDistrictTable`
VALUES (424, '0754', 440512, '濠江区', NULL, '116.729528,23.279345', 'district', 420);
INSERT INTO `amapDistrictTable`
VALUES (425, '0754', 440513, '潮阳区', NULL, '116.602602,23.262336', 'district', 420);
INSERT INTO `amapDistrictTable`
VALUES (426, '0754', 440511, '金平区', NULL, '116.703583,23.367071', 'district', 420);
INSERT INTO `amapDistrictTable`
VALUES (427, '0754', 440507, '龙湖区', NULL, '116.732015,23.373754', 'district', 420);
INSERT INTO `amapDistrictTable`
VALUES (428, '0757', 440600, '佛山市', NULL, '113.122717,23.028762', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (429, '0757', 440607, '三水区', NULL, '112.899414,23.16504', 'district', 428);
INSERT INTO `amapDistrictTable`
VALUES (430, '0757', 440608, '高明区', NULL, '112.882123,22.893855', 'district', 428);
INSERT INTO `amapDistrictTable`
VALUES (431, '0757', 440606, '顺德区', NULL, '113.281826,22.75851', 'district', 428);
INSERT INTO `amapDistrictTable`
VALUES (432, '0757', 440605, '南海区', NULL, '113.145577,23.031562', 'district', 428);
INSERT INTO `amapDistrictTable`
VALUES (433, '0757', 440604, '禅城区', NULL, '113.112414,23.019643', 'district', 428);
INSERT INTO `amapDistrictTable`
VALUES (434, '0758', 441200, '肇庆市', NULL, '112.472529,23.051546', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (435, '0758', 441224, '怀集县', NULL, '112.182466,23.913072', 'district', 434);
INSERT INTO `amapDistrictTable`
VALUES (436, '0758', 441225, '封开县', NULL, '111.502973,23.434731', 'district', 434);
INSERT INTO `amapDistrictTable`
VALUES (437, '0758', 441223, '广宁县', NULL, '112.440419,23.631486', 'district', 434);
INSERT INTO `amapDistrictTable`
VALUES (438, '0758', 441284, '四会市', NULL, '112.695028,23.340324', 'district', 434);
INSERT INTO `amapDistrictTable`
VALUES (439, '0758', 441226, '德庆县', NULL, '111.78156,23.141711', 'district', 434);
INSERT INTO `amapDistrictTable`
VALUES (440, '0758', 441203, '鼎湖区', NULL, '112.565249,23.155822', 'district', 434);
INSERT INTO `amapDistrictTable`
VALUES (441, '0758', 441202, '端州区', NULL, '112.472329,23.052662', 'district', 434);
INSERT INTO `amapDistrictTable`
VALUES (442, '0758', 441204, '高要区', NULL, '112.460846,23.027694', 'district', 434);
INSERT INTO `amapDistrictTable`
VALUES (443, '0752', 441300, '惠州市', NULL, '114.412599,23.079404', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (444, '0752', 441324, '龙门县', NULL, '114.259986,23.723894', 'district', 443);
INSERT INTO `amapDistrictTable`
VALUES (445, '0752', 441323, '惠东县', NULL, '114.723092,22.983036', 'district', 443);
INSERT INTO `amapDistrictTable`
VALUES (446, '0752', 441322, '博罗县', NULL, '114.284254,23.167575', 'district', 443);
INSERT INTO `amapDistrictTable`
VALUES (447, '0752', 441303, '惠阳区', NULL, '114.469444,22.78851', 'district', 443);
INSERT INTO `amapDistrictTable`
VALUES (448, '0752', 441302, '惠城区', NULL, '114.413978,23.079883', 'district', 443);
INSERT INTO `amapDistrictTable`
VALUES (449, '0755', 440300, '深圳市', NULL, '114.085947,22.547', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (450, '0755', 440306, '宝安区', NULL, '113.828671,22.754741', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (451, '0755', 440305, '南山区', NULL, '113.92943,22.531221', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (452, '0755', 440304, '福田区', NULL, '114.05096,22.541009', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (453, '0755', 440308, '盐田区', NULL, '114.235366,22.555069', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (454, '0755', 440303, '罗湖区', NULL, '114.123885,22.555341', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (455, '0755', 440310, '坪山区', NULL, '114.338441,22.69423', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (456, '0755', 440307, '龙岗区', NULL, '114.251372,22.721511', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (457, '0755', 440309, '龙华区', NULL, '114.044346,22.691963', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (458, '0755', 440311, '光明区', NULL, '113.935895,22.748816', 'district', 449);
INSERT INTO `amapDistrictTable`
VALUES (459, '0759', 440800, '湛江市', NULL, '110.364977,21.274898', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (460, '0759', 440881, '廉江市', NULL, '110.284961,21.611281', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (461, '0759', 440883, '吴川市', NULL, '110.780508,21.428453', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (462, '0759', 440825, '徐闻县', NULL, '110.175718,20.326083', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (463, '0759', 440882, '雷州市', NULL, '110.088275,20.908523', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (464, '0759', 440811, '麻章区', NULL, '110.329167,21.265997', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (465, '0759', 440804, '坡头区', NULL, '110.455632,21.24441', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (466, '0759', 440803, '霞山区', NULL, '110.406382,21.194229', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (467, '0759', 440823, '遂溪县', NULL, '110.255321,21.376915', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (468, '0759', 440802, '赤坎区', NULL, '110.361634,21.273365', 'district', 459);
INSERT INTO `amapDistrictTable`
VALUES (469, '0756', 440400, '珠海市', NULL, '113.553986,22.224979', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (470, '0756', 440403, '斗门区', NULL, '113.297739,22.209117', 'district', 469);
INSERT INTO `amapDistrictTable`
VALUES (471, '0756', 440404, '金湾区', NULL, '113.345071,22.139122', 'district', 469);
INSERT INTO `amapDistrictTable`
VALUES (472, '0756', 440402, '香洲区', NULL, '113.55027,22.271249', 'district', 469);
INSERT INTO `amapDistrictTable`
VALUES (473, '0768', 445100, '潮州市', NULL, '116.632301,23.661701', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (474, '0768', 445122, '饶平县', NULL, '117.00205,23.668171', 'district', 473);
INSERT INTO `amapDistrictTable`
VALUES (475, '0768', 445102, '湘桥区', NULL, '116.63365,23.664675', 'district', 473);
INSERT INTO `amapDistrictTable`
VALUES (476, '0768', 445103, '潮安区', NULL, '116.67931,23.461012', 'district', 473);
INSERT INTO `amapDistrictTable`
VALUES (477, '0668', 440900, '茂名市', NULL, '110.919229,21.659751', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (478, '0668', 440983, '信宜市', NULL, '110.941656,22.352681', 'district', 477);
INSERT INTO `amapDistrictTable`
VALUES (479, '0668', 440981, '高州市', NULL, '110.853251,21.915153', 'district', 477);
INSERT INTO `amapDistrictTable`
VALUES (480, '0668', 440982, '化州市', NULL, '110.63839,21.654953', 'district', 477);
INSERT INTO `amapDistrictTable`
VALUES (481, '0668', 440904, '电白区', NULL, '111.007264,21.507219', 'district', 477);
INSERT INTO `amapDistrictTable`
VALUES (482, '0668', 440902, '茂南区', NULL, '110.920542,21.660425', 'district', 477);
INSERT INTO `amapDistrictTable`
VALUES (483, '0750', 440700, '江门市', NULL, '113.094942,22.590431', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (484, '0750', 440784, '鹤山市', NULL, '112.961795,22.768104', 'district', 483);
INSERT INTO `amapDistrictTable`
VALUES (485, '0750', 440704, '江海区', NULL, '113.120601,22.572211', 'district', 483);
INSERT INTO `amapDistrictTable`
VALUES (486, '0750', 440783, '开平市', NULL, '112.692262,22.366286', 'district', 483);
INSERT INTO `amapDistrictTable`
VALUES (487, '0750', 440781, '台山市', NULL, '112.793414,22.250713', 'district', 483);
INSERT INTO `amapDistrictTable`
VALUES (488, '0750', 440785, '恩平市', NULL, '112.314051,22.182956', 'district', 483);
INSERT INTO `amapDistrictTable`
VALUES (489, '0750', 440705, '新会区', NULL, '113.038584,22.520247', 'district', 483);
INSERT INTO `amapDistrictTable`
VALUES (490, '0750', 440703, '蓬江区', NULL, '113.07859,22.59677', 'district', 483);
INSERT INTO `amapDistrictTable`
VALUES (491, '0762', 441600, '河源市', NULL, '114.697802,23.746266', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (492, '0762', 441624, '和平县', NULL, '114.941473,24.44318', 'district', 491);
INSERT INTO `amapDistrictTable`
VALUES (493, '0762', 441622, '龙川县', NULL, '115.256415,24.101174', 'district', 491);
INSERT INTO `amapDistrictTable`
VALUES (494, '0762', 441623, '连平县', NULL, '114.495952,24.364227', 'district', 491);
INSERT INTO `amapDistrictTable`
VALUES (495, '0762', 441625, '东源县', NULL, '114.742711,23.789093', 'district', 491);
INSERT INTO `amapDistrictTable`
VALUES (496, '0762', 441602, '源城区', NULL, '114.696828,23.746255', 'district', 491);
INSERT INTO `amapDistrictTable`
VALUES (497, '0762', 441621, '紫金县', NULL, '115.184383,23.633744', 'district', 491);
INSERT INTO `amapDistrictTable`
VALUES (498, '0766', 445300, '云浮市', NULL, '112.044439,22.929801', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (499, '0766', 445322, '郁南县', NULL, '111.535921,23.237709', 'district', 498);
INSERT INTO `amapDistrictTable`
VALUES (500, '0766', 445381, '罗定市', NULL, '111.578201,22.765415', 'district', 498);
INSERT INTO `amapDistrictTable`
VALUES (501, '0766', 445321, '新兴县', NULL, '112.23083,22.703204', 'district', 498);
INSERT INTO `amapDistrictTable`
VALUES (502, '0766', 445302, '云城区', NULL, '112.04471,22.930827', 'district', 498);
INSERT INTO `amapDistrictTable`
VALUES (503, '0766', 445303, '云安区', NULL, '112.005609,23.073152', 'district', 498);
INSERT INTO `amapDistrictTable`
VALUES (504, '0660', 441500, '汕尾市', NULL, '115.364238,22.774485', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (505, '0660', 441521, '海丰县', NULL, '115.337324,22.971042', 'district', 504);
INSERT INTO `amapDistrictTable`
VALUES (506, '0660', 441523, '陆河县', NULL, '115.657565,23.302682', 'district', 504);
INSERT INTO `amapDistrictTable`
VALUES (507, '0660', 441581, '陆丰市', NULL, '115.644203,22.946104', 'district', 504);
INSERT INTO `amapDistrictTable`
VALUES (508, '0660', 441502, '城区', NULL, '115.363667,22.776227', 'district', 504);
INSERT INTO `amapDistrictTable`
VALUES (509, '0662', 441700, '阳江市', NULL, '111.975107,21.859222', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (510, '0662', 441781, '阳春市', NULL, '111.7905,22.169598', 'district', 509);
INSERT INTO `amapDistrictTable`
VALUES (511, '0662', 441702, '江城区', NULL, '111.968909,21.859182', 'district', 509);
INSERT INTO `amapDistrictTable`
VALUES (512, '0662', 441721, '阳西县', NULL, '111.617556,21.75367', 'district', 509);
INSERT INTO `amapDistrictTable`
VALUES (513, '0662', 441704, '阳东区', NULL, '112.011267,21.864728', 'district', 509);
INSERT INTO `amapDistrictTable`
VALUES (514, '0663', 445200, '揭阳市', NULL, '116.355733,23.543778', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (515, '0663', 445281, '普宁市', NULL, '116.165082,23.29788', 'district', 514);
INSERT INTO `amapDistrictTable`
VALUES (516, '0663', 445222, '揭西县', NULL, '115.838708,23.4273', 'district', 514);
INSERT INTO `amapDistrictTable`
VALUES (517, '0663', 445224, '惠来县', NULL, '116.295832,23.029834', 'district', 514);
INSERT INTO `amapDistrictTable`
VALUES (518, '0663', 445203, '揭东区', NULL, '116.412947,23.569887', 'district', 514);
INSERT INTO `amapDistrictTable`
VALUES (519, '0663', 445202, '榕城区', NULL, '116.357045,23.535524', 'district', 514);
INSERT INTO `amapDistrictTable`
VALUES (520, '0753', 441400, '梅州市', NULL, '116.117582,24.299112', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (521, '0753', 441427, '蕉岭县', NULL, '116.170531,24.653313', 'district', 520);
INSERT INTO `amapDistrictTable`
VALUES (522, '0753', 441426, '平远县', NULL, '115.891729,24.569651', 'district', 520);
INSERT INTO `amapDistrictTable`
VALUES (523, '0753', 441481, '兴宁市', NULL, '115.731648,24.138077', 'district', 520);
INSERT INTO `amapDistrictTable`
VALUES (524, '0753', 441424, '五华县', NULL, '115.775004,23.925424', 'district', 520);
INSERT INTO `amapDistrictTable`
VALUES (525, '0753', 441423, '丰顺县', NULL, '116.184419,23.752771', 'district', 520);
INSERT INTO `amapDistrictTable`
VALUES (526, '0753', 441422, '大埔县', NULL, '116.69552,24.351587', 'district', 520);
INSERT INTO `amapDistrictTable`
VALUES (527, '0753', 441403, '梅县区', NULL, '116.083482,24.267825', 'district', 520);
INSERT INTO `amapDistrictTable`
VALUES (528, '0753', 441402, '梅江区', NULL, '116.12116,24.302593', 'district', 520);
INSERT INTO `amapDistrictTable`
VALUES (529, '020', 440100, '广州市', NULL, '113.280637,23.125178', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (530, '020', 440117, '从化区', NULL, '113.587386,23.545283', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (531, '020', 440115, '南沙区', NULL, '113.53738,22.794531', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (532, '020', 440114, '花都区', NULL, '113.211184,23.39205', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (533, '020', 440111, '白云区', NULL, '113.262831,23.162281', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (534, '020', 440113, '番禺区', NULL, '113.364619,22.938582', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (535, '020', 440103, '荔湾区', NULL, '113.243038,23.124943', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (536, '020', 440105, '海珠区', NULL, '113.262008,23.103131', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (537, '020', 440118, '增城区', NULL, '113.829579,23.290497', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (538, '020', 440104, '越秀区', NULL, '113.280714,23.125624', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (539, '020', 440112, '黄埔区', NULL, '113.450761,23.103239', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (540, '020', 440106, '天河区', NULL, '113.335367,23.13559', 'district', 529);
INSERT INTO `amapDistrictTable`
VALUES (541, '0751', 440200, '韶关市', NULL, '113.591544,24.801322', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (542, '0751', 440222, '始兴县', NULL, '114.067205,24.948364', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (543, '0751', 440282, '南雄市', NULL, '114.311231,25.115328', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (544, '0751', 440204, '浈江区', NULL, '113.599224,24.803977', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (545, '0751', 440224, '仁化县', NULL, '113.748627,25.088226', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (546, '0751', 440232, '乳源瑶族自治县', NULL, '113.278417,24.776109', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (547, '0751', 440229, '翁源县', NULL, '114.131289,24.353887', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (548, '0751', 440205, '曲江区', NULL, '113.605582,24.680195', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (549, '0751', 440203, '武江区', NULL, '113.588289,24.80016', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (550, '0751', 440233, '新丰县', NULL, '114.207034,24.055412', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (551, '0751', 440281, '乐昌市', NULL, '113.352413,25.128445', 'district', 541);
INSERT INTO `amapDistrictTable`
VALUES (552, '0763', 441800, '清远市', NULL, '113.051227,23.685022', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (553, '0763', 441882, '连州市', NULL, '112.379271,24.783966', 'district', 552);
INSERT INTO `amapDistrictTable`
VALUES (554, '0763', 441825, '连山壮族瑶族自治县', NULL, '112.086555,24.567271', 'district', 552);
INSERT INTO `amapDistrictTable`
VALUES (555, '0763', 441826, '连南瑶族自治县', NULL, '112.290808,24.719097', 'district', 552);
INSERT INTO `amapDistrictTable`
VALUES (556, '0763', 441881, '英德市', NULL, '113.405404,24.18612', 'district', 552);
INSERT INTO `amapDistrictTable`
VALUES (557, '0763', 441821, '佛冈县', NULL, '113.534094,23.866739', 'district', 552);
INSERT INTO `amapDistrictTable`
VALUES (558, '0763', 441823, '阳山县', NULL, '112.634019,24.470286', 'district', 552);
INSERT INTO `amapDistrictTable`
VALUES (559, '0763', 441803, '清新区', NULL, '113.015203,23.736949', 'district', 552);
INSERT INTO `amapDistrictTable`
VALUES (560, '0763', 441802, '清城区', NULL, '113.048698,23.688976', 'district', 552);
INSERT INTO `amapDistrictTable`
VALUES (561, '0760', 442000, '中山市', NULL, '113.382391,22.521113', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (562, '0760', 442000, '三角镇', NULL, '113.416,22.7079', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (563, '0760', 442000, '横栏镇', NULL, '113.224,22.6048', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (564, '0760', 442000, '五桂山街道', NULL, '113.399,22.4847', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (565, '0760', 442000, '东升镇', NULL, '113.321,22.5607', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (566, '0760', 442000, '神湾镇', NULL, '113.376,22.2768', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (567, '0760', 442000, '火炬开发区街道', NULL, '113.42,22.5577', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (568, '0760', 442000, '小榄镇', NULL, '113.23,22.7026', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (569, '0760', 442000, '南朗镇', NULL, '113.482,22.519', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (570, '0760', 442000, '古镇镇', NULL, '113.167,22.6751', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (571, '0760', 442000, '民众镇', NULL, '113.499,22.6855', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (572, '0760', 442000, '港口镇', NULL, '113.354,22.6027', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (573, '0760', 442000, '石岐区街道', NULL, '113.405,22.5247', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (574, '0760', 442000, '三乡镇', NULL, '113.432,22.3879', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (575, '0760', 442000, '大涌镇', NULL, '113.297,22.4834', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (576, '0760', 442000, '南头镇', NULL, '113.328,22.6882', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (577, '0760', 442000, '黄圃镇', NULL, '113.329,22.7457', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (578, '0760', 442000, '东区街道', NULL, '113.4,22.5274', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (579, '0760', 442000, '坦洲镇', NULL, '113.38,22.2868', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (580, '0760', 442000, '阜沙镇', NULL, '113.34,22.6406', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (581, '0760', 442000, '西区街道', NULL, '113.314,22.5649', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (582, '0760', 442000, '板芙镇', NULL, '113.358,22.4068', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (583, '0760', 442000, '南区街道', NULL, '113.367,22.4892', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (584, '0760', 442000, '沙溪镇', NULL, '113.344,22.5248', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (585, '0760', 442000, '东凤镇', NULL, '113.308,22.6803', 'street', 561);
INSERT INTO `amapDistrictTable`
VALUES (586, '0769', 441900, '东莞市', NULL, '113.746262,23.046237', 'city', 419);
INSERT INTO `amapDistrictTable`
VALUES (587, '0769', 441900, '莞城街道', NULL, '113.743,23.0225', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (588, '0769', 441900, '常平镇', NULL, '114.036,23.0074', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (589, '0769', 441900, '望牛墩镇', NULL, '113.676,23.0683', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (590, '0769', 441900, '大朗镇', NULL, '113.939,22.8654', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (591, '0769', 441900, '麻涌镇', NULL, '113.562,22.9718', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (592, '0769', 441900, '黄江镇', NULL, '113.973,22.8121', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (593, '0769', 441900, '东莞生态园', NULL, '113.917,23.0806', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (594, '0769', 441900, '樟木头镇', NULL, '114.018,22.8704', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (595, '0769', 441900, '桥头镇', NULL, '114.065,23.0315', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (596, '0769', 441900, '凤岗镇', NULL, '114.105,22.7308', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (597, '0769', 441900, '松山湖管委会', NULL, '113.875,22.869', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (598, '0769', 441900, '寮步镇', NULL, '113.888,22.9529', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (599, '0769', 441900, '石龙镇', NULL, '113.833,23.1123', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (600, '0769', 441900, '高埗镇', NULL, '113.773,23.112', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (601, '0769', 441900, '塘厦镇', NULL, '114.05,22.7713', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (602, '0769', 441900, '谢岗镇', NULL, '114.128,22.9901', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (603, '0769', 441900, '厚街镇', NULL, '113.776,22.9097', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (604, '0769', 441900, '虎门镇', NULL, '113.797,22.8587', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (605, '0769', 441900, '南城街道', NULL, '113.737,23.0249', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (606, '0769', 441900, '虎门港管委会', NULL, '113.562,22.9718', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (607, '0769', 441900, '横沥镇', NULL, '114.006,23.0504', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (608, '0769', 441900, '企石镇', NULL, '113.99,23.0541', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (609, '0769', 441900, '东坑镇', NULL, '113.918,22.995', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (610, '0769', 441900, '东城街道', NULL, '113.757,23.0485', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (611, '0769', 441900, '石排镇', NULL, '113.988,23.068', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (612, '0769', 441900, '沙田镇', NULL, '113.582,22.9426', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (613, '0769', 441900, '洪梅镇', NULL, '113.607,23.0155', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (614, '0769', 441900, '长安镇', NULL, '113.708,22.7941', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (615, '0769', 441900, '道滘镇', NULL, '113.692,23.004', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (616, '0769', 441900, '大岭山镇', NULL, '113.843,22.9534', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (617, '0769', 441900, '茶山镇', NULL, '113.839,23.0813', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (618, '0769', 441900, '清溪镇', NULL, '114.11,22.862', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (619, '0769', 441900, '石碣镇', NULL, '113.846,23.1024', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (620, '0769', 441900, '中堂镇', NULL, '113.734,23.1164', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (621, '0769', 441900, '万江街道', NULL, '113.709,23.0014', 'street', 586);
INSERT INTO `amapDistrictTable`
VALUES (622, NULL, 410000, '河南省', NULL, '113.665412,34.757975', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (623, '0379', 410300, '洛阳市', NULL, '112.434468,34.663041', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (624, '0379', 410323, '新安县', NULL, '112.141403,34.728679', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (625, '0379', 410324, '栾川县', NULL, '111.618386,33.783195', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (626, '0379', 410329, '伊川县', NULL, '112.429384,34.423416', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (627, '0379', 410306, '吉利区', NULL, '112.584796,34.899093', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (628, '0379', 410328, '洛宁县', NULL, '111.655399,34.387179', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (629, '0379', 410381, '偃师市', NULL, '112.787739,34.723042', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (630, '0379', 410304, '瀍河回族区', NULL, '112.491625,34.684738', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (631, '0379', 410302, '老城区', NULL, '112.477298,34.682945', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (632, '0379', 410303, '西工区', NULL, '112.443232,34.667847', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (633, '0379', 410322, '孟津县', NULL, '112.443892,34.826485', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (634, '0379', 410311, '洛龙区', NULL, '112.456634,34.618557', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (635, '0379', 410305, '涧西区', NULL, '112.399243,34.654251', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (636, '0379', 410327, '宜阳县', NULL, '112.179989,34.516478', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (637, '0379', 410326, '汝阳县', NULL, '112.473789,34.15323', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (638, '0379', 410325, '嵩县', NULL, '112.087765,34.131563', 'district', 623);
INSERT INTO `amapDistrictTable`
VALUES (639, '0398', 411200, '三门峡市', NULL, '111.194099,34.777338', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (640, '0398', 411202, '湖滨区', NULL, '111.19487,34.77812', 'district', 639);
INSERT INTO `amapDistrictTable`
VALUES (641, '0398', 411224, '卢氏县', NULL, '111.052649,34.053995', 'district', 639);
INSERT INTO `amapDistrictTable`
VALUES (642, '0398', 411221, '渑池县', NULL, '111.762992,34.763487', 'district', 639);
INSERT INTO `amapDistrictTable`
VALUES (643, '0398', 411282, '灵宝市', NULL, '110.88577,34.521264', 'district', 639);
INSERT INTO `amapDistrictTable`
VALUES (644, '0398', 411203, '陕州区', NULL, '111.103851,34.720244', 'district', 639);
INSERT INTO `amapDistrictTable`
VALUES (645, '0398', 411281, '义马市', NULL, '111.869417,34.746868', 'district', 639);
INSERT INTO `amapDistrictTable`
VALUES (646, '0395', 411100, '漯河市', NULL, '114.026405,33.575855', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (647, '0395', 411104, '召陵区', NULL, '114.051686,33.567555', 'district', 646);
INSERT INTO `amapDistrictTable`
VALUES (648, '0395', 411122, '临颍县', NULL, '113.938891,33.80609', 'district', 646);
INSERT INTO `amapDistrictTable`
VALUES (649, '0395', 411102, '源汇区', NULL, '114.017948,33.565441', 'district', 646);
INSERT INTO `amapDistrictTable`
VALUES (650, '0395', 411103, '郾城区', NULL, '114.016813,33.588897', 'district', 646);
INSERT INTO `amapDistrictTable`
VALUES (651, '0395', 411121, '舞阳县', NULL, '113.610565,33.436278', 'district', 646);
INSERT INTO `amapDistrictTable`
VALUES (652, '0374', 411000, '许昌市', NULL, '113.826063,34.022956', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (653, '0374', 411003, '建安区', NULL, '113.842898,34.005018', 'district', 652);
INSERT INTO `amapDistrictTable`
VALUES (654, '0374', 411002, '魏都区', NULL, '113.828307,34.02711', 'district', 652);
INSERT INTO `amapDistrictTable`
VALUES (655, '0374', 411082, '长葛市', NULL, '113.768912,34.219257', 'district', 652);
INSERT INTO `amapDistrictTable`
VALUES (656, '0374', 411081, '禹州市', NULL, '113.471316,34.154403', 'district', 652);
INSERT INTO `amapDistrictTable`
VALUES (657, '0374', 411024, '鄢陵县', NULL, '114.188507,34.100502', 'district', 652);
INSERT INTO `amapDistrictTable`
VALUES (658, '0374', 411025, '襄城县', NULL, '113.493166,33.855943', 'district', 652);
INSERT INTO `amapDistrictTable`
VALUES (659, '0377', 411300, '南阳市', NULL, '112.540918,32.999082', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (660, '0377', 411323, '西峡县', NULL, '111.485772,33.302981', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (661, '0377', 411327, '社旗县', NULL, '112.938279,33.056126', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (662, '0377', 411330, '桐柏县', NULL, '113.406059,32.367153', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (663, '0377', 411303, '卧龙区', NULL, '112.528789,32.989877', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (664, '0377', 411321, '南召县', NULL, '112.435583,33.488617', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (665, '0377', 411328, '唐河县', NULL, '112.838492,32.687892', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (666, '0377', 411322, '方城县', NULL, '113.010933,33.255138', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (667, '0377', 411302, '宛城区', NULL, '112.544591,32.994857', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (668, '0377', 411329, '新野县', NULL, '112.365624,32.524006', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (669, '0377', 411324, '镇平县', NULL, '112.232722,33.036651', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (670, '0377', 411326, '淅川县', NULL, '111.489026,33.136106', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (671, '0377', 411381, '邓州市', NULL, '112.092716,32.681642', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (672, '0377', 411325, '内乡县', NULL, '111.843801,33.046358', 'district', 659);
INSERT INTO `amapDistrictTable`
VALUES (673, '0376', 411500, '信阳市', NULL, '114.075031,32.123274', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (674, '0376', 411526, '潢川县', NULL, '115.050123,32.134024', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (675, '0376', 411527, '淮滨县', NULL, '115.415451,32.452639', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (676, '0376', 411521, '罗山县', NULL, '114.533414,32.203206', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (677, '0376', 411522, '光山县', NULL, '114.903577,32.010398', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (678, '0376', 411523, '新县', NULL, '114.87705,31.63515', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (679, '0376', 411502, '浉河区', NULL, '114.075031,32.123274', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (680, '0376', 411525, '固始县', NULL, '115.667328,32.183074', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (681, '0376', 411524, '商城县', NULL, '115.406297,31.799982', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (682, '0376', 411528, '息县', NULL, '114.740713,32.344744', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (683, '0376', 411503, '平桥区', NULL, '114.126027,32.098395', 'district', 673);
INSERT INTO `amapDistrictTable`
VALUES (684, '1391', 419001, '济源市', NULL, '112.590047,35.090378', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (685, '1391', 419001, '济源市坡头镇', NULL, '112.538,34.9308', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (686, '1391', 419001, '济源市梨林镇', NULL, '112.753,35.0882', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (687, '1391', 419001, '济源市大峪镇', NULL, '112.338,34.9398', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (688, '1391', 419001, '济源市思礼镇', NULL, '112.388,35.2103', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (689, '1391', 419001, '济源市五龙口镇', NULL, '112.761,35.1956', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (690, '1391', 419001, '济源市王屋镇', NULL, '112.169,35.1244', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (691, '1391', 419001, '济源市玉泉街道', NULL, '112.624,35.1189', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (692, '1391', 419001, '济源市轵城镇', NULL, '112.622,35.0625', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (693, '1391', 419001, '济源市济水街道', NULL, '112.595,35.0944', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (694, '1391', 419001, '济源市沁园街道', NULL, '112.593,35.0822', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (695, '1391', 419001, '济源市下冶镇', NULL, '112.212,35.1131', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (696, '1391', 419001, '济源市克井镇', NULL, '112.635,35.255', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (697, '1391', 419001, '济源市天坛街道', NULL, '112.567,35.1229', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (698, '1391', 419001, '济源市邵原镇', NULL, '112.113,35.2704', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (699, '1391', 419001, '济源市北海街道', NULL, '112.569,35.1116', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (700, '1391', 419001, '济源市承留镇', NULL, '112.509,35.0243', 'street', 684);
INSERT INTO `amapDistrictTable`
VALUES (701, '0396', 411700, '驻马店市', NULL, '114.024736,32.980169', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (702, '0396', 411722, '上蔡县', NULL, '114.266892,33.264719', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (703, '0396', 411721, '西平县', NULL, '114.026864,33.382315', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (704, '0396', 411729, '新蔡县', NULL, '114.975246,32.749948', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (705, '0396', 411726, '泌阳县', NULL, '113.32605,32.725129', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (706, '0396', 411702, '驿城区', NULL, '114.029149,32.977559', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (707, '0396', 411725, '确山县', NULL, '114.026679,32.801538', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (708, '0396', 411724, '正阳县', NULL, '114.38948,32.601826', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (709, '0396', 411728, '遂平县', NULL, '114.00371,33.14698', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (710, '0396', 411727, '汝南县', NULL, '114.359495,33.004535', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (711, '0396', 411723, '平舆县', NULL, '114.637105,32.955626', 'district', 701);
INSERT INTO `amapDistrictTable`
VALUES (712, '0393', 410900, '濮阳市', NULL, '115.041299,35.768234', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (713, '0393', 410927, '台前县', NULL, '115.855681,35.996474', 'district', 712);
INSERT INTO `amapDistrictTable`
VALUES (714, '0393', 410923, '南乐县', NULL, '115.204336,36.075204', 'district', 712);
INSERT INTO `amapDistrictTable`
VALUES (715, '0393', 410926, '范县', NULL, '115.504212,35.851977', 'district', 712);
INSERT INTO `amapDistrictTable`
VALUES (716, '0393', 410902, '华龙区', NULL, '115.03184,35.760473', 'district', 712);
INSERT INTO `amapDistrictTable`
VALUES (717, '0393', 410922, '清丰县', NULL, '115.107287,35.902413', 'district', 712);
INSERT INTO `amapDistrictTable`
VALUES (718, '0393', 410928, '濮阳县', NULL, '115.023844,35.710349', 'district', 712);
INSERT INTO `amapDistrictTable`
VALUES (719, '0391', 410800, '焦作市', NULL, '113.238266,35.23904', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (720, '0391', 410883, '孟州市', NULL, '112.78708,34.90963', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (721, '0391', 410825, '温县', NULL, '113.079118,34.941233', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (722, '0391', 410882, '沁阳市', NULL, '112.934538,35.08901', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (723, '0391', 410804, '马村区', NULL, '113.321703,35.265453', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (724, '0391', 410823, '武陟县', NULL, '113.408334,35.09885', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (725, '0391', 410822, '博爱县', NULL, '113.069313,35.170351', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (726, '0391', 410821, '修武县', NULL, '113.447465,35.229923', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (727, '0391', 410802, '解放区', NULL, '113.226126,35.241353', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (728, '0391', 410811, '山阳区', NULL, '113.26766,35.21476', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (729, '0391', 410803, '中站区', NULL, '113.175485,35.236145', 'district', 719);
INSERT INTO `amapDistrictTable`
VALUES (730, '0371', 410100, '郑州市', NULL, '113.665412,34.757975', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (731, '0371', 410185, '登封市', NULL, '113.037768,34.459939', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (732, '0371', 410102, '中原区', NULL, '113.611576,34.748286', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (733, '0371', 410183, '新密市', NULL, '113.380616,34.537846', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (734, '0371', 410184, '新郑市', NULL, '113.73967,34.394219', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (735, '0371', 410181, '巩义市', NULL, '112.98283,34.75218', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (736, '0371', 410182, '荥阳市', NULL, '113.391523,34.789077', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (737, '0371', 410106, '上街区', NULL, '113.298282,34.808689', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (738, '0371', 410103, '二七区', NULL, '113.645422,34.730936', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (739, '0371', 410105, '金水区', NULL, '113.686037,34.775838', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (740, '0371', 410108, '惠济区', NULL, '113.61836,34.828591', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (741, '0371', 410122, '中牟县', NULL, '114.022521,34.721976', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (742, '0371', 410104, '管城回族区', NULL, '113.685313,34.746453', 'district', 730);
INSERT INTO `amapDistrictTable`
VALUES (743, '0372', 410500, '安阳市', NULL, '114.352482,36.103442', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (744, '0372', 410523, '汤阴县', NULL, '114.362357,35.922349', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (745, '0372', 410505, '殷都区', NULL, '114.300098,36.108974', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (746, '0372', 410581, '林州市', NULL, '113.823767,36.063403', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (747, '0372', 410506, '龙安区', NULL, '114.323522,36.095568', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (748, '0372', 410527, '内黄县', NULL, '114.904582,35.953702', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (749, '0372', 410503, '北关区', NULL, '114.352646,36.10978', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (750, '0372', 410522, '安阳县', NULL, '114.130207,36.130585', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (751, '0372', 410502, '文峰区', NULL, '114.352562,36.098101', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (752, '0372', 410526, '滑县', NULL, '114.524,35.574628', 'district', 743);
INSERT INTO `amapDistrictTable`
VALUES (753, '0373', 410700, '新乡市', NULL, '113.883991,35.302616', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (754, '0373', 410782, '辉县市', NULL, '113.802518,35.461318', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (755, '0373', 410704, '凤泉区', NULL, '113.906712,35.379855', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (756, '0373', 410783, '长垣市', NULL, '114.673807,35.19615', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (757, '0373', 410711, '牧野区', NULL, '113.89716,35.312974', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (758, '0373', 410703, '卫滨区', NULL, '113.866065,35.304905', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (759, '0373', 410724, '获嘉县', NULL, '113.657249,35.261685', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (760, '0373', 410721, '新乡县', NULL, '113.806186,35.190021', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (761, '0373', 410727, '封丘县', NULL, '114.423405,35.04057', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (762, '0373', 410725, '原阳县', NULL, '113.965966,35.054001', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (763, '0373', 410726, '延津县', NULL, '114.200982,35.149515', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (764, '0373', 410781, '卫辉市', NULL, '114.065855,35.404295', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (765, '0373', 410702, '红旗区', NULL, '113.878158,35.302684', 'district', 753);
INSERT INTO `amapDistrictTable`
VALUES (766, '0392', 410600, '鹤壁市', NULL, '114.295444,35.748236', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (767, '0392', 410602, '鹤山区', NULL, '114.166551,35.936128', 'district', 766);
INSERT INTO `amapDistrictTable`
VALUES (768, '0392', 410603, '山城区', NULL, '114.184202,35.896058', 'district', 766);
INSERT INTO `amapDistrictTable`
VALUES (769, '0392', 410622, '淇县', NULL, '114.200379,35.609478', 'district', 766);
INSERT INTO `amapDistrictTable`
VALUES (770, '0392', 410611, '淇滨区', NULL, '114.293917,35.748382', 'district', 766);
INSERT INTO `amapDistrictTable`
VALUES (771, '0392', 410621, '浚县', NULL, '114.550162,35.671282', 'district', 766);
INSERT INTO `amapDistrictTable`
VALUES (772, '0378', 410200, '开封市', NULL, '114.341447,34.797049', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (773, '0378', 410203, '顺河回族区', NULL, '114.364875,34.800459', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (774, '0378', 410212, '祥符区', NULL, '114.437622,34.756476', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (775, '0378', 410205, '禹王台区', NULL, '114.350246,34.779727', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (776, '0378', 410204, '鼓楼区', NULL, '114.3485,34.792383', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (777, '0378', 410202, '龙亭区', NULL, '114.353348,34.799833', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (778, '0378', 410223, '尉氏县', NULL, '114.193927,34.412256', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (779, '0378', 410225, '兰考县', NULL, '114.820572,34.829899', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (780, '0378', 410221, '杞县', NULL, '114.770472,34.554585', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (781, '0378', 410222, '通许县', NULL, '114.467734,34.477302', 'district', 772);
INSERT INTO `amapDistrictTable`
VALUES (782, '0394', 411600, '周口市', NULL, '114.649653,33.620357', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (783, '0394', 411624, '沈丘县', NULL, '115.078375,33.395514', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (784, '0394', 411681, '项城市', NULL, '114.899521,33.443085', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (785, '0394', 411602, '川汇区', NULL, '114.652136,33.614836', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (786, '0394', 411623, '商水县', NULL, '114.60927,33.543845', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (787, '0394', 411628, '鹿邑县', NULL, '115.486386,33.861067', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (788, '0394', 411625, '郸城县', NULL, '115.189,33.643852', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (789, '0394', 411603, '淮阳区', NULL, '114.870166,33.732547', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (790, '0394', 411622, '西华县', NULL, '114.530067,33.784378', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (791, '0394', 411621, '扶沟县', NULL, '114.392008,34.054061', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (792, '0394', 411627, '太康县', NULL, '114.853834,34.065312', 'district', 782);
INSERT INTO `amapDistrictTable`
VALUES (793, '0375', 410400, '平顶山市', NULL, '113.307718,33.735241', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (794, '0375', 410404, '石龙区', NULL, '112.889885,33.901538', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (795, '0375', 410403, '卫东区', NULL, '113.310327,33.739285', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (796, '0375', 410423, '鲁山县', NULL, '112.906703,33.740325', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (797, '0375', 410411, '湛河区', NULL, '113.320873,33.725681', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (798, '0375', 410481, '舞钢市', NULL, '113.52625,33.302082', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (799, '0375', 410425, '郏县', NULL, '113.220451,33.971993', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (800, '0375', 410422, '叶县', NULL, '113.358298,33.621252', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (801, '0375', 410421, '宝丰县', NULL, '113.066812,33.866359', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (802, '0375', 410482, '汝州市', NULL, '112.845336,34.167408', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (803, '0375', 410402, '新华区', NULL, '113.299061,33.737579', 'district', 793);
INSERT INTO `amapDistrictTable`
VALUES (804, '0370', 411400, '商丘市', NULL, '115.650497,34.437054', 'city', 622);
INSERT INTO `amapDistrictTable`
VALUES (805, '0370', 411423, '宁陵县', NULL, '115.320055,34.449299', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (806, '0370', 411402, '梁园区', NULL, '115.65459,34.436553', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (807, '0370', 411481, '永城市', NULL, '116.449672,33.931318', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (808, '0370', 411403, '睢阳区', NULL, '115.653813,34.390536', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (809, '0370', 411422, '睢县', NULL, '115.070109,34.428433', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (810, '0370', 411426, '夏邑县', NULL, '116.13989,34.240894', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (811, '0370', 411425, '虞城县', NULL, '115.863811,34.399634', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (812, '0370', 411421, '民权县', NULL, '115.148146,34.648455', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (813, '0370', 411424, '柘城县', NULL, '115.307433,34.075277', 'district', 804);
INSERT INTO `amapDistrictTable`
VALUES (814, NULL, 150000, '内蒙古自治区', NULL, '111.670801,40.818311', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (815, '0477', 150600, '鄂尔多斯市', NULL, '109.99029,39.817179', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (816, '0477', 150621, '达拉特旗', NULL, '110.040281,40.404076', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (817, '0477', 150624, '鄂托克旗', NULL, '107.982604,39.095752', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (818, '0477', 150622, '准格尔旗', NULL, '111.238332,39.865221', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (819, '0477', 150625, '杭锦旗', NULL, '108.736324,39.831789', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (820, '0477', 150626, '乌审旗', NULL, '108.842454,38.596611', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (821, '0477', 150623, '鄂托克前旗', NULL, '107.48172,38.183257', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (822, '0477', 150627, '伊金霍洛旗', NULL, '109.787402,39.604312', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (823, '0477', 150603, '康巴什区', NULL, '109.790076,39.607472', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (824, '0477', 150602, '东胜区', NULL, '109.98945,39.81788', 'district', 815);
INSERT INTO `amapDistrictTable`
VALUES (825, '0472', 150200, '包头市', NULL, '109.840405,40.658168', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (826, '0472', 150221, '土默特右旗', NULL, '110.526766,40.566434', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (827, '0472', 150206, '白云鄂博矿区', NULL, '109.97016,41.769246', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (828, '0472', 150223, '达尔罕茂明安联合旗', NULL, '110.438452,41.702836', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (829, '0472', 150207, '九原区', NULL, '109.968122,40.600581', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (830, '0472', 150205, '石拐区', NULL, '110.272565,40.672094', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (831, '0472', 150204, '青山区', NULL, '109.880049,40.668558', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (832, '0472', 150202, '东河区', NULL, '110.026895,40.587056', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (833, '0472', 150203, '昆都仑区', NULL, '109.822932,40.661345', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (834, '0472', 150222, '固阳县', NULL, '110.063421,41.030004', 'district', 825);
INSERT INTO `amapDistrictTable`
VALUES (835, '0478', 150800, '巴彦淖尔市', NULL, '107.416959,40.757402', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (836, '0478', 150824, '乌拉特中旗', NULL, '108.515255,41.57254', 'district', 835);
INSERT INTO `amapDistrictTable`
VALUES (837, '0478', 150821, '五原县', NULL, '108.270658,41.097639', 'district', 835);
INSERT INTO `amapDistrictTable`
VALUES (838, '0478', 150802, '临河区', NULL, '107.417018,40.757092', 'district', 835);
INSERT INTO `amapDistrictTable`
VALUES (839, '0478', 150822, '磴口县', NULL, '107.006056,40.330479', 'district', 835);
INSERT INTO `amapDistrictTable`
VALUES (840, '0478', 150823, '乌拉特前旗', NULL, '108.656816,40.725209', 'district', 835);
INSERT INTO `amapDistrictTable`
VALUES (841, '0478', 150826, '杭锦后旗', NULL, '107.147682,40.888797', 'district', 835);
INSERT INTO `amapDistrictTable`
VALUES (842, '0478', 150825, '乌拉特后旗', NULL, '107.074941,41.084307', 'district', 835);
INSERT INTO `amapDistrictTable`
VALUES (843, '0473', 150300, '乌海市', NULL, '106.825563,39.673734', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (844, '0473', 150304, '乌达区', NULL, '106.722711,39.502288', 'district', 843);
INSERT INTO `amapDistrictTable`
VALUES (845, '0473', 150303, '海南区', NULL, '106.884789,39.44153', 'district', 843);
INSERT INTO `amapDistrictTable`
VALUES (846, '0473', 150302, '海勃湾区', NULL, '106.817762,39.673527', 'district', 843);
INSERT INTO `amapDistrictTable`
VALUES (847, '0470', 150700, '呼伦贝尔市', NULL, '119.758168,49.215333', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (848, '0470', 150784, '额尔古纳市', NULL, '120.178636,50.2439', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (849, '0470', 150782, '牙克石市', NULL, '120.729005,49.287024', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (850, '0470', 150785, '根河市', NULL, '121.532724,50.780454', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (851, '0470', 150721, '阿荣旗', NULL, '123.464615,48.130503', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (852, '0470', 150702, '海拉尔区', NULL, '119.764923,49.213889', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (853, '0470', 150725, '陈巴尔虎旗', NULL, '119.437609,49.328422', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (854, '0470', 150783, '扎兰屯市', NULL, '122.744401,48.007412', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (855, '0470', 150722, '莫力达瓦达斡尔族自治旗', NULL, '124.507401,48.478385', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (856, '0470', 150724, '鄂温克族自治旗', NULL, '119.754041,49.143293', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (857, '0470', 150727, '新巴尔虎右旗', NULL, '116.825991,48.669134', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (858, '0470', 150703, '扎赉诺尔区', NULL, '117.716373,49.456567', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (859, '0470', 150781, '满洲里市', NULL, '117.455561,49.590788', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (860, '0470', 150723, '鄂伦春自治旗', NULL, '123.725684,50.590177', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (861, '0470', 150726, '新巴尔虎左旗', NULL, '118.267454,48.216571', 'district', 847);
INSERT INTO `amapDistrictTable`
VALUES (862, '0483', 152900, '阿拉善盟', NULL, '105.706422,38.844814', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (863, '0483', 152923, '额济纳旗', NULL, '101.06944,41.958813', 'district', 862);
INSERT INTO `amapDistrictTable`
VALUES (864, '0483', 152922, '阿拉善右旗', NULL, '101.671984,39.21159', 'district', 862);
INSERT INTO `amapDistrictTable`
VALUES (865, '0483', 152921, '阿拉善左旗', NULL, '105.70192,38.847241', 'district', 862);
INSERT INTO `amapDistrictTable`
VALUES (866, '0475', 150500, '通辽市', NULL, '122.263119,43.617429', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (867, '0475', 150581, '霍林郭勒市', NULL, '119.657862,45.532361', 'district', 866);
INSERT INTO `amapDistrictTable`
VALUES (868, '0475', 150526, '扎鲁特旗', NULL, '120.905275,44.555294', 'district', 866);
INSERT INTO `amapDistrictTable`
VALUES (869, '0475', 150521, '科尔沁左翼中旗', NULL, '123.313873,44.127166', 'district', 866);
INSERT INTO `amapDistrictTable`
VALUES (870, '0475', 150525, '奈曼旗', NULL, '120.662543,42.84685', 'district', 866);
INSERT INTO `amapDistrictTable`
VALUES (871, '0475', 150523, '开鲁县', NULL, '121.308797,43.602432', 'district', 866);
INSERT INTO `amapDistrictTable`
VALUES (872, '0475', 150502, '科尔沁区', NULL, '122.264042,43.617422', 'district', 866);
INSERT INTO `amapDistrictTable`
VALUES (873, '0475', 150524, '库伦旗', NULL, '121.774886,42.734692', 'district', 866);
INSERT INTO `amapDistrictTable`
VALUES (874, '0475', 150522, '科尔沁左翼后旗', NULL, '122.355155,42.954564', 'district', 866);
INSERT INTO `amapDistrictTable`
VALUES (875, '0482', 152200, '兴安盟', NULL, '122.070317,46.076268', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (876, '0482', 152202, '阿尔山市', NULL, '119.943656,47.177', 'district', 875);
INSERT INTO `amapDistrictTable`
VALUES (877, '0482', 152222, '科尔沁右翼中旗', NULL, '121.472818,45.059645', 'district', 875);
INSERT INTO `amapDistrictTable`
VALUES (878, '0482', 152224, '突泉县', NULL, '121.564856,45.380986', 'district', 875);
INSERT INTO `amapDistrictTable`
VALUES (879, '0482', 152201, '乌兰浩特市', NULL, '122.068975,46.077238', 'district', 875);
INSERT INTO `amapDistrictTable`
VALUES (880, '0482', 152223, '扎赉特旗', NULL, '122.909332,46.725136', 'district', 875);
INSERT INTO `amapDistrictTable`
VALUES (881, '0482', 152221, '科尔沁右翼前旗', NULL, '121.957544,46.076497', 'district', 875);
INSERT INTO `amapDistrictTable`
VALUES (882, '0479', 152500, '锡林郭勒盟', NULL, '116.090996,43.944018', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (883, '0479', 152526, '西乌珠穆沁旗', NULL, '117.615249,44.586147', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (884, '0479', 152502, '锡林浩特市', NULL, '116.091903,43.944301', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (885, '0479', 152525, '东乌珠穆沁旗', NULL, '116.980022,45.510307', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (886, '0479', 152522, '阿巴嘎旗', NULL, '114.970618,44.022728', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (887, '0479', 152523, '苏尼特左旗', NULL, '113.653412,43.854108', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (888, '0479', 152524, '苏尼特右旗', NULL, '112.65539,42.746662', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (889, '0479', 152501, '二连浩特市', NULL, '111.97981,43.652895', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (890, '0479', 152528, '镶黄旗', NULL, '113.843869,42.239229', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (891, '0479', 152530, '正蓝旗', NULL, '116.003311,42.245895', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (892, '0479', 152529, '正镶白旗', NULL, '115.031423,42.286807', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (893, '0479', 152531, '多伦县', NULL, '116.477288,42.197962', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (894, '0479', 152527, '太仆寺旗', NULL, '115.28728,41.895199', 'district', 882);
INSERT INTO `amapDistrictTable`
VALUES (895, '0471', 150100, '呼和浩特市', NULL, '111.670801,40.818311', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (896, '0471', 150123, '和林格尔县', NULL, '111.824143,40.380288', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (897, '0471', 150103, '回民区', NULL, '111.662162,40.815149', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (898, '0471', 150104, '玉泉区', NULL, '111.66543,40.799421', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (899, '0471', 150125, '武川县', NULL, '111.456563,41.094483', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (900, '0471', 150121, '土默特左旗', NULL, '111.133615,40.720416', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (901, '0471', 150122, '托克托县', NULL, '111.197317,40.276729', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (902, '0471', 150105, '赛罕区', NULL, '111.698463,40.807834', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (903, '0471', 150102, '新城区', NULL, '111.685964,40.826225', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (904, '0471', 150124, '清水河县', NULL, '111.67222,39.912479', 'district', 895);
INSERT INTO `amapDistrictTable`
VALUES (905, '0476', 150400, '赤峰市', NULL, '118.956806,42.275317', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (906, '0476', 150421, '阿鲁科尔沁旗', NULL, '120.094969,43.87877', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (907, '0476', 150424, '林西县', NULL, '118.05775,43.605326', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (908, '0476', 150422, '巴林左旗', NULL, '119.391737,43.980715', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (909, '0476', 150423, '巴林右旗', NULL, '118.678347,43.528963', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (910, '0476', 150425, '克什克腾旗', NULL, '117.542465,43.256233', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (911, '0476', 150426, '翁牛特旗', NULL, '119.022619,42.937128', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (912, '0476', 150404, '松山区', NULL, '118.938958,42.281046', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (913, '0476', 150402, '红山区', NULL, '118.961087,42.269732', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (914, '0476', 150428, '喀喇沁旗', NULL, '118.708572,41.92778', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (915, '0476', 150403, '元宝山区', NULL, '119.289877,42.041168', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (916, '0476', 150430, '敖汉旗', NULL, '119.906486,42.287012', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (917, '0476', 150429, '宁城县', NULL, '119.339242,41.598692', 'district', 905);
INSERT INTO `amapDistrictTable`
VALUES (918, '0474', 150900, '乌兰察布市', NULL, '113.114543,41.034126', 'city', 814);
INSERT INTO `amapDistrictTable`
VALUES (919, '0474', 150929, '四子王旗', NULL, '111.70123,41.528114', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (920, '0474', 150927, '察哈尔右翼中旗', NULL, '112.633563,41.274212', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (921, '0474', 150923, '商都县', NULL, '113.560643,41.560163', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (922, '0474', 150924, '兴和县', NULL, '113.834009,40.872437', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (923, '0474', 150922, '化德县', NULL, '114.01008,41.899335', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (924, '0474', 150928, '察哈尔右翼后旗', NULL, '113.1906,41.447213', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (925, '0474', 150921, '卓资县', NULL, '112.577702,40.89576', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (926, '0474', 150981, '丰镇市', NULL, '113.163462,40.437534', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (927, '0474', 150926, '察哈尔右翼前旗', NULL, '113.211958,40.786859', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (928, '0474', 150902, '集宁区', NULL, '113.116453,41.034134', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (929, '0474', 150925, '凉城县', NULL, '112.500911,40.531627', 'district', 918);
INSERT INTO `amapDistrictTable`
VALUES (930, NULL, 650000, '新疆维吾尔自治区', NULL, '87.617733,43.792818', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (931, '1909', 659007, '双河市', NULL, '82.353656,44.840524', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (932, '1909', 659007, '兵团八十九团', NULL, '82.2853,45.0582', 'street', 931);
INSERT INTO `amapDistrictTable`
VALUES (933, '1909', 659007, '兵团八十六团', NULL, '82.1787,44.8089', 'street', 931);
INSERT INTO `amapDistrictTable`
VALUES (934, '1909', 659007, '兵团八十四团', NULL, '82.215,45.1246', 'street', 931);
INSERT INTO `amapDistrictTable`
VALUES (935, '1909', 659007, '兵团九十团', NULL, '82.6473,44.7651', 'street', 931);
INSERT INTO `amapDistrictTable`
VALUES (936, '1909', 659007, '兵团八十一团', NULL, '82.4908,44.7469', 'street', 931);
INSERT INTO `amapDistrictTable`
VALUES (937, '1906', 659005, '北屯市', NULL, '87.824932,47.353177', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (938, '1906', 659005, '兵团一八八团', NULL, '87.5186,47.4099', 'street', 937);
INSERT INTO `amapDistrictTable`
VALUES (939, '1906', 659005, '兵团一八三团', NULL, '88.1187,47.1285', 'street', 937);
INSERT INTO `amapDistrictTable`
VALUES (940, '1906', 659005, '兵团一八七团', NULL, '87.761,47.1948', 'street', 937);
INSERT INTO `amapDistrictTable`
VALUES (941, '1906', 659005, '北屯镇', NULL, '87.7224,47.4017', 'street', 937);
INSERT INTO `amapDistrictTable`
VALUES (942, '0909', 652700, '博尔塔拉蒙古自治州', NULL, '82.074778,44.903258', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (943, '0909', 652723, '温泉县', NULL, '81.03099,44.973751', 'district', 942);
INSERT INTO `amapDistrictTable`
VALUES (944, '0909', 652702, '阿拉山口市', NULL, '82.569389,45.16777', 'district', 942);
INSERT INTO `amapDistrictTable`
VALUES (945, '0909', 652701, '博乐市', NULL, '82.072237,44.903087', 'district', 942);
INSERT INTO `amapDistrictTable`
VALUES (946, '0909', 652722, '精河县', NULL, '82.892938,44.605645', 'district', 942);
INSERT INTO `amapDistrictTable`
VALUES (947, '1996', 659006, '铁门关市', NULL, '85.501218,41.827251', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (948, '1996', 659006, '兵团二十九团', NULL, '85.5849,41.8825', 'street', 947);
INSERT INTO `amapDistrictTable`
VALUES (949, '1996', 659006, '农二师三十团', NULL, '85.5849,41.8825', 'street', 947);
INSERT INTO `amapDistrictTable`
VALUES (950, '1999', 659008, '可克达拉市', NULL, '80.63579,43.6832', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (951, '1999', 659008, '兵团六十八团', NULL, '80.9903,43.8897', 'street', 950);
INSERT INTO `amapDistrictTable`
VALUES (952, '1999', 659008, '都拉塔口岸', NULL, '80.6882,43.7131', 'street', 950);
INSERT INTO `amapDistrictTable`
VALUES (953, '1999', 659008, '兵团六十六团', NULL, '81.086,43.9599', 'street', 950);
INSERT INTO `amapDistrictTable`
VALUES (954, '1999', 659008, '兵团六十七团', NULL, '80.6068,43.7652', 'street', 950);
INSERT INTO `amapDistrictTable`
VALUES (955, '1999', 659008, '兵团六十三团', NULL, '80.4844,43.931', 'street', 950);
INSERT INTO `amapDistrictTable`
VALUES (956, '1999', 659008, '兵团六十四团', NULL, '80.6749,44.0986', 'street', 950);
INSERT INTO `amapDistrictTable`
VALUES (957, '0991', 650100, '乌鲁木齐市', NULL, '87.617733,43.792818', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (958, '0991', 650107, '达坂城区', NULL, '88.30994,43.36181', 'district', 957);
INSERT INTO `amapDistrictTable`
VALUES (959, '0991', 650102, '天山区', NULL, '87.620116,43.796428', 'district', 957);
INSERT INTO `amapDistrictTable`
VALUES (960, '0991', 650105, '水磨沟区', NULL, '87.613093,43.816747', 'district', 957);
INSERT INTO `amapDistrictTable`
VALUES (961, '0991', 650109, '米东区', NULL, '87.691801,43.960982', 'district', 957);
INSERT INTO `amapDistrictTable`
VALUES (962, '0991', 650106, '头屯河区', NULL, '87.425823,43.876053', 'district', 957);
INSERT INTO `amapDistrictTable`
VALUES (963, '0991', 650121, '乌鲁木齐县', NULL, '87.505603,43.982546', 'district', 957);
INSERT INTO `amapDistrictTable`
VALUES (964, '0991', 650103, '沙依巴克区', NULL, '87.596639,43.788872', 'district', 957);
INSERT INTO `amapDistrictTable`
VALUES (965, '0991', 650104, '新市区', NULL, '87.560653,43.870882', 'district', 957);
INSERT INTO `amapDistrictTable`
VALUES (966, '1903', 659009, '昆玉市', NULL, '79.287372,37.207994', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (967, '1903', 659009, '兵团二二四团', NULL, '79.3401,37.416', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (968, '1903', 659009, '阔依其乡', NULL, '79.6876,37.3691', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (969, '1903', 659009, '乌鲁克萨依乡', NULL, '80.8148,36.2925', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (970, '1903', 659009, '普恰克其乡', NULL, '79.783,37.5805', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (971, '1903', 659009, '兵团四十七团', NULL, '79.6039,37.3666', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (972, '1903', 659009, '兵团一牧场', NULL, '81.0295,36.3152', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (973, '1903', 659009, '兵团皮山农场', NULL, '78.5171,37.563', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (974, '1903', 659009, '乌尔其乡', NULL, '79.5866,37.332', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (975, '1903', 659009, '喀拉喀什镇', NULL, '79.7678,37.2867', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (976, '1903', 659009, '奴尔乡', NULL, '81.0072,36.2605', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (977, '1903', 659009, '博斯坦乡', NULL, '81.3298,36.4124', 'street', 966);
INSERT INTO `amapDistrictTable`
VALUES (978, '0996', 652800, '巴音郭楞蒙古自治州', NULL, '86.150969,41.768552', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (979, '0996', 652828, '和硕县', NULL, '86.864947,42.268863', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (980, '0996', 652827, '和静县', NULL, '86.391067,42.31716', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (981, '0996', 652824, '若羌县', NULL, '88.168807,39.023807', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (982, '0996', 652826, '焉耆回族自治县', NULL, '86.5698,42.064349', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (983, '0996', 652829, '博湖县', NULL, '86.631576,41.980166', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (984, '0996', 652825, '且末县', NULL, '85.532629,38.138562', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (985, '0996', 652801, '库尔勒市', NULL, '86.145948,41.763122', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (986, '0996', 652822, '轮台县', NULL, '84.248542,41.781266', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (987, '0996', 652823, '尉犁县', NULL, '86.263412,41.337428', 'district', 978);
INSERT INTO `amapDistrictTable`
VALUES (988, '0903', 653200, '和田地区', NULL, '79.92533,37.110687', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (989, '0903', 653227, '民丰县', NULL, '82.692354,37.064909', 'district', 988);
INSERT INTO `amapDistrictTable`
VALUES (990, '0903', 653226, '于田县', NULL, '81.667845,36.854628', 'district', 988);
INSERT INTO `amapDistrictTable`
VALUES (991, '0903', 653201, '和田市', NULL, '79.927542,37.108944', 'district', 988);
INSERT INTO `amapDistrictTable`
VALUES (992, '0903', 653221, '和田县', NULL, '79.81907,37.120031', 'district', 988);
INSERT INTO `amapDistrictTable`
VALUES (993, '0903', 653225, '策勒县', NULL, '80.803572,37.001672', 'district', 988);
INSERT INTO `amapDistrictTable`
VALUES (994, '0903', 653223, '皮山县', NULL, '78.282301,37.616332', 'district', 988);
INSERT INTO `amapDistrictTable`
VALUES (995, '0903', 653224, '洛浦县', NULL, '80.184038,37.074377', 'district', 988);
INSERT INTO `amapDistrictTable`
VALUES (996, '0903', 653222, '墨玉县', NULL, '79.736629,37.271511', 'district', 988);
INSERT INTO `amapDistrictTable`
VALUES (997, '0901', 654200, '塔城地区', NULL, '82.985732,46.746301', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (998, '0901', 654201, '塔城市', NULL, '82.983988,46.746281', 'district', 997);
INSERT INTO `amapDistrictTable`
VALUES (999, '0901', 654221, '额敏县', NULL, '83.622118,46.522555', 'district', 997);
INSERT INTO `amapDistrictTable`
VALUES (1000, '0901', 654226, '和布克赛尔蒙古自治县', NULL, '85.733551,46.793001', 'district', 997);
INSERT INTO `amapDistrictTable`
VALUES (1001, '0901', 654225, '裕民县', NULL, '82.982157,46.202781', 'district', 997);
INSERT INTO `amapDistrictTable`
VALUES (1002, '0901', 654224, '托里县', NULL, '83.60469,45.935863', 'district', 997);
INSERT INTO `amapDistrictTable`
VALUES (1003, '0901', 654202, '乌苏市', NULL, '84.677624,44.430115', 'district', 997);
INSERT INTO `amapDistrictTable`
VALUES (1004, '0901', 654223, '沙湾县', NULL, '85.622508,44.329544', 'district', 997);
INSERT INTO `amapDistrictTable`
VALUES (1005, '0906', 654300, '阿勒泰地区', NULL, '88.13963,47.848393', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1006, '0906', 654321, '布尔津县', NULL, '86.86186,47.70453', 'district', 1005);
INSERT INTO `amapDistrictTable`
VALUES (1007, '0906', 654324, '哈巴河县', NULL, '86.418964,48.059284', 'district', 1005);
INSERT INTO `amapDistrictTable`
VALUES (1008, '0906', 654326, '吉木乃县', NULL, '85.876064,47.434633', 'district', 1005);
INSERT INTO `amapDistrictTable`
VALUES (1009, '0906', 654325, '青河县', NULL, '90.381561,46.672446', 'district', 1005);
INSERT INTO `amapDistrictTable`
VALUES (1010, '0906', 654322, '富蕴县', NULL, '89.524993,46.993106', 'district', 1005);
INSERT INTO `amapDistrictTable`
VALUES (1011, '0906', 654301, '阿勒泰市', NULL, '88.138743,47.848911', 'district', 1005);
INSERT INTO `amapDistrictTable`
VALUES (1012, '0906', 654323, '福海县', NULL, '87.494569,47.113128', 'district', 1005);
INSERT INTO `amapDistrictTable`
VALUES (1013, '0994', 652300, '昌吉回族自治州', NULL, '87.304012,44.014577', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1014, '0994', 652325, '奇台县', NULL, '89.591437,44.021996', 'district', 1013);
INSERT INTO `amapDistrictTable`
VALUES (1015, '0994', 652324, '玛纳斯县', NULL, '86.217687,44.305625', 'district', 1013);
INSERT INTO `amapDistrictTable`
VALUES (1016, '0994', 652323, '呼图壁县', NULL, '86.888613,44.189342', 'district', 1013);
INSERT INTO `amapDistrictTable`
VALUES (1017, '0994', 652328, '木垒哈萨克自治县', NULL, '90.282833,43.832442', 'district', 1013);
INSERT INTO `amapDistrictTable`
VALUES (1018, '0994', 652302, '阜康市', NULL, '87.98384,44.152153', 'district', 1013);
INSERT INTO `amapDistrictTable`
VALUES (1019, '0994', 652301, '昌吉市', NULL, '87.304112,44.013183', 'district', 1013);
INSERT INTO `amapDistrictTable`
VALUES (1020, '0994', 652327, '吉木萨尔县', NULL, '89.181288,43.997162', 'district', 1013);
INSERT INTO `amapDistrictTable`
VALUES (1021, '0993', 659001, '石河子市', NULL, '86.041075,44.305886', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1022, '0993', 659001, '兵团一五二团', NULL, '86.0704,44.2827', 'street', 1021);
INSERT INTO `amapDistrictTable`
VALUES (1023, '0993', 659001, '向阳街道', NULL, '86.0397,44.3429', 'street', 1021);
INSERT INTO `amapDistrictTable`
VALUES (1024, '0993', 659001, '红山街道', NULL, '86.048,44.2682', 'street', 1021);
INSERT INTO `amapDistrictTable`
VALUES (1025, '0993', 659001, '东城街道', NULL, '86.0687,44.2873', 'street', 1021);
INSERT INTO `amapDistrictTable`
VALUES (1026, '0993', 659001, '老街街道', NULL, '85.9909,44.3496', 'street', 1021);
INSERT INTO `amapDistrictTable`
VALUES (1027, '0993', 659001, '石河子乡', NULL, '86.1022,44.1352', 'street', 1021);
INSERT INTO `amapDistrictTable`
VALUES (1028, '0993', 659001, '新城街道', NULL, '85.9823,44.2893', 'street', 1021);
INSERT INTO `amapDistrictTable`
VALUES (1029, '0993', 659001, '北泉镇', NULL, '86.0983,44.4346', 'street', 1021);
INSERT INTO `amapDistrictTable`
VALUES (1030, '1994', 659004, '五家渠市', NULL, '87.526884,44.167401', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1031, '1994', 659004, '兵团一零二团', NULL, '87.5925,44.2694', 'street', 1030);
INSERT INTO `amapDistrictTable`
VALUES (1032, '1994', 659004, '军垦路街道', NULL, '87.5084,44.1889', 'street', 1030);
INSERT INTO `amapDistrictTable`
VALUES (1033, '1994', 659004, '人民路街道', NULL, '87.5728,44.1822', 'street', 1030);
INSERT INTO `amapDistrictTable`
VALUES (1034, '1994', 659004, '兵团一零一团', NULL, '87.5562,44.1752', 'street', 1030);
INSERT INTO `amapDistrictTable`
VALUES (1035, '1994', 659004, '兵团一零三团', NULL, '87.4075,44.5317', 'street', 1030);
INSERT INTO `amapDistrictTable`
VALUES (1036, '1994', 659004, '青湖路街道', NULL, '87.5245,44.1764', 'street', 1030);
INSERT INTO `amapDistrictTable`
VALUES (1037, '0999', 654000, '伊犁哈萨克自治州', NULL, '81.317946,43.92186', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1038, '0999', 654003, '奎屯市', NULL, '84.901602,44.423445', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1039, '0999', 654021, '伊宁县', NULL, '81.524671,43.977876', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1040, '0999', 654025, '新源县', NULL, '83.258493,43.434249', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1041, '0999', 654024, '巩留县', NULL, '82.227044,43.481618', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1042, '0999', 654028, '尼勒克县', NULL, '82.504119,43.789737', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1043, '0999', 654027, '特克斯县', NULL, '81.840058,43.214861', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1044, '0999', 654026, '昭苏县', NULL, '81.126029,43.157765', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1045, '0999', 654022, '察布查尔锡伯自治县', NULL, '81.150874,43.838883', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1046, '0999', 654023, '霍城县', NULL, '80.872508,44.049912', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1047, '0999', 654004, '霍尔果斯市', NULL, '80.420759,44.201669', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1048, '0999', 654002, '伊宁市', NULL, '81.316343,43.922209', 'district', 1037);
INSERT INTO `amapDistrictTable`
VALUES (1049, '1997', 659002, '阿拉尔市', NULL, '81.285884,40.541914', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1050, '1997', 659002, '阿拉尔农场', NULL, '81.0627,40.5567', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1051, '1997', 659002, '幸福路街道', NULL, '81.2681,40.577', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1052, '1997', 659002, '兵团第一师幸福农场', NULL, '80.9904,40.7025', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1053, '1997', 659002, '工业园区', NULL, '81.2448,40.5461', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1054, '1997', 659002, '兵团七团', NULL, '80.6543,40.6569', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1055, '1997', 659002, '兵团十一团', NULL, '81.5619,40.6277', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1056, '1997', 659002, '青松路街道', NULL, '81.2545,40.542', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1057, '1997', 659002, '托喀依乡', NULL, '81.3541,40.5818', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1058, '1997', 659002, '兵团第一师水利水电工程处', NULL, '81.2858,40.5496', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1059, '1997', 659002, '兵团八团', NULL, '80.7996,40.5973', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1060, '1997', 659002, '中心监狱', NULL, '81.2766,40.6692', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1061, '1997', 659002, '兵团第一师塔里木灌区水利管理处', NULL, '81.2876,40.5454', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1062, '1997', 659002, '兵团十四团', NULL, '81.8688,40.9423', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1063, '1997', 659002, '兵团十团', NULL, '81.259,40.6387', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1064, '1997', 659002, '金银川路街道', NULL, '81.2613,40.5355', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1065, '1997', 659002, '兵团十二团', NULL, '81.1109,40.4977', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1066, '1997', 659002, '兵团十六团', NULL, '80.7871,40.4163', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1067, '1997', 659002, '兵团十三团', NULL, '81.4734,40.5742', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1068, '1997', 659002, '南口街道', NULL, '81.2988,40.5154', 'street', 1049);
INSERT INTO `amapDistrictTable`
VALUES (1069, '0995', 650400, '吐鲁番市', NULL, '89.184078,42.947613', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1070, '0995', 650421, '鄯善县', NULL, '90.212692,42.865503', 'district', 1069);
INSERT INTO `amapDistrictTable`
VALUES (1071, '0995', 650422, '托克逊县', NULL, '88.655771,42.793536', 'district', 1069);
INSERT INTO `amapDistrictTable`
VALUES (1072, '0995', 650402, '高昌区', NULL, '89.182324,42.947627', 'district', 1069);
INSERT INTO `amapDistrictTable`
VALUES (1073, '0998', 653100, '喀什地区', NULL, '75.989138,39.467664', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1074, '0998', 653122, '疏勒县', NULL, '76.053653,39.399461', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1075, '0998', 653127, '麦盖提县', NULL, '77.651538,38.903384', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1076, '0998', 653125, '莎车县', NULL, '77.248884,38.414499', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1077, '0998', 653129, '伽师县', NULL, '76.741982,39.494325', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1078, '0998', 653131, '塔什库尔干塔吉克自治县', NULL, '75.228068,37.775437', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1079, '0998', 653126, '叶城县', NULL, '77.420353,37.884679', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1080, '0998', 653124, '泽普县', NULL, '77.273593,38.191217', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1081, '0998', 653130, '巴楚县', NULL, '78.55041,39.783479', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1082, '0998', 653121, '疏附县', NULL, '75.863075,39.378306', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1083, '0998', 653123, '英吉沙县', NULL, '76.174292,38.929839', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1084, '0998', 653101, '喀什市', NULL, '75.98838,39.467861', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1085, '0998', 653128, '岳普湖县', NULL, '76.7724,39.235248', 'district', 1073);
INSERT INTO `amapDistrictTable`
VALUES (1086, '0902', 650500, '哈密市', NULL, '93.51316,42.833248', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1087, '0902', 650502, '伊州区', NULL, '93.509174,42.833888', 'district', 1086);
INSERT INTO `amapDistrictTable`
VALUES (1088, '0902', 650521, '巴里坤哈萨克自治县', NULL, '93.021795,43.599032', 'district', 1086);
INSERT INTO `amapDistrictTable`
VALUES (1089, '0902', 650522, '伊吾县', NULL, '94.692773,43.252012', 'district', 1086);
INSERT INTO `amapDistrictTable`
VALUES (1090, '1998', 659003, '图木舒克市', NULL, '79.077978,39.867316', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1091, '1998', 659003, '兵团四十九团', NULL, '78.756,39.8224', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1092, '1998', 659003, '兵团图木舒克市永安坝', NULL, '79.0133,39.8385', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1093, '1998', 659003, '兵团五十一团', NULL, '79.2902,39.9888', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1094, '1998', 659003, '前海街道', NULL, '79.0778,39.855', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1095, '1998', 659003, '兵团图木舒克市喀拉拜勒镇', NULL, '79.0112,39.8526', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1096, '1998', 659003, '永安坝街道', NULL, '79.0229,39.8507', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1097, '1998', 659003, '齐干却勒街道', NULL, '79.0906,39.8753', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1098, '1998', 659003, '兵团五十三团', NULL, '79.3214,40.0318', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1099, '1998', 659003, '兵团五十团', NULL, '79.2315,39.9549', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1100, '1998', 659003, '兵团四十四团', NULL, '79.1926,39.9168', 'street', 1090);
INSERT INTO `amapDistrictTable`
VALUES (1101, '0908', 653000, '克孜勒苏柯尔克孜自治州', NULL, '76.172825,39.713431', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1102, '0908', 653024, '乌恰县', NULL, '75.25969,39.716633', 'district', 1101);
INSERT INTO `amapDistrictTable`
VALUES (1103, '0908', 653001, '阿图什市', NULL, '76.173939,39.712898', 'district', 1101);
INSERT INTO `amapDistrictTable`
VALUES (1104, '0908', 653023, '阿合奇县', NULL, '78.450164,40.937567', 'district', 1101);
INSERT INTO `amapDistrictTable`
VALUES (1105, '0908', 653022, '阿克陶县', NULL, '75.945159,39.147079', 'district', 1101);
INSERT INTO `amapDistrictTable`
VALUES (1106, '0997', 652900, '阿克苏地区', NULL, '80.265068,41.170712', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1107, '0997', 652922, '温宿县', NULL, '80.243273,41.272995', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1108, '0997', 652901, '阿克苏市', NULL, '80.2629,41.171272', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1109, '0997', 652902, '库车市', NULL, '82.96304,41.717141', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1110, '0997', 652924, '沙雅县', NULL, '82.78077,41.226268', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1111, '0997', 652926, '拜城县', NULL, '81.869881,41.796101', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1112, '0997', 652929, '柯坪县', NULL, '79.04785,40.50624', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1113, '0997', 652925, '新和县', NULL, '82.610828,41.551176', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1114, '0997', 652928, '阿瓦提县', NULL, '80.378426,40.638422', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1115, '0997', 652927, '乌什县', NULL, '79.230805,41.21587', 'district', 1106);
INSERT INTO `amapDistrictTable`
VALUES (1116, '0990', 650200, '克拉玛依市', NULL, '84.873946,45.595886', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1117, '0990', 650204, '白碱滩区', NULL, '85.129882,45.689021', 'district', 1116);
INSERT INTO `amapDistrictTable`
VALUES (1118, '0990', 650203, '克拉玛依区', NULL, '84.868918,45.600477', 'district', 1116);
INSERT INTO `amapDistrictTable`
VALUES (1119, '0990', 650205, '乌尔禾区', NULL, '85.697767,46.08776', 'district', 1116);
INSERT INTO `amapDistrictTable`
VALUES (1120, '0990', 650202, '独山子区', NULL, '84.882267,44.327207', 'district', 1116);
INSERT INTO `amapDistrictTable`
VALUES (1121, '0992', 659010, '胡杨河市', NULL, '84.8275959,44.69288853', 'city', 930);
INSERT INTO `amapDistrictTable`
VALUES (1122, '0992', 659010, '兵团一三零团', NULL, '84.8765,44.6164', 'street', 1121);
INSERT INTO `amapDistrictTable`
VALUES (1123, '0992', 659010, '五五新镇街道', NULL, '84.8012,44.865', 'street', 1121);
INSERT INTO `amapDistrictTable`
VALUES (1124, '0992', 659010, '兵团一二八团', NULL, '84.5572,45.0861', 'street', 1121);
INSERT INTO `amapDistrictTable`
VALUES (1125, '0992', 659010, '兵团一二九团', NULL, '84.8046,44.8465', 'street', 1121);
INSERT INTO `amapDistrictTable`
VALUES (1126, NULL, 210000, '辽宁省', NULL, '123.429096,41.796767', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1127, '0416', 210700, '锦州市', NULL, '121.135742,41.119269', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1128, '0416', 210727, '义县', NULL, '121.242831,41.537224', 'district', 1127);
INSERT INTO `amapDistrictTable`
VALUES (1129, '0416', 210726, '黑山县', NULL, '122.117915,41.691804', 'district', 1127);
INSERT INTO `amapDistrictTable`
VALUES (1130, '0416', 210781, '凌海市', NULL, '121.364236,41.171738', 'district', 1127);
INSERT INTO `amapDistrictTable`
VALUES (1131, '0416', 210711, '太和区', NULL, '121.107297,41.105378', 'district', 1127);
INSERT INTO `amapDistrictTable`
VALUES (1132, '0416', 210782, '北镇市', NULL, '121.795962,41.598764', 'district', 1127);
INSERT INTO `amapDistrictTable`
VALUES (1133, '0416', 210703, '凌河区', NULL, '121.151304,41.114662', 'district', 1127);
INSERT INTO `amapDistrictTable`
VALUES (1134, '0416', 210702, '古塔区', NULL, '121.130085,41.115719', 'district', 1127);
INSERT INTO `amapDistrictTable`
VALUES (1135, '0411', 210200, '大连市', NULL, '121.618622,38.91459', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1136, '0411', 210212, '旅顺口区', NULL, '121.26713,38.812043', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1137, '0411', 210213, '金州区', NULL, '121.789413,39.052745', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1138, '0411', 210281, '瓦房店市', NULL, '122.002656,39.63065', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1139, '0411', 210224, '长海县', NULL, '122.587824,39.272399', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1140, '0411', 210211, '甘井子区', NULL, '121.582614,38.975148', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1141, '0411', 210214, '普兰店区', NULL, '121.9705,39.401555', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1142, '0411', 210283, '庄河市', NULL, '122.970612,39.69829', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1143, '0411', 210202, '中山区', NULL, '121.64376,38.921553', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1144, '0411', 210203, '西岗区', NULL, '121.616112,38.914266', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1145, '0411', 210204, '沙河口区', NULL, '121.593702,38.912859', 'district', 1135);
INSERT INTO `amapDistrictTable`
VALUES (1146, '0415', 210600, '丹东市', NULL, '124.383044,40.124296', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1147, '0415', 210682, '凤城市', NULL, '124.071067,40.457567', 'district', 1146);
INSERT INTO `amapDistrictTable`
VALUES (1148, '0415', 210604, '振安区', NULL, '124.427709,40.158557', 'district', 1146);
INSERT INTO `amapDistrictTable`
VALUES (1149, '0415', 210681, '东港市', NULL, '124.149437,39.883467', 'district', 1146);
INSERT INTO `amapDistrictTable`
VALUES (1150, '0415', 210603, '振兴区', NULL, '124.361153,40.102801', 'district', 1146);
INSERT INTO `amapDistrictTable`
VALUES (1151, '0415', 210624, '宽甸满族自治县', NULL, '124.784867,40.730412', 'district', 1146);
INSERT INTO `amapDistrictTable`
VALUES (1152, '0415', 210602, '元宝区', NULL, '124.397814,40.136483', 'district', 1146);
INSERT INTO `amapDistrictTable`
VALUES (1153, '0413', 210400, '抚顺市', NULL, '123.921109,41.875956', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1154, '0413', 210423, '清原满族自治县', NULL, '124.927192,42.10135', 'district', 1153);
INSERT INTO `amapDistrictTable`
VALUES (1155, '0413', 210422, '新宾满族自治县', NULL, '125.037547,41.732456', 'district', 1153);
INSERT INTO `amapDistrictTable`
VALUES (1156, '0413', 210411, '顺城区', NULL, '123.917165,41.881132', 'district', 1153);
INSERT INTO `amapDistrictTable`
VALUES (1157, '0413', 210403, '东洲区', NULL, '124.047219,41.866829', 'district', 1153);
INSERT INTO `amapDistrictTable`
VALUES (1158, '0413', 210402, '新抚区', NULL, '123.902858,41.86082', 'district', 1153);
INSERT INTO `amapDistrictTable`
VALUES (1159, '0413', 210404, '望花区', NULL, '123.801509,41.851803', 'district', 1153);
INSERT INTO `amapDistrictTable`
VALUES (1160, '0413', 210421, '抚顺县', NULL, '124.097979,41.922644', 'district', 1153);
INSERT INTO `amapDistrictTable`
VALUES (1161, '0429', 211400, '葫芦岛市', NULL, '120.856394,40.755572', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1162, '0429', 211403, '龙港区', NULL, '120.838569,40.709991', 'district', 1161);
INSERT INTO `amapDistrictTable`
VALUES (1163, '0429', 211422, '建昌县', NULL, '119.807776,40.812871', 'district', 1161);
INSERT INTO `amapDistrictTable`
VALUES (1164, '0429', 211481, '兴城市', NULL, '120.729365,40.619413', 'district', 1161);
INSERT INTO `amapDistrictTable`
VALUES (1165, '0429', 211421, '绥中县', NULL, '120.342112,40.328407', 'district', 1161);
INSERT INTO `amapDistrictTable`
VALUES (1166, '0429', 211402, '连山区', NULL, '120.85937,40.755143', 'district', 1161);
INSERT INTO `amapDistrictTable`
VALUES (1167, '0429', 211404, '南票区', NULL, '120.752314,41.098813', 'district', 1161);
INSERT INTO `amapDistrictTable`
VALUES (1168, '0410', 211200, '铁岭市', NULL, '123.844279,42.290585', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1169, '0410', 211282, '开原市', NULL, '124.045551,42.542141', 'district', 1168);
INSERT INTO `amapDistrictTable`
VALUES (1170, '0410', 211281, '调兵山市', NULL, '123.545366,42.450734', 'district', 1168);
INSERT INTO `amapDistrictTable`
VALUES (1171, '0410', 211204, '清河区', NULL, '124.14896,42.542978', 'district', 1168);
INSERT INTO `amapDistrictTable`
VALUES (1172, '0410', 211202, '银州区', NULL, '123.844877,42.292278', 'district', 1168);
INSERT INTO `amapDistrictTable`
VALUES (1173, '0410', 211223, '西丰县', NULL, '124.72332,42.738091', 'district', 1168);
INSERT INTO `amapDistrictTable`
VALUES (1174, '0410', 211221, '铁岭县', NULL, '123.725669,42.223316', 'district', 1168);
INSERT INTO `amapDistrictTable`
VALUES (1175, '0410', 211224, '昌图县', NULL, '124.11017,42.784441', 'district', 1168);
INSERT INTO `amapDistrictTable`
VALUES (1176, '024', 210100, '沈阳市', NULL, '123.429096,41.796767', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1177, '024', 210181, '新民市', NULL, '122.828868,41.996508', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1178, '024', 210111, '苏家屯区', NULL, '123.341604,41.665904', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1179, '024', 210102, '和平区', NULL, '123.406664,41.788074', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1180, '024', 210105, '皇姑区', NULL, '123.405677,41.822336', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1181, '024', 210114, '于洪区', NULL, '123.310829,41.795833', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1182, '024', 210123, '康平县', NULL, '123.352703,42.741533', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1183, '024', 210124, '法库县', NULL, '123.416722,42.507045', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1184, '024', 210103, '沈河区', NULL, '123.445696,41.795591', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1185, '024', 210104, '大东区', NULL, '123.469956,41.808503', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1186, '024', 210106, '铁西区', NULL, '123.350664,41.787808', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1187, '024', 210115, '辽中区', NULL, '122.731269,41.512725', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1188, '024', 210113, '沈北新区', NULL, '123.521471,42.052312', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1189, '024', 210112, '浑南区', NULL, '123.458981,41.741946', 'district', 1176);
INSERT INTO `amapDistrictTable`
VALUES (1190, '0417', 210800, '营口市', NULL, '122.235151,40.667432', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1191, '0417', 210882, '大石桥市', NULL, '122.505894,40.633973', 'district', 1190);
INSERT INTO `amapDistrictTable`
VALUES (1192, '0417', 210804, '鲅鱼圈区', NULL, '122.127242,40.263646', 'district', 1190);
INSERT INTO `amapDistrictTable`
VALUES (1193, '0417', 210881, '盖州市', NULL, '122.355534,40.405234', 'district', 1190);
INSERT INTO `amapDistrictTable`
VALUES (1194, '0417', 210803, '西市区', NULL, '122.210067,40.663086', 'district', 1190);
INSERT INTO `amapDistrictTable`
VALUES (1195, '0417', 210802, '站前区', NULL, '122.253235,40.669949', 'district', 1190);
INSERT INTO `amapDistrictTable`
VALUES (1196, '0417', 210811, '老边区', NULL, '122.382584,40.682723', 'district', 1190);
INSERT INTO `amapDistrictTable`
VALUES (1197, '0427', 211100, '盘锦市', NULL, '122.06957,41.124484', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1198, '0427', 211103, '兴隆台区', NULL, '122.071624,41.122423', 'district', 1197);
INSERT INTO `amapDistrictTable`
VALUES (1199, '0427', 211122, '盘山县', NULL, '121.98528,41.240701', 'district', 1197);
INSERT INTO `amapDistrictTable`
VALUES (1200, '0427', 211104, '大洼区', NULL, '122.071708,40.994428', 'district', 1197);
INSERT INTO `amapDistrictTable`
VALUES (1201, '0427', 211102, '双台子区', NULL, '122.055733,41.190365', 'district', 1197);
INSERT INTO `amapDistrictTable`
VALUES (1202, '0418', 210900, '阜新市', NULL, '121.648962,42.011796', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1203, '0418', 210905, '清河门区', NULL, '121.42018,41.780477', 'district', 1202);
INSERT INTO `amapDistrictTable`
VALUES (1204, '0418', 210904, '太平区', NULL, '121.677575,42.011145', 'district', 1202);
INSERT INTO `amapDistrictTable`
VALUES (1205, '0418', 210921, '阜新蒙古族自治县', NULL, '121.743125,42.058607', 'district', 1202);
INSERT INTO `amapDistrictTable`
VALUES (1206, '0418', 210903, '新邱区', NULL, '121.790541,42.086603', 'district', 1202);
INSERT INTO `amapDistrictTable`
VALUES (1207, '0418', 210922, '彰武县', NULL, '122.537444,42.384823', 'district', 1202);
INSERT INTO `amapDistrictTable`
VALUES (1208, '0418', 210902, '海州区', NULL, '121.657639,42.011162', 'district', 1202);
INSERT INTO `amapDistrictTable`
VALUES (1209, '0418', 210911, '细河区', NULL, '121.654791,42.019218', 'district', 1202);
INSERT INTO `amapDistrictTable`
VALUES (1210, '0414', 210500, '本溪市', NULL, '123.770519,41.297909', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1211, '0414', 210522, '桓仁满族自治县', NULL, '125.359195,41.268997', 'district', 1210);
INSERT INTO `amapDistrictTable`
VALUES (1212, '0414', 210503, '溪湖区', NULL, '123.765226,41.330056', 'district', 1210);
INSERT INTO `amapDistrictTable`
VALUES (1213, '0414', 210505, '南芬区', NULL, '123.748381,41.104093', 'district', 1210);
INSERT INTO `amapDistrictTable`
VALUES (1214, '0414', 210502, '平山区', NULL, '123.761231,41.291581', 'district', 1210);
INSERT INTO `amapDistrictTable`
VALUES (1215, '0414', 210504, '明山区', NULL, '123.763288,41.302429', 'district', 1210);
INSERT INTO `amapDistrictTable`
VALUES (1216, '0414', 210521, '本溪满族自治县', NULL, '124.126156,41.300344', 'district', 1210);
INSERT INTO `amapDistrictTable`
VALUES (1217, '0419', 211000, '辽阳市', NULL, '123.18152,41.269402', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1218, '0419', 211005, '弓长岭区', NULL, '123.431633,41.157831', 'district', 1217);
INSERT INTO `amapDistrictTable`
VALUES (1219, '0419', 211081, '灯塔市', NULL, '123.325864,41.427836', 'district', 1217);
INSERT INTO `amapDistrictTable`
VALUES (1220, '0419', 211021, '辽阳县', NULL, '123.079674,41.216479', 'district', 1217);
INSERT INTO `amapDistrictTable`
VALUES (1221, '0419', 211002, '白塔区', NULL, '123.172611,41.26745', 'district', 1217);
INSERT INTO `amapDistrictTable`
VALUES (1222, '0419', 211003, '文圣区', NULL, '123.188227,41.266765', 'district', 1217);
INSERT INTO `amapDistrictTable`
VALUES (1223, '0419', 211011, '太子河区', NULL, '123.185336,41.251682', 'district', 1217);
INSERT INTO `amapDistrictTable`
VALUES (1224, '0419', 211004, '宏伟区', NULL, '123.200461,41.205747', 'district', 1217);
INSERT INTO `amapDistrictTable`
VALUES (1225, '0412', 210300, '鞍山市', NULL, '122.995632,41.110626', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1226, '0412', 210321, '台安县', NULL, '122.429736,41.38686', 'district', 1225);
INSERT INTO `amapDistrictTable`
VALUES (1227, '0412', 210323, '岫岩满族自治县', NULL, '123.28833,40.281509', 'district', 1225);
INSERT INTO `amapDistrictTable`
VALUES (1228, '0412', 210311, '千山区', NULL, '122.949298,41.068909', 'district', 1225);
INSERT INTO `amapDistrictTable`
VALUES (1229, '0412', 210303, '铁西区', NULL, '122.971834,41.11069', 'district', 1225);
INSERT INTO `amapDistrictTable`
VALUES (1230, '0412', 210302, '铁东区', NULL, '122.994475,41.110344', 'district', 1225);
INSERT INTO `amapDistrictTable`
VALUES (1231, '0412', 210304, '立山区', NULL, '123.024806,41.150622', 'district', 1225);
INSERT INTO `amapDistrictTable`
VALUES (1232, '0412', 210381, '海城市', NULL, '122.752199,40.852533', 'district', 1225);
INSERT INTO `amapDistrictTable`
VALUES (1233, '0421', 211300, '朝阳市', NULL, '120.451176,41.576758', 'city', 1126);
INSERT INTO `amapDistrictTable`
VALUES (1234, '0421', 211322, '建平县', NULL, '119.642363,41.402576', 'district', 1233);
INSERT INTO `amapDistrictTable`
VALUES (1235, '0421', 211381, '北票市', NULL, '120.766951,41.803286', 'district', 1233);
INSERT INTO `amapDistrictTable`
VALUES (1236, '0421', 211321, '朝阳县', NULL, '120.404217,41.526342', 'district', 1233);
INSERT INTO `amapDistrictTable`
VALUES (1237, '0421', 211302, '双塔区', NULL, '120.44877,41.579389', 'district', 1233);
INSERT INTO `amapDistrictTable`
VALUES (1238, '0421', 211303, '龙城区', NULL, '120.413376,41.576749', 'district', 1233);
INSERT INTO `amapDistrictTable`
VALUES (1239, '0421', 211324, '喀喇沁左翼蒙古族自治县', NULL, '119.744883,41.125428', 'district', 1233);
INSERT INTO `amapDistrictTable`
VALUES (1240, '0421', 211382, '凌源市', NULL, '119.404789,41.243086', 'district', 1233);
INSERT INTO `amapDistrictTable`
VALUES (1241, NULL, 420000, '湖北省', NULL, '114.298572,30.584355', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1242, '0719', 420300, '十堰市', NULL, '110.787916,32.646907', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1243, '0719', 420381, '丹江口市', NULL, '111.513793,32.538839', 'district', 1242);
INSERT INTO `amapDistrictTable`
VALUES (1244, '0719', 420304, '郧阳区', NULL, '110.812099,32.838267', 'district', 1242);
INSERT INTO `amapDistrictTable`
VALUES (1245, '0719', 420303, '张湾区', NULL, '110.772365,32.652516', 'district', 1242);
INSERT INTO `amapDistrictTable`
VALUES (1246, '0719', 420302, '茅箭区', NULL, '110.78621,32.644463', 'district', 1242);
INSERT INTO `amapDistrictTable`
VALUES (1247, '0719', 420324, '竹溪县', NULL, '109.717196,32.315342', 'district', 1242);
INSERT INTO `amapDistrictTable`
VALUES (1248, '0719', 420323, '竹山县', NULL, '110.2296,32.22586', 'district', 1242);
INSERT INTO `amapDistrictTable`
VALUES (1249, '0719', 420325, '房县', NULL, '110.741966,32.055002', 'district', 1242);
INSERT INTO `amapDistrictTable`
VALUES (1250, '0719', 420322, '郧西县', NULL, '110.426472,32.991457', 'district', 1242);
INSERT INTO `amapDistrictTable`
VALUES (1251, '0710', 420600, '襄阳市', NULL, '112.144146,32.042426', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1252, '0710', 420684, '宜城市', NULL, '112.261441,31.709203', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1253, '0710', 420626, '保康县', NULL, '111.262235,31.873507', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1254, '0710', 420683, '枣阳市', NULL, '112.765268,32.123083', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1255, '0710', 420625, '谷城县', NULL, '111.640147,32.262676', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1256, '0710', 420624, '南漳县', NULL, '111.844424,31.77692', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1257, '0710', 420682, '老河口市', NULL, '111.675732,32.385438', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1258, '0710', 420602, '襄城区', NULL, '112.150327,32.015088', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1259, '0710', 420606, '樊城区', NULL, '112.13957,32.058589', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1260, '0710', 420607, '襄州区', NULL, '112.197378,32.085517', 'district', 1251);
INSERT INTO `amapDistrictTable`
VALUES (1261, '0717', 420500, '宜昌市', NULL, '111.290843,30.702636', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1262, '0717', 420525, '远安县', NULL, '111.64331,31.059626', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1263, '0717', 420526, '兴山县', NULL, '110.754499,31.34795', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1264, '0717', 420582, '当阳市', NULL, '111.793419,30.824492', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1265, '0717', 420527, '秭归县', NULL, '110.976785,30.823908', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1266, '0717', 420528, '长阳土家族自治县', NULL, '111.198475,30.466534', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1267, '0717', 420504, '点军区', NULL, '111.268163,30.692322', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1268, '0717', 420505, '猇亭区', NULL, '111.427642,30.530744', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1269, '0717', 420503, '伍家岗区', NULL, '111.307215,30.679053', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1270, '0717', 420581, '宜都市', NULL, '111.454367,30.387234', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1271, '0717', 420529, '五峰土家族自治县', NULL, '110.674938,30.199252', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1272, '0717', 420583, '枝江市', NULL, '111.751799,30.425364', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1273, '0717', 420506, '夷陵区', NULL, '111.326747,30.770199', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1274, '0717', 420502, '西陵区', NULL, '111.295468,30.702476', 'district', 1261);
INSERT INTO `amapDistrictTable`
VALUES (1275, '0724', 420800, '荆门市', NULL, '112.204251,31.03542', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1276, '0724', 420802, '东宝区', NULL, '112.204804,31.033461', 'district', 1275);
INSERT INTO `amapDistrictTable`
VALUES (1277, '0724', 420881, '钟祥市', NULL, '112.587267,31.165573', 'district', 1275);
INSERT INTO `amapDistrictTable`
VALUES (1278, '0724', 420882, '京山市', NULL, '113.114595,31.022457', 'district', 1275);
INSERT INTO `amapDistrictTable`
VALUES (1279, '0724', 420804, '掇刀区', NULL, '112.198413,30.980798', 'district', 1275);
INSERT INTO `amapDistrictTable`
VALUES (1280, '0724', 420822, '沙洋县', NULL, '112.595218,30.70359', 'district', 1275);
INSERT INTO `amapDistrictTable`
VALUES (1281, '0713', 421100, '黄冈市', NULL, '114.879365,30.447711', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1282, '0713', 421181, '麻城市', NULL, '115.02541,31.177906', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1283, '0713', 421121, '团风县', NULL, '114.872029,30.63569', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1284, '0713', 421102, '黄州区', NULL, '114.878934,30.447435', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1285, '0713', 421126, '蕲春县', NULL, '115.433964,30.234927', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1286, '0713', 421125, '浠水县', NULL, '115.26344,30.454837', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1287, '0713', 421124, '英山县', NULL, '115.67753,30.735794', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1288, '0713', 421122, '红安县', NULL, '114.615095,31.284777', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1289, '0713', 421127, '黄梅县', NULL, '115.942548,30.075113', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1290, '0713', 421182, '武穴市', NULL, '115.56242,29.849342', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1291, '0713', 421123, '罗田县', NULL, '115.398984,30.781679', 'district', 1281);
INSERT INTO `amapDistrictTable`
VALUES (1292, '1728', 429006, '天门市', NULL, '113.165862,30.653061', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1293, '1728', 429006, '胡市镇', NULL, '113.422,30.802', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1294, '1728', 429006, '多祥镇', NULL, '113.361,30.4223', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1295, '1728', 429006, '沉湖管委会', NULL, '113.399,30.4588', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1296, '1728', 429006, '黄潭镇', NULL, '113.039,30.6922', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1297, '1728', 429006, '干驿镇', NULL, '113.451,30.503', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1298, '1728', 429006, '横林镇', NULL, '113.215,30.5643', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1299, '1728', 429006, '马湾镇', NULL, '113.312,30.5993', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1300, '1728', 429006, '小板镇', NULL, '113.264,30.6151', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1301, '1728', 429006, '蒋湖农场', NULL, '112.802,30.6364', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1302, '1728', 429006, '多宝镇', NULL, '112.614,30.7034', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1303, '1728', 429006, '岳口镇', NULL, '113.105,30.5868', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1304, '1728', 429006, '蒋场镇', NULL, '112.927,30.646', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1305, '1728', 429006, '石家河镇', NULL, '113.076,30.8211', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1306, '1728', 429006, '彭市镇', NULL, '113.157,30.4315', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1307, '1728', 429006, '佛子山镇', NULL, '113.068,30.6892', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1308, '1728', 429006, '九真镇', NULL, '113.206,30.8245', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1309, '1728', 429006, '竟陵街道', NULL, '113.183,30.7066', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1310, '1728', 429006, '侨乡街道开发区', NULL, '113.134,30.652', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1311, '1728', 429006, '麻洋镇', NULL, '113.309,30.5249', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1312, '1728', 429006, '杨林街道', NULL, '113.265,30.6856', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1313, '1728', 429006, '白茅湖农场', NULL, '113.063,30.5868', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1314, '1728', 429006, '汪场镇', NULL, '112.979,30.638', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1315, '1728', 429006, '张港镇', NULL, '112.801,30.5529', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1316, '1728', 429006, '渔薪镇', NULL, '112.879,30.6744', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1317, '1728', 429006, '净潭乡', NULL, '113.451,30.6464', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1318, '1728', 429006, '皂市镇', NULL, '113.223,30.7957', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1319, '1728', 429006, '拖市镇', NULL, '112.856,30.7135', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1320, '1728', 429006, '卢市镇', NULL, '113.397,30.6596', 'street', 1292);
INSERT INTO `amapDistrictTable`
VALUES (1321, '0712', 420900, '孝感市', NULL, '113.926655,30.926423', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1322, '0712', 420923, '云梦县', NULL, '113.750616,31.021691', 'district', 1321);
INSERT INTO `amapDistrictTable`
VALUES (1323, '0712', 420981, '应城市', NULL, '113.573842,30.939038', 'district', 1321);
INSERT INTO `amapDistrictTable`
VALUES (1324, '0712', 420902, '孝南区', NULL, '113.925849,30.925966', 'district', 1321);
INSERT INTO `amapDistrictTable`
VALUES (1325, '0712', 420984, '汉川市', NULL, '113.835301,30.652165', 'district', 1321);
INSERT INTO `amapDistrictTable`
VALUES (1326, '0712', 420921, '孝昌县', NULL, '113.988964,31.251618', 'district', 1321);
INSERT INTO `amapDistrictTable`
VALUES (1327, '0712', 420922, '大悟县', NULL, '114.126249,31.565483', 'district', 1321);
INSERT INTO `amapDistrictTable`
VALUES (1328, '0712', 420982, '安陆市', NULL, '113.690401,31.26174', 'district', 1321);
INSERT INTO `amapDistrictTable`
VALUES (1329, '2728', 429005, '潜江市', NULL, '112.896866,30.421215', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1330, '2728', 429005, '积玉口镇', NULL, '112.721,30.4185', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1331, '2728', 429005, '广华街道', NULL, '112.666,30.4633', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1332, '2728', 429005, '泰丰街道', NULL, '112.981,30.4167', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1333, '2728', 429005, '周矶管理区', NULL, '112.826,30.4567', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1334, '2728', 429005, '潜江经济开发区', NULL, '112.883,30.4825', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1335, '2728', 429005, '周矶街道', NULL, '112.818,30.4576', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1336, '2728', 429005, '高场街道', NULL, '112.775,30.4076', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1337, '2728', 429005, '总口管理区', NULL, '112.89,30.2581', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1338, '2728', 429005, '运粮湖管理区', NULL, '112.582,30.252', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1339, '2728', 429005, '王场镇', NULL, '112.819,30.4906', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1340, '2728', 429005, '园林街道', NULL, '112.91,30.377', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1341, '2728', 429005, '白鹭湖管理区', NULL, '112.716,30.1788', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1342, '2728', 429005, '竹根滩镇', NULL, '112.979,30.4716', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1343, '2728', 429005, '渔洋镇', NULL, '112.966,30.2392', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1344, '2728', 429005, '熊口镇', NULL, '112.724,30.3404', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1345, '2728', 429005, '后湖管理区', NULL, '112.768,30.4049', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1346, '2728', 429005, '熊口管理区', NULL, '112.802,30.195', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1347, '2728', 429005, '江汉石油管理局', NULL, '112.793,30.4635', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1348, '2728', 429005, '张金镇', NULL, '112.577,30.2389', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1349, '2728', 429005, '杨市街道', NULL, '112.915,30.3835', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1350, '2728', 429005, '浩口原种场', NULL, '112.643,30.3784', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1351, '2728', 429005, '龙湾镇', NULL, '112.69,30.2848', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1352, '2728', 429005, '老新镇', NULL, '112.81,30.2185', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1353, '2728', 429005, '浩口镇', NULL, '112.65,30.3695', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1354, '2728', 429005, '高石碑镇', NULL, '112.626,30.6203', 'street', 1329);
INSERT INTO `amapDistrictTable`
VALUES (1355, '0718', 422800, '恩施土家族苗族自治州', NULL, '109.48699,30.283114', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1356, '0718', 422822, '建始县', NULL, '109.723822,30.601632', 'district', 1355);
INSERT INTO `amapDistrictTable`
VALUES (1357, '0718', 422801, '恩施市', NULL, '109.486761,30.282406', 'district', 1355);
INSERT INTO `amapDistrictTable`
VALUES (1358, '0718', 422802, '利川市', NULL, '108.943491,30.294247', 'district', 1355);
INSERT INTO `amapDistrictTable`
VALUES (1359, '0718', 422828, '鹤峰县', NULL, '110.033699,29.887298', 'district', 1355);
INSERT INTO `amapDistrictTable`
VALUES (1360, '0718', 422827, '来凤县', NULL, '109.408328,29.506945', 'district', 1355);
INSERT INTO `amapDistrictTable`
VALUES (1361, '0718', 422823, '巴东县', NULL, '110.336665,31.041403', 'district', 1355);
INSERT INTO `amapDistrictTable`
VALUES (1362, '0718', 422825, '宣恩县', NULL, '109.482819,29.98867', 'district', 1355);
INSERT INTO `amapDistrictTable`
VALUES (1363, '0718', 422826, '咸丰县', NULL, '109.15041,29.678967', 'district', 1355);
INSERT INTO `amapDistrictTable`
VALUES (1364, '027', 420100, '武汉市', NULL, '114.298572,30.584355', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1365, '027', 420116, '黄陂区', NULL, '114.374025,30.874155', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1366, '027', 420117, '新洲区', NULL, '114.802108,30.842149', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1367, '027', 420114, '蔡甸区', NULL, '114.029341,30.582186', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1368, '027', 420113, '汉南区', NULL, '114.08124,30.309637', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1369, '027', 420106, '武昌区', NULL, '114.307344,30.546536', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1370, '027', 420115, '江夏区', NULL, '114.313961,30.349045', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1371, '027', 420112, '东西湖区', NULL, '114.142483,30.622467', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1372, '027', 420104, '硚口区', NULL, '114.264568,30.57061', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1373, '027', 420105, '汉阳区', NULL, '114.265807,30.549326', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1374, '027', 420103, '江汉区', NULL, '114.283109,30.578771', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1375, '027', 420102, '江岸区', NULL, '114.30304,30.594911', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1376, '027', 420107, '青山区', NULL, '114.39707,30.634215', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1377, '027', 420111, '洪山区', NULL, '114.400718,30.504259', 'district', 1364);
INSERT INTO `amapDistrictTable`
VALUES (1378, '0728', 429004, '仙桃市', NULL, '113.453974,30.364953', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1379, '0728', 429004, '畜禽良种场', NULL, '113.751,30.1779', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1380, '0728', 429004, '工业园区', NULL, '113.413,30.3233', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1381, '0728', 429004, '豆河镇', NULL, '113,30.37', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1382, '0728', 429004, '沙湖镇', NULL, '113.6,30.1698', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1383, '0728', 429004, '通海口镇', NULL, '113.206,30.2722', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1384, '0728', 429004, '长倘口镇', NULL, '113.598,30.3512', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1385, '0728', 429004, '胡场镇', NULL, '113.29,30.4278', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1386, '0728', 429004, '五湖渔场', NULL, '113.783,30.161', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1387, '0728', 429004, '干河街道', NULL, '113.451,30.3772', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1388, '0728', 429004, '杨林尾镇', NULL, '113.561,30.2014', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1389, '0728', 429004, '西流河镇', NULL, '113.761,30.297', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1390, '0728', 429004, '赵西垸林场', NULL, '113.027,30.285', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1391, '0728', 429004, '九合垸原种场', NULL, '113.006,30.2473', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1392, '0728', 429004, '彭场镇', NULL, '113.446,30.2518', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1393, '0728', 429004, '沔城回族镇', NULL, '113.201,30.1921', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1394, '0728', 429004, '龙华山街道', NULL, '113.46,30.3649', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1395, '0728', 429004, '沙湖原种场', NULL, '113.643,30.1482', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1396, '0728', 429004, '陈场镇', NULL, '113.111,30.2879', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1397, '0728', 429004, '郭河镇', NULL, '113.304,30.3027', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1398, '0728', 429004, '郑场镇', NULL, '112.979,30.4707', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1399, '0728', 429004, '排湖风景区', NULL, '113.223,30.2987', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1400, '0728', 429004, '沙嘴街道', NULL, '113.441,30.3596', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1401, '0728', 429004, '张沟镇', NULL, '113.438,30.2968', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1402, '0728', 429004, '毛嘴镇', NULL, '113.045,30.4188', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1403, '0728', 429004, '三伏潭镇', NULL, '113.207,30.3395', 'street', 1378);
INSERT INTO `amapDistrictTable`
VALUES (1404, '0716', 421000, '荆州市', NULL, '112.23813,30.326857', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1405, '0716', 421024, '江陵县', NULL, '112.41735,30.033919', 'district', 1404);
INSERT INTO `amapDistrictTable`
VALUES (1406, '0716', 421023, '监利县', NULL, '112.904344,29.820079', 'district', 1404);
INSERT INTO `amapDistrictTable`
VALUES (1407, '0716', 421083, '洪湖市', NULL, '113.470304,29.81297', 'district', 1404);
INSERT INTO `amapDistrictTable`
VALUES (1408, '0716', 421081, '石首市', NULL, '112.40887,29.716437', 'district', 1404);
INSERT INTO `amapDistrictTable`
VALUES (1409, '0716', 421087, '松滋市', NULL, '111.77818,30.176037', 'district', 1404);
INSERT INTO `amapDistrictTable`
VALUES (1410, '0716', 421002, '沙市区', NULL, '112.257433,30.315895', 'district', 1404);
INSERT INTO `amapDistrictTable`
VALUES (1411, '0716', 421022, '公安县', NULL, '112.230179,30.059065', 'district', 1404);
INSERT INTO `amapDistrictTable`
VALUES (1412, '0716', 421003, '荆州区', NULL, '112.195354,30.350674', 'district', 1404);
INSERT INTO `amapDistrictTable`
VALUES (1413, '0722', 421300, '随州市', NULL, '113.37377,31.717497', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1414, '0722', 421303, '曾都区', NULL, '113.374519,31.717521', 'district', 1413);
INSERT INTO `amapDistrictTable`
VALUES (1415, '0722', 421321, '随县', NULL, '113.301384,31.854246', 'district', 1413);
INSERT INTO `amapDistrictTable`
VALUES (1416, '0722', 421381, '广水市', NULL, '113.826601,31.617731', 'district', 1413);
INSERT INTO `amapDistrictTable`
VALUES (1417, '1719', 429021, '神农架林区', NULL, '110.671525,31.744449', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1418, '1719', 429021, '木鱼镇', NULL, '110.312,31.3933', 'street', 1417);
INSERT INTO `amapDistrictTable`
VALUES (1419, '1719', 429021, '下谷坪土家族乡', NULL, '110.113,31.4153', 'street', 1417);
INSERT INTO `amapDistrictTable`
VALUES (1420, '1719', 429021, '新华镇', NULL, '110.842,31.6218', 'street', 1417);
INSERT INTO `amapDistrictTable`
VALUES (1421, '1719', 429021, '九湖镇', NULL, '110.062,31.4095', 'street', 1417);
INSERT INTO `amapDistrictTable`
VALUES (1422, '1719', 429021, '宋洛乡', NULL, '110.59,31.7303', 'street', 1417);
INSERT INTO `amapDistrictTable`
VALUES (1423, '1719', 429021, '松柏镇', NULL, '110.609,31.7041', 'street', 1417);
INSERT INTO `amapDistrictTable`
VALUES (1424, '1719', 429021, '红坪镇', NULL, '110.196,31.4718', 'street', 1417);
INSERT INTO `amapDistrictTable`
VALUES (1425, '1719', 429021, '阳日镇', NULL, '110.763,31.677', 'street', 1417);
INSERT INTO `amapDistrictTable`
VALUES (1426, '0715', 421200, '咸宁市', NULL, '114.328963,29.832798', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1427, '0715', 421221, '嘉鱼县', NULL, '113.921547,29.973363', 'district', 1426);
INSERT INTO `amapDistrictTable`
VALUES (1428, '0715', 421224, '通山县', NULL, '114.493163,29.604455', 'district', 1426);
INSERT INTO `amapDistrictTable`
VALUES (1429, '0715', 421202, '咸安区', NULL, '114.333894,29.824716', 'district', 1426);
INSERT INTO `amapDistrictTable`
VALUES (1430, '0715', 421223, '崇阳县', NULL, '114.049958,29.54101', 'district', 1426);
INSERT INTO `amapDistrictTable`
VALUES (1431, '0715', 421281, '赤壁市', NULL, '113.88366,29.716879', 'district', 1426);
INSERT INTO `amapDistrictTable`
VALUES (1432, '0715', 421222, '通城县', NULL, '113.814131,29.246076', 'district', 1426);
INSERT INTO `amapDistrictTable`
VALUES (1433, '0711', 420700, '鄂州市', NULL, '114.890593,30.396536', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1434, '0711', 420703, '华容区', NULL, '114.74148,30.534468', 'district', 1433);
INSERT INTO `amapDistrictTable`
VALUES (1435, '0711', 420704, '鄂城区', NULL, '114.890012,30.39669', 'district', 1433);
INSERT INTO `amapDistrictTable`
VALUES (1436, '0711', 420702, '梁子湖区', NULL, '114.681967,30.098191', 'district', 1433);
INSERT INTO `amapDistrictTable`
VALUES (1437, '0714', 420200, '黄石市', NULL, '115.077048,30.220074', 'city', 1241);
INSERT INTO `amapDistrictTable`
VALUES (1438, '0714', 420205, '铁山区', NULL, '114.901366,30.20601', 'district', 1437);
INSERT INTO `amapDistrictTable`
VALUES (1439, '0714', 420203, '西塞山区', NULL, '115.093354,30.205365', 'district', 1437);
INSERT INTO `amapDistrictTable`
VALUES (1440, '0714', 420204, '下陆区', NULL, '114.975755,30.177845', 'district', 1437);
INSERT INTO `amapDistrictTable`
VALUES (1441, '0714', 420281, '大冶市', NULL, '114.974842,30.098804', 'district', 1437);
INSERT INTO `amapDistrictTable`
VALUES (1442, '0714', 420222, '阳新县', NULL, '115.212883,29.841572', 'district', 1437);
INSERT INTO `amapDistrictTable`
VALUES (1443, '0714', 420202, '黄石港区', NULL, '115.090164,30.212086', 'district', 1437);
INSERT INTO `amapDistrictTable`
VALUES (1444, NULL, 610000, '陕西省', NULL, '108.948024,34.263161', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1445, '0914', 611000, '商洛市', NULL, '109.939776,33.868319', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1446, '0914', 611022, '丹凤县', NULL, '110.33191,33.694711', 'district', 1445);
INSERT INTO `amapDistrictTable`
VALUES (1447, '0914', 611025, '镇安县', NULL, '109.151075,33.423981', 'district', 1445);
INSERT INTO `amapDistrictTable`
VALUES (1448, '0914', 611026, '柞水县', NULL, '109.111249,33.682773', 'district', 1445);
INSERT INTO `amapDistrictTable`
VALUES (1449, '0914', 611023, '商南县', NULL, '110.885437,33.526367', 'district', 1445);
INSERT INTO `amapDistrictTable`
VALUES (1450, '0914', 611021, '洛南县', NULL, '110.145716,34.088502', 'district', 1445);
INSERT INTO `amapDistrictTable`
VALUES (1451, '0914', 611002, '商州区', NULL, '109.937685,33.869208', 'district', 1445);
INSERT INTO `amapDistrictTable`
VALUES (1452, '0914', 611024, '山阳县', NULL, '109.880435,33.530411', 'district', 1445);
INSERT INTO `amapDistrictTable`
VALUES (1453, '0919', 610200, '铜川市', NULL, '108.979608,34.916582', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1454, '0919', 610222, '宜君县', NULL, '109.118278,35.398766', 'district', 1453);
INSERT INTO `amapDistrictTable`
VALUES (1455, '0919', 610202, '王益区', NULL, '109.075862,35.069098', 'district', 1453);
INSERT INTO `amapDistrictTable`
VALUES (1456, '0919', 610204, '耀州区', NULL, '108.962538,34.910206', 'district', 1453);
INSERT INTO `amapDistrictTable`
VALUES (1457, '0919', 610203, '印台区', NULL, '109.100814,35.111927', 'district', 1453);
INSERT INTO `amapDistrictTable`
VALUES (1458, '029', 610100, '西安市', NULL, '108.948024,34.263161', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1459, '029', 610115, '临潼区', NULL, '109.213986,34.372065', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1460, '029', 610117, '高陵区', NULL, '109.088896,34.535065', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1461, '029', 610122, '蓝田县', NULL, '109.317634,34.156189', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1462, '029', 610118, '鄠邑区', NULL, '108.607385,34.108668', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1463, '029', 610116, '长安区', NULL, '108.941579,34.157097', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1464, '029', 610104, '莲湖区', NULL, '108.933194,34.2656', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1465, '029', 610111, '灞桥区', NULL, '109.067261,34.267453', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1466, '029', 610102, '新城区', NULL, '108.959903,34.26927', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1467, '029', 610103, '碑林区', NULL, '108.946994,34.251061', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1468, '029', 610124, '周至县', NULL, '108.216465,34.161532', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1469, '029', 610113, '雁塔区', NULL, '108.926593,34.213389', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1470, '029', 610114, '阎良区', NULL, '109.22802,34.662141', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1471, '029', 610112, '未央区', NULL, '108.946022,34.30823', 'district', 1458);
INSERT INTO `amapDistrictTable`
VALUES (1472, '0916', 610700, '汉中市', NULL, '107.028621,33.077668', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1473, '0916', 610730, '佛坪县', NULL, '107.988582,33.520745', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1474, '0916', 610723, '洋县', NULL, '107.549962,33.223283', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1475, '0916', 610729, '留坝县', NULL, '106.924377,33.61334', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1476, '0916', 610727, '略阳县', NULL, '106.153899,33.329638', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1477, '0916', 610724, '西乡县', NULL, '107.765858,32.987961', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1478, '0916', 610726, '宁强县', NULL, '106.25739,32.830806', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1479, '0916', 610725, '勉县', NULL, '106.680175,33.155618', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1480, '0916', 610703, '南郑区', NULL, '106.942393,33.003341', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1481, '0916', 610702, '汉台区', NULL, '107.028233,33.077674', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1482, '0916', 610722, '城固县', NULL, '107.329887,33.153098', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1483, '0916', 610728, '镇巴县', NULL, '107.89531,32.535854', 'district', 1472);
INSERT INTO `amapDistrictTable`
VALUES (1484, '0912', 610800, '榆林市', NULL, '109.741193,38.290162', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1485, '0912', 610802, '榆阳区', NULL, '109.74791,38.299267', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1486, '0912', 610827, '米脂县', NULL, '110.178683,37.759081', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1487, '0912', 610828, '佳县', NULL, '110.493367,38.021597', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1488, '0912', 610822, '府谷县', NULL, '111.069645,39.029243', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1489, '0912', 610803, '横山区', NULL, '109.292596,37.964048', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1490, '0912', 610881, '神木市', NULL, '110.497005,38.835641', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1491, '0912', 610824, '靖边县', NULL, '108.80567,37.596084', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1492, '0912', 610831, '子洲县', NULL, '110.03457,37.611573', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1493, '0912', 610830, '清涧县', NULL, '110.12146,37.087702', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1494, '0912', 610829, '吴堡县', NULL, '110.739315,37.451925', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1495, '0912', 610826, '绥德县', NULL, '110.265377,37.507701', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1496, '0912', 610825, '定边县', NULL, '107.601284,37.59523', 'district', 1484);
INSERT INTO `amapDistrictTable`
VALUES (1497, '0911', 610600, '延安市', NULL, '109.49081,36.596537', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1498, '0911', 610603, '安塞区', NULL, '109.325341,36.86441', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1499, '0911', 610626, '吴起县', NULL, '108.176976,36.924852', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1500, '0911', 610625, '志丹县', NULL, '108.768898,36.823031', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1501, '0911', 610622, '延川县', NULL, '110.190314,36.882066', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1502, '0911', 610602, '宝塔区', NULL, '109.49069,36.596291', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1503, '0911', 610681, '子长市', NULL, '109.675968,37.14207', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1504, '0911', 610621, '延长县', NULL, '110.012961,36.578306', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1505, '0911', 610629, '洛川县', NULL, '109.435712,35.762133', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1506, '0911', 610632, '黄陵县', NULL, '109.262469,35.580165', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1507, '0911', 610630, '宜川县', NULL, '110.175537,36.050391', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1508, '0911', 610627, '甘泉县', NULL, '109.34961,36.277729', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1509, '0911', 610628, '富县', NULL, '109.384136,35.996495', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1510, '0911', 610631, '黄龙县', NULL, '109.83502,35.583276', 'district', 1497);
INSERT INTO `amapDistrictTable`
VALUES (1511, '0917', 610300, '宝鸡市', NULL, '107.14487,34.369315', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1512, '0917', 610329, '麟游县', NULL, '107.796608,34.677714', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1513, '0917', 610327, '陇县', NULL, '106.857066,34.893262', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1514, '0917', 610328, '千阳县', NULL, '107.132987,34.642584', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1515, '0917', 610303, '金台区', NULL, '107.149943,34.375192', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1516, '0917', 610330, '凤县', NULL, '106.525212,33.912464', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1517, '0917', 610323, '岐山县', NULL, '107.624464,34.44296', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1518, '0917', 610302, '渭滨区', NULL, '107.144467,34.371008', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1519, '0917', 610331, '太白县', NULL, '107.316533,34.059215', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1520, '0917', 610304, '陈仓区', NULL, '107.383645,34.352747', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1521, '0917', 610322, '凤翔县', NULL, '107.400577,34.521668', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1522, '0917', 610324, '扶风县', NULL, '107.891419,34.375497', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1523, '0917', 610326, '眉县', NULL, '107.752371,34.272137', 'district', 1511);
INSERT INTO `amapDistrictTable`
VALUES (1524, '0913', 610500, '渭南市', NULL, '109.502882,34.499381', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1525, '0913', 610527, '白水县', NULL, '109.594309,35.177291', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1526, '0913', 610581, '韩城市', NULL, '110.452391,35.475238', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1527, '0913', 610523, '大荔县', NULL, '109.943123,34.795011', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1528, '0913', 610582, '华阴市', NULL, '110.08952,34.565359', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1529, '0913', 610503, '华州区', NULL, '109.76141,34.511958', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1530, '0913', 610522, '潼关县', NULL, '110.24726,34.544515', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1531, '0913', 610525, '澄城县', NULL, '109.937609,35.184', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1532, '0913', 610526, '蒲城县', NULL, '109.589653,34.956034', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1533, '0913', 610502, '临渭区', NULL, '109.503299,34.501271', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1534, '0913', 610524, '合阳县', NULL, '110.147979,35.237098', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1535, '0913', 610528, '富平县', NULL, '109.187174,34.746679', 'district', 1524);
INSERT INTO `amapDistrictTable`
VALUES (1536, '0910', 610400, '咸阳市', NULL, '108.705117,34.333439', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1537, '0910', 610429, '旬邑县', NULL, '108.337231,35.112234', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1538, '0910', 610482, '彬州市', NULL, '108.083674,35.034233', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1539, '0910', 610424, '乾县', NULL, '108.247406,34.527261', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1540, '0910', 610426, '永寿县', NULL, '108.143129,34.692619', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1541, '0910', 610404, '渭城区', NULL, '108.730957,34.336847', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1542, '0910', 610431, '武功县', NULL, '108.212857,34.259732', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1543, '0910', 610423, '泾阳县', NULL, '108.83784,34.528493', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1544, '0910', 610428, '长武县', NULL, '107.795835,35.206122', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1545, '0910', 610481, '兴平市', NULL, '108.488493,34.297134', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1546, '0910', 610403, '杨陵区', NULL, '108.086348,34.27135', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1547, '0910', 610422, '三原县', NULL, '108.943481,34.613996', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1548, '0910', 610430, '淳化县', NULL, '108.581173,34.79797', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1549, '0910', 610402, '秦都区', NULL, '108.698636,34.329801', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1550, '0910', 610425, '礼泉县', NULL, '108.428317,34.482583', 'district', 1536);
INSERT INTO `amapDistrictTable`
VALUES (1551, '0915', 610900, '安康市', NULL, '109.029273,32.6903', 'city', 1444);
INSERT INTO `amapDistrictTable`
VALUES (1552, '0915', 610923, '宁陕县', NULL, '108.313714,33.312184', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1553, '0915', 610921, '汉阴县', NULL, '108.510946,32.891121', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1554, '0915', 610922, '石泉县', NULL, '108.250512,33.038512', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1555, '0915', 610924, '紫阳县', NULL, '108.537788,32.520176', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1556, '0915', 610902, '汉滨区', NULL, '109.029098,32.690817', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1557, '0915', 610928, '旬阳县', NULL, '109.368149,32.833567', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1558, '0915', 610926, '平利县', NULL, '109.361865,32.387933', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1559, '0915', 610929, '白河县', NULL, '110.114186,32.809484', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1560, '0915', 610925, '岚皋县', NULL, '108.900663,32.31069', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1561, '0915', 610927, '镇坪县', NULL, '109.526437,31.883395', 'district', 1551);
INSERT INTO `amapDistrictTable`
VALUES (1562, NULL, 520000, '贵州省', NULL, '106.713478,26.578343', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1563, '0858', 520200, '六盘水市', NULL, '104.846743,26.584643', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1564, '0858', 520201, '钟山区', NULL, '104.846244,26.584805', 'district', 1563);
INSERT INTO `amapDistrictTable`
VALUES (1565, '0858', 520203, '六枝特区', NULL, '105.474235,26.210662', 'district', 1563);
INSERT INTO `amapDistrictTable`
VALUES (1566, '0858', 520281, '盘州市', NULL, '104.468367,25.706966', 'district', 1563);
INSERT INTO `amapDistrictTable`
VALUES (1567, '0858', 520221, '水城县', NULL, '104.95685,26.540478', 'district', 1563);
INSERT INTO `amapDistrictTable`
VALUES (1568, '0856', 520600, '铜仁市', NULL, '109.191555,27.718346', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1569, '0856', 520623, '石阡县', NULL, '108.229854,27.519386', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1570, '0856', 520625, '印江土家族苗族自治县', NULL, '108.405517,27.997976', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1571, '0856', 520626, '德江县', NULL, '108.117317,28.26094', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1572, '0856', 520602, '碧江区', NULL, '109.192117,27.718745', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1573, '0856', 520621, '江口县', NULL, '108.848427,27.691904', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1574, '0856', 520603, '万山区', NULL, '109.21199,27.51903', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1575, '0856', 520628, '松桃苗族自治县', NULL, '109.202627,28.165419', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1576, '0856', 520627, '沿河土家族自治县', NULL, '108.495746,28.560487', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1577, '0856', 520624, '思南县', NULL, '108.255827,27.941331', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1578, '0856', 520622, '玉屏侗族自治县', NULL, '108.917882,27.238024', 'district', 1568);
INSERT INTO `amapDistrictTable`
VALUES (1579, '0852', 520300, '遵义市', NULL, '106.937265,27.706626', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1580, '0852', 520323, '绥阳县', NULL, '107.191024,27.951342', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1581, '0852', 520328, '湄潭县', NULL, '107.485723,27.765839', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1582, '0852', 520322, '桐梓县', NULL, '106.826591,28.131559', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1583, '0852', 520329, '余庆县', NULL, '107.892566,27.221552', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1584, '0852', 520304, '播州区', NULL, '106.831668,27.535288', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1585, '0852', 520382, '仁怀市', NULL, '106.412476,27.803377', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1586, '0852', 520381, '赤水市', NULL, '105.698116,28.587057', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1587, '0852', 520330, '习水县', NULL, '106.200954,28.327826', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1588, '0852', 520325, '道真仡佬族苗族自治县', NULL, '107.605342,28.880088', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1589, '0852', 520324, '正安县', NULL, '107.441872,28.550337', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1590, '0852', 520326, '务川仡佬族苗族自治县', NULL, '107.887857,28.521567', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1591, '0852', 520327, '凤冈县', NULL, '107.722021,27.960858', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1592, '0852', 520303, '汇川区', NULL, '106.937265,27.706626', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1593, '0852', 520302, '红花岗区', NULL, '106.943784,27.694395', 'district', 1579);
INSERT INTO `amapDistrictTable`
VALUES (1594, '0853', 520400, '安顺市', NULL, '105.932188,26.245544', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1595, '0853', 520402, '西秀区', NULL, '105.946169,26.248323', 'district', 1594);
INSERT INTO `amapDistrictTable`
VALUES (1596, '0853', 520425, '紫云苗族布依族自治县', NULL, '106.084515,25.751567', 'district', 1594);
INSERT INTO `amapDistrictTable`
VALUES (1597, '0853', 520423, '镇宁布依族苗族自治县', NULL, '105.768656,26.056096', 'district', 1594);
INSERT INTO `amapDistrictTable`
VALUES (1598, '0853', 520424, '关岭布依族苗族自治县', NULL, '105.618454,25.944248', 'district', 1594);
INSERT INTO `amapDistrictTable`
VALUES (1599, '0853', 520403, '平坝区', NULL, '106.259942,26.40608', 'district', 1594);
INSERT INTO `amapDistrictTable`
VALUES (1600, '0853', 520422, '普定县', NULL, '105.745609,26.305794', 'district', 1594);
INSERT INTO `amapDistrictTable`
VALUES (1601, '0854', 522700, '黔南布依族苗族自治州', NULL, '107.517156,26.258219', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1602, '0854', 522729, '长顺县', NULL, '106.447376,26.022116', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1603, '0854', 522726, '独山县', NULL, '107.542757,25.826283', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1604, '0854', 522731, '惠水县', NULL, '106.657848,26.128637', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1605, '0854', 522727, '平塘县', NULL, '107.32405,25.831803', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1606, '0854', 522728, '罗甸县', NULL, '106.750006,25.429894', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1607, '0854', 522722, '荔波县', NULL, '107.8838,25.412239', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1608, '0854', 522730, '龙里县', NULL, '106.977733,26.448809', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1609, '0854', 522723, '贵定县', NULL, '107.233588,26.580807', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1610, '0854', 522732, '三都水族自治县', NULL, '107.87747,25.985183', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1611, '0854', 522725, '瓮安县', NULL, '107.478417,27.066339', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1612, '0854', 522702, '福泉市', NULL, '107.513508,26.702508', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1613, '0854', 522701, '都匀市', NULL, '107.517021,26.258205', 'district', 1601);
INSERT INTO `amapDistrictTable`
VALUES (1614, '0857', 520500, '毕节市', NULL, '105.28501,27.301693', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1615, '0857', 520502, '七星关区', NULL, '105.284852,27.302085', 'district', 1614);
INSERT INTO `amapDistrictTable`
VALUES (1616, '0857', 520521, '大方县', NULL, '105.609254,27.143521', 'district', 1614);
INSERT INTO `amapDistrictTable`
VALUES (1617, '0857', 520522, '黔西县', NULL, '106.038299,27.024923', 'district', 1614);
INSERT INTO `amapDistrictTable`
VALUES (1618, '0857', 520523, '金沙县', NULL, '106.222103,27.459693', 'district', 1614);
INSERT INTO `amapDistrictTable`
VALUES (1619, '0857', 520525, '纳雍县', NULL, '105.375322,26.769875', 'district', 1614);
INSERT INTO `amapDistrictTable`
VALUES (1620, '0857', 520524, '织金县', NULL, '105.768997,26.668497', 'district', 1614);
INSERT INTO `amapDistrictTable`
VALUES (1621, '0857', 520526, '威宁彝族回族苗族自治县', NULL, '104.286523,26.859099', 'district', 1614);
INSERT INTO `amapDistrictTable`
VALUES (1622, '0857', 520527, '赫章县', NULL, '104.726438,27.119243', 'district', 1614);
INSERT INTO `amapDistrictTable`
VALUES (1623, '0855', 522600, '黔东南苗族侗族自治州', NULL, '107.977488,26.583352', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1624, '0855', 522624, '三穗县', NULL, '108.681121,26.959884', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1625, '0855', 522632, '榕江县', NULL, '108.521026,25.931085', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1626, '0855', 522634, '雷山县', NULL, '108.079613,26.381027', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1627, '0855', 522627, '天柱县', NULL, '109.212798,26.909684', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1628, '0855', 522623, '施秉县', NULL, '108.12678,27.034657', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1629, '0855', 522625, '镇远县', NULL, '108.423656,27.050233', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1630, '0855', 522636, '丹寨县', NULL, '107.794808,26.199497', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1631, '0855', 522601, '凯里市', NULL, '107.977541,26.582964', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1632, '0855', 522631, '黎平县', NULL, '109.136504,26.230636', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1633, '0855', 522633, '从江县', NULL, '108.912648,25.747058', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1634, '0855', 522629, '剑河县', NULL, '108.440499,26.727349', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1635, '0855', 522628, '锦屏县', NULL, '109.20252,26.680625', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1636, '0855', 522630, '台江县', NULL, '108.314637,26.669138', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1637, '0855', 522622, '黄平县', NULL, '107.901337,26.896973', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1638, '0855', 522635, '麻江县', NULL, '107.593172,26.494803', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1639, '0855', 522626, '岑巩县', NULL, '108.816459,27.173244', 'district', 1623);
INSERT INTO `amapDistrictTable`
VALUES (1640, '0859', 522300, '黔西南布依族苗族自治州', NULL, '104.897971,25.08812', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1641, '0859', 522301, '兴义市', NULL, '104.897982,25.088599', 'district', 1640);
INSERT INTO `amapDistrictTable`
VALUES (1642, '0859', 522302, '兴仁市', NULL, '105.192778,25.431378', 'district', 1640);
INSERT INTO `amapDistrictTable`
VALUES (1643, '0859', 522328, '安龙县', NULL, '105.471498,25.108959', 'district', 1640);
INSERT INTO `amapDistrictTable`
VALUES (1644, '0859', 522327, '册亨县', NULL, '105.81241,24.983338', 'district', 1640);
INSERT INTO `amapDistrictTable`
VALUES (1645, '0859', 522325, '贞丰县', NULL, '105.650133,25.385752', 'district', 1640);
INSERT INTO `amapDistrictTable`
VALUES (1646, '0859', 522323, '普安县', NULL, '104.955347,25.786404', 'district', 1640);
INSERT INTO `amapDistrictTable`
VALUES (1647, '0859', 522326, '望谟县', NULL, '106.091563,25.166667', 'district', 1640);
INSERT INTO `amapDistrictTable`
VALUES (1648, '0859', 522324, '晴隆县', NULL, '105.218773,25.832881', 'district', 1640);
INSERT INTO `amapDistrictTable`
VALUES (1649, '0851', 520100, '贵阳市', NULL, '106.713478,26.578343', 'city', 1562);
INSERT INTO `amapDistrictTable`
VALUES (1650, '0851', 520121, '开阳县', NULL, '106.969438,27.056793', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1651, '0851', 520113, '白云区', NULL, '106.633037,26.676849', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1652, '0851', 520122, '息烽县', NULL, '106.737693,27.092665', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1653, '0851', 520123, '修文县', NULL, '106.599218,26.840672', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1654, '0851', 520181, '清镇市', NULL, '106.470278,26.551289', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1655, '0851', 520112, '乌当区', NULL, '106.762123,26.630928', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1656, '0851', 520102, '南明区', NULL, '106.715963,26.573743', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1657, '0851', 520111, '花溪区', NULL, '106.670791,26.410464', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1658, '0851', 520103, '云岩区', NULL, '106.713397,26.58301', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1659, '0851', 520115, '观山湖区', NULL, '106.626323,26.646358', 'district', 1649);
INSERT INTO `amapDistrictTable`
VALUES (1660, '021', 310000, '上海市', NULL, '121.472644,31.231706', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1661, '021', 310100, '上海城区', NULL, '121.472644,31.231706', 'city', 1660);
INSERT INTO `amapDistrictTable`
VALUES (1662, '021', 310120, '奉贤区', NULL, '121.458472,30.912345', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1663, '021', 310151, '崇明区', NULL, '121.397516,31.626946', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1664, '021', 310116, '金山区', NULL, '121.330736,30.724697', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1665, '021', 310115, '浦东新区', NULL, '121.567706,31.245944', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1666, '021', 310101, '黄浦区', NULL, '121.490317,31.222771', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1667, '021', 310113, '宝山区', NULL, '121.489934,31.398896', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1668, '021', 310107, '普陀区', NULL, '121.392499,31.241701', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1669, '021', 310114, '嘉定区', NULL, '121.250333,31.383524', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1670, '021', 310110, '杨浦区', NULL, '121.522797,31.270755', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1671, '021', 310117, '松江区', NULL, '121.223543,31.03047', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1672, '021', 310109, '虹口区', NULL, '121.491832,31.26097', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1673, '021', 310106, '静安区', NULL, '121.448224,31.229003', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1674, '021', 310105, '长宁区', NULL, '121.4222,31.218123', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1675, '021', 310112, '闵行区', NULL, '121.375972,31.111658', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1676, '021', 310104, '徐汇区', NULL, '121.43752,31.179973', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1677, '021', 310118, '青浦区', NULL, '121.113021,31.151209', 'district', 1661);
INSERT INTO `amapDistrictTable`
VALUES (1678, NULL, 370000, '山东省', NULL, '117.000923,36.675807', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1679, '0635', 371500, '聊城市', NULL, '115.980367,36.456013', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1680, '0635', 371525, '冠县', NULL, '115.444808,36.483753', 'district', 1679);
INSERT INTO `amapDistrictTable`
VALUES (1681, '0635', 371522, '莘县', NULL, '115.667291,36.237597', 'district', 1679);
INSERT INTO `amapDistrictTable`
VALUES (1682, '0635', 371503, '茌平区', NULL, '116.25335,36.591934', 'district', 1679);
INSERT INTO `amapDistrictTable`
VALUES (1683, '0635', 371502, '东昌府区', NULL, '115.980023,36.45606', 'district', 1679);
INSERT INTO `amapDistrictTable`
VALUES (1684, '0635', 371581, '临清市', NULL, '115.713462,36.842598', 'district', 1679);
INSERT INTO `amapDistrictTable`
VALUES (1685, '0635', 371524, '东阿县', NULL, '116.248855,36.336004', 'district', 1679);
INSERT INTO `amapDistrictTable`
VALUES (1686, '0635', 371521, '阳谷县', NULL, '115.784287,36.113708', 'district', 1679);
INSERT INTO `amapDistrictTable`
VALUES (1687, '0635', 371526, '高唐县', NULL, '116.229662,36.859755', 'district', 1679);
INSERT INTO `amapDistrictTable`
VALUES (1688, '0533', 370300, '淄博市', NULL, '118.047648,36.814939', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1689, '0533', 370304, '博山区', NULL, '117.85823,36.497567', 'district', 1688);
INSERT INTO `amapDistrictTable`
VALUES (1690, '0533', 370305, '临淄区', NULL, '118.306018,36.816657', 'district', 1688);
INSERT INTO `amapDistrictTable`
VALUES (1691, '0533', 370322, '高青县', NULL, '117.829839,37.169581', 'district', 1688);
INSERT INTO `amapDistrictTable`
VALUES (1692, '0533', 370321, '桓台县', NULL, '118.101556,36.959773', 'district', 1688);
INSERT INTO `amapDistrictTable`
VALUES (1693, '0533', 370303, '张店区', NULL, '118.053521,36.807049', 'district', 1688);
INSERT INTO `amapDistrictTable`
VALUES (1694, '0533', 370323, '沂源县', NULL, '118.166161,36.186282', 'district', 1688);
INSERT INTO `amapDistrictTable`
VALUES (1695, '0533', 370302, '淄川区', NULL, '117.967696,36.647272', 'district', 1688);
INSERT INTO `amapDistrictTable`
VALUES (1696, '0533', 370306, '周村区', NULL, '117.851036,36.803699', 'district', 1688);
INSERT INTO `amapDistrictTable`
VALUES (1697, '0539', 371300, '临沂市', NULL, '118.326443,35.065282', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1698, '0539', 371323, '沂水县', NULL, '118.634543,35.787029', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1699, '0539', 371328, '蒙阴县', NULL, '117.943271,35.712435', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1700, '0539', 371326, '平邑县', NULL, '117.631884,35.511519', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1701, '0539', 371322, '郯城县', NULL, '118.342963,34.614741', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1702, '0539', 371327, '莒南县', NULL, '118.838322,35.175911', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1703, '0539', 371321, '沂南县', NULL, '118.455395,35.547002', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1704, '0539', 371302, '兰山区', NULL, '118.327667,35.061631', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1705, '0539', 371311, '罗庄区', NULL, '118.284795,34.997204', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1706, '0539', 371329, '临沭县', NULL, '118.648379,34.917062', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1707, '0539', 371312, '河东区', NULL, '118.398296,35.085004', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1708, '0539', 371325, '费县', NULL, '117.968869,35.269174', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1709, '0539', 371324, '兰陵县', NULL, '118.049968,34.855573', 'district', 1697);
INSERT INTO `amapDistrictTable`
VALUES (1710, '0532', 370200, '青岛市', NULL, '120.355173,36.082982', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1711, '0532', 370285, '莱西市', NULL, '120.526226,36.86509', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1712, '0532', 370283, '平度市', NULL, '119.959012,36.788828', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1713, '0532', 370214, '城阳区', NULL, '120.389135,36.306833', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1714, '0532', 370215, '即墨区', NULL, '120.447352,36.390847', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1715, '0532', 370213, '李沧区', NULL, '120.421236,36.160023', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1716, '0532', 370212, '崂山区', NULL, '120.467393,36.102569', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1717, '0532', 370211, '黄岛区', NULL, '119.995518,35.875138', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1718, '0532', 370203, '市北区', NULL, '120.355026,36.083819', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1719, '0532', 370281, '胶州市', NULL, '120.006202,36.285878', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1720, '0532', 370202, '市南区', NULL, '120.395966,36.070892', 'district', 1710);
INSERT INTO `amapDistrictTable`
VALUES (1721, '0631', 371000, '威海市', NULL, '122.116394,37.509691', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1722, '0631', 371002, '环翠区', NULL, '122.116189,37.510754', 'district', 1721);
INSERT INTO `amapDistrictTable`
VALUES (1723, '0631', 371003, '文登区', NULL, '122.057139,37.196211', 'district', 1721);
INSERT INTO `amapDistrictTable`
VALUES (1724, '0631', 371083, '乳山市', NULL, '121.536346,36.919622', 'district', 1721);
INSERT INTO `amapDistrictTable`
VALUES (1725, '0631', 371082, '荣成市', NULL, '122.422896,37.160134', 'district', 1721);
INSERT INTO `amapDistrictTable`
VALUES (1726, '0535', 370600, '烟台市', NULL, '121.391382,37.539297', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1727, '0535', 370602, '芝罘区', NULL, '121.385877,37.540925', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1728, '0535', 370614, '蓬莱区', NULL, '120.759074,37.811045', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1729, '0535', 370683, '莱州市', NULL, '119.942135,37.182725', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1730, '0535', 370687, '海阳市', NULL, '121.168392,36.780657', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1731, '0535', 370681, '龙口市', NULL, '120.528328,37.648446', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1732, '0535', 370682, '莱阳市', NULL, '120.711151,36.977037', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1733, '0535', 370685, '招远市', NULL, '120.403142,37.364919', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1734, '0535', 370611, '福山区', NULL, '121.264741,37.496875', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1735, '0535', 370613, '莱山区', NULL, '121.448866,37.473549', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1736, '0535', 370686, '栖霞市', NULL, '120.834097,37.305854', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1737, '0535', 370612, '牟平区', NULL, '121.60151,37.388356', 'district', 1726);
INSERT INTO `amapDistrictTable`
VALUES (1738, '0536', 370700, '潍坊市', NULL, '119.107078,36.70925', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1739, '0536', 370705, '奎文区', NULL, '119.137357,36.709494', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1740, '0536', 370724, '临朐县', NULL, '118.539876,36.516371', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1741, '0536', 370702, '潍城区', NULL, '119.103784,36.710062', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1742, '0536', 370784, '安丘市', NULL, '119.206886,36.427417', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1743, '0536', 370782, '诸城市', NULL, '119.403182,35.997093', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1744, '0536', 370783, '寿光市', NULL, '118.736451,36.874411', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1745, '0536', 370703, '寒亭区', NULL, '119.207866,36.772103', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1746, '0536', 370786, '昌邑市', NULL, '119.394502,36.854937', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1747, '0536', 370725, '昌乐县', NULL, '118.839995,36.703253', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1748, '0536', 370781, '青州市', NULL, '118.484693,36.697855', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1749, '0536', 370785, '高密市', NULL, '119.757033,36.37754', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1750, '0536', 370704, '坊子区', NULL, '119.166326,36.654616', 'district', 1738);
INSERT INTO `amapDistrictTable`
VALUES (1751, '0546', 370500, '东营市', NULL, '118.66471,37.434564', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1752, '0546', 370522, '利津县', NULL, '118.248854,37.493365', 'district', 1751);
INSERT INTO `amapDistrictTable`
VALUES (1753, '0546', 370523, '广饶县', NULL, '118.407522,37.05161', 'district', 1751);
INSERT INTO `amapDistrictTable`
VALUES (1754, '0546', 370502, '东营区', NULL, '118.507543,37.461567', 'district', 1751);
INSERT INTO `amapDistrictTable`
VALUES (1755, '0546', 370503, '河口区', NULL, '118.529613,37.886015', 'district', 1751);
INSERT INTO `amapDistrictTable`
VALUES (1756, '0546', 370505, '垦利区', NULL, '118.551314,37.588679', 'district', 1751);
INSERT INTO `amapDistrictTable`
VALUES (1757, '0543', 371600, '滨州市', NULL, '118.016974,37.383542', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1758, '0543', 371602, '滨城区', NULL, '118.020149,37.384842', 'district', 1757);
INSERT INTO `amapDistrictTable`
VALUES (1759, '0543', 371603, '沾化区', NULL, '118.129902,37.698456', 'district', 1757);
INSERT INTO `amapDistrictTable`
VALUES (1760, '0543', 371681, '邹平市', NULL, '117.736807,36.87803', 'district', 1757);
INSERT INTO `amapDistrictTable`
VALUES (1761, '0543', 371625, '博兴县', NULL, '118.123096,37.147002', 'district', 1757);
INSERT INTO `amapDistrictTable`
VALUES (1762, '0543', 371623, '无棣县', NULL, '117.616325,37.740848', 'district', 1757);
INSERT INTO `amapDistrictTable`
VALUES (1763, '0543', 371622, '阳信县', NULL, '117.581326,37.640492', 'district', 1757);
INSERT INTO `amapDistrictTable`
VALUES (1764, '0543', 371621, '惠民县', NULL, '117.508941,37.483876', 'district', 1757);
INSERT INTO `amapDistrictTable`
VALUES (1765, '0633', 371100, '日照市', NULL, '119.461208,35.428588', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1766, '0633', 371121, '五莲县', NULL, '119.206745,35.751936', 'district', 1765);
INSERT INTO `amapDistrictTable`
VALUES (1767, '0633', 371102, '东港区', NULL, '119.457703,35.426152', 'district', 1765);
INSERT INTO `amapDistrictTable`
VALUES (1768, '0633', 371122, '莒县', NULL, '118.832859,35.588115', 'district', 1765);
INSERT INTO `amapDistrictTable`
VALUES (1769, '0633', 371103, '岚山区', NULL, '119.315844,35.119794', 'district', 1765);
INSERT INTO `amapDistrictTable`
VALUES (1770, '0632', 370400, '枣庄市', NULL, '117.557964,34.856424', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1771, '0632', 370404, '峄城区', NULL, '117.586316,34.767713', 'district', 1770);
INSERT INTO `amapDistrictTable`
VALUES (1772, '0632', 370406, '山亭区', NULL, '117.458968,35.096077', 'district', 1770);
INSERT INTO `amapDistrictTable`
VALUES (1773, '0632', 370403, '薛城区', NULL, '117.265293,34.79789', 'district', 1770);
INSERT INTO `amapDistrictTable`
VALUES (1774, '0632', 370402, '市中区', NULL, '117.557281,34.856651', 'district', 1770);
INSERT INTO `amapDistrictTable`
VALUES (1775, '0632', 370481, '滕州市', NULL, '117.162098,35.088498', 'district', 1770);
INSERT INTO `amapDistrictTable`
VALUES (1776, '0632', 370405, '台儿庄区', NULL, '117.734747,34.564815', 'district', 1770);
INSERT INTO `amapDistrictTable`
VALUES (1777, '0534', 371400, '德州市', NULL, '116.307428,37.453968', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1778, '0534', 371422, '宁津县', NULL, '116.79372,37.649619', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1779, '0534', 371481, '乐陵市', NULL, '117.216657,37.729115', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1780, '0534', 371402, '德城区', NULL, '116.307076,37.453923', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1781, '0534', 371428, '武城县', NULL, '116.078627,37.209527', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1782, '0534', 371423, '庆云县', NULL, '117.390507,37.777724', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1783, '0534', 371427, '夏津县', NULL, '116.003816,36.950501', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1784, '0534', 371425, '齐河县', NULL, '116.758394,36.795497', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1785, '0534', 371482, '禹城市', NULL, '116.642554,36.934485', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1786, '0534', 371424, '临邑县', NULL, '116.867028,37.192044', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1787, '0534', 371403, '陵城区', NULL, '116.574929,37.332848', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1788, '0534', 371426, '平原县', NULL, '116.433904,37.164465', 'district', 1777);
INSERT INTO `amapDistrictTable`
VALUES (1789, '0531', 370100, '济南市', NULL, '117.000923,36.675807', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1790, '0531', 370117, '钢城区', NULL, '117.82033,36.058038', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1791, '0531', 370116, '莱芜区', NULL, '117.675808,36.214395', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1792, '0531', 370114, '章丘区', NULL, '117.54069,36.71209', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1793, '0531', 370105, '天桥区', NULL, '116.996086,36.693374', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1794, '0531', 370115, '济阳区', NULL, '117.176035,36.976771', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1795, '0531', 370112, '历城区', NULL, '117.063744,36.681744', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1796, '0531', 370102, '历下区', NULL, '117.03862,36.664169', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1797, '0531', 370124, '平阴县', NULL, '116.455054,36.286923', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1798, '0531', 370126, '商河县', NULL, '117.156369,37.310544', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1799, '0531', 370103, '市中区', NULL, '116.99898,36.657354', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1800, '0531', 370104, '槐荫区', NULL, '116.947921,36.668205', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1801, '0531', 370113, '长清区', NULL, '116.74588,36.561049', 'district', 1789);
INSERT INTO `amapDistrictTable`
VALUES (1802, '0530', 371700, '菏泽市', NULL, '115.469381,35.246531', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1803, '0530', 371726, '鄄城县', NULL, '115.51434,35.560257', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1804, '0530', 371702, '牡丹区', NULL, '115.470946,35.24311', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1805, '0530', 371728, '东明县', NULL, '115.098412,35.289637', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1806, '0530', 371703, '定陶区', NULL, '115.569601,35.072701', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1807, '0530', 371725, '郓城县', NULL, '115.93885,35.594773', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1808, '0530', 371724, '巨野县', NULL, '116.089341,35.390999', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1809, '0530', 371723, '成武县', NULL, '115.897349,34.947366', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1810, '0530', 371721, '曹县', NULL, '115.549482,34.823253', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1811, '0530', 371722, '单县', NULL, '116.08262,34.790851', 'district', 1802);
INSERT INTO `amapDistrictTable`
VALUES (1812, '0538', 370900, '泰安市', NULL, '117.129063,36.194968', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1813, '0538', 370982, '新泰市', NULL, '117.766092,35.910387', 'district', 1812);
INSERT INTO `amapDistrictTable`
VALUES (1814, '0538', 370923, '东平县', NULL, '116.461052,35.930467', 'district', 1812);
INSERT INTO `amapDistrictTable`
VALUES (1815, '0538', 370902, '泰山区', NULL, '117.129984,36.189313', 'district', 1812);
INSERT INTO `amapDistrictTable`
VALUES (1816, '0538', 370911, '岱岳区', NULL, '117.04353,36.1841', 'district', 1812);
INSERT INTO `amapDistrictTable`
VALUES (1817, '0538', 370983, '肥城市', NULL, '116.763703,36.1856', 'district', 1812);
INSERT INTO `amapDistrictTable`
VALUES (1818, '0538', 370921, '宁阳县', NULL, '116.799297,35.76754', 'district', 1812);
INSERT INTO `amapDistrictTable`
VALUES (1819, '0537', 370800, '济宁市', NULL, '116.587245,35.415393', 'city', 1678);
INSERT INTO `amapDistrictTable`
VALUES (1820, '0537', 370830, '汶上县', NULL, '116.487146,35.721746', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1821, '0537', 370883, '邹城市', NULL, '116.96673,35.405259', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1822, '0537', 370831, '泗水县', NULL, '117.273605,35.653216', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1823, '0537', 370881, '曲阜市', NULL, '116.991885,35.592788', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1824, '0537', 370811, '任城区', NULL, '116.595261,35.414828', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1825, '0537', 370829, '嘉祥县', NULL, '116.342885,35.398098', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1826, '0537', 370832, '梁山县', NULL, '116.08963,35.801843', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1827, '0537', 370827, '鱼台县', NULL, '116.650023,34.997706', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1828, '0537', 370828, '金乡县', NULL, '116.310364,35.06977', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1829, '0537', 370826, '微山县', NULL, '117.12861,34.809525', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1830, '0537', 370812, '兖州区', NULL, '116.828996,35.556445', 'district', 1819);
INSERT INTO `amapDistrictTable`
VALUES (1831, NULL, 340000, '安徽省', NULL, '117.283042,31.86119', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1832, '0561', 340600, '淮北市', NULL, '116.794664,33.971707', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1833, '0561', 340602, '杜集区', NULL, '116.833925,33.991218', 'district', 1832);
INSERT INTO `amapDistrictTable`
VALUES (1834, '0561', 340604, '烈山区', NULL, '116.809465,33.889529', 'district', 1832);
INSERT INTO `amapDistrictTable`
VALUES (1835, '0561', 340603, '相山区', NULL, '116.790775,33.970916', 'district', 1832);
INSERT INTO `amapDistrictTable`
VALUES (1836, '0561', 340621, '濉溪县', NULL, '116.767435,33.916407', 'district', 1832);
INSERT INTO `amapDistrictTable`
VALUES (1837, '0562', 340700, '铜陵市', NULL, '117.816576,30.929935', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1838, '0562', 340711, '郊区', NULL, '117.80707,30.908927', 'district', 1837);
INSERT INTO `amapDistrictTable`
VALUES (1839, '0562', 340705, '铜官区', NULL, '117.816167,30.927613', 'district', 1837);
INSERT INTO `amapDistrictTable`
VALUES (1840, '0562', 340722, '枞阳县', NULL, '117.222027,30.700615', 'district', 1837);
INSERT INTO `amapDistrictTable`
VALUES (1841, '0562', 340706, '义安区', NULL, '117.792288,30.952338', 'district', 1837);
INSERT INTO `amapDistrictTable`
VALUES (1842, '0556', 340800, '安庆市', NULL, '117.043551,30.50883', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1843, '0556', 340882, '潜山市', NULL, '116.573665,30.638222', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1844, '0556', 340826, '宿松县', NULL, '116.120204,30.158327', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1845, '0556', 340811, '宜秀区', NULL, '117.070003,30.541323', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1846, '0556', 340825, '太湖县', NULL, '116.305225,30.451869', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1847, '0556', 340828, '岳西县', NULL, '116.360482,30.848502', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1848, '0556', 340802, '迎江区', NULL, '117.044965,30.506375', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1849, '0556', 340881, '桐城市', NULL, '116.959656,31.050576', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1850, '0556', 340827, '望江县', NULL, '116.690927,30.12491', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1851, '0556', 340822, '怀宁县', NULL, '116.828664,30.734994', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1852, '0556', 340803, '大观区', NULL, '117.034512,30.505632', 'district', 1842);
INSERT INTO `amapDistrictTable`
VALUES (1853, '0566', 341700, '池州市', NULL, '117.489157,30.656037', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1854, '0566', 341723, '青阳县', NULL, '117.857395,30.63818', 'district', 1853);
INSERT INTO `amapDistrictTable`
VALUES (1855, '0566', 341721, '东至县', NULL, '117.021476,30.096568', 'district', 1853);
INSERT INTO `amapDistrictTable`
VALUES (1856, '0566', 341702, '贵池区', NULL, '117.488342,30.657378', 'district', 1853);
INSERT INTO `amapDistrictTable`
VALUES (1857, '0566', 341722, '石台县', NULL, '117.482907,30.210324', 'district', 1853);
INSERT INTO `amapDistrictTable`
VALUES (1858, '0555', 340500, '马鞍山市', NULL, '118.507906,31.689362', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1859, '0555', 340506, '博望区', NULL, '118.843742,31.562321', 'district', 1858);
INSERT INTO `amapDistrictTable`
VALUES (1860, '0555', 340521, '当涂县', NULL, '118.489873,31.556167', 'district', 1858);
INSERT INTO `amapDistrictTable`
VALUES (1861, '0555', 340504, '雨山区', NULL, '118.493104,31.685912', 'district', 1858);
INSERT INTO `amapDistrictTable`
VALUES (1862, '0555', 340503, '花山区', NULL, '118.511308,31.69902', 'district', 1858);
INSERT INTO `amapDistrictTable`
VALUES (1863, '0555', 340523, '和县', NULL, '118.362998,31.716634', 'district', 1858);
INSERT INTO `amapDistrictTable`
VALUES (1864, '0555', 340522, '含山县', NULL, '118.105545,31.727758', 'district', 1858);
INSERT INTO `amapDistrictTable`
VALUES (1865, '1558', 341200, '阜阳市', NULL, '115.819729,32.896969', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1866, '1558', 341222, '太和县', NULL, '115.627243,33.16229', 'district', 1865);
INSERT INTO `amapDistrictTable`
VALUES (1867, '1558', 341203, '颍东区', NULL, '115.858747,32.908861', 'district', 1865);
INSERT INTO `amapDistrictTable`
VALUES (1868, '1558', 341221, '临泉县', NULL, '115.261688,33.062698', 'district', 1865);
INSERT INTO `amapDistrictTable`
VALUES (1869, '1558', 341204, '颍泉区', NULL, '115.804525,32.924797', 'district', 1865);
INSERT INTO `amapDistrictTable`
VALUES (1870, '1558', 341202, '颍州区', NULL, '115.813914,32.891238', 'district', 1865);
INSERT INTO `amapDistrictTable`
VALUES (1871, '1558', 341225, '阜南县', NULL, '115.590534,32.638102', 'district', 1865);
INSERT INTO `amapDistrictTable`
VALUES (1872, '1558', 341226, '颍上县', NULL, '116.259122,32.637065', 'district', 1865);
INSERT INTO `amapDistrictTable`
VALUES (1873, '1558', 341282, '界首市', NULL, '115.362117,33.26153', 'district', 1865);
INSERT INTO `amapDistrictTable`
VALUES (1874, '0559', 341000, '黄山市', NULL, '118.317325,29.709239', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1875, '0559', 341003, '黄山区', NULL, '118.136639,30.294517', 'district', 1874);
INSERT INTO `amapDistrictTable`
VALUES (1876, '0559', 341023, '黟县', NULL, '117.942911,29.923812', 'district', 1874);
INSERT INTO `amapDistrictTable`
VALUES (1877, '0559', 341024, '祁门县', NULL, '117.717237,29.853472', 'district', 1874);
INSERT INTO `amapDistrictTable`
VALUES (1878, '0559', 341021, '歙县', NULL, '118.428025,29.867748', 'district', 1874);
INSERT INTO `amapDistrictTable`
VALUES (1879, '0559', 341004, '徽州区', NULL, '118.339743,29.825201', 'district', 1874);
INSERT INTO `amapDistrictTable`
VALUES (1880, '0559', 341022, '休宁县', NULL, '118.188531,29.788878', 'district', 1874);
INSERT INTO `amapDistrictTable`
VALUES (1881, '0559', 341002, '屯溪区', NULL, '118.317354,29.709186', 'district', 1874);
INSERT INTO `amapDistrictTable`
VALUES (1882, '0564', 341500, '六安市', NULL, '116.507676,31.752889', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1883, '0564', 341525, '霍山县', NULL, '116.333078,31.402456', 'district', 1882);
INSERT INTO `amapDistrictTable`
VALUES (1884, '0564', 341503, '裕安区', NULL, '116.494543,31.750692', 'district', 1882);
INSERT INTO `amapDistrictTable`
VALUES (1885, '0564', 341524, '金寨县', NULL, '115.878514,31.681624', 'district', 1882);
INSERT INTO `amapDistrictTable`
VALUES (1886, '0564', 341502, '金安区', NULL, '116.503288,31.754491', 'district', 1882);
INSERT INTO `amapDistrictTable`
VALUES (1887, '0564', 341504, '叶集区', NULL, '115.913594,31.84768', 'district', 1882);
INSERT INTO `amapDistrictTable`
VALUES (1888, '0564', 341522, '霍邱县', NULL, '116.278875,32.341305', 'district', 1882);
INSERT INTO `amapDistrictTable`
VALUES (1889, '0564', 341523, '舒城县', NULL, '116.944088,31.462848', 'district', 1882);
INSERT INTO `amapDistrictTable`
VALUES (1890, '0554', 340400, '淮南市', NULL, '117.018329,32.647574', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1891, '0554', 340421, '凤台县', NULL, '116.722769,32.705382', 'district', 1890);
INSERT INTO `amapDistrictTable`
VALUES (1892, '0554', 340405, '八公山区', NULL, '116.841111,32.628229', 'district', 1890);
INSERT INTO `amapDistrictTable`
VALUES (1893, '0554', 340406, '潘集区', NULL, '116.816879,32.782117', 'district', 1890);
INSERT INTO `amapDistrictTable`
VALUES (1894, '0554', 340402, '大通区', NULL, '117.052927,32.632066', 'district', 1890);
INSERT INTO `amapDistrictTable`
VALUES (1895, '0554', 340404, '谢家集区', NULL, '116.865354,32.598289', 'district', 1890);
INSERT INTO `amapDistrictTable`
VALUES (1896, '0554', 340403, '田家庵区', NULL, '117.018318,32.644342', 'district', 1890);
INSERT INTO `amapDistrictTable`
VALUES (1897, '0554', 340422, '寿县', NULL, '116.785349,32.577304', 'district', 1890);
INSERT INTO `amapDistrictTable`
VALUES (1898, '0552', 340300, '蚌埠市', NULL, '117.363228,32.939667', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1899, '0552', 340311, '淮上区', NULL, '117.34709,32.963147', 'district', 1898);
INSERT INTO `amapDistrictTable`
VALUES (1900, '0552', 340322, '五河县', NULL, '117.888809,33.146202', 'district', 1898);
INSERT INTO `amapDistrictTable`
VALUES (1901, '0552', 340321, '怀远县', NULL, '117.200171,32.956934', 'district', 1898);
INSERT INTO `amapDistrictTable`
VALUES (1902, '0552', 340304, '禹会区', NULL, '117.35259,32.931933', 'district', 1898);
INSERT INTO `amapDistrictTable`
VALUES (1903, '0552', 340303, '蚌山区', NULL, '117.355789,32.938066', 'district', 1898);
INSERT INTO `amapDistrictTable`
VALUES (1904, '0552', 340302, '龙子湖区', NULL, '117.382312,32.950452', 'district', 1898);
INSERT INTO `amapDistrictTable`
VALUES (1905, '0552', 340323, '固镇县', NULL, '117.315962,33.318679', 'district', 1898);
INSERT INTO `amapDistrictTable`
VALUES (1906, '0553', 340200, '芜湖市', NULL, '118.376451,31.326319', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1907, '0553', 340222, '繁昌县', NULL, '118.201349,31.080896', 'district', 1906);
INSERT INTO `amapDistrictTable`
VALUES (1908, '0553', 340203, '弋江区', NULL, '118.377476,31.313394', 'district', 1906);
INSERT INTO `amapDistrictTable`
VALUES (1909, '0553', 340202, '镜湖区', NULL, '118.376343,31.32559', 'district', 1906);
INSERT INTO `amapDistrictTable`
VALUES (1910, '0553', 340281, '无为市', NULL, '117.911432,31.303075', 'district', 1906);
INSERT INTO `amapDistrictTable`
VALUES (1911, '0553', 340208, '三山区', NULL, '118.233987,31.225423', 'district', 1906);
INSERT INTO `amapDistrictTable`
VALUES (1912, '0553', 340207, '鸠江区', NULL, '118.400174,31.362716', 'district', 1906);
INSERT INTO `amapDistrictTable`
VALUES (1913, '0553', 340221, '芜湖县', NULL, '118.572301,31.145262', 'district', 1906);
INSERT INTO `amapDistrictTable`
VALUES (1914, '0553', 340223, '南陵县', NULL, '118.337104,30.919638', 'district', 1906);
INSERT INTO `amapDistrictTable`
VALUES (1915, '0550', 341100, '滁州市', NULL, '118.316264,32.303627', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1916, '0550', 341182, '明光市', NULL, '117.998048,32.781206', 'district', 1915);
INSERT INTO `amapDistrictTable`
VALUES (1917, '0550', 341181, '天长市', NULL, '119.011212,32.6815', 'district', 1915);
INSERT INTO `amapDistrictTable`
VALUES (1918, '0550', 341126, '凤阳县', NULL, '117.562461,32.867146', 'district', 1915);
INSERT INTO `amapDistrictTable`
VALUES (1919, '0550', 341125, '定远县', NULL, '117.683713,32.527105', 'district', 1915);
INSERT INTO `amapDistrictTable`
VALUES (1920, '0550', 341122, '来安县', NULL, '118.433293,32.450231', 'district', 1915);
INSERT INTO `amapDistrictTable`
VALUES (1921, '0550', 341103, '南谯区', NULL, '118.296955,32.329841', 'district', 1915);
INSERT INTO `amapDistrictTable`
VALUES (1922, '0550', 341102, '琅琊区', NULL, '118.316475,32.303797', 'district', 1915);
INSERT INTO `amapDistrictTable`
VALUES (1923, '0550', 341124, '全椒县', NULL, '118.268576,32.09385', 'district', 1915);
INSERT INTO `amapDistrictTable`
VALUES (1924, '0551', 340100, '合肥市', NULL, '117.283042,31.86119', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1925, '0551', 340124, '庐江县', NULL, '117.289844,31.251488', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1926, '0551', 340111, '包河区', NULL, '117.285751,31.82956', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1927, '0551', 340181, '巢湖市', NULL, '117.874155,31.600518', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1928, '0551', 340123, '肥西县', NULL, '117.166118,31.719646', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1929, '0551', 340104, '蜀山区', NULL, '117.262072,31.855868', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1930, '0551', 340103, '庐阳区', NULL, '117.283776,31.869011', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1931, '0551', 340121, '长丰县', NULL, '117.164699,32.478548', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1932, '0551', 340122, '肥东县', NULL, '117.463222,31.883992', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1933, '0551', 340102, '瑶海区', NULL, '117.315358,31.86961', 'district', 1924);
INSERT INTO `amapDistrictTable`
VALUES (1934, '0563', 341800, '宣城市', NULL, '118.757995,30.945667', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1935, '0563', 341882, '广德市', NULL, '119.417521,30.893116', 'district', 1934);
INSERT INTO `amapDistrictTable`
VALUES (1936, '0563', 341824, '绩溪县', NULL, '118.594705,30.065267', 'district', 1934);
INSERT INTO `amapDistrictTable`
VALUES (1937, '0563', 341825, '旌德县', NULL, '118.543081,30.288057', 'district', 1934);
INSERT INTO `amapDistrictTable`
VALUES (1938, '0563', 341802, '宣州区', NULL, '118.758412,30.946003', 'district', 1934);
INSERT INTO `amapDistrictTable`
VALUES (1939, '0563', 341881, '宁国市', NULL, '118.983407,30.626529', 'district', 1934);
INSERT INTO `amapDistrictTable`
VALUES (1940, '0563', 341821, '郎溪县', NULL, '119.185024,31.127834', 'district', 1934);
INSERT INTO `amapDistrictTable`
VALUES (1941, '0563', 341823, '泾县', NULL, '118.412397,30.685975', 'district', 1934);
INSERT INTO `amapDistrictTable`
VALUES (1942, '0558', 341600, '亳州市', NULL, '115.782939,33.869338', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1943, '0558', 341602, '谯城区', NULL, '115.781214,33.869284', 'district', 1942);
INSERT INTO `amapDistrictTable`
VALUES (1944, '0558', 341623, '利辛县', NULL, '116.207782,33.143503', 'district', 1942);
INSERT INTO `amapDistrictTable`
VALUES (1945, '0558', 341622, '蒙城县', NULL, '116.560337,33.260814', 'district', 1942);
INSERT INTO `amapDistrictTable`
VALUES (1946, '0558', 341621, '涡阳县', NULL, '116.211551,33.502831', 'district', 1942);
INSERT INTO `amapDistrictTable`
VALUES (1947, '0557', 341300, '宿州市', NULL, '116.984084,33.633891', 'city', 1831);
INSERT INTO `amapDistrictTable`
VALUES (1948, '0557', 341302, '埇桥区', NULL, '116.983309,33.633853', 'district', 1947);
INSERT INTO `amapDistrictTable`
VALUES (1949, '0557', 341324, '泗县', NULL, '117.885443,33.47758', 'district', 1947);
INSERT INTO `amapDistrictTable`
VALUES (1950, '0557', 341322, '萧县', NULL, '116.945399,34.183266', 'district', 1947);
INSERT INTO `amapDistrictTable`
VALUES (1951, '0557', 341323, '灵璧县', NULL, '117.551493,33.540629', 'district', 1947);
INSERT INTO `amapDistrictTable`
VALUES (1952, '0557', 341321, '砀山县', NULL, '116.351113,34.426247', 'district', 1947);
INSERT INTO `amapDistrictTable`
VALUES (1953, '023', 500000, '重庆市', NULL, '106.504962,29.533155', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1954, '023', 500200, '重庆郊县', NULL, '108.170255,29.291965', 'city', 1953);
INSERT INTO `amapDistrictTable`
VALUES (1955, '023', 500236, '奉节县', NULL, '109.465774,31.019967', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1956, '023', 500238, '巫溪县', NULL, '109.628912,31.3966', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1957, '023', 500229, '城口县', NULL, '108.6649,31.946293', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1958, '023', 500230, '丰都县', NULL, '107.73248,29.866424', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1959, '023', 500243, '彭水苗族土家族自治县', NULL, '108.166551,29.293856', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1960, '023', 500241, '秀山土家族苗族自治县', NULL, '108.996043,28.444772', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1961, '023', 500235, '云阳县', NULL, '108.697698,30.930529', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1962, '023', 500237, '巫山县', NULL, '109.878928,31.074843', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1963, '023', 500242, '酉阳土家族苗族自治县', NULL, '108.767201,28.839828', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1964, '023', 500231, '垫江县', NULL, '107.348692,30.330012', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1965, '023', 500233, '忠县', NULL, '108.037518,30.291537', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1966, '023', 500240, '石柱土家族自治县', NULL, '108.112448,29.99853', 'district', 1954);
INSERT INTO `amapDistrictTable`
VALUES (1967, '023', 500100, '重庆城区', NULL, '106.504962,29.533155', 'city', 1953);
INSERT INTO `amapDistrictTable`
VALUES (1968, '023', 500117, '合川区', NULL, '106.265554,29.990993', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1969, '023', 500152, '潼南区', NULL, '105.841818,30.189554', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1970, '023', 500151, '铜梁区', NULL, '106.054948,29.839944', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1971, '023', 500115, '长寿区', NULL, '107.074854,29.833671', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1972, '023', 500120, '璧山区', NULL, '106.231126,29.593581', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1973, '023', 500111, '大足区', NULL, '105.715319,29.700498', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1974, '023', 500153, '荣昌区', NULL, '105.594061,29.403627', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1975, '023', 500118, '永川区', NULL, '105.894714,29.348748', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1976, '023', 500103, '渝中区', NULL, '106.56288,29.556742', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1977, '023', 500156, '武隆区', NULL, '107.75655,29.32376', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1978, '023', 500119, '南川区', NULL, '107.098153,29.156646', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1979, '023', 500107, '九龙坡区', NULL, '106.480989,29.523492', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1980, '023', 500104, '大渡口区', NULL, '106.48613,29.481002', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1981, '023', 500101, '万州区', NULL, '108.380246,30.807807', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1982, '023', 500102, '涪陵区', NULL, '107.394905,29.703652', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1983, '023', 500110, '綦江区', NULL, '106.651417,29.028091', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1984, '023', 500155, '梁平区', NULL, '107.800034,30.672168', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1985, '023', 500154, '开州区', NULL, '108.413317,31.167735', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1986, '023', 500116, '江津区', NULL, '106.253156,29.283387', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1987, '023', 500114, '黔江区', NULL, '108.782577,29.527548', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1988, '023', 500108, '南岸区', NULL, '106.560813,29.523992', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1989, '023', 500113, '巴南区', NULL, '106.519423,29.381919', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1990, '023', 500106, '沙坪坝区', NULL, '106.4542,29.541224', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1991, '023', 500109, '北碚区', NULL, '106.437868,29.82543', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1992, '023', 500112, '渝北区', NULL, '106.512851,29.601451', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1993, '023', 500105, '江北区', NULL, '106.532844,29.575352', 'district', 1967);
INSERT INTO `amapDistrictTable`
VALUES (1994, NULL, 540000, '西藏自治区', NULL, '91.132212,29.660361', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (1995, '0892', 540200, '日喀则市', NULL, '88.885148,29.267519', 'city', 1994);
INSERT INTO `amapDistrictTable`
VALUES (1996, '0892', 540232, '仲巴县', NULL, '84.032826,29.768336', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (1997, '0892', 540226, '昂仁县', NULL, '87.23578,29.294758', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (1998, '0892', 540227, '谢通门县', NULL, '88.260517,29.431597', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (1999, '0892', 540236, '萨嘎县', NULL, '85.234622,29.328194', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2000, '0892', 540221, '南木林县', NULL, '89.099434,29.680459', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2001, '0892', 540202, '桑珠孜区', NULL, '88.88667,29.267003', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2002, '0892', 540225, '拉孜县', NULL, '87.63743,29.085136', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2003, '0892', 540229, '仁布县', NULL, '89.843207,29.230299', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2004, '0892', 540224, '萨迦县', NULL, '88.023007,28.901077', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2005, '0892', 540234, '吉隆县', NULL, '85.298349,28.852416', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2006, '0892', 540228, '白朗县', NULL, '89.263618,29.106627', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2007, '0892', 540222, '江孜县', NULL, '89.605044,28.908845', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2008, '0892', 540223, '定日县', NULL, '87.123887,28.656667', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2009, '0892', 540235, '聂拉木县', NULL, '85.981953,28.15595', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2010, '0892', 540233, '亚东县', NULL, '88.906806,27.482772', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2011, '0892', 540237, '岗巴县', NULL, '88.518903,28.274371', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2012, '0892', 540230, '康马县', NULL, '89.683406,28.554719', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2013, '0892', 540231, '定结县', NULL, '87.767723,28.36409', 'district', 1995);
INSERT INTO `amapDistrictTable`
VALUES (2014, '0893', 540500, '山南市', NULL, '91.766529,29.236023', 'city', 1994);
INSERT INTO `amapDistrictTable`
VALUES (2015, '0893', 540523, '桑日县', NULL, '92.015732,29.259774', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2016, '0893', 540521, '扎囊县', NULL, '91.338,29.246476', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2017, '0893', 540502, '乃东区', NULL, '91.76525,29.236106', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2018, '0893', 540528, '加查县', NULL, '92.591043,29.140921', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2019, '0893', 540524, '琼结县', NULL, '91.683753,29.025242', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2020, '0893', 540522, '贡嘎县', NULL, '90.985271,29.289078', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2021, '0893', 540531, '浪卡子县', NULL, '90.398747,28.96836', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2022, '0893', 540525, '曲松县', NULL, '92.201066,29.063656', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2023, '0893', 540526, '措美县', NULL, '91.432347,28.437353', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2024, '0893', 540530, '错那县', NULL, '91.960132,27.991707', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2025, '0893', 540529, '隆子县', NULL, '92.463309,28.408548', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2026, '0893', 540527, '洛扎县', NULL, '90.858243,28.385765', 'district', 2014);
INSERT INTO `amapDistrictTable`
VALUES (2027, '0896', 540600, '那曲市', NULL, '92.060214,31.476004', 'city', 1994);
INSERT INTO `amapDistrictTable`
VALUES (2028, '0896', 540624, '安多县', NULL, '91.681879,32.260299', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2029, '0896', 540623, '聂荣县', NULL, '92.303659,32.107855', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2030, '0896', 540628, '巴青县', NULL, '94.054049,31.918691', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2031, '0896', 540625, '申扎县', NULL, '88.709777,30.929056', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2032, '0896', 540627, '班戈县', NULL, '90.011822,31.394578', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2033, '0896', 540622, '比如县', NULL, '93.68044,31.479917', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2034, '0896', 540626, '索县', NULL, '93.784964,31.886173', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2035, '0896', 540621, '嘉黎县', NULL, '93.232907,30.640846', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2036, '0896', 540602, '色尼区', NULL, '92.061862,31.475756', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2037, '0896', 540629, '尼玛县', NULL, '87.236646,31.784979', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2038, '0896', 540630, '双湖县', NULL, '88.838578,33.18698', 'district', 2027);
INSERT INTO `amapDistrictTable`
VALUES (2039, '0895', 540300, '昌都市', NULL, '97.178452,31.136875', 'city', 1994);
INSERT INTO `amapDistrictTable`
VALUES (2040, '0895', 540324, '丁青县', NULL, '95.597748,31.410681', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2041, '0895', 540302, '卡若区', NULL, '97.178255,31.137035', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2042, '0895', 540321, '江达县', NULL, '98.218351,31.499534', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2043, '0895', 540323, '类乌齐县', NULL, '96.601259,31.213048', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2044, '0895', 540330, '边坝县', NULL, '94.707504,30.933849', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2045, '0895', 540322, '贡觉县', NULL, '98.271191,30.859206', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2046, '0895', 540329, '洛隆县', NULL, '95.823418,30.741947', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2047, '0895', 540325, '察雅县', NULL, '97.565701,30.653038', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2048, '0895', 540326, '八宿县', NULL, '96.917893,30.053408', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2049, '0895', 540327, '左贡县', NULL, '97.840532,29.671335', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2050, '0895', 540328, '芒康县', NULL, '98.596444,29.686615', 'district', 2039);
INSERT INTO `amapDistrictTable`
VALUES (2051, '0891', 540100, '拉萨市', NULL, '91.132212,29.660361', 'city', 1994);
INSERT INTO `amapDistrictTable`
VALUES (2052, '0891', 540122, '当雄县', NULL, '91.103551,30.474819', 'district', 2051);
INSERT INTO `amapDistrictTable`
VALUES (2053, '0891', 540121, '林周县', NULL, '91.261842,29.895754', 'district', 2051);
INSERT INTO `amapDistrictTable`
VALUES (2054, '0891', 540123, '尼木县', NULL, '90.165545,29.431346', 'district', 2051);
INSERT INTO `amapDistrictTable`
VALUES (2055, '0891', 540104, '达孜区', NULL, '91.350976,29.670314', 'district', 2051);
INSERT INTO `amapDistrictTable`
VALUES (2056, '0891', 540127, '墨竹工卡县', NULL, '91.731158,29.834657', 'district', 2051);
INSERT INTO `amapDistrictTable`
VALUES (2057, '0891', 540103, '堆龙德庆区', NULL, '91.002823,29.647347', 'district', 2051);
INSERT INTO `amapDistrictTable`
VALUES (2058, '0891', 540124, '曲水县', NULL, '90.738051,29.349895', 'district', 2051);
INSERT INTO `amapDistrictTable`
VALUES (2059, '0891', 540102, '城关区', NULL, '91.132911,29.659472', 'district', 2051);
INSERT INTO `amapDistrictTable`
VALUES (2060, '0894', 540400, '林芝市', NULL, '94.362348,29.654693', 'city', 1994);
INSERT INTO `amapDistrictTable`
VALUES (2061, '0894', 540424, '波密县', NULL, '95.768151,29.858771', 'district', 2060);
INSERT INTO `amapDistrictTable`
VALUES (2062, '0894', 540421, '工布江达县', NULL, '93.246515,29.88447', 'district', 2060);
INSERT INTO `amapDistrictTable`
VALUES (2063, '0894', 540423, '墨脱县', NULL, '95.332245,29.32573', 'district', 2060);
INSERT INTO `amapDistrictTable`
VALUES (2064, '0894', 540402, '巴宜区', NULL, '94.360987,29.653732', 'district', 2060);
INSERT INTO `amapDistrictTable`
VALUES (2065, '0894', 540422, '米林县', NULL, '94.213679,29.213811', 'district', 2060);
INSERT INTO `amapDistrictTable`
VALUES (2066, '0894', 540425, '察隅县', NULL, '97.465002,28.660244', 'district', 2060);
INSERT INTO `amapDistrictTable`
VALUES (2067, '0894', 540426, '朗县', NULL, '93.073429,29.0446', 'district', 2060);
INSERT INTO `amapDistrictTable`
VALUES (2068, '0897', 542500, '阿里地区', NULL, '80.105498,32.503187', 'city', 1994);
INSERT INTO `amapDistrictTable`
VALUES (2069, '0897', 542526, '改则县', NULL, '84.062384,32.302076', 'district', 2068);
INSERT INTO `amapDistrictTable`
VALUES (2070, '0897', 542522, '札达县', NULL, '79.803191,31.478587', 'district', 2068);
INSERT INTO `amapDistrictTable`
VALUES (2071, '0897', 542527, '措勤县', NULL, '85.159254,31.016774', 'district', 2068);
INSERT INTO `amapDistrictTable`
VALUES (2072, '0897', 542521, '普兰县', NULL, '81.177588,30.291896', 'district', 2068);
INSERT INTO `amapDistrictTable`
VALUES (2073, '0897', 542523, '噶尔县', NULL, '80.105005,32.503373', 'district', 2068);
INSERT INTO `amapDistrictTable`
VALUES (2074, '0897', 542525, '革吉县', NULL, '81.142896,32.389192', 'district', 2068);
INSERT INTO `amapDistrictTable`
VALUES (2075, '0897', 542524, '日土县', NULL, '79.731937,33.382454', 'district', 2068);
INSERT INTO `amapDistrictTable`
VALUES (2076, NULL, 430000, '湖南省', NULL, '112.982279,28.19409', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2077, '0730', 430600, '岳阳市', NULL, '113.132855,29.37029', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2078, '0730', 430611, '君山区', NULL, '113.004082,29.438062', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2079, '0730', 430603, '云溪区', NULL, '113.27387,29.473395', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2080, '0730', 430623, '华容县', NULL, '112.559369,29.524107', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2081, '0730', 430602, '岳阳楼区', NULL, '113.120751,29.366784', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2082, '0730', 430681, '汨罗市', NULL, '113.079419,28.803149', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2083, '0730', 430624, '湘阴县', NULL, '112.889748,28.677498', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2084, '0730', 430682, '临湘市', NULL, '113.450809,29.471594', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2085, '0730', 430621, '岳阳县', NULL, '113.116073,29.144843', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2086, '0730', 430626, '平江县', NULL, '113.593751,28.701523', 'district', 2077);
INSERT INTO `amapDistrictTable`
VALUES (2087, '0737', 430900, '益阳市', NULL, '112.355042,28.570066', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2088, '0737', 430902, '资阳区', NULL, '112.33084,28.592771', 'district', 2087);
INSERT INTO `amapDistrictTable`
VALUES (2089, '0737', 430922, '桃江县', NULL, '112.139732,28.520993', 'district', 2087);
INSERT INTO `amapDistrictTable`
VALUES (2090, '0737', 430903, '赫山区', NULL, '112.360946,28.568327', 'district', 2087);
INSERT INTO `amapDistrictTable`
VALUES (2091, '0737', 430923, '安化县', NULL, '111.221824,28.377421', 'district', 2087);
INSERT INTO `amapDistrictTable`
VALUES (2092, '0737', 430981, '沅江市', NULL, '112.361088,28.839713', 'district', 2087);
INSERT INTO `amapDistrictTable`
VALUES (2093, '0737', 430921, '南县', NULL, '112.410399,29.372181', 'district', 2087);
INSERT INTO `amapDistrictTable`
VALUES (2094, '0734', 430400, '衡阳市', NULL, '112.607693,26.900358', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2095, '0734', 430423, '衡山县', NULL, '112.86971,27.234808', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2096, '0734', 430424, '衡东县', NULL, '112.950412,27.083531', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2097, '0734', 430421, '衡阳县', NULL, '112.379643,26.962388', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2098, '0734', 430412, '南岳区', NULL, '112.734147,27.240536', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2099, '0734', 430481, '耒阳市', NULL, '112.847215,26.414162', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2100, '0734', 430406, '雁峰区', NULL, '112.612241,26.893694', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2101, '0734', 430405, '珠晖区', NULL, '112.626324,26.891063', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2102, '0734', 430407, '石鼓区', NULL, '112.607635,26.903908', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2103, '0734', 430422, '衡南县', NULL, '112.677459,26.739973', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2104, '0734', 430426, '祁东县', NULL, '112.111192,26.787109', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2105, '0734', 430408, '蒸湘区', NULL, '112.570608,26.89087', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2106, '0734', 430482, '常宁市', NULL, '112.396821,26.406773', 'district', 2094);
INSERT INTO `amapDistrictTable`
VALUES (2107, '0738', 431300, '娄底市', NULL, '112.008497,27.728136', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2108, '0738', 431381, '冷水江市', NULL, '111.434674,27.685759', 'district', 2107);
INSERT INTO `amapDistrictTable`
VALUES (2109, '0738', 431322, '新化县', NULL, '111.306747,27.737456', 'district', 2107);
INSERT INTO `amapDistrictTable`
VALUES (2110, '0738', 431382, '涟源市', NULL, '111.670847,27.692301', 'district', 2107);
INSERT INTO `amapDistrictTable`
VALUES (2111, '0738', 431321, '双峰县', NULL, '112.198245,27.459126', 'district', 2107);
INSERT INTO `amapDistrictTable`
VALUES (2112, '0738', 431302, '娄星区', NULL, '112.008486,27.726643', 'district', 2107);
INSERT INTO `amapDistrictTable`
VALUES (2113, '0736', 430700, '常德市', NULL, '111.691347,29.040225', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2114, '0736', 430726, '石门县', NULL, '111.379087,29.584703', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2115, '0736', 430723, '澧县', NULL, '111.761682,29.64264', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2116, '0736', 430781, '津市市', NULL, '111.879609,29.630867', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2117, '0736', 430724, '临澧县', NULL, '111.645602,29.443217', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2118, '0736', 430722, '汉寿县', NULL, '111.968506,28.907319', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2119, '0736', 430703, '鼎城区', NULL, '111.685327,29.014426', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2120, '0736', 430702, '武陵区', NULL, '111.690718,29.040477', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2121, '0736', 430725, '桃源县', NULL, '111.484503,28.902734', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2122, '0736', 430721, '安乡县', NULL, '112.172289,29.414483', 'district', 2113);
INSERT INTO `amapDistrictTable`
VALUES (2123, '0744', 430800, '张家界市', NULL, '110.479921,29.127401', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2124, '0744', 430811, '武陵源区', NULL, '110.54758,29.347827', 'district', 2123);
INSERT INTO `amapDistrictTable`
VALUES (2125, '0744', 430821, '慈利县', NULL, '111.132702,29.423876', 'district', 2123);
INSERT INTO `amapDistrictTable`
VALUES (2126, '0744', 430822, '桑植县', NULL, '110.164039,29.399939', 'district', 2123);
INSERT INTO `amapDistrictTable`
VALUES (2127, '0744', 430802, '永定区', NULL, '110.484559,29.125961', 'district', 2123);
INSERT INTO `amapDistrictTable`
VALUES (2128, '0745', 431200, '怀化市', NULL, '109.97824,27.550082', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2129, '0745', 431281, '洪江市', NULL, '109.831765,27.201876', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2130, '0745', 431228, '芷江侗族自治县', NULL, '109.687777,27.437996', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2131, '0745', 431230, '通道侗族自治县', NULL, '109.783359,26.158349', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2132, '0745', 431223, '辰溪县', NULL, '110.196953,28.005474', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2133, '0745', 431222, '沅陵县', NULL, '110.399161,28.455554', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2134, '0745', 431224, '溆浦县', NULL, '110.593373,27.903802', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2135, '0745', 431229, '靖州苗族侗族自治县', NULL, '109.691159,26.573511', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2136, '0745', 431225, '会同县', NULL, '109.720785,26.870789', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2137, '0745', 431227, '新晃侗族自治县', NULL, '109.174443,27.359897', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2138, '0745', 431226, '麻阳苗族自治县', NULL, '109.802807,27.865991', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2139, '0745', 431221, '中方县', NULL, '109.948061,27.43736', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2140, '0745', 431202, '鹤城区', NULL, '109.982242,27.548474', 'district', 2128);
INSERT INTO `amapDistrictTable`
VALUES (2141, '0743', 433100, '湘西土家族苗族自治州', NULL, '109.739735,28.314296', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2142, '0743', 433127, '永顺县', NULL, '109.853292,28.998068', 'district', 2141);
INSERT INTO `amapDistrictTable`
VALUES (2143, '0743', 433125, '保靖县', NULL, '109.651445,28.709605', 'district', 2141);
INSERT INTO `amapDistrictTable`
VALUES (2144, '0743', 433124, '花垣县', NULL, '109.479063,28.581352', 'district', 2141);
INSERT INTO `amapDistrictTable`
VALUES (2145, '0743', 433101, '吉首市', NULL, '109.738273,28.314827', 'district', 2141);
INSERT INTO `amapDistrictTable`
VALUES (2146, '0743', 433126, '古丈县', NULL, '109.949592,28.616973', 'district', 2141);
INSERT INTO `amapDistrictTable`
VALUES (2147, '0743', 433122, '泸溪县', NULL, '110.214428,28.214516', 'district', 2141);
INSERT INTO `amapDistrictTable`
VALUES (2148, '0743', 433130, '龙山县', NULL, '109.441189,29.453438', 'district', 2141);
INSERT INTO `amapDistrictTable`
VALUES (2149, '0743', 433123, '凤凰县', NULL, '109.599191,27.948308', 'district', 2141);
INSERT INTO `amapDistrictTable`
VALUES (2150, '0731', 430100, '长沙市', NULL, '112.982279,28.19409', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2151, '0731', 430105, '开福区', NULL, '112.985525,28.201336', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2152, '0731', 430104, '岳麓区', NULL, '112.911591,28.213044', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2153, '0731', 430103, '天心区', NULL, '112.97307,28.192375', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2154, '0731', 430181, '浏阳市', NULL, '113.633301,28.141112', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2155, '0731', 430121, '长沙县', NULL, '113.080098,28.237888', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2156, '0731', 430112, '望城区', NULL, '112.819549,28.347458', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2157, '0731', 430182, '宁乡市', NULL, '112.553182,28.253928', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2158, '0731', 430102, '芙蓉区', NULL, '112.988094,28.193106', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2159, '0731', 430111, '雨花区', NULL, '113.016337,28.109937', 'district', 2150);
INSERT INTO `amapDistrictTable`
VALUES (2160, '0732', 430300, '湘潭市', NULL, '112.944052,27.82973', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2161, '0732', 430321, '湘潭县', NULL, '112.952829,27.778601', 'district', 2160);
INSERT INTO `amapDistrictTable`
VALUES (2162, '0732', 430302, '雨湖区', NULL, '112.907427,27.86077', 'district', 2160);
INSERT INTO `amapDistrictTable`
VALUES (2163, '0732', 430304, '岳塘区', NULL, '112.927707,27.828854', 'district', 2160);
INSERT INTO `amapDistrictTable`
VALUES (2164, '0732', 430382, '韶山市', NULL, '112.52848,27.922682', 'district', 2160);
INSERT INTO `amapDistrictTable`
VALUES (2165, '0732', 430381, '湘乡市', NULL, '112.525217,27.734918', 'district', 2160);
INSERT INTO `amapDistrictTable`
VALUES (2166, '0733', 430200, '株洲市', NULL, '113.151737,27.835806', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2167, '0733', 430202, '荷塘区', NULL, '113.162548,27.833036', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2168, '0733', 430223, '攸县', NULL, '113.345774,27.000071', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2169, '0733', 430224, '茶陵县', NULL, '113.546509,26.789534', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2170, '0733', 430225, '炎陵县', NULL, '113.776884,26.489459', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2171, '0733', 430212, '渌口区', NULL, '113.146175,27.705844', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2172, '0733', 430203, '芦淞区', NULL, '113.155169,27.827246', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2173, '0733', 430211, '天元区', NULL, '113.136252,27.826909', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2174, '0733', 430204, '石峰区', NULL, '113.11295,27.871945', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2175, '0733', 430281, '醴陵市', NULL, '113.507157,27.657873', 'district', 2166);
INSERT INTO `amapDistrictTable`
VALUES (2176, '0739', 430500, '邵阳市', NULL, '111.46923,27.237842', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2177, '0739', 430524, '隆回县', NULL, '111.038785,27.116002', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2178, '0739', 430503, '大祥区', NULL, '111.462968,27.233593', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2179, '0739', 430527, '绥宁县', NULL, '110.155075,26.580622', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2180, '0739', 430511, '北塔区', NULL, '111.452315,27.245688', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2181, '0739', 430502, '双清区', NULL, '111.479756,27.240001', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2182, '0739', 430523, '邵阳县', NULL, '111.2757,26.989713', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2183, '0739', 430529, '城步苗族自治县', NULL, '110.313226,26.363575', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2184, '0739', 430582, '邵东市', NULL, '111.743168,27.257273', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2185, '0739', 430522, '新邵县', NULL, '111.459762,27.311429', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2186, '0739', 430528, '新宁县', NULL, '110.859115,26.438912', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2187, '0739', 430581, '武冈市', NULL, '110.636804,26.732086', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2188, '0739', 430525, '洞口县', NULL, '110.579212,27.062286', 'district', 2176);
INSERT INTO `amapDistrictTable`
VALUES (2189, '0735', 431000, '郴州市', NULL, '113.032067,25.793589', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2190, '0735', 431028, '安仁县', NULL, '113.27217,26.708625', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2191, '0735', 431026, '汝城县', NULL, '113.685686,25.553759', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2192, '0735', 431023, '永兴县', NULL, '113.114819,26.129392', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2193, '0735', 431003, '苏仙区', NULL, '113.038698,25.793157', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2194, '0735', 431081, '资兴市', NULL, '113.23682,25.974152', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2195, '0735', 431002, '北湖区', NULL, '113.032208,25.792628', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2196, '0735', 431027, '桂东县', NULL, '113.945879,26.073917', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2197, '0735', 431025, '临武县', NULL, '112.564589,25.279119', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2198, '0735', 431022, '宜章县', NULL, '112.947884,25.394345', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2199, '0735', 431024, '嘉禾县', NULL, '112.370618,25.587309', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2200, '0735', 431021, '桂阳县', NULL, '112.734466,25.737447', 'district', 2189);
INSERT INTO `amapDistrictTable`
VALUES (2201, '0746', 431100, '永州市', NULL, '111.608019,26.434516', 'city', 2076);
INSERT INTO `amapDistrictTable`
VALUES (2202, '0746', 431103, '冷水滩区', NULL, '111.607156,26.434364', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2203, '0746', 431121, '祁阳县', NULL, '111.85734,26.585929', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2204, '0746', 431122, '东安县', NULL, '111.313035,26.397278', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2205, '0746', 431102, '零陵区', NULL, '111.626348,26.223347', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2206, '0746', 431128, '新田县', NULL, '112.220341,25.906927', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2207, '0746', 431126, '宁远县', NULL, '111.944529,25.584112', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2208, '0746', 431123, '双牌县', NULL, '111.662146,25.959397', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2209, '0746', 431127, '蓝山县', NULL, '112.194195,25.375255', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2210, '0746', 431124, '道县', NULL, '111.591614,25.518444', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2211, '0746', 431125, '江永县', NULL, '111.346803,25.268154', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2212, '0746', 431129, '江华瑶族自治县', NULL, '111.577276,25.182596', 'district', 2201);
INSERT INTO `amapDistrictTable`
VALUES (2213, NULL, 460000, '海南省', NULL, '110.33119,20.031971', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2214, '0807', 469007, '东方市', NULL, '108.653789,19.10198', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2215, '0807', 469007, '东方华侨农场', NULL, '108.696,18.9726', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2216, '0807', 469007, '江边乡', NULL, '109.108,18.8945', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2217, '0807', 469007, '天安乡', NULL, '108.817,18.8803', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2218, '0807', 469007, '东河镇', NULL, '108.991,19.1321', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2219, '0807', 469007, '新龙镇', NULL, '108.686,18.9263', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2220, '0807', 469007, '国营广坝农场', NULL, '108.732,18.8589', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2221, '0807', 469007, '感城镇', NULL, '108.83,18.8833', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2222, '0807', 469007, '三家镇', NULL, '108.798,19.2498', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2223, '0807', 469007, '四更镇', NULL, '108.606,19.2646', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2224, '0807', 469007, '板桥镇', NULL, '108.87,18.8744', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2225, '0807', 469007, '八所镇', NULL, '108.622,19.0927', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2226, '0807', 469007, '大田镇', NULL, '108.976,19.1314', 'street', 2214);
INSERT INTO `amapDistrictTable`
VALUES (2227, '1892', 469022, '屯昌县', NULL, '110.102773,19.362916', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2228, '1892', 469022, '国营中建农场', NULL, '109.966,19.2466', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2229, '1892', 469022, '屯城镇', NULL, '110.161,19.4468', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2230, '1892', 469022, '南吕镇', NULL, '110.05,19.2222', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2231, '1892', 469022, '坡心镇', NULL, '110.11,19.3302', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2232, '1892', 469022, '新兴镇', NULL, '110.154,19.5707', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2233, '1892', 469022, '西昌镇', NULL, '110.024,19.4428', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2234, '1892', 469022, '国营中坤农场', NULL, '109.855,19.2944', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2235, '1892', 469022, '南坤镇', NULL, '109.857,19.2939', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2236, '1892', 469022, '枫木镇', NULL, '109.994,19.1901', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2237, '1892', 469022, '乌坡镇', NULL, '110.093,19.1953', 'street', 2227);
INSERT INTO `amapDistrictTable`
VALUES (2238, '1898', 469006, '万宁市', NULL, '110.388793,18.796216', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2239, '1898', 469006, '后安镇', NULL, '110.374,18.9087', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2240, '1898', 469006, '礼纪镇', NULL, '110.269,18.7354', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2241, '1898', 469006, '国营东兴农场', NULL, '110.375,18.894', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2242, '1898', 469006, '万城镇', NULL, '110.414,18.8276', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2243, '1898', 469006, '国营东和农场', NULL, '110.217,18.7629', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2244, '1898', 469006, '山根镇', NULL, '110.483,18.9946', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2245, '1898', 469006, '大茂镇', NULL, '110.39,18.8759', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2246, '1898', 469006, '和乐镇', NULL, '110.416,18.9625', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2247, '1898', 469006, '龙滚镇', NULL, '110.495,18.9855', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2248, '1898', 469006, '兴隆华侨农场', NULL, '110.106,18.8195', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2249, '1898', 469006, '北大镇', NULL, '110.24,18.9316', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2250, '1898', 469006, '国营新中农场', NULL, '110.17,18.6967', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2251, '1898', 469006, '三更罗镇', NULL, '110.214,18.9979', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2252, '1898', 469006, '长丰镇', NULL, '110.321,18.7876', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2253, '1898', 469006, '地方国营六连林场', NULL, '110.505,18.9899', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2254, '1898', 469006, '东澳镇', NULL, '110.429,18.6408', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2255, '1898', 469006, '南桥镇', NULL, '110.196,18.7201', 'street', 2238);
INSERT INTO `amapDistrictTable`
VALUES (2256, '1896', 469024, '临高县', NULL, '109.687697,19.908293', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2257, '1896', 469024, '南宝镇', NULL, '109.638,19.7516', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2258, '1896', 469024, '博厚镇', NULL, '109.716,19.893', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2259, '1896', 469024, '和舍镇', NULL, '109.715,19.6717', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2260, '1896', 469024, '调楼镇', NULL, '109.61,19.9231', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2261, '1896', 469024, '波莲镇', NULL, '109.615,19.8555', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2262, '1896', 469024, '国营加来农场', NULL, '109.651,19.7591', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2263, '1896', 469024, '多文镇', NULL, '109.802,19.7418', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2264, '1896', 469024, '新盈镇', NULL, '109.624,19.8719', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2265, '1896', 469024, '东英镇', NULL, '109.613,19.9349', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2266, '1896', 469024, '临城镇', NULL, '109.673,19.8932', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2267, '1896', 469024, '国营红华农场', NULL, '109.764,19.8244', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2268, '1896', 469024, '皇桐镇', NULL, '109.816,19.8743', 'street', 2256);
INSERT INTO `amapDistrictTable`
VALUES (2269, '0803', 469026, '昌江黎族自治县', NULL, '109.053351,19.260968', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2270, '0803', 469026, '十月田镇', NULL, '108.989,19.3818', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2271, '0803', 469026, '国营霸王岭林场', NULL, '109.03,19.1725', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2272, '0803', 469026, '乌烈镇', NULL, '108.81,19.3525', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2273, '0803', 469026, '七叉镇', NULL, '109.069,19.1732', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2274, '0803', 469026, '叉河镇', NULL, '108.989,19.2536', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2275, '0803', 469026, '海南矿业联合有限公司', NULL, '108.989,19.2538', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2276, '0803', 469026, '石碌镇', NULL, '109.05,19.2444', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2277, '0803', 469026, '海尾镇', NULL, '108.952,19.4945', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2278, '0803', 469026, '国营红林农场', NULL, '109.088,19.2367', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2279, '0803', 469026, '王下乡', NULL, '109.094,18.9052', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2280, '0803', 469026, '昌化镇', NULL, '108.732,19.3836', 'street', 2269);
INSERT INTO `amapDistrictTable`
VALUES (2281, '0806', 469021, '定安县', NULL, '110.349235,19.684966', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2282, '0806', 469021, '黄竹镇', NULL, '110.528,19.4887', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2283, '0806', 469021, '富文镇', NULL, '110.232,19.521', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2284, '0806', 469021, '新竹镇', NULL, '110.159,19.5843', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2285, '0806', 469021, '国营中瑞农场', NULL, '110.244,19.3008', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2286, '0806', 469021, '定城镇', NULL, '110.317,19.7017', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2287, '0806', 469021, '雷鸣镇', NULL, '110.273,19.5137', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2288, '0806', 469021, '翰林镇', NULL, '110.24,19.2982', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2289, '0806', 469021, '岭口镇', NULL, '110.276,19.3601', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2290, '0806', 469021, '国营南海农场', NULL, '110.469,19.4432', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2291, '0806', 469021, '龙门镇', NULL, '110.298,19.4997', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2292, '0806', 469021, '国营金鸡岭农场', NULL, '110.252,19.5171', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2293, '0806', 469021, '龙河镇', NULL, '110.226,19.4221', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2294, '0806', 469021, '龙湖镇', NULL, '110.469,19.5845', 'street', 2281);
INSERT INTO `amapDistrictTable`
VALUES (2295, '0802', 469025, '白沙黎族自治县', NULL, '109.452606,19.224584', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2296, '0802', 469025, '金波乡', NULL, '109.157,19.2577', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2297, '0802', 469025, '七坊镇', NULL, '109.298,19.3459', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2298, '0802', 469025, '南开乡', NULL, '109.293,19.0596', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2299, '0802', 469025, '荣邦乡', NULL, '109.064,19.4868', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2300, '0802', 469025, '邦溪镇', NULL, '109.09,19.3912', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2301, '0802', 469025, '青松乡', NULL, '109.302,19.0689', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2302, '0802', 469025, '细水乡', NULL, '109.523,19.2096', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2303, '0802', 469025, '国营龙江农场', NULL, '109.178,19.2369', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2304, '0802', 469025, '元门乡', NULL, '109.455,19.0981', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2305, '0802', 469025, '牙叉镇', NULL, '109.45,19.3004', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2306, '0802', 469025, '国营白沙农场', NULL, '109.429,19.2881', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2307, '0802', 469025, '打安镇', NULL, '109.36,19.3756', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2308, '0802', 469025, '阜龙乡', NULL, '109.436,19.3316', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2309, '0802', 469025, '国营邦溪农场', NULL, '109.18,19.4104', 'street', 2295);
INSERT INTO `amapDistrictTable`
VALUES (2310, '1894', 469002, '琼海市', NULL, '110.466785,19.246011', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2311, '1894', 469002, '会山镇', NULL, '110.302,19.0792', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2312, '1894', 469002, '嘉积镇', NULL, '110.441,19.3208', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2313, '1894', 469002, '国营东太农场', NULL, '110.367,19.1372', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2314, '1894', 469002, '国营东升农场', NULL, '110.413,19.284', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2315, '1894', 469002, '大路镇', NULL, '110.424,19.354', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2316, '1894', 469002, '万泉镇', NULL, '110.364,19.2516', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2317, '1894', 469002, '彬村山华侨农场', NULL, '110.623,19.3022', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2318, '1894', 469002, '国营东红农场', NULL, '110.509,19.364', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2319, '1894', 469002, '潭门镇', NULL, '110.546,19.2013', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2320, '1894', 469002, '塔洋镇', NULL, '110.475,19.3404', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2321, '1894', 469002, '中原镇', NULL, '110.419,19.1765', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2322, '1894', 469002, '博鳌镇', NULL, '110.495,19.1766', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2323, '1894', 469002, '阳江镇', NULL, '110.334,19.0558', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2324, '1894', 469002, '龙江镇', NULL, '110.36,19.1595', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2325, '1894', 469002, '石壁镇', NULL, '110.168,19.167', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2326, '1894', 469002, '长坡镇', NULL, '110.594,19.3213', 'street', 2310);
INSERT INTO `amapDistrictTable`
VALUES (2327, '1899', 469030, '琼中黎族苗族自治县', NULL, '109.839996,19.03557', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2328, '1899', 469030, '什运乡', NULL, '109.583,18.9237', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2329, '1899', 469030, '吊罗山乡', NULL, '109.917,18.8198', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2330, '1899', 469030, '国营乌石农场', NULL, '109.937,19.0977', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2331, '1899', 469030, '和平镇', NULL, '109.894,18.899', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2332, '1899', 469030, '湾岭镇', NULL, '109.9,19.1334', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2333, '1899', 469030, '国营加钗农场', NULL, '109.783,19.0265', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2334, '1899', 469030, '国营阳江农场', NULL, '109.823,19.2127', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2335, '1899', 469030, '营根镇', NULL, '109.733,18.9748', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2336, '1899', 469030, '中平镇', NULL, '110.107,19.0716', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2337, '1899', 469030, '上安乡', NULL, '109.731,18.9133', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2338, '1899', 469030, '国营黎母山林业公司', NULL, '109.703,19.1542', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2339, '1899', 469030, '国营长征农场', NULL, '109.899,18.9965', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2340, '1899', 469030, '黎母山镇', NULL, '109.704,19.2577', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2341, '1899', 469030, '长征镇', NULL, '109.799,18.8976', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2342, '1899', 469030, '红毛镇', NULL, '109.734,19.0657', 'street', 2327);
INSERT INTO `amapDistrictTable`
VALUES (2343, '0805', 460400, '儋州市', NULL, '109.576782,19.517486', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2344, '0805', 460400, '洋浦经济开发区', NULL, '109.162,19.7962', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2345, '0805', 460400, '光村镇', NULL, '109.467,19.9035', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2346, '0805', 460400, '兰洋镇', NULL, '109.682,19.4833', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2347, '0805', 460400, '海头镇', NULL, '108.948,19.4939', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2348, '0805', 460400, '和庆镇', NULL, '109.677,19.5887', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2349, '0805', 460400, '国营蓝洋农场', NULL, '109.618,19.5107', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2350, '0805', 460400, '华南热作学院', NULL, '109.505,19.573', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2351, '0805', 460400, '东成镇', NULL, '109.579,19.7102', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2352, '0805', 460400, '排浦镇', NULL, '109.196,19.65', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2353, '0805', 460400, '王五镇', NULL, '109.258,19.6415', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2354, '0805', 460400, '新州镇', NULL, '109.321,19.7523', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2355, '0805', 460400, '木棠镇', NULL, '109.33,19.8594', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2356, '0805', 460400, '中和镇', NULL, '109.351,19.7747', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2357, '0805', 460400, '国营八一农场', NULL, '109.23,19.3915', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2358, '0805', 460400, '国营西培农场', NULL, '109.31,19.4969', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2359, '0805', 460400, '国营西联农场', NULL, '109.537,19.6556', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2360, '0805', 460400, '雅星镇', NULL, '109.156,19.4695', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2361, '0805', 460400, '南丰镇', NULL, '109.532,19.4981', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2362, '0805', 460400, '白马井镇', NULL, '109.268,19.7046', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2363, '0805', 460400, '峨蔓镇', NULL, '109.333,19.8438', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2364, '0805', 460400, '大成镇', NULL, '109.345,19.4765', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2365, '0805', 460400, '那大镇', NULL, '109.573,19.5907', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2366, '0805', 460400, '三都镇', NULL, '109.176,19.7946', 'street', 2343);
INSERT INTO `amapDistrictTable`
VALUES (2367, '2802', 469027, '乐东黎族自治县', NULL, '109.175444,18.74758', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2368, '2802', 469027, '国营山荣农场', NULL, '109.223,18.7507', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2369, '2802', 469027, '莺歌海镇', NULL, '108.728,18.4959', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2370, '2802', 469027, '国营保国农场', NULL, '109.245,18.6612', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2371, '2802', 469027, '万冲镇', NULL, '109.339,18.7838', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2372, '2802', 469027, '抱由镇', NULL, '109.138,18.8948', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2373, '2802', 469027, '大安镇', NULL, '109.225,18.5876', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2374, '2802', 469027, '利国镇', NULL, '108.965,18.529', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2375, '2802', 469027, '国营乐光农场', NULL, '109.192,18.5331', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2376, '2802', 469027, '九所镇', NULL, '108.927,18.5276', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2377, '2802', 469027, '黄流镇', NULL, '108.808,18.597', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2378, '2802', 469027, '佛罗镇', NULL, '108.792,18.5833', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2379, '2802', 469027, '国营尖峰岭林业公司', NULL, '109.027,18.726', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2380, '2802', 469027, '尖峰镇', NULL, '108.7,18.7124', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2381, '2802', 469027, '千家镇', NULL, '109.15,18.6353', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2382, '2802', 469027, '国营莺歌海盐场', NULL, '108.729,18.5523', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2383, '2802', 469027, '志仲镇', NULL, '109.224,18.5932', 'street', 2367);
INSERT INTO `amapDistrictTable`
VALUES (2384, '0804', 469023, '澄迈县', NULL, '110.007147,19.737095', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2385, '0804', 469023, '福山镇', NULL, '109.919,19.7325', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2386, '0804', 469023, '永发镇', NULL, '110.186,19.6424', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2387, '0804', 469023, '桥头镇', NULL, '109.931,19.9171', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2388, '0804', 469023, '金江镇', NULL, '109.987,19.7817', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2389, '0804', 469023, '文儒镇', NULL, '110.121,19.6454', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2390, '0804', 469023, '中兴镇', NULL, '109.938,19.5697', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2391, '0804', 469023, '老城镇', NULL, '110.159,19.9529', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2392, '0804', 469023, '国营红岗农场', NULL, '110.038,19.5642', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2393, '0804', 469023, '瑞溪镇', NULL, '110.087,19.7731', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2394, '0804', 469023, '国营红光农场', NULL, '109.957,19.8731', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2395, '0804', 469023, '大丰镇', NULL, '109.989,19.904', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2396, '0804', 469023, '仁兴镇', NULL, '109.916,19.5062', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2397, '0804', 469023, '加乐镇', NULL, '110.042,19.6276', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2398, '0804', 469023, '国营金安农场', NULL, '110.123,19.7367', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2399, '0804', 469023, '国营昆仑农场', NULL, '109.802,19.5127', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2400, '0804', 469023, '国营西达农场', NULL, '109.862,19.4343', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2401, '0804', 469023, '国营和岭农场', NULL, '109.814,19.5367', 'street', 2384);
INSERT INTO `amapDistrictTable`
VALUES (2402, '0899', 460200, '三亚市', NULL, '109.508268,18.247872', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2403, '0899', 460204, '天涯区', NULL, '109.506357,18.24734', 'district', 2402);
INSERT INTO `amapDistrictTable`
VALUES (2404, '0899', 460202, '海棠区', NULL, '109.760778,18.407516', 'district', 2402);
INSERT INTO `amapDistrictTable`
VALUES (2405, '0899', 460203, '吉阳区', NULL, '109.512081,18.247436', 'district', 2402);
INSERT INTO `amapDistrictTable`
VALUES (2406, '0899', 460205, '崖州区', NULL, '109.174306,18.352192', 'district', 2402);
INSERT INTO `amapDistrictTable`
VALUES (2407, '0809', 469028, '陵水黎族自治县', NULL, '110.037218,18.505006', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2408, '0809', 469028, '椰林镇', NULL, '110.02,18.4825', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2409, '0809', 469028, '黎安镇', NULL, '110.146,18.4342', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2410, '0809', 469028, '新村镇', NULL, '110.026,18.446', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2411, '0809', 469028, '文罗镇', NULL, '109.914,18.5734', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2412, '0809', 469028, '国营吊罗山林业公司', NULL, '109.948,18.6553', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2413, '0809', 469028, '国营南平农场', NULL, '109.833,18.6336', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2414, '0809', 469028, '本号镇', NULL, '109.856,18.6617', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2415, '0809', 469028, '光坡镇', NULL, '110.04,18.5564', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2416, '0809', 469028, '群英乡', NULL, '109.847,18.5697', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2417, '0809', 469028, '三才镇', NULL, '109.963,18.4915', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2418, '0809', 469028, '提蒙乡', NULL, '110.013,18.6404', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2419, '0809', 469028, '隆广镇', NULL, '109.858,18.4802', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2420, '0809', 469028, '国营岭门农场', NULL, '110.046,18.6244', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2421, '0809', 469028, '英州镇', NULL, '109.876,18.4739', 'street', 2407);
INSERT INTO `amapDistrictTable`
VALUES (2422, '1893', 469005, '文昌市', NULL, '110.753975,19.612986', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2423, '1893', 469005, '东阁镇', NULL, '110.799,19.7566', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2424, '1893', 469005, '文教镇', NULL, '110.856,19.7083', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2425, '1893', 469005, '国营罗豆农场', NULL, '110.624,19.9713', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2426, '1893', 469005, '会文镇', NULL, '110.708,19.4957', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2427, '1893', 469005, '国营东路农场', NULL, '110.714,19.8524', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2428, '1893', 469005, '东郊镇', NULL, '110.91,19.6291', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2429, '1893', 469005, '翁田镇', NULL, '110.813,19.9295', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2430, '1893', 469005, '铺前镇', NULL, '110.675,20.0377', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2431, '1893', 469005, '锦山镇', NULL, '110.67,20.0418', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2432, '1893', 469005, '龙楼镇', NULL, '110.938,19.6606', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2433, '1893', 469005, '冯坡镇', NULL, '110.774,20.0176', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2434, '1893', 469005, '国营南阳农场', NULL, '110.556,19.4727', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2435, '1893', 469005, '公坡镇', NULL, '110.836,19.8543', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2436, '1893', 469005, '昌洒镇', NULL, '111.26,19.9626', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2437, '1893', 469005, '抱罗镇', NULL, '110.73,19.889', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2438, '1893', 469005, '东路镇', NULL, '110.658,19.8051', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2439, '1893', 469005, '潭牛镇', NULL, '110.623,19.6785', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2440, '1893', 469005, '蓬莱镇', NULL, '110.638,19.5164', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2441, '1893', 469005, '重兴镇', NULL, '110.654,19.4341', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2442, '1893', 469005, '文城镇', NULL, '110.708,19.4982', 'street', 2422);
INSERT INTO `amapDistrictTable`
VALUES (2443, '2898', 460300, '三沙市', NULL, '112.34882,16.831039', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2444, '2898', 460301, '西沙区', NULL, '112.3386402,16.8310066', 'district', 2443);
INSERT INTO `amapDistrictTable`
VALUES (2445, '2898', 460302, '南沙区', NULL, '112.891018,9.543575', 'district', 2443);
INSERT INTO `amapDistrictTable`
VALUES (2446, '0898', 460100, '海口市', NULL, '110.33119,20.031971', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2447, '0898', 460108, '美兰区', NULL, '110.356566,20.03074', 'district', 2446);
INSERT INTO `amapDistrictTable`
VALUES (2448, '0898', 460106, '龙华区', NULL, '110.330373,20.031026', 'district', 2446);
INSERT INTO `amapDistrictTable`
VALUES (2449, '0898', 460107, '琼山区', NULL, '110.354722,20.001051', 'district', 2446);
INSERT INTO `amapDistrictTable`
VALUES (2450, '0898', 460105, '秀英区', NULL, '110.282393,20.008145', 'district', 2446);
INSERT INTO `amapDistrictTable`
VALUES (2451, '0801', 469029, '保亭黎族苗族自治县', NULL, '109.70245,18.636371', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2452, '0801', 469029, '海南保亭热带作物研究所', NULL, '109.709,18.6282', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2453, '0801', 469029, '新政镇', NULL, '109.578,18.5685', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2454, '0801', 469029, '加茂镇', NULL, '109.719,18.5033', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2455, '0801', 469029, '国营金江农场', NULL, '109.682,18.547', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2456, '0801', 469029, '国营新星农场', NULL, '109.729,18.6749', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2457, '0801', 469029, '保城镇', NULL, '109.747,18.6854', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2458, '0801', 469029, '南林乡', NULL, '109.577,18.3893', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2459, '0801', 469029, '国营三道农场', NULL, '109.649,18.5179', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2460, '0801', 469029, '毛感乡', NULL, '109.503,18.5563', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2461, '0801', 469029, '三道镇', NULL, '109.66,18.5251', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2462, '0801', 469029, '什玲镇', NULL, '109.74,18.6941', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2463, '0801', 469029, '六弓乡', NULL, '109.803,18.5393', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2464, '0801', 469029, '响水镇', NULL, '109.61,18.5626', 'street', 2451);
INSERT INTO `amapDistrictTable`
VALUES (2465, '1897', 469001, '五指山市', NULL, '109.516662,18.776921', 'city', 2213);
INSERT INTO `amapDistrictTable`
VALUES (2466, '1897', 469001, '南圣镇', NULL, '109.687,18.8266', 'street', 2465);
INSERT INTO `amapDistrictTable`
VALUES (2467, '1897', 469001, '毛阳镇', NULL, '109.45,18.8811', 'street', 2465);
INSERT INTO `amapDistrictTable`
VALUES (2468, '1897', 469001, '通什镇', NULL, '109.614,18.8418', 'street', 2465);
INSERT INTO `amapDistrictTable`
VALUES (2469, '1897', 469001, '水满乡', NULL, '109.601,18.8995', 'street', 2465);
INSERT INTO `amapDistrictTable`
VALUES (2470, '1897', 469001, '番阳镇', NULL, '109.334,18.9132', 'street', 2465);
INSERT INTO `amapDistrictTable`
VALUES (2471, '1897', 469001, '畅好乡', NULL, '109.397,18.6549', 'street', 2465);
INSERT INTO `amapDistrictTable`
VALUES (2472, '1897', 469001, '毛道乡', NULL, '109.356,18.7134', 'street', 2465);
INSERT INTO `amapDistrictTable`
VALUES (2473, '1897', 469001, '国营畅好农场', NULL, '109.523,18.7089', 'street', 2465);
INSERT INTO `amapDistrictTable`
VALUES (2474, NULL, 630000, '青海省', NULL, '101.778916,36.623178', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2475, '0975', 632600, '果洛藏族自治州', NULL, '100.242143,34.4736', 'city', 2474);
INSERT INTO `amapDistrictTable`
VALUES (2476, '0975', 632623, '甘德县', NULL, '99.902589,33.966987', 'district', 2475);
INSERT INTO `amapDistrictTable`
VALUES (2477, '0975', 632621, '玛沁县', NULL, '100.243531,34.473386', 'district', 2475);
INSERT INTO `amapDistrictTable`
VALUES (2478, '0975', 632624, '达日县', NULL, '99.651715,33.753259', 'district', 2475);
INSERT INTO `amapDistrictTable`
VALUES (2479, '0975', 632625, '久治县', NULL, '101.484884,33.430217', 'district', 2475);
INSERT INTO `amapDistrictTable`
VALUES (2480, '0975', 632622, '班玛县', NULL, '100.737955,32.931589', 'district', 2475);
INSERT INTO `amapDistrictTable`
VALUES (2481, '0975', 632626, '玛多县', NULL, '98.211343,34.91528', 'district', 2475);
INSERT INTO `amapDistrictTable`
VALUES (2482, '0974', 632500, '海南藏族自治州', NULL, '100.619542,36.280353', 'city', 2474);
INSERT INTO `amapDistrictTable`
VALUES (2483, '0974', 632523, '贵德县', NULL, '101.431856,36.040456', 'district', 2482);
INSERT INTO `amapDistrictTable`
VALUES (2484, '0974', 632521, '共和县', NULL, '100.619597,36.280286', 'district', 2482);
INSERT INTO `amapDistrictTable`
VALUES (2485, '0974', 632525, '贵南县', NULL, '100.74792,35.587085', 'district', 2482);
INSERT INTO `amapDistrictTable`
VALUES (2486, '0974', 632522, '同德县', NULL, '100.579465,35.254492', 'district', 2482);
INSERT INTO `amapDistrictTable`
VALUES (2487, '0974', 632524, '兴海县', NULL, '99.986963,35.58909', 'district', 2482);
INSERT INTO `amapDistrictTable`
VALUES (2488, '0976', 632700, '玉树藏族自治州', NULL, '97.008522,33.004049', 'city', 2474);
INSERT INTO `amapDistrictTable`
VALUES (2489, '0976', 632723, '称多县', NULL, '97.110893,33.367884', 'district', 2488);
INSERT INTO `amapDistrictTable`
VALUES (2490, '0976', 632724, '治多县', NULL, '95.616843,33.852322', 'district', 2488);
INSERT INTO `amapDistrictTable`
VALUES (2491, '0976', 632726, '曲麻莱县', NULL, '95.800674,34.12654', 'district', 2488);
INSERT INTO `amapDistrictTable`
VALUES (2492, '0976', 632701, '玉树市', NULL, '97.008762,33.00393', 'district', 2488);
INSERT INTO `amapDistrictTable`
VALUES (2493, '0976', 632722, '杂多县', NULL, '95.293423,32.891886', 'district', 2488);
INSERT INTO `amapDistrictTable`
VALUES (2494, '0976', 632725, '囊谦县', NULL, '96.479797,32.203206', 'district', 2488);
INSERT INTO `amapDistrictTable`
VALUES (2495, '0973', 632300, '黄南藏族自治州', NULL, '102.019988,35.517744', 'city', 2474);
INSERT INTO `amapDistrictTable`
VALUES (2496, '0973', 632322, '尖扎县', NULL, '102.031953,35.938205', 'district', 2495);
INSERT INTO `amapDistrictTable`
VALUES (2497, '0973', 632321, '同仁县', NULL, '102.017604,35.516337', 'district', 2495);
INSERT INTO `amapDistrictTable`
VALUES (2498, '0973', 632324, '河南蒙古族自治县', NULL, '101.611877,34.734522', 'district', 2495);
INSERT INTO `amapDistrictTable`
VALUES (2499, '0973', 632323, '泽库县', NULL, '101.469343,35.036842', 'district', 2495);
INSERT INTO `amapDistrictTable`
VALUES (2500, '0977', 632800, '海西蒙古族藏族自治州', NULL, '97.370785,37.374663', 'city', 2474);
INSERT INTO `amapDistrictTable`
VALUES (2501, '0977', 632823, '天峻县', NULL, '99.02078,37.29906', 'district', 2500);
INSERT INTO `amapDistrictTable`
VALUES (2502, '0977', 632802, '德令哈市', NULL, '97.370143,37.374555', 'district', 2500);
INSERT INTO `amapDistrictTable`
VALUES (2503, '0977', 632822, '都兰县', NULL, '98.089161,36.298553', 'district', 2500);
INSERT INTO `amapDistrictTable`
VALUES (2504, '0977', 632801, '格尔木市', NULL, '94.905777,36.401541', 'district', 2500);
INSERT INTO `amapDistrictTable`
VALUES (2505, '0977', 632825, '海西蒙古族藏族自治州直辖', NULL, '95.357233,37.853631', 'district', 2500);
INSERT INTO `amapDistrictTable`
VALUES (2506, '0977', 632821, '乌兰县', NULL, '98.479852,36.930389', 'district', 2500);
INSERT INTO `amapDistrictTable`
VALUES (2507, '0977', 632803, '茫崖市', NULL, '90.855955,38.247117', 'district', 2500);
INSERT INTO `amapDistrictTable`
VALUES (2508, '0972', 630200, '海东市', NULL, '102.10327,36.502916', 'city', 2474);
INSERT INTO `amapDistrictTable`
VALUES (2509, '0972', 630224, '化隆回族自治县', NULL, '102.262329,36.098322', 'district', 2508);
INSERT INTO `amapDistrictTable`
VALUES (2510, '0972', 630222, '民和回族土族自治县', NULL, '102.804209,36.329451', 'district', 2508);
INSERT INTO `amapDistrictTable`
VALUES (2511, '0972', 630202, '乐都区', NULL, '102.402431,36.480291', 'district', 2508);
INSERT INTO `amapDistrictTable`
VALUES (2512, '0972', 630225, '循化撒拉族自治县', NULL, '102.486534,35.847247', 'district', 2508);
INSERT INTO `amapDistrictTable`
VALUES (2513, '0972', 630203, '平安区', NULL, '102.104295,36.502714', 'district', 2508);
INSERT INTO `amapDistrictTable`
VALUES (2514, '0972', 630223, '互助土族自治县', NULL, '101.956734,36.83994', 'district', 2508);
INSERT INTO `amapDistrictTable`
VALUES (2515, '0971', 630100, '西宁市', NULL, '101.778916,36.623178', 'city', 2474);
INSERT INTO `amapDistrictTable`
VALUES (2516, '0971', 630123, '湟源县', NULL, '101.263435,36.684818', 'district', 2515);
INSERT INTO `amapDistrictTable`
VALUES (2517, '0971', 630102, '城东区', NULL, '101.796095,36.616043', 'district', 2515);
INSERT INTO `amapDistrictTable`
VALUES (2518, '0971', 630121, '大通回族土族自治县', NULL, '101.684183,36.931343', 'district', 2515);
INSERT INTO `amapDistrictTable`
VALUES (2519, '0971', 630104, '城西区', NULL, '101.763649,36.628323', 'district', 2515);
INSERT INTO `amapDistrictTable`
VALUES (2520, '0971', 630106, '湟中区', NULL, '101.569475,36.500419', 'district', 2515);
INSERT INTO `amapDistrictTable`
VALUES (2521, '0971', 630103, '城中区', NULL, '101.784554,36.621181', 'district', 2515);
INSERT INTO `amapDistrictTable`
VALUES (2522, '0971', 630105, '城北区', NULL, '101.761297,36.648448', 'district', 2515);
INSERT INTO `amapDistrictTable`
VALUES (2523, '0970', 632200, '海北藏族自治州', NULL, '100.901059,36.959435', 'city', 2474);
INSERT INTO `amapDistrictTable`
VALUES (2524, '0970', 632223, '海晏县', NULL, '100.90049,36.959542', 'district', 2523);
INSERT INTO `amapDistrictTable`
VALUES (2525, '0970', 632221, '门源回族自治县', NULL, '101.618461,37.376627', 'district', 2523);
INSERT INTO `amapDistrictTable`
VALUES (2526, '0970', 632224, '刚察县', NULL, '100.138417,37.326263', 'district', 2523);
INSERT INTO `amapDistrictTable`
VALUES (2527, '0970', 632222, '祁连县', NULL, '100.249778,38.175409', 'district', 2523);
INSERT INTO `amapDistrictTable`
VALUES (2528, NULL, 350000, '福建省', NULL, '119.306239,26.075302', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2529, '0593', 350900, '宁德市', NULL, '119.527082,26.65924', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2530, '0593', 350924, '寿宁县', NULL, '119.506733,27.457798', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2531, '0593', 350923, '屏南县', NULL, '118.987544,26.910826', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2532, '0593', 350982, '福鼎市', NULL, '120.219761,27.318884', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2533, '0593', 350981, '福安市', NULL, '119.650798,27.084246', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2534, '0593', 350922, '古田县', NULL, '118.743156,26.577491', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2535, '0593', 350925, '周宁县', NULL, '119.338239,27.103106', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2536, '0593', 350902, '蕉城区', NULL, '119.527225,26.659253', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2537, '0593', 350921, '霞浦县', NULL, '120.005214,26.882068', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2538, '0593', 350926, '柘荣县', NULL, '119.898226,27.236163', 'district', 2529);
INSERT INTO `amapDistrictTable`
VALUES (2539, '0599', 350700, '南平市', NULL, '118.178459,26.635627', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2540, '0599', 350722, '浦城县', NULL, '118.536822,27.920412', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2541, '0599', 350782, '武夷山市', NULL, '118.032796,27.751733', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2542, '0599', 350703, '建阳区', NULL, '118.12267,27.332067', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2543, '0599', 350723, '光泽县', NULL, '117.337897,27.542803', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2544, '0599', 350724, '松溪县', NULL, '118.783491,27.525785', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2545, '0599', 350783, '建瓯市', NULL, '118.321765,27.03502', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2546, '0599', 350721, '顺昌县', NULL, '117.80771,26.792851', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2547, '0599', 350781, '邵武市', NULL, '117.491544,27.337952', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2548, '0599', 350725, '政和县', NULL, '118.858661,27.365398', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2549, '0599', 350702, '延平区', NULL, '118.178918,26.636079', 'district', 2539);
INSERT INTO `amapDistrictTable`
VALUES (2550, '0594', 350300, '莆田市', NULL, '119.007558,25.431011', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2551, '0594', 350322, '仙游县', NULL, '118.694331,25.356529', 'district', 2550);
INSERT INTO `amapDistrictTable`
VALUES (2552, '0594', 350304, '荔城区', NULL, '119.020047,25.430047', 'district', 2550);
INSERT INTO `amapDistrictTable`
VALUES (2553, '0594', 350305, '秀屿区', NULL, '119.092607,25.316141', 'district', 2550);
INSERT INTO `amapDistrictTable`
VALUES (2554, '0594', 350302, '城厢区', NULL, '119.001028,25.433737', 'district', 2550);
INSERT INTO `amapDistrictTable`
VALUES (2555, '0594', 350303, '涵江区', NULL, '119.119102,25.459273', 'district', 2550);
INSERT INTO `amapDistrictTable`
VALUES (2556, '0597', 350800, '龙岩市', NULL, '117.02978,25.091603', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2557, '0597', 350881, '漳平市', NULL, '117.42073,25.291597', 'district', 2556);
INSERT INTO `amapDistrictTable`
VALUES (2558, '0597', 350823, '上杭县', NULL, '116.424774,25.050019', 'district', 2556);
INSERT INTO `amapDistrictTable`
VALUES (2559, '0597', 350824, '武平县', NULL, '116.100928,25.08865', 'district', 2556);
INSERT INTO `amapDistrictTable`
VALUES (2560, '0597', 350803, '永定区', NULL, '116.732691,24.720442', 'district', 2556);
INSERT INTO `amapDistrictTable`
VALUES (2561, '0597', 350802, '新罗区', NULL, '117.030721,25.0918', 'district', 2556);
INSERT INTO `amapDistrictTable`
VALUES (2562, '0597', 350821, '长汀县', NULL, '116.361007,25.842278', 'district', 2556);
INSERT INTO `amapDistrictTable`
VALUES (2563, '0597', 350825, '连城县', NULL, '116.756687,25.708506', 'district', 2556);
INSERT INTO `amapDistrictTable`
VALUES (2564, '0591', 350100, '福州市', NULL, '119.306239,26.075302', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2565, '0591', 350122, '连江县', NULL, '119.538365,26.202109', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2566, '0591', 350123, '罗源县', NULL, '119.552645,26.487234', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2567, '0591', 350124, '闽清县', NULL, '118.868416,26.223793', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2568, '0591', 350121, '闽侯县', NULL, '119.145117,26.148567', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2569, '0591', 350104, '仓山区', NULL, '119.320988,26.038912', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2570, '0591', 350125, '永泰县', NULL, '118.939089,25.864825', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2571, '0591', 350181, '福清市', NULL, '119.376992,25.720402', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2572, '0591', 350112, '长乐区', NULL, '119.510849,25.960583', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2573, '0591', 350128, '平潭县', NULL, '119.791197,25.503672', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2574, '0591', 350103, '台江区', NULL, '119.310156,26.058616', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2575, '0591', 350102, '鼓楼区', NULL, '119.29929,26.082284', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2576, '0591', 350105, '马尾区', NULL, '119.458725,25.991975', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2577, '0591', 350111, '晋安区', NULL, '119.328597,26.078837', 'district', 2564);
INSERT INTO `amapDistrictTable`
VALUES (2578, '0598', 350400, '三明市', NULL, '117.635001,26.265444', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2579, '0598', 350429, '泰宁县', NULL, '117.177522,26.897995', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2580, '0598', 350402, '梅列区', NULL, '117.63687,26.269208', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2581, '0598', 350424, '宁化县', NULL, '116.659725,26.259932', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2582, '0598', 350423, '清流县', NULL, '116.815821,26.17761', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2583, '0598', 350481, '永安市', NULL, '117.364447,25.974075', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2584, '0598', 350403, '三元区', NULL, '117.607418,26.234191', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2585, '0598', 350425, '大田县', NULL, '117.849355,25.690803', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2586, '0598', 350426, '尤溪县', NULL, '118.188577,26.169261', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2587, '0598', 350430, '建宁县', NULL, '116.845832,26.831398', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2588, '0598', 350427, '沙县', NULL, '117.789095,26.397361', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2589, '0598', 350421, '明溪县', NULL, '117.201845,26.357375', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2590, '0598', 350428, '将乐县', NULL, '117.473558,26.728667', 'district', 2578);
INSERT INTO `amapDistrictTable`
VALUES (2591, '0595', 350500, '泉州市', NULL, '118.589421,24.908853', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2592, '0595', 350526, '德化县', NULL, '118.242986,25.489004', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2593, '0595', 350525, '永春县', NULL, '118.29503,25.320721', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2594, '0595', 350504, '洛江区', NULL, '118.670312,24.941153', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2595, '0595', 350505, '泉港区', NULL, '118.912285,25.126859', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2596, '0595', 350503, '丰泽区', NULL, '118.605147,24.896041', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2597, '0595', 350581, '石狮市', NULL, '118.628402,24.731978', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2598, '0595', 350583, '南安市', NULL, '118.387031,24.959494', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2599, '0595', 350521, '惠安县', NULL, '118.798954,25.028718', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2600, '0595', 350582, '晋江市', NULL, '118.577338,24.807322', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2601, '0595', 350527, '金门县', NULL, '118.323221,24.436417', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2602, '0595', 350502, '鲤城区', NULL, '118.588929,24.907645', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2603, '0595', 350524, '安溪县', NULL, '118.186014,25.056824', 'district', 2591);
INSERT INTO `amapDistrictTable`
VALUES (2604, '0592', 350200, '厦门市', NULL, '118.11022,24.490474', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2605, '0592', 350206, '湖里区', NULL, '118.10943,24.512764', 'district', 2604);
INSERT INTO `amapDistrictTable`
VALUES (2606, '0592', 350203, '思明区', NULL, '118.087828,24.462059', 'district', 2604);
INSERT INTO `amapDistrictTable`
VALUES (2607, '0592', 350213, '翔安区', NULL, '118.242811,24.637479', 'district', 2604);
INSERT INTO `amapDistrictTable`
VALUES (2608, '0592', 350205, '海沧区', NULL, '118.036364,24.492512', 'district', 2604);
INSERT INTO `amapDistrictTable`
VALUES (2609, '0592', 350211, '集美区', NULL, '118.100869,24.572874', 'district', 2604);
INSERT INTO `amapDistrictTable`
VALUES (2610, '0592', 350212, '同安区', NULL, '118.150455,24.729333', 'district', 2604);
INSERT INTO `amapDistrictTable`
VALUES (2611, '0596', 350600, '漳州市', NULL, '117.661801,24.510897', 'city', 2528);
INSERT INTO `amapDistrictTable`
VALUES (2612, '0596', 350629, '华安县', NULL, '117.53631,25.001416', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2613, '0596', 350627, '南靖县', NULL, '117.365462,24.516425', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2614, '0596', 350681, '龙海市', NULL, '117.817292,24.445341', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2615, '0596', 350623, '漳浦县', NULL, '117.614023,24.117907', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2616, '0596', 350626, '东山县', NULL, '117.427679,23.702845', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2617, '0596', 350624, '诏安县', NULL, '117.176083,23.710834', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2618, '0596', 350602, '芗城区', NULL, '117.656461,24.509955', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2619, '0596', 350603, '龙文区', NULL, '117.671387,24.515656', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2620, '0596', 350622, '云霄县', NULL, '117.340946,23.950486', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2621, '0596', 350628, '平和县', NULL, '117.313549,24.366158', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2622, '0596', 350625, '长泰县', NULL, '117.755913,24.621475', 'district', 2611);
INSERT INTO `amapDistrictTable`
VALUES (2623, NULL, 640000, '宁夏回族自治区', NULL, '106.278179,38.46637', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2624, '0952', 640200, '石嘴山市', NULL, '106.376173,39.01333', 'city', 2623);
INSERT INTO `amapDistrictTable`
VALUES (2625, '0952', 640202, '大武口区', NULL, '106.376651,39.014158', 'district', 2624);
INSERT INTO `amapDistrictTable`
VALUES (2626, '0952', 640205, '惠农区', NULL, '106.775513,39.230094', 'district', 2624);
INSERT INTO `amapDistrictTable`
VALUES (2627, '0952', 640221, '平罗县', NULL, '106.54489,38.90674', 'district', 2624);
INSERT INTO `amapDistrictTable`
VALUES (2628, '1953', 640500, '中卫市', NULL, '105.189568,37.514951', 'city', 2623);
INSERT INTO `amapDistrictTable`
VALUES (2629, '1953', 640521, '中宁县', NULL, '105.675784,37.489736', 'district', 2628);
INSERT INTO `amapDistrictTable`
VALUES (2630, '1953', 640522, '海原县', NULL, '105.647323,36.562007', 'district', 2628);
INSERT INTO `amapDistrictTable`
VALUES (2631, '1953', 640502, '沙坡头区', NULL, '105.190536,37.514564', 'district', 2628);
INSERT INTO `amapDistrictTable`
VALUES (2632, '0954', 640400, '固原市', NULL, '106.285241,36.004561', 'city', 2623);
INSERT INTO `amapDistrictTable`
VALUES (2633, '0954', 640423, '隆德县', NULL, '106.12344,35.618234', 'district', 2632);
INSERT INTO `amapDistrictTable`
VALUES (2634, '0954', 640425, '彭阳县', NULL, '106.641512,35.849975', 'district', 2632);
INSERT INTO `amapDistrictTable`
VALUES (2635, '0954', 640402, '原州区', NULL, '106.28477,36.005337', 'district', 2632);
INSERT INTO `amapDistrictTable`
VALUES (2636, '0954', 640424, '泾源县', NULL, '106.338674,35.49344', 'district', 2632);
INSERT INTO `amapDistrictTable`
VALUES (2637, '0954', 640422, '西吉县', NULL, '105.731801,35.965384', 'district', 2632);
INSERT INTO `amapDistrictTable`
VALUES (2638, '0951', 640100, '银川市', NULL, '106.278179,38.46637', 'city', 2623);
INSERT INTO `amapDistrictTable`
VALUES (2639, '0951', 640105, '西夏区', NULL, '106.132116,38.492424', 'district', 2638);
INSERT INTO `amapDistrictTable`
VALUES (2640, '0951', 640121, '永宁县', NULL, '106.253781,38.28043', 'district', 2638);
INSERT INTO `amapDistrictTable`
VALUES (2641, '0951', 640106, '金凤区', NULL, '106.228486,38.477353', 'district', 2638);
INSERT INTO `amapDistrictTable`
VALUES (2642, '0951', 640122, '贺兰县', NULL, '106.345904,38.554563', 'district', 2638);
INSERT INTO `amapDistrictTable`
VALUES (2643, '0951', 640104, '兴庆区', NULL, '106.278393,38.46747', 'district', 2638);
INSERT INTO `amapDistrictTable`
VALUES (2644, '0951', 640181, '灵武市', NULL, '106.334701,38.094058', 'district', 2638);
INSERT INTO `amapDistrictTable`
VALUES (2645, '0953', 640300, '吴忠市', NULL, '106.199409,37.986165', 'city', 2623);
INSERT INTO `amapDistrictTable`
VALUES (2646, '0953', 640381, '青铜峡市', NULL, '106.075395,38.021509', 'district', 2645);
INSERT INTO `amapDistrictTable`
VALUES (2647, '0953', 640324, '同心县', NULL, '105.914764,36.9829', 'district', 2645);
INSERT INTO `amapDistrictTable`
VALUES (2648, '0953', 640323, '盐池县', NULL, '107.40541,37.784222', 'district', 2645);
INSERT INTO `amapDistrictTable`
VALUES (2649, '0953', 640303, '红寺堡区', NULL, '106.067315,37.421616', 'district', 2645);
INSERT INTO `amapDistrictTable`
VALUES (2650, '0953', 640302, '利通区', NULL, '106.199419,37.985967', 'district', 2645);
INSERT INTO `amapDistrictTable`
VALUES (2651, NULL, 450000, '广西壮族自治区', NULL, '108.320004,22.82402', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2652, '0776', 451000, '百色市', NULL, '106.616285,23.897742', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2653, '0776', 451028, '乐业县', NULL, '106.559638,24.782204', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2654, '0776', 451031, '隆林各族自治县', NULL, '105.342363,24.774318', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2655, '0776', 451030, '西林县', NULL, '105.095025,24.492041', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2656, '0776', 451027, '凌云县', NULL, '106.56487,24.345643', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2657, '0776', 451002, '右江区', NULL, '106.615727,23.897675', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2658, '0776', 451082, '平果市', NULL, '107.580403,23.320479', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2659, '0776', 451026, '那坡县', NULL, '105.833553,23.400785', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2660, '0776', 451081, '靖西市', NULL, '106.417549,23.134766', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2661, '0776', 451029, '田林县', NULL, '106.235047,24.290262', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2662, '0776', 451003, '田阳区', NULL, '106.904315,23.736079', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2663, '0776', 451024, '德保县', NULL, '106.618164,23.321464', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2664, '0776', 451022, '田东县', NULL, '107.12426,23.600444', 'district', 2652);
INSERT INTO `amapDistrictTable`
VALUES (2665, '0779', 450500, '北海市', NULL, '109.119254,21.473343', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2666, '0779', 450512, '铁山港区', NULL, '109.450573,21.5928', 'district', 2665);
INSERT INTO `amapDistrictTable`
VALUES (2667, '0779', 450503, '银海区', NULL, '109.118707,21.444909', 'district', 2665);
INSERT INTO `amapDistrictTable`
VALUES (2668, '0779', 450502, '海城区', NULL, '109.107529,21.468443', 'district', 2665);
INSERT INTO `amapDistrictTable`
VALUES (2669, '0779', 450521, '合浦县', NULL, '109.200695,21.663554', 'district', 2665);
INSERT INTO `amapDistrictTable`
VALUES (2670, '0777', 450700, '钦州市', NULL, '108.624175,21.967127', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2671, '0777', 450702, '钦南区', NULL, '108.626629,21.966808', 'district', 2670);
INSERT INTO `amapDistrictTable`
VALUES (2672, '0777', 450703, '钦北区', NULL, '108.44911,22.132761', 'district', 2670);
INSERT INTO `amapDistrictTable`
VALUES (2673, '0777', 450722, '浦北县', NULL, '109.556341,22.268335', 'district', 2670);
INSERT INTO `amapDistrictTable`
VALUES (2674, '0777', 450721, '灵山县', NULL, '109.293468,22.418041', 'district', 2670);
INSERT INTO `amapDistrictTable`
VALUES (2675, '0772', 450200, '柳州市', NULL, '109.411703,24.314617', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2676, '0772', 450226, '三江侗族自治县', NULL, '109.614846,25.78553', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2677, '0772', 450225, '融水苗族自治县', NULL, '109.252744,25.068812', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2678, '0772', 450224, '融安县', NULL, '109.403621,25.214703', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2679, '0772', 450223, '鹿寨县', NULL, '109.740805,24.483405', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2680, '0772', 450205, '柳北区', NULL, '109.406577,24.359145', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2681, '0772', 450202, '城中区', NULL, '109.411749,24.312324', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2682, '0772', 450222, '柳城县', NULL, '109.245812,24.655121', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2683, '0772', 450203, '鱼峰区', NULL, '109.415364,24.303848', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2684, '0772', 450206, '柳江区', NULL, '109.334503,24.257512', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2685, '0772', 450204, '柳南区', NULL, '109.395936,24.287013', 'district', 2675);
INSERT INTO `amapDistrictTable`
VALUES (2686, '1772', 451300, '来宾市', NULL, '109.229772,23.733766', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2687, '1772', 451322, '象州县', NULL, '109.684555,23.959824', 'district', 2686);
INSERT INTO `amapDistrictTable`
VALUES (2688, '1772', 451321, '忻城县', NULL, '108.667361,24.064779', 'district', 2686);
INSERT INTO `amapDistrictTable`
VALUES (2689, '1772', 451324, '金秀瑶族自治县', NULL, '110.188556,24.134941', 'district', 2686);
INSERT INTO `amapDistrictTable`
VALUES (2690, '1772', 451302, '兴宾区', NULL, '109.230541,23.732926', 'district', 2686);
INSERT INTO `amapDistrictTable`
VALUES (2691, '1772', 451323, '武宣县', NULL, '109.66287,23.604162', 'district', 2686);
INSERT INTO `amapDistrictTable`
VALUES (2692, '1772', 451381, '合山市', NULL, '108.88858,23.81311', 'district', 2686);
INSERT INTO `amapDistrictTable`
VALUES (2693, '0771', 450100, '南宁市', NULL, '108.320004,22.82402', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2694, '0771', 450125, '上林县', NULL, '108.603937,23.431769', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2695, '0771', 450110, '武鸣区', NULL, '108.280717,23.157163', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2696, '0771', 450124, '马山县', NULL, '108.172903,23.711758', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2697, '0771', 450127, '横县', NULL, '109.270987,22.68743', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2698, '0771', 450126, '宾阳县', NULL, '108.816735,23.216884', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2699, '0771', 450108, '良庆区', NULL, '108.322102,22.75909', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2700, '0771', 450109, '邕宁区', NULL, '108.484251,22.756598', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2701, '0771', 450105, '江南区', NULL, '108.310478,22.799593', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2702, '0771', 450102, '兴宁区', NULL, '108.320189,22.819511', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2703, '0771', 450107, '西乡塘区', NULL, '108.306903,22.832779', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2704, '0771', 450103, '青秀区', NULL, '108.346113,22.816614', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2705, '0771', 450123, '隆安县', NULL, '107.688661,23.174763', 'district', 2693);
INSERT INTO `amapDistrictTable`
VALUES (2706, '0774', 450400, '梧州市', NULL, '111.297604,23.474803', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2707, '0774', 450423, '蒙山县', NULL, '110.5226,24.199829', 'district', 2706);
INSERT INTO `amapDistrictTable`
VALUES (2708, '0774', 450405, '长洲区', NULL, '111.275678,23.4777', 'district', 2706);
INSERT INTO `amapDistrictTable`
VALUES (2709, '0774', 450406, '龙圩区', NULL, '111.246035,23.40996', 'district', 2706);
INSERT INTO `amapDistrictTable`
VALUES (2710, '0774', 450481, '岑溪市', NULL, '110.998114,22.918406', 'district', 2706);
INSERT INTO `amapDistrictTable`
VALUES (2711, '0774', 450421, '苍梧县', NULL, '111.544008,23.845097', 'district', 2706);
INSERT INTO `amapDistrictTable`
VALUES (2712, '0774', 450403, '万秀区', NULL, '111.315817,23.471318', 'district', 2706);
INSERT INTO `amapDistrictTable`
VALUES (2713, '0774', 450422, '藤县', NULL, '110.931826,23.373963', 'district', 2706);
INSERT INTO `amapDistrictTable`
VALUES (2714, '0773', 450300, '桂林市', NULL, '110.299121,25.274215', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2715, '0773', 450325, '兴安县', NULL, '110.670783,25.609554', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2716, '0773', 450312, '临桂区', NULL, '110.205487,25.246257', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2717, '0773', 450326, '永福县', NULL, '109.989208,24.986692', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2718, '0773', 450332, '恭城瑶族自治县', NULL, '110.82952,24.833612', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2719, '0773', 450311, '雁山区', NULL, '110.305667,25.077646', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2720, '0773', 450305, '七星区', NULL, '110.317577,25.254339', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2721, '0773', 450321, '阳朔县', NULL, '110.494699,24.77534', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2722, '0773', 450381, '荔浦市', NULL, '110.400149,24.497786', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2723, '0773', 450330, '平乐县', NULL, '110.642821,24.632216', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2724, '0773', 450328, '龙胜各族自治县', NULL, '110.009423,25.796428', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2725, '0773', 450302, '秀峰区', NULL, '110.292445,25.278544', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2726, '0773', 450304, '象山区', NULL, '110.284882,25.261986', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2727, '0773', 450327, '灌阳县', NULL, '111.160248,25.489098', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2728, '0773', 450324, '全州县', NULL, '111.072989,25.929897', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2729, '0773', 450323, '灵川县', NULL, '110.325712,25.408541', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2730, '0773', 450303, '叠彩区', NULL, '110.300783,25.301334', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2731, '0773', 450329, '资源县', NULL, '110.642587,26.0342', 'district', 2714);
INSERT INTO `amapDistrictTable`
VALUES (2732, '1771', 451400, '崇左市', NULL, '107.353926,22.404108', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2733, '1771', 451425, '天等县', NULL, '107.142441,23.082484', 'district', 2732);
INSERT INTO `amapDistrictTable`
VALUES (2734, '1771', 451402, '江州区', NULL, '107.354443,22.40469', 'district', 2732);
INSERT INTO `amapDistrictTable`
VALUES (2735, '1771', 451421, '扶绥县', NULL, '107.911533,22.635821', 'district', 2732);
INSERT INTO `amapDistrictTable`
VALUES (2736, '1771', 451424, '大新县', NULL, '107.200803,22.833369', 'district', 2732);
INSERT INTO `amapDistrictTable`
VALUES (2737, '1771', 451481, '凭祥市', NULL, '106.759038,22.108882', 'district', 2732);
INSERT INTO `amapDistrictTable`
VALUES (2738, '1771', 451423, '龙州县', NULL, '106.857502,22.343716', 'district', 2732);
INSERT INTO `amapDistrictTable`
VALUES (2739, '1771', 451422, '宁明县', NULL, '107.067616,22.131353', 'district', 2732);
INSERT INTO `amapDistrictTable`
VALUES (2740, '0770', 450600, '防城港市', NULL, '108.345478,21.614631', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2741, '0770', 450602, '港口区', NULL, '108.346281,21.614406', 'district', 2740);
INSERT INTO `amapDistrictTable`
VALUES (2742, '0770', 450603, '防城区', NULL, '108.358426,21.764758', 'district', 2740);
INSERT INTO `amapDistrictTable`
VALUES (2743, '0770', 450681, '东兴市', NULL, '107.97017,21.541172', 'district', 2740);
INSERT INTO `amapDistrictTable`
VALUES (2744, '0770', 450621, '上思县', NULL, '107.982139,22.151423', 'district', 2740);
INSERT INTO `amapDistrictTable`
VALUES (2745, '1774', 451100, '贺州市', NULL, '111.552056,24.414141', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2746, '1774', 451123, '富川瑶族自治县', NULL, '111.277228,24.81896', 'district', 2745);
INSERT INTO `amapDistrictTable`
VALUES (2747, '1774', 451121, '昭平县', NULL, '110.810865,24.172958', 'district', 2745);
INSERT INTO `amapDistrictTable`
VALUES (2748, '1774', 451122, '钟山县', NULL, '111.303629,24.528566', 'district', 2745);
INSERT INTO `amapDistrictTable`
VALUES (2749, '1774', 451103, '平桂区', NULL, '111.524014,24.417148', 'district', 2745);
INSERT INTO `amapDistrictTable`
VALUES (2750, '1774', 451102, '八步区', NULL, '111.551991,24.412446', 'district', 2745);
INSERT INTO `amapDistrictTable`
VALUES (2751, '0775', 450900, '玉林市', NULL, '110.154393,22.63136', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2752, '0775', 450903, '福绵区', NULL, '110.054155,22.58163', 'district', 2751);
INSERT INTO `amapDistrictTable`
VALUES (2753, '0775', 450924, '兴业县', NULL, '109.877768,22.74187', 'district', 2751);
INSERT INTO `amapDistrictTable`
VALUES (2754, '0775', 450923, '博白县', NULL, '109.980004,22.271285', 'district', 2751);
INSERT INTO `amapDistrictTable`
VALUES (2755, '0775', 450922, '陆川县', NULL, '110.264842,22.321054', 'district', 2751);
INSERT INTO `amapDistrictTable`
VALUES (2756, '0775', 450921, '容县', NULL, '110.552467,22.856435', 'district', 2751);
INSERT INTO `amapDistrictTable`
VALUES (2757, '0775', 450902, '玉州区', NULL, '110.154912,22.632132', 'district', 2751);
INSERT INTO `amapDistrictTable`
VALUES (2758, '0775', 450981, '北流市', NULL, '110.348052,22.701648', 'district', 2751);
INSERT INTO `amapDistrictTable`
VALUES (2759, '1755', 450800, '贵港市', NULL, '109.602146,23.0936', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2760, '1755', 450804, '覃塘区', NULL, '109.415697,23.132815', 'district', 2759);
INSERT INTO `amapDistrictTable`
VALUES (2761, '1755', 450802, '港北区', NULL, '109.59481,23.107677', 'district', 2759);
INSERT INTO `amapDistrictTable`
VALUES (2762, '1755', 450803, '港南区', NULL, '109.604665,23.067516', 'district', 2759);
INSERT INTO `amapDistrictTable`
VALUES (2763, '1755', 450881, '桂平市', NULL, '110.074668,23.382473', 'district', 2759);
INSERT INTO `amapDistrictTable`
VALUES (2764, '1755', 450821, '平南县', NULL, '110.397485,23.544546', 'district', 2759);
INSERT INTO `amapDistrictTable`
VALUES (2765, '0778', 451200, '河池市', NULL, '108.062105,24.695899', 'city', 2651);
INSERT INTO `amapDistrictTable`
VALUES (2766, '0778', 451225, '罗城仫佬族自治县', NULL, '108.902453,24.779327', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2767, '0778', 451221, '南丹县', NULL, '107.546605,24.983192', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2768, '0778', 451222, '天峨县', NULL, '107.174939,24.985964', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2769, '0778', 451226, '环江毛南族自治县', NULL, '108.258669,24.827628', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2770, '0778', 451203, '宜州区', NULL, '108.653965,24.492193', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2771, '0778', 451223, '凤山县', NULL, '107.044592,24.544561', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2772, '0778', 451202, '金城江区', NULL, '108.062131,24.695625', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2773, '0778', 451228, '都安瑶族自治县', NULL, '108.102761,23.934964', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2774, '0778', 451229, '大化瑶族自治县', NULL, '107.9945,23.739596', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2775, '0778', 451224, '东兰县', NULL, '107.373696,24.509367', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2776, '0778', 451227, '巴马瑶族自治县', NULL, '107.253126,24.139538', 'district', 2765);
INSERT INTO `amapDistrictTable`
VALUES (2777, NULL, 320000, '江苏省', NULL, '118.767413,32.041544', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2778, '0518', 320700, '连云港市', NULL, '119.178821,34.600018', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2779, '0518', 320722, '东海县', NULL, '118.766489,34.522859', 'district', 2778);
INSERT INTO `amapDistrictTable`
VALUES (2780, '0518', 320703, '连云区', NULL, '119.366487,34.739529', 'district', 2778);
INSERT INTO `amapDistrictTable`
VALUES (2781, '0518', 320723, '灌云县', NULL, '119.255741,34.298436', 'district', 2778);
INSERT INTO `amapDistrictTable`
VALUES (2782, '0518', 320724, '灌南县', NULL, '119.352331,34.092553', 'district', 2778);
INSERT INTO `amapDistrictTable`
VALUES (2783, '0518', 320707, '赣榆区', NULL, '119.128774,34.839154', 'district', 2778);
INSERT INTO `amapDistrictTable`
VALUES (2784, '0518', 320706, '海州区', NULL, '119.179793,34.601584', 'district', 2778);
INSERT INTO `amapDistrictTable`
VALUES (2785, '0527', 321300, '宿迁市', NULL, '118.275162,33.963008', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2786, '0527', 321322, '沭阳县', NULL, '118.775889,34.129097', 'district', 2785);
INSERT INTO `amapDistrictTable`
VALUES (2787, '0527', 321323, '泗阳县', NULL, '118.681284,33.711433', 'district', 2785);
INSERT INTO `amapDistrictTable`
VALUES (2788, '0527', 321324, '泗洪县', NULL, '118.211824,33.456538', 'district', 2785);
INSERT INTO `amapDistrictTable`
VALUES (2789, '0527', 321311, '宿豫区', NULL, '118.330012,33.941071', 'district', 2785);
INSERT INTO `amapDistrictTable`
VALUES (2790, '0527', 321302, '宿城区', NULL, '118.278984,33.937726', 'district', 2785);
INSERT INTO `amapDistrictTable`
VALUES (2791, '025', 320100, '南京市', NULL, '118.767413,32.041544', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2792, '025', 320111, '浦口区', NULL, '118.625307,32.05839', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2793, '025', 320114, '雨花台区', NULL, '118.77207,31.995946', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2794, '025', 320115, '江宁区', NULL, '118.850621,31.953418', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2795, '025', 320117, '溧水区', NULL, '119.028732,31.653061', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2796, '025', 320116, '六合区', NULL, '118.85065,32.340655', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2797, '025', 320118, '高淳区', NULL, '118.87589,31.327132', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2798, '025', 320105, '建邺区', NULL, '118.732688,32.004538', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2799, '025', 320106, '鼓楼区', NULL, '118.769739,32.066966', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2800, '025', 320104, '秦淮区', NULL, '118.786088,32.033818', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2801, '025', 320113, '栖霞区', NULL, '118.808702,32.102147', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2802, '025', 320102, '玄武区', NULL, '118.792199,32.050678', 'district', 2791);
INSERT INTO `amapDistrictTable`
VALUES (2803, '0513', 320600, '南通市', NULL, '120.864608,32.016212', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2804, '0513', 320682, '如皋市', NULL, '120.566324,32.391591', 'district', 2803);
INSERT INTO `amapDistrictTable`
VALUES (2805, '0513', 320684, '海门市', NULL, '121.176609,31.893528', 'district', 2803);
INSERT INTO `amapDistrictTable`
VALUES (2806, '0513', 320685, '海安市', NULL, '120.465995,32.540288', 'district', 2803);
INSERT INTO `amapDistrictTable`
VALUES (2807, '0513', 320623, '如东县', NULL, '121.186088,32.311832', 'district', 2803);
INSERT INTO `amapDistrictTable`
VALUES (2808, '0513', 320681, '启东市', NULL, '121.659724,31.810158', 'district', 2803);
INSERT INTO `amapDistrictTable`
VALUES (2809, '0513', 320611, '港闸区', NULL, '120.8339,32.040299', 'district', 2803);
INSERT INTO `amapDistrictTable`
VALUES (2810, '0513', 320612, '通州区', NULL, '121.073171,32.084287', 'district', 2803);
INSERT INTO `amapDistrictTable`
VALUES (2811, '0513', 320602, '崇川区', NULL, '120.86635,32.015278', 'district', 2803);
INSERT INTO `amapDistrictTable`
VALUES (2812, '0517', 320800, '淮安市', NULL, '119.021265,33.597506', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2813, '0517', 320804, '淮阴区', NULL, '119.020817,33.622452', 'district', 2812);
INSERT INTO `amapDistrictTable`
VALUES (2814, '0517', 320830, '盱眙县', NULL, '118.493823,33.00439', 'district', 2812);
INSERT INTO `amapDistrictTable`
VALUES (2815, '0517', 320831, '金湖县', NULL, '119.016936,33.018162', 'district', 2812);
INSERT INTO `amapDistrictTable`
VALUES (2816, '0517', 320813, '洪泽区', NULL, '118.867875,33.294975', 'district', 2812);
INSERT INTO `amapDistrictTable`
VALUES (2817, '0517', 320826, '涟水县', NULL, '119.266078,33.771308', 'district', 2812);
INSERT INTO `amapDistrictTable`
VALUES (2818, '0517', 320812, '清江浦区', NULL, '119.019454,33.603234', 'district', 2812);
INSERT INTO `amapDistrictTable`
VALUES (2819, '0517', 320803, '淮安区', NULL, '119.14634,33.507499', 'district', 2812);
INSERT INTO `amapDistrictTable`
VALUES (2820, '0514', 321000, '扬州市', NULL, '119.421003,32.393159', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2821, '0514', 321003, '邗江区', NULL, '119.397777,32.377899', 'district', 2820);
INSERT INTO `amapDistrictTable`
VALUES (2822, '0514', 321002, '广陵区', NULL, '119.442267,32.392154', 'district', 2820);
INSERT INTO `amapDistrictTable`
VALUES (2823, '0514', 321081, '仪征市', NULL, '119.182443,32.271965', 'district', 2820);
INSERT INTO `amapDistrictTable`
VALUES (2824, '0514', 321084, '高邮市', NULL, '119.443842,32.785164', 'district', 2820);
INSERT INTO `amapDistrictTable`
VALUES (2825, '0514', 321023, '宝应县', NULL, '119.321284,33.23694', 'district', 2820);
INSERT INTO `amapDistrictTable`
VALUES (2826, '0514', 321012, '江都区', NULL, '119.567481,32.426564', 'district', 2820);
INSERT INTO `amapDistrictTable`
VALUES (2827, '0523', 321200, '泰州市', NULL, '119.915176,32.484882', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2828, '0523', 321282, '靖江市', NULL, '120.26825,32.018168', 'district', 2827);
INSERT INTO `amapDistrictTable`
VALUES (2829, '0523', 321283, '泰兴市', NULL, '120.020228,32.168784', 'district', 2827);
INSERT INTO `amapDistrictTable`
VALUES (2830, '0523', 321281, '兴化市', NULL, '119.840162,32.938065', 'district', 2827);
INSERT INTO `amapDistrictTable`
VALUES (2831, '0523', 321204, '姜堰区', NULL, '120.148208,32.508483', 'district', 2827);
INSERT INTO `amapDistrictTable`
VALUES (2832, '0523', 321203, '高港区', NULL, '119.88166,32.315701', 'district', 2827);
INSERT INTO `amapDistrictTable`
VALUES (2833, '0523', 321202, '海陵区', NULL, '119.920187,32.488406', 'district', 2827);
INSERT INTO `amapDistrictTable`
VALUES (2834, '0515', 320900, '盐城市', NULL, '120.139998,33.377631', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2835, '0515', 320923, '阜宁县', NULL, '119.805338,33.78573', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2836, '0515', 320922, '滨海县', NULL, '119.828434,33.989888', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2837, '0515', 320924, '射阳县', NULL, '120.257444,33.773779', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2838, '0515', 320925, '建湖县', NULL, '119.793105,33.472621', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2839, '0515', 320902, '亭湖区', NULL, '120.136078,33.383912', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2840, '0515', 320903, '盐都区', NULL, '120.139753,33.341288', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2841, '0515', 320981, '东台市', NULL, '120.314101,32.853174', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2842, '0515', 320904, '大丰区', NULL, '120.470324,33.199531', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2843, '0515', 320921, '响水县', NULL, '119.579573,34.19996', 'district', 2834);
INSERT INTO `amapDistrictTable`
VALUES (2844, '0511', 321100, '镇江市', NULL, '119.452753,32.204402', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2845, '0511', 321182, '扬中市', NULL, '119.828054,32.237266', 'district', 2844);
INSERT INTO `amapDistrictTable`
VALUES (2846, '0511', 321111, '润州区', NULL, '119.414877,32.213501', 'district', 2844);
INSERT INTO `amapDistrictTable`
VALUES (2847, '0511', 321112, '丹徒区', NULL, '119.433883,32.128972', 'district', 2844);
INSERT INTO `amapDistrictTable`
VALUES (2848, '0511', 321102, '京口区', NULL, '119.454571,32.206191', 'district', 2844);
INSERT INTO `amapDistrictTable`
VALUES (2849, '0511', 321181, '丹阳市', NULL, '119.581911,31.991459', 'district', 2844);
INSERT INTO `amapDistrictTable`
VALUES (2850, '0511', 321183, '句容市', NULL, '119.167135,31.947355', 'district', 2844);
INSERT INTO `amapDistrictTable`
VALUES (2851, '0512', 320500, '苏州市', NULL, '120.619585,31.299379', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2852, '0512', 320582, '张家港市', NULL, '120.543441,31.865553', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2853, '0512', 320505, '虎丘区', NULL, '120.566833,31.294845', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2854, '0512', 320585, '太仓市', NULL, '121.112275,31.452568', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2855, '0512', 320508, '姑苏区', NULL, '120.622249,31.311414', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2856, '0512', 320509, '吴江区', NULL, '120.641601,31.160404', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2857, '0512', 320507, '相城区', NULL, '120.618956,31.396684', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2858, '0512', 320571, '苏州工业园区', NULL, '120.723343,31.324036', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2859, '0512', 320581, '常熟市', NULL, '120.74852,31.658156', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2860, '0512', 320506, '吴中区', NULL, '120.624621,31.270839', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2861, '0512', 320583, '昆山市', NULL, '120.958137,31.381925', 'district', 2851);
INSERT INTO `amapDistrictTable`
VALUES (2862, '0510', 320200, '无锡市', NULL, '120.301663,31.574729', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2863, '0510', 320213, '梁溪区', NULL, '120.296595,31.575706', 'district', 2862);
INSERT INTO `amapDistrictTable`
VALUES (2864, '0510', 320214, '新吴区', NULL, '120.352782,31.550966', 'district', 2862);
INSERT INTO `amapDistrictTable`
VALUES (2865, '0510', 320281, '江阴市', NULL, '120.275891,31.910984', 'district', 2862);
INSERT INTO `amapDistrictTable`
VALUES (2866, '0510', 320211, '滨湖区', NULL, '120.266053,31.550228', 'district', 2862);
INSERT INTO `amapDistrictTable`
VALUES (2867, '0510', 320282, '宜兴市', NULL, '119.820538,31.364384', 'district', 2862);
INSERT INTO `amapDistrictTable`
VALUES (2868, '0510', 320205, '锡山区', NULL, '120.357298,31.585559', 'district', 2862);
INSERT INTO `amapDistrictTable`
VALUES (2869, '0510', 320206, '惠山区', NULL, '120.303543,31.681019', 'district', 2862);
INSERT INTO `amapDistrictTable`
VALUES (2870, '0519', 320400, '常州市', NULL, '119.946973,31.772752', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2871, '0519', 320413, '金坛区', NULL, '119.573395,31.744399', 'district', 2870);
INSERT INTO `amapDistrictTable`
VALUES (2872, '0519', 320481, '溧阳市', NULL, '119.487816,31.427081', 'district', 2870);
INSERT INTO `amapDistrictTable`
VALUES (2873, '0519', 320411, '新北区', NULL, '119.974654,31.824664', 'district', 2870);
INSERT INTO `amapDistrictTable`
VALUES (2874, '0519', 320412, '武进区', NULL, '119.958773,31.718566', 'district', 2870);
INSERT INTO `amapDistrictTable`
VALUES (2875, '0519', 320404, '钟楼区', NULL, '119.948388,31.78096', 'district', 2870);
INSERT INTO `amapDistrictTable`
VALUES (2876, '0519', 320402, '天宁区', NULL, '119.963783,31.779632', 'district', 2870);
INSERT INTO `amapDistrictTable`
VALUES (2877, '0516', 320300, '徐州市', NULL, '117.184811,34.261792', 'city', 2777);
INSERT INTO `amapDistrictTable`
VALUES (2878, '0516', 320381, '新沂市', NULL, '118.345828,34.368779', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2879, '0516', 320311, '泉山区', NULL, '117.182225,34.262249', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2880, '0516', 320312, '铜山区', NULL, '117.183894,34.19288', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2881, '0516', 320303, '云龙区', NULL, '117.194589,34.254805', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2882, '0516', 320302, '鼓楼区', NULL, '117.192941,34.269397', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2883, '0516', 320324, '睢宁县', NULL, '117.95066,33.899222', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2884, '0516', 320382, '邳州市', NULL, '117.963923,34.314708', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2885, '0516', 320322, '沛县', NULL, '116.937182,34.729044', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2886, '0516', 320321, '丰县', NULL, '116.592888,34.696946', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2887, '0516', 320305, '贾汪区', NULL, '117.450212,34.441642', 'district', 2877);
INSERT INTO `amapDistrictTable`
VALUES (2888, NULL, 330000, '浙江省', NULL, '120.153576,30.287459', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2889, '0580', 330900, '舟山市', NULL, '122.106863,30.016028', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2890, '0580', 330921, '岱山县', NULL, '122.201132,30.242865', 'district', 2889);
INSERT INTO `amapDistrictTable`
VALUES (2891, '0580', 330922, '嵊泗县', NULL, '122.457809,30.727166', 'district', 2889);
INSERT INTO `amapDistrictTable`
VALUES (2892, '0580', 330903, '普陀区', NULL, '122.301953,29.945614', 'district', 2889);
INSERT INTO `amapDistrictTable`
VALUES (2893, '0580', 330902, '定海区', NULL, '122.108496,30.016423', 'district', 2889);
INSERT INTO `amapDistrictTable`
VALUES (2894, '0573', 330400, '嘉兴市', NULL, '120.750865,30.762653', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2895, '0573', 330482, '平湖市', NULL, '121.014666,30.698921', 'district', 2894);
INSERT INTO `amapDistrictTable`
VALUES (2896, '0573', 330402, '南湖区', NULL, '120.749953,30.764652', 'district', 2894);
INSERT INTO `amapDistrictTable`
VALUES (2897, '0573', 330421, '嘉善县', NULL, '120.921871,30.841352', 'district', 2894);
INSERT INTO `amapDistrictTable`
VALUES (2898, '0573', 330424, '海盐县', NULL, '120.942017,30.522223', 'district', 2894);
INSERT INTO `amapDistrictTable`
VALUES (2899, '0573', 330483, '桐乡市', NULL, '120.551085,30.629065', 'district', 2894);
INSERT INTO `amapDistrictTable`
VALUES (2900, '0573', 330411, '秀洲区', NULL, '120.720431,30.763323', 'district', 2894);
INSERT INTO `amapDistrictTable`
VALUES (2901, '0573', 330481, '海宁市', NULL, '120.688821,30.525544', 'district', 2894);
INSERT INTO `amapDistrictTable`
VALUES (2902, '0577', 330300, '温州市', NULL, '120.672111,28.000575', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2903, '0577', 330381, '瑞安市', NULL, '120.646171,27.779321', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2904, '0577', 330327, '苍南县', NULL, '120.406256,27.507743', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2905, '0577', 330305, '洞头区', NULL, '121.156181,27.836057', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2906, '0577', 330326, '平阳县', NULL, '120.564387,27.6693', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2907, '0577', 330383, '龙港市', NULL, '120.553039,27.578156', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2908, '0577', 330328, '文成县', NULL, '120.09245,27.789133', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2909, '0577', 330329, '泰顺县', NULL, '119.71624,27.557309', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2910, '0577', 330324, '永嘉县', NULL, '120.690968,28.153886', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2911, '0577', 330382, '乐清市', NULL, '120.967147,28.116083', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2912, '0577', 330302, '鹿城区', NULL, '120.674231,28.003352', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2913, '0577', 330304, '瓯海区', NULL, '120.637145,28.006444', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2914, '0577', 330303, '龙湾区', NULL, '120.763469,27.970254', 'district', 2902);
INSERT INTO `amapDistrictTable`
VALUES (2915, '0576', 331000, '台州市', NULL, '121.428599,28.661378', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2916, '0576', 331004, '路桥区', NULL, '121.37292,28.581799', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2917, '0576', 331083, '玉环市', NULL, '121.232337,28.12842', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2918, '0576', 331002, '椒江区', NULL, '121.431049,28.67615', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2919, '0576', 331082, '临海市', NULL, '121.131229,28.845441', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2920, '0576', 331081, '温岭市', NULL, '121.373611,28.368781', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2921, '0576', 331022, '三门县', NULL, '121.376429,29.118955', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2922, '0576', 331023, '天台县', NULL, '121.031227,29.141126', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2923, '0576', 331003, '黄岩区', NULL, '121.262138,28.64488', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2924, '0576', 331024, '仙居县', NULL, '120.735074,28.849213', 'district', 2915);
INSERT INTO `amapDistrictTable`
VALUES (2925, '0574', 330200, '宁波市', NULL, '121.549792,29.868388', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2926, '0574', 330206, '北仑区', NULL, '121.831303,29.90944', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2927, '0574', 330225, '象山县', NULL, '121.877091,29.470206', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2928, '0574', 330211, '镇海区', NULL, '121.713162,29.952107', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2929, '0574', 330205, '江北区', NULL, '121.559282,29.888361', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2930, '0574', 330213, '奉化区', NULL, '121.41089,29.662348', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2931, '0574', 330226, '宁海县', NULL, '121.432606,29.299836', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2932, '0574', 330203, '海曙区', NULL, '121.539698,29.874452', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2933, '0574', 330212, '鄞州区', NULL, '121.558436,29.831662', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2934, '0574', 330281, '余姚市', NULL, '121.156294,30.045404', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2935, '0574', 330282, '慈溪市', NULL, '121.248052,30.177142', 'district', 2925);
INSERT INTO `amapDistrictTable`
VALUES (2936, '0578', 331100, '丽水市', NULL, '119.921786,28.451993', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2937, '0578', 331181, '龙泉市', NULL, '119.132319,28.069177', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2938, '0578', 331102, '莲都区', NULL, '119.922293,28.451103', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2939, '0578', 331124, '松阳县', NULL, '119.485292,28.449937', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2940, '0578', 331125, '云和县', NULL, '119.569458,28.111077', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2941, '0578', 331123, '遂昌县', NULL, '119.27589,28.5924', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2942, '0578', 331127, '景宁畲族自治县', NULL, '119.634669,27.977247', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2943, '0578', 331121, '青田县', NULL, '120.291939,28.135247', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2944, '0578', 331126, '庆元县', NULL, '119.067233,27.618231', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2945, '0578', 331122, '缙云县', NULL, '120.078965,28.654208', 'district', 2936);
INSERT INTO `amapDistrictTable`
VALUES (2946, '0572', 330500, '湖州市', NULL, '120.102398,30.867198', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2947, '0572', 330521, '德清县', NULL, '119.967662,30.534927', 'district', 2946);
INSERT INTO `amapDistrictTable`
VALUES (2948, '0572', 330503, '南浔区', NULL, '120.417195,30.872742', 'district', 2946);
INSERT INTO `amapDistrictTable`
VALUES (2949, '0572', 330523, '安吉县', NULL, '119.687891,30.631974', 'district', 2946);
INSERT INTO `amapDistrictTable`
VALUES (2950, '0572', 330522, '长兴县', NULL, '119.910122,31.00475', 'district', 2946);
INSERT INTO `amapDistrictTable`
VALUES (2951, '0572', 330502, '吴兴区', NULL, '120.101416,30.867252', 'district', 2946);
INSERT INTO `amapDistrictTable`
VALUES (2952, '0570', 330800, '衢州市', NULL, '118.87263,28.941708', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2953, '0570', 330822, '常山县', NULL, '118.521654,28.900039', 'district', 2952);
INSERT INTO `amapDistrictTable`
VALUES (2954, '0570', 330824, '开化县', NULL, '118.414435,29.136503', 'district', 2952);
INSERT INTO `amapDistrictTable`
VALUES (2955, '0570', 330802, '柯城区', NULL, '118.873041,28.944539', 'district', 2952);
INSERT INTO `amapDistrictTable`
VALUES (2956, '0570', 330881, '江山市', NULL, '118.627879,28.734674', 'district', 2952);
INSERT INTO `amapDistrictTable`
VALUES (2957, '0570', 330803, '衢江区', NULL, '118.957683,28.973195', 'district', 2952);
INSERT INTO `amapDistrictTable`
VALUES (2958, '0570', 330825, '龙游县', NULL, '119.172525,29.031364', 'district', 2952);
INSERT INTO `amapDistrictTable`
VALUES (2959, '0571', 330100, '杭州市', NULL, '120.153576,30.287459', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2960, '0571', 330102, '上城区', NULL, '120.171465,30.250236', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2961, '0571', 330111, '富阳区', NULL, '119.949869,30.049871', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2962, '0571', 330122, '桐庐县', NULL, '119.685045,29.797437', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2963, '0571', 330182, '建德市', NULL, '119.279089,29.472284', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2964, '0571', 330127, '淳安县', NULL, '119.044276,29.604177', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2965, '0571', 330108, '滨江区', NULL, '120.21062,30.206615', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2966, '0571', 330112, '临安区', NULL, '119.715101,30.231153', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2967, '0571', 330109, '萧山区', NULL, '120.27069,30.162932', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2968, '0571', 330104, '江干区', NULL, '120.202633,30.266603', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2969, '0571', 330110, '余杭区', NULL, '120.301737,30.421187', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2970, '0571', 330106, '西湖区', NULL, '120.147376,30.272934', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2971, '0571', 330105, '拱墅区', NULL, '120.150053,30.314697', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2972, '0571', 330103, '下城区', NULL, '120.172763,30.276271', 'district', 2959);
INSERT INTO `amapDistrictTable`
VALUES (2973, '0579', 330700, '金华市', NULL, '119.649506,29.089524', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2974, '0579', 330726, '浦江县', NULL, '119.893363,29.451254', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2975, '0579', 330784, '永康市', NULL, '120.036328,28.895293', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2976, '0579', 330783, '东阳市', NULL, '120.23334,29.262546', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2977, '0579', 330723, '武义县', NULL, '119.819159,28.896563', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2978, '0579', 330781, '兰溪市', NULL, '119.460521,29.210065', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2979, '0579', 330727, '磐安县', NULL, '120.44513,29.052627', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2980, '0579', 330782, '义乌市', NULL, '120.074911,29.306863', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2981, '0579', 330703, '金东区', NULL, '119.681264,29.095835', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2982, '0579', 330702, '婺城区', NULL, '119.652579,29.082607', 'district', 2973);
INSERT INTO `amapDistrictTable`
VALUES (2983, '0575', 330600, '绍兴市', NULL, '120.582112,29.997117', 'city', 2888);
INSERT INTO `amapDistrictTable`
VALUES (2984, '0575', 330683, '嵊州市', NULL, '120.82888,29.586606', 'district', 2983);
INSERT INTO `amapDistrictTable`
VALUES (2985, '0575', 330602, '越城区', NULL, '120.585315,29.996993', 'district', 2983);
INSERT INTO `amapDistrictTable`
VALUES (2986, '0575', 330603, '柯桥区', NULL, '120.476075,30.078038', 'district', 2983);
INSERT INTO `amapDistrictTable`
VALUES (2987, '0575', 330681, '诸暨市', NULL, '120.244326,29.713662', 'district', 2983);
INSERT INTO `amapDistrictTable`
VALUES (2988, '0575', 330624, '新昌县', NULL, '120.905665,29.501205', 'district', 2983);
INSERT INTO `amapDistrictTable`
VALUES (2989, '0575', 330604, '上虞区', NULL, '120.874185,30.016769', 'district', 2983);
INSERT INTO `amapDistrictTable`
VALUES (2990, NULL, 360000, '江西省', NULL, '115.892151,28.676493', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (2991, '0794', 361000, '抚州市', NULL, '116.358351,27.98385', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (2992, '0794', 361003, '东乡区', NULL, '116.605341,28.2325', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (2993, '0794', 361024, '崇仁县', NULL, '116.059109,27.760907', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (2994, '0794', 361028, '资溪县', NULL, '117.066095,27.70653', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (2995, '0794', 361002, '临川区', NULL, '116.361404,27.981919', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (2996, '0794', 361026, '宜黄县', NULL, '116.223023,27.546512', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (2997, '0794', 361022, '黎川县', NULL, '116.91457,27.292561', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (2998, '0794', 361021, '南城县', NULL, '116.63945,27.55531', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (2999, '0794', 361027, '金溪县', NULL, '116.778751,27.907387', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (3000, '0794', 361025, '乐安县', NULL, '115.838432,27.420101', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (3001, '0794', 361023, '南丰县', NULL, '116.532994,27.210132', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (3002, '0794', 361030, '广昌县', NULL, '116.327291,26.838426', 'district', 2991);
INSERT INTO `amapDistrictTable`
VALUES (3003, '0792', 360400, '九江市', NULL, '115.992811,29.712034', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3004, '0792', 360430, '彭泽县', NULL, '116.55584,29.898865', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3005, '0792', 360429, '湖口县', NULL, '116.244313,29.7263', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3006, '0792', 360428, '都昌县', NULL, '116.205114,29.275105', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3007, '0792', 360404, '柴桑区', NULL, '115.892977,29.610264', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3008, '0792', 360423, '武宁县', NULL, '115.105646,29.260182', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3009, '0792', 360424, '修水县', NULL, '114.573428,29.032729', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3010, '0792', 360483, '庐山市', NULL, '116.043743,29.456169', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3011, '0792', 360402, '濂溪区', NULL, '115.99012,29.676175', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3012, '0792', 360403, '浔阳区', NULL, '115.995947,29.72465', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3013, '0792', 360425, '永修县', NULL, '115.809055,29.018212', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3014, '0792', 360482, '共青城市', NULL, '115.805712,29.247884', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3015, '0792', 360426, '德安县', NULL, '115.762611,29.327474', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3016, '0792', 360481, '瑞昌市', NULL, '115.669081,29.676599', 'district', 3003);
INSERT INTO `amapDistrictTable`
VALUES (3017, '0797', 360700, '赣州市', NULL, '114.940278,25.85097', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3018, '0797', 360732, '兴国县', NULL, '115.351896,26.330489', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3019, '0797', 360730, '宁都县', NULL, '116.018782,26.472054', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3020, '0797', 360735, '石城县', NULL, '116.342249,26.326582', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3021, '0797', 360725, '崇义县', NULL, '114.307348,25.687911', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3022, '0797', 360731, '于都县', NULL, '115.411198,25.955033', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3023, '0797', 360734, '寻乌县', NULL, '115.651399,24.954136', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3024, '0797', 360723, '大余县', NULL, '114.362243,25.395937', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3025, '0797', 360726, '安远县', NULL, '115.392328,25.134591', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3026, '0797', 360729, '全南县', NULL, '114.531589,24.742651', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3027, '0797', 360781, '瑞金市', NULL, '116.034854,25.875278', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3028, '0797', 360733, '会昌县', NULL, '115.791158,25.599125', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3029, '0797', 360722, '信丰县', NULL, '114.930893,25.38023', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3030, '0797', 360724, '上犹县', NULL, '114.540537,25.794284', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3031, '0797', 360728, '定南县', NULL, '115.03267,24.774277', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3032, '0797', 360703, '南康区', NULL, '114.756933,25.661721', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3033, '0797', 360727, '龙南县', NULL, '114.792657,24.90476', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3034, '0797', 360704, '赣县区', NULL, '115.018461,25.865432', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3035, '0797', 360702, '章贡区', NULL, '114.93872,25.851367', 'district', 3017);
INSERT INTO `amapDistrictTable`
VALUES (3036, '0701', 360600, '鹰潭市', NULL, '117.033838,28.238638', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3037, '0701', 360681, '贵溪市', NULL, '117.212103,28.283693', 'district', 3036);
INSERT INTO `amapDistrictTable`
VALUES (3038, '0701', 360603, '余江区', NULL, '116.822763,28.206177', 'district', 3036);
INSERT INTO `amapDistrictTable`
VALUES (3039, '0701', 360602, '月湖区', NULL, '117.034112,28.239076', 'district', 3036);
INSERT INTO `amapDistrictTable`
VALUES (3040, '0798', 360200, '景德镇市', NULL, '117.214664,29.29256', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3041, '0798', 360222, '浮梁县', NULL, '117.217611,29.352251', 'district', 3040);
INSERT INTO `amapDistrictTable`
VALUES (3042, '0798', 360203, '珠山区', NULL, '117.214814,29.292812', 'district', 3040);
INSERT INTO `amapDistrictTable`
VALUES (3043, '0798', 360202, '昌江区', NULL, '117.195023,29.288465', 'district', 3040);
INSERT INTO `amapDistrictTable`
VALUES (3044, '0798', 360281, '乐平市', NULL, '117.129376,28.967361', 'district', 3040);
INSERT INTO `amapDistrictTable`
VALUES (3045, '0793', 361100, '上饶市', NULL, '117.971185,28.44442', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3046, '0793', 361130, '婺源县', NULL, '117.86219,29.254015', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3047, '0793', 361181, '德兴市', NULL, '117.578732,28.945034', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3048, '0793', 361127, '余干县', NULL, '116.691072,28.69173', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3049, '0793', 361125, '横峰县', NULL, '117.608247,28.415103', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3050, '0793', 361126, '弋阳县', NULL, '117.435002,28.402391', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3051, '0793', 361103, '广丰区', NULL, '118.189852,28.440285', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3052, '0793', 361124, '铅山县', NULL, '117.711906,28.310892', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3053, '0793', 361123, '玉山县', NULL, '118.244408,28.673479', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3054, '0793', 361128, '鄱阳县', NULL, '116.673748,28.993374', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3055, '0793', 361129, '万年县', NULL, '117.07015,28.692589', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3056, '0793', 361104, '广信区', NULL, '117.90612,28.453897', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3057, '0793', 361102, '信州区', NULL, '117.970522,28.445378', 'district', 3045);
INSERT INTO `amapDistrictTable`
VALUES (3058, '0799', 360300, '萍乡市', NULL, '113.852186,27.622946', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3059, '0799', 360302, '安源区', NULL, '113.855044,27.625826', 'district', 3058);
INSERT INTO `amapDistrictTable`
VALUES (3060, '0799', 360323, '芦溪县', NULL, '114.041206,27.633633', 'district', 3058);
INSERT INTO `amapDistrictTable`
VALUES (3061, '0799', 360322, '上栗县', NULL, '113.800525,27.877041', 'district', 3058);
INSERT INTO `amapDistrictTable`
VALUES (3062, '0799', 360321, '莲花县', NULL, '113.955582,27.127807', 'district', 3058);
INSERT INTO `amapDistrictTable`
VALUES (3063, '0799', 360313, '湘东区', NULL, '113.7456,27.639319', 'district', 3058);
INSERT INTO `amapDistrictTable`
VALUES (3064, '0795', 360900, '宜春市', NULL, '114.391136,27.8043', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3065, '0795', 360921, '奉新县', NULL, '115.389899,28.700672', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3066, '0795', 360924, '宜丰县', NULL, '114.787381,28.388289', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3067, '0795', 360983, '高安市', NULL, '115.381527,28.420951', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3068, '0795', 360981, '丰城市', NULL, '115.786005,28.191584', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3069, '0795', 360923, '上高县', NULL, '114.932653,28.234789', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3070, '0795', 360926, '铜鼓县', NULL, '114.37014,28.520956', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3071, '0795', 360902, '袁州区', NULL, '114.387379,27.800117', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3072, '0795', 360922, '万载县', NULL, '114.449012,28.104528', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3073, '0795', 360982, '樟树市', NULL, '115.543388,28.055898', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3074, '0795', 360925, '靖安县', NULL, '115.361744,28.86054', 'district', 3064);
INSERT INTO `amapDistrictTable`
VALUES (3075, '0791', 360100, '南昌市', NULL, '115.892151,28.676493', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3076, '0791', 360124, '进贤县', NULL, '116.267671,28.365681', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3077, '0791', 360104, '青云谱区', NULL, '115.907292,28.635724', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3078, '0791', 360121, '南昌县', NULL, '115.942465,28.543781', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3079, '0791', 360103, '西湖区', NULL, '115.91065,28.662901', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3080, '0791', 360111, '青山湖区', NULL, '115.949044,28.689292', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3081, '0791', 360102, '东湖区', NULL, '115.889675,28.682988', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3082, '0791', 360112, '新建区', NULL, '115.820806,28.690788', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3083, '0791', 360113, '红谷滩区', NULL, '115.8580521,28.69819928', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3084, '0791', 360123, '安义县', NULL, '115.553109,28.841334', 'district', 3075);
INSERT INTO `amapDistrictTable`
VALUES (3085, '0796', 360800, '吉安市', NULL, '114.986373,27.111699', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3086, '0796', 360821, '吉安县', NULL, '114.905117,27.040042', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3087, '0796', 360825, '永丰县', NULL, '115.435559,27.321087', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3088, '0796', 360822, '吉水县', NULL, '115.134569,27.213445', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3089, '0796', 360830, '永新县', NULL, '114.242534,26.944721', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3090, '0796', 360827, '遂川县', NULL, '114.51689,26.323705', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3091, '0796', 360802, '吉州区', NULL, '114.987331,27.112367', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3092, '0796', 360828, '万安县', NULL, '114.784694,26.462085', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3093, '0796', 360803, '青原区', NULL, '115.016306,27.105879', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3094, '0796', 360829, '安福县', NULL, '114.61384,27.382746', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3095, '0796', 360824, '新干县', NULL, '115.399294,27.755758', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3096, '0796', 360823, '峡江县', NULL, '115.319331,27.580862', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3097, '0796', 360881, '井冈山市', NULL, '114.284421,26.745919', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3098, '0796', 360826, '泰和县', NULL, '114.901393,26.790164', 'district', 3085);
INSERT INTO `amapDistrictTable`
VALUES (3099, '0790', 360500, '新余市', NULL, '114.930835,27.810834', 'city', 2990);
INSERT INTO `amapDistrictTable`
VALUES (3100, '0790', 360521, '分宜县', NULL, '114.675262,27.811301', 'district', 3099);
INSERT INTO `amapDistrictTable`
VALUES (3101, '0790', 360502, '渝水区', NULL, '114.923923,27.819171', 'district', 3099);
INSERT INTO `amapDistrictTable`
VALUES (3102, '1886', 710000, '台湾省', NULL, '121.509062,25.044332', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3103, NULL, 130000, '河北省', NULL, '114.502461,38.045474', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3104, '0315', 130200, '唐山市', NULL, '118.175393,39.635113', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3105, '0315', 130281, '遵化市', NULL, '117.965875,40.188616', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3106, '0315', 130227, '迁西县', NULL, '118.305139,40.146238', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3107, '0315', 130283, '迁安市', NULL, '118.701933,40.012108', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3108, '0315', 130224, '滦南县', NULL, '118.681552,39.506201', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3109, '0315', 130209, '曹妃甸区', NULL, '118.446585,39.278277', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3110, '0315', 130284, '滦州市', NULL, '118.699546,39.74485', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3111, '0315', 130225, '乐亭县', NULL, '118.905341,39.42813', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3112, '0315', 130229, '玉田县', NULL, '117.753665,39.887323', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3113, '0315', 130202, '路南区', NULL, '118.210821,39.615162', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3114, '0315', 130207, '丰南区', NULL, '118.110793,39.56303', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3115, '0315', 130203, '路北区', NULL, '118.174736,39.628538', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3116, '0315', 130208, '丰润区', NULL, '118.155779,39.831363', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3117, '0315', 130204, '古冶区', NULL, '118.45429,39.715736', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3118, '0315', 130205, '开平区', NULL, '118.264425,39.676171', 'district', 3104);
INSERT INTO `amapDistrictTable`
VALUES (3119, '0316', 131000, '廊坊市', NULL, '116.704441,39.523927', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3120, '0316', 131028, '大厂回族自治县', NULL, '116.986501,39.889266', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3121, '0316', 131025, '大城县', NULL, '116.640735,38.699215', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3122, '0316', 131024, '香河县', NULL, '117.007161,39.757212', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3123, '0316', 131026, '文安县', NULL, '116.460107,38.866801', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3124, '0316', 131023, '永清县', NULL, '116.498089,39.319717', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3125, '0316', 131022, '固安县', NULL, '116.299894,39.436468', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3126, '0316', 131003, '广阳区', NULL, '116.713708,39.521931', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3127, '0316', 131082, '三河市', NULL, '117.077018,39.982778', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3128, '0316', 131002, '安次区', NULL, '116.694544,39.502569', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3129, '0316', 131081, '霸州市', NULL, '116.392021,39.117331', 'district', 3119);
INSERT INTO `amapDistrictTable`
VALUES (3130, '0335', 130300, '秦皇岛市', NULL, '119.586579,39.942531', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3131, '0335', 130321, '青龙满族自治县', NULL, '118.954555,40.406023', 'district', 3130);
INSERT INTO `amapDistrictTable`
VALUES (3132, '0335', 130324, '卢龙县', NULL, '118.881809,39.891639', 'district', 3130);
INSERT INTO `amapDistrictTable`
VALUES (3133, '0335', 130303, '山海关区', NULL, '119.753591,39.998023', 'district', 3130);
INSERT INTO `amapDistrictTable`
VALUES (3134, '0335', 130306, '抚宁区', NULL, '119.240651,39.887053', 'district', 3130);
INSERT INTO `amapDistrictTable`
VALUES (3135, '0335', 130302, '海港区', NULL, '119.596224,39.943458', 'district', 3130);
INSERT INTO `amapDistrictTable`
VALUES (3136, '0335', 130304, '北戴河区', NULL, '119.486286,39.825121', 'district', 3130);
INSERT INTO `amapDistrictTable`
VALUES (3137, '0335', 130322, '昌黎县', NULL, '119.164541,39.709729', 'district', 3130);
INSERT INTO `amapDistrictTable`
VALUES (3138, '0313', 130700, '张家口市', NULL, '114.884091,40.811901', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3139, '0313', 130722, '张北县', NULL, '114.715951,41.151713', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3140, '0313', 130723, '康保县', NULL, '114.615809,41.850046', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3141, '0313', 130724, '沽源县', NULL, '115.684836,41.667419', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3142, '0313', 130725, '尚义县', NULL, '113.977713,41.080091', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3143, '0313', 130709, '崇礼区', NULL, '115.281652,40.971302', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3144, '0313', 130708, '万全区', NULL, '114.736131,40.765136', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3145, '0313', 130732, '赤城县', NULL, '115.832708,40.912081', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3146, '0313', 130730, '怀来县', NULL, '115.520846,40.405405', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3147, '0313', 130706, '下花园区', NULL, '115.281002,40.488645', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3148, '0313', 130731, '涿鹿县', NULL, '115.219246,40.378701', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3149, '0313', 130705, '宣化区', NULL, '115.0632,40.609368', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3150, '0313', 130703, '桥西区', NULL, '114.882127,40.824385', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3151, '0313', 130702, '桥东区', NULL, '114.885658,40.813875', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3152, '0313', 130728, '怀安县', NULL, '114.422364,40.671274', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3153, '0313', 130726, '蔚县', NULL, '114.582695,39.837181', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3154, '0313', 130727, '阳原县', NULL, '114.167343,40.113419', 'district', 3138);
INSERT INTO `amapDistrictTable`
VALUES (3155, '0317', 130900, '沧州市', NULL, '116.857461,38.310582', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3156, '0317', 130982, '任丘市', NULL, '116.106764,38.706513', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3157, '0317', 130929, '献县', NULL, '116.123844,38.189661', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3158, '0317', 130902, '新华区', NULL, '116.873049,38.308273', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3159, '0317', 130903, '运河区', NULL, '116.840063,38.307405', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3160, '0317', 130924, '海兴县', NULL, '117.496606,38.141582', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3161, '0317', 130927, '南皮县', NULL, '116.709171,38.042439', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3162, '0317', 130923, '东光县', NULL, '116.542062,37.88655', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3163, '0317', 130928, '吴桥县', NULL, '116.391512,37.628182', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3164, '0317', 130983, '黄骅市', NULL, '117.343803,38.369238', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3165, '0317', 130922, '青县', NULL, '116.838384,38.569646', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3166, '0317', 130921, '沧县', NULL, '117.007478,38.219856', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3167, '0317', 130981, '泊头市', NULL, '116.570163,38.073479', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3168, '0317', 130984, '河间市', NULL, '116.089452,38.44149', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3169, '0317', 130926, '肃宁县', NULL, '115.835856,38.427102', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3170, '0317', 130930, '孟村回族自治县', NULL, '117.105104,38.057953', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3171, '0317', 130925, '盐山县', NULL, '117.229814,38.056141', 'district', 3155);
INSERT INTO `amapDistrictTable`
VALUES (3172, '0310', 130400, '邯郸市', NULL, '114.490686,36.612273', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3173, '0310', 130481, '武安市', NULL, '114.194581,36.696115', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3174, '0310', 130423, '临漳县', NULL, '114.610703,36.337604', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3175, '0310', 130434, '魏县', NULL, '114.93411,36.354248', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3176, '0310', 130406, '峰峰矿区', NULL, '114.209936,36.420487', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3177, '0310', 130407, '肥乡区', NULL, '114.805154,36.555778', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3178, '0310', 130426, '涉县', NULL, '113.673297,36.563143', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3179, '0310', 130431, '鸡泽县', NULL, '114.878517,36.914908', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3180, '0310', 130435, '曲周县', NULL, '114.957588,36.773398', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3181, '0310', 130427, '磁县', NULL, '114.38208,36.367673', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3182, '0310', 130404, '复兴区', NULL, '114.458242,36.615484', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3183, '0310', 130403, '丛台区', NULL, '114.494703,36.611082', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3184, '0310', 130408, '永年区', NULL, '114.496162,36.776413', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3185, '0310', 130402, '邯山区', NULL, '114.484989,36.603196', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3186, '0310', 130424, '成安县', NULL, '114.680356,36.443832', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3187, '0310', 130433, '馆陶县', NULL, '115.289057,36.539461', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3188, '0310', 130430, '邱县', NULL, '115.168584,36.81325', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3189, '0310', 130425, '大名县', NULL, '115.152586,36.283316', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3190, '0310', 130432, '广平县', NULL, '114.950859,36.483603', 'district', 3172);
INSERT INTO `amapDistrictTable`
VALUES (3191, '0319', 130500, '邢台市', NULL, '114.508851,37.0682', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3192, '0319', 130523, '内丘县', NULL, '114.511523,37.287663', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3193, '0319', 130524, '柏乡县', NULL, '114.693382,37.483596', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3194, '0319', 130530, '新河县', NULL, '115.247537,37.526216', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3195, '0319', 130527, '南和区', NULL, '114.691377,37.003812', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3196, '0319', 130581, '南宫市', NULL, '115.398102,37.359668', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3197, '0319', 130532, '平乡县', NULL, '115.029218,37.069404', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3198, '0319', 130582, '沙河市', NULL, '114.504902,36.861903', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3199, '0319', 130531, '广宗县', NULL, '115.142797,37.075548', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3200, '0319', 130534, '清河县', NULL, '115.668999,37.059991', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3201, '0319', 130522, '临城县', NULL, '114.506873,37.444009', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3202, '0319', 130533, '威县', NULL, '115.272749,36.983272', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3203, '0319', 130535, '临西县', NULL, '115.498684,36.8642', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3204, '0319', 130528, '宁晋县', NULL, '114.921027,37.618956', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3205, '0319', 130525, '隆尧县', NULL, '114.776348,37.350925', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3206, '0319', 130526, '任泽区', NULL, '114.684469,37.129952', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3207, '0319', 130529, '巨鹿县', NULL, '115.038782,37.21768', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3208, '0319', 130503, '信都区', NULL, '114.473687,37.068009', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3209, '0319', 130502, '襄都区', NULL, '114.507131,37.064125', 'district', 3191);
INSERT INTO `amapDistrictTable`
VALUES (3210, '0311', 130100, '石家庄市', NULL, '114.502461,38.045474', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3211, '0311', 130123, '正定县', NULL, '114.569887,38.147835', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3212, '0311', 130109, '藁城区', NULL, '114.849647,38.033767', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3213, '0311', 130131, '平山县', NULL, '114.184144,38.259311', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3214, '0311', 130126, '灵寿县', NULL, '114.37946,38.306546', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3215, '0311', 130130, '无极县', NULL, '114.977845,38.176376', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3216, '0311', 130127, '高邑县', NULL, '114.610699,37.605714', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3217, '0311', 130132, '元氏县', NULL, '114.52618,37.762514', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3218, '0311', 130129, '赞皇县', NULL, '114.387756,37.660199', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3219, '0311', 130104, '桥西区', NULL, '114.462931,38.028383', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3220, '0311', 130110, '鹿泉区', NULL, '114.321023,38.093994', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3221, '0311', 130108, '裕华区', NULL, '114.533257,38.027696', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3222, '0311', 130102, '长安区', NULL, '114.548151,38.047501', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3223, '0311', 130183, '晋州市', NULL, '115.044886,38.027478', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3224, '0311', 130121, '井陉县', NULL, '114.144488,38.033614', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3225, '0311', 130107, '井陉矿区', NULL, '114.058178,38.069748', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3226, '0311', 130181, '辛集市', NULL, '115.217451,37.92904', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3227, '0311', 130184, '新乐市', NULL, '114.68578,38.344768', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3228, '0311', 130105, '新华区', NULL, '114.465974,38.067142', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3229, '0311', 130128, '深泽县', NULL, '115.200207,38.18454', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3230, '0311', 130133, '赵县', NULL, '114.775362,37.754341', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3231, '0311', 130111, '栾城区', NULL, '114.654281,37.886911', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3232, '0311', 130125, '行唐县', NULL, '114.552734,38.437422', 'district', 3210);
INSERT INTO `amapDistrictTable`
VALUES (3233, '0318', 131100, '衡水市', NULL, '115.665993,37.735097', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3234, '0318', 131122, '武邑县', NULL, '115.892415,37.803774', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3235, '0318', 131123, '武强县', NULL, '115.970236,38.03698', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3236, '0318', 131121, '枣强县', NULL, '115.726499,37.511512', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3237, '0318', 131102, '桃城区', NULL, '115.694945,37.732237', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3238, '0318', 131182, '深州市', NULL, '115.554596,38.00347', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3239, '0318', 131128, '阜城县', NULL, '116.164727,37.869945', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3240, '0318', 131125, '安平县', NULL, '115.519627,38.233511', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3241, '0318', 131124, '饶阳县', NULL, '115.726577,38.232671', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3242, '0318', 131103, '冀州区', NULL, '115.579173,37.542788', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3243, '0318', 131127, '景县', NULL, '116.258446,37.686622', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3244, '0318', 131126, '故城县', NULL, '115.966747,37.350981', 'district', 3233);
INSERT INTO `amapDistrictTable`
VALUES (3245, '0312', 130600, '保定市', NULL, '115.482331,38.867657', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3246, '0312', 130630, '涞源县', NULL, '114.692567,39.35755', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3247, '0312', 130632, '安新县', NULL, '115.931979,38.929912', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3248, '0312', 130633, '易县', NULL, '115.501146,39.35297', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3249, '0312', 130609, '徐水区', NULL, '115.64941,39.020395', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3250, '0312', 130636, '顺平县', NULL, '115.132749,38.845127', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3251, '0312', 130628, '高阳县', NULL, '115.778878,38.690092', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3252, '0312', 130602, '竞秀区', NULL, '115.470659,38.88662', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3253, '0312', 130607, '满城区', NULL, '115.32442,38.95138', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3254, '0312', 130682, '定州市', NULL, '114.991389,38.517602', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3255, '0312', 130683, '安国市', NULL, '115.33141,38.421367', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3256, '0312', 130606, '莲池区', NULL, '115.500934,38.865005', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3257, '0312', 130623, '涞水县', NULL, '115.711985,39.393148', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3258, '0312', 130681, '涿州市', NULL, '115.973409,39.485765', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3259, '0312', 130637, '博野县', NULL, '115.461798,38.458271', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3260, '0312', 130635, '蠡县', NULL, '115.583631,38.496429', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3261, '0312', 130624, '阜平县', NULL, '114.198801,38.847276', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3262, '0312', 130608, '清苑区', NULL, '115.492221,38.771012', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3263, '0312', 130631, '望都县', NULL, '115.154009,38.707448', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3264, '0312', 130634, '曲阳县', NULL, '114.704055,38.619992', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3265, '0312', 130627, '唐县', NULL, '114.981241,38.748542', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3266, '0312', 130684, '高碑店市', NULL, '115.882704,39.327689', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3267, '0312', 130629, '容城县', NULL, '115.866247,39.05282', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3268, '0312', 130626, '定兴县', NULL, '115.796895,39.266195', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3269, '0312', 130638, '雄县', NULL, '116.107474,38.990819', 'district', 3245);
INSERT INTO `amapDistrictTable`
VALUES (3270, '0314', 130800, '承德市', NULL, '117.939152,40.976204', 'city', 3103);
INSERT INTO `amapDistrictTable`
VALUES (3271, '0314', 130828, '围场满族蒙古族自治县', NULL, '117.764086,41.949404', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3272, '0314', 130826, '丰宁满族自治县', NULL, '116.65121,41.209903', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3273, '0314', 130825, '隆化县', NULL, '117.736343,41.316667', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3274, '0314', 130827, '宽城满族自治县', NULL, '118.488642,40.607981', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3275, '0314', 130804, '鹰手营子矿区', NULL, '117.661154,40.546956', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3276, '0314', 130881, '平泉市', NULL, '118.690238,41.00561', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3277, '0314', 130822, '兴隆县', NULL, '117.507098,40.418525', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3278, '0314', 130824, '滦平县', NULL, '117.337124,40.936644', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3279, '0314', 130803, '双滦区', NULL, '117.797485,40.959756', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3280, '0314', 130802, '双桥区', NULL, '117.939152,40.976204', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3281, '0314', 130821, '承德县', NULL, '118.172496,40.768637', 'district', 3270);
INSERT INTO `amapDistrictTable`
VALUES (3282, '1852', 810000, '香港特别行政区', NULL, '114.173355,22.320048', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3283, '1852', 810016, '沙田区', NULL, '114.1953653,22.37953167', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3284, '1852', 810005, '油尖旺区', NULL, '114.1733317,22.31170389', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3285, '1852', 810009, '观塘区', NULL, '114.2140542,22.32083778', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3286, '1852', 810011, '屯门区', NULL, '113.9765742,22.39384417', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3287, '1852', 810014, '大埔区', NULL, '114.1717431,22.44565306', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3288, '1852', 810004, '南区', NULL, '114.1600117,22.24589667', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3289, '1852', 810007, '九龙城区', NULL, '114.1928467,22.31251', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3290, '1852', 810015, '西贡区', NULL, '114.264645,22.31421306', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3291, '1852', 810006, '深水埗区', NULL, '114.1632417,22.33385417', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3292, '1852', 810008, '黄大仙区', NULL, '114.2038856,22.33632056', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3293, '1852', 810001, '中西区', NULL, '114.1543731,22.28198083', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3294, '1852', 810013, '北区', NULL, '114.1473639,22.49610389', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3295, '1852', 810012, '元朗区', NULL, '114.0324381,22.44142833', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3296, '1852', 810002, '湾仔区', NULL, '114.1829153,22.27638889', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3297, '1852', 810018, '离岛区', NULL, '113.94612,22.28640778', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3298, '1852', 810003, '东区', NULL, '114.2260031,22.27969306', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3299, '1852', 810010, '荃湾区', NULL, '114.1210792,22.36830667', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3300, '1852', 810017, '葵青区', NULL, '114.1393194,22.36387667', 'district', 3282);
INSERT INTO `amapDistrictTable`
VALUES (3301, '1853', 820000, '澳门特别行政区', NULL, '113.54909,22.198951', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3302, '1853', 820001, '花地玛堂区', NULL, '113.5528956,22.20787', 'district', 3301);
INSERT INTO `amapDistrictTable`
VALUES (3303, '1853', 820007, '路凼填海区', NULL, '113.5695992,22.13663', 'district', 3301);
INSERT INTO `amapDistrictTable`
VALUES (3304, '1853', 820003, '望德堂区', NULL, '113.5501828,22.19372083', 'district', 3301);
INSERT INTO `amapDistrictTable`
VALUES (3305, '1853', 820002, '花王堂区', NULL, '113.5489608,22.1992075', 'district', 3301);
INSERT INTO `amapDistrictTable`
VALUES (3306, '1853', 820004, '大堂区', NULL, '113.5536475,22.18853944', 'district', 3301);
INSERT INTO `amapDistrictTable`
VALUES (3307, '1853', 820008, '圣方济各堂区', NULL, '113.5599542,22.12348639', 'district', 3301);
INSERT INTO `amapDistrictTable`
VALUES (3308, '1853', 820006, '嘉模堂区', NULL, '113.5587044,22.15375944', 'district', 3301);
INSERT INTO `amapDistrictTable`
VALUES (3309, '1853', 820005, '风顺堂区', NULL, '113.5419278,22.18736806', 'district', 3301);
INSERT INTO `amapDistrictTable`
VALUES (3310, NULL, 620000, '甘肃省', NULL, '103.823557,36.058039', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3311, '0935', 620300, '金昌市', NULL, '102.187888,38.514238', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3312, '0935', 620321, '永昌县', NULL, '101.971957,38.247354', 'district', 3311);
INSERT INTO `amapDistrictTable`
VALUES (3313, '0935', 620302, '金川区', NULL, '102.187683,38.513793', 'district', 3311);
INSERT INTO `amapDistrictTable`
VALUES (3314, '0943', 620400, '白银市', NULL, '104.173606,36.54568', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3315, '0943', 620421, '靖远县', NULL, '104.686972,36.561424', 'district', 3314);
INSERT INTO `amapDistrictTable`
VALUES (3316, '0943', 620403, '平川区', NULL, '104.819207,36.72921', 'district', 3314);
INSERT INTO `amapDistrictTable`
VALUES (3317, '0943', 620402, '白银区', NULL, '104.17425,36.545649', 'district', 3314);
INSERT INTO `amapDistrictTable`
VALUES (3318, '0943', 620423, '景泰县', NULL, '104.066394,37.193519', 'district', 3314);
INSERT INTO `amapDistrictTable`
VALUES (3319, '0943', 620422, '会宁县', NULL, '105.054337,35.692486', 'district', 3314);
INSERT INTO `amapDistrictTable`
VALUES (3320, '0937', 620900, '酒泉市', NULL, '98.510795,39.744023', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3321, '0937', 620921, '金塔县', NULL, '98.902959,39.983036', 'district', 3320);
INSERT INTO `amapDistrictTable`
VALUES (3322, '0937', 620923, '肃北蒙古族自治县', NULL, '94.87728,39.51224', 'district', 3320);
INSERT INTO `amapDistrictTable`
VALUES (3323, '0937', 620981, '玉门市', NULL, '97.037206,40.28682', 'district', 3320);
INSERT INTO `amapDistrictTable`
VALUES (3324, '0937', 620982, '敦煌市', NULL, '94.664279,40.141119', 'district', 3320);
INSERT INTO `amapDistrictTable`
VALUES (3325, '0937', 620902, '肃州区', NULL, '98.511155,39.743858', 'district', 3320);
INSERT INTO `amapDistrictTable`
VALUES (3326, '0937', 620922, '瓜州县', NULL, '95.780591,40.516525', 'district', 3320);
INSERT INTO `amapDistrictTable`
VALUES (3327, '0937', 620924, '阿克塞哈萨克族自治县', NULL, '94.337642,39.631642', 'district', 3320);
INSERT INTO `amapDistrictTable`
VALUES (3328, '2935', 621200, '陇南市', NULL, '104.929379,33.388598', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3329, '2935', 621226, '礼县', NULL, '105.181616,34.189387', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3330, '2935', 621223, '宕昌县', NULL, '104.394475,34.042655', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3331, '2935', 621202, '武都区', NULL, '104.929866,33.388155', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3332, '2935', 621224, '康县', NULL, '105.609534,33.328266', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3333, '2935', 621228, '两当县', NULL, '106.306959,33.910729', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3334, '2935', 621227, '徽县', NULL, '106.085632,33.767785', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3335, '2935', 621221, '成县', NULL, '105.734434,33.739863', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3336, '2935', 621222, '文县', NULL, '104.682448,32.942171', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3337, '2935', 621225, '西和县', NULL, '105.299737,34.013718', 'district', 3328);
INSERT INTO `amapDistrictTable`
VALUES (3338, '0933', 620800, '平凉市', NULL, '106.684691,35.54279', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3339, '0933', 620822, '灵台县', NULL, '107.620587,35.064009', 'district', 3338);
INSERT INTO `amapDistrictTable`
VALUES (3340, '0933', 620802, '崆峒区', NULL, '106.684223,35.54173', 'district', 3338);
INSERT INTO `amapDistrictTable`
VALUES (3341, '0933', 620825, '庄浪县', NULL, '106.041979,35.203428', 'district', 3338);
INSERT INTO `amapDistrictTable`
VALUES (3342, '0933', 620823, '崇信县', NULL, '107.031253,35.304533', 'district', 3338);
INSERT INTO `amapDistrictTable`
VALUES (3343, '0933', 620826, '静宁县', NULL, '105.733489,35.525243', 'district', 3338);
INSERT INTO `amapDistrictTable`
VALUES (3344, '0933', 620881, '华亭市', NULL, '106.649308,35.215341', 'district', 3338);
INSERT INTO `amapDistrictTable`
VALUES (3345, '0933', 620821, '泾川县', NULL, '107.365218,35.335283', 'district', 3338);
INSERT INTO `amapDistrictTable`
VALUES (3346, '1935', 620600, '武威市', NULL, '102.634697,37.929996', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3347, '1935', 620622, '古浪县', NULL, '102.898047,37.470571', 'district', 3346);
INSERT INTO `amapDistrictTable`
VALUES (3348, '1935', 620602, '凉州区', NULL, '102.634492,37.93025', 'district', 3346);
INSERT INTO `amapDistrictTable`
VALUES (3349, '1935', 620623, '天祝藏族自治县', NULL, '103.142034,36.971678', 'district', 3346);
INSERT INTO `amapDistrictTable`
VALUES (3350, '1935', 620621, '民勤县', NULL, '103.090654,38.624621', 'district', 3346);
INSERT INTO `amapDistrictTable`
VALUES (3351, '0931', 620100, '兰州市', NULL, '103.823557,36.058039', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3352, '0931', 620121, '永登县', NULL, '103.262203,36.734428', 'district', 3351);
INSERT INTO `amapDistrictTable`
VALUES (3353, '0931', 620122, '皋兰县', NULL, '103.94933,36.331254', 'district', 3351);
INSERT INTO `amapDistrictTable`
VALUES (3354, '0931', 620104, '西固区', NULL, '103.622331,36.100369', 'district', 3351);
INSERT INTO `amapDistrictTable`
VALUES (3355, '0931', 620111, '红古区', NULL, '102.861814,36.344177', 'district', 3351);
INSERT INTO `amapDistrictTable`
VALUES (3356, '0931', 620105, '安宁区', NULL, '103.724038,36.10329', 'district', 3351);
INSERT INTO `amapDistrictTable`
VALUES (3357, '0931', 620102, '城关区', NULL, '103.841032,36.049115', 'district', 3351);
INSERT INTO `amapDistrictTable`
VALUES (3358, '0931', 620103, '七里河区', NULL, '103.784326,36.06673', 'district', 3351);
INSERT INTO `amapDistrictTable`
VALUES (3359, '0931', 620123, '榆中县', NULL, '104.114975,35.84443', 'district', 3351);
INSERT INTO `amapDistrictTable`
VALUES (3360, '1937', 620200, '嘉峪关市', NULL, '98.277304,39.786529', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3361, '1937', 620200, '峪泉镇', NULL, '98.3204,39.9583', 'street', 3360);
INSERT INTO `amapDistrictTable`
VALUES (3362, '1937', 620200, '新城镇', NULL, '98.3627,39.9581', 'street', 3360);
INSERT INTO `amapDistrictTable`
VALUES (3363, '1937', 620200, '文殊镇', NULL, '98.1579,39.6969', 'street', 3360);
INSERT INTO `amapDistrictTable`
VALUES (3364, '1937', 620200, '雄关街道', NULL, '98.2391,39.893', 'street', 3360);
INSERT INTO `amapDistrictTable`
VALUES (3365, '1937', 620200, '钢城街道', NULL, '98.2926,39.7558', 'street', 3360);
INSERT INTO `amapDistrictTable`
VALUES (3366, '0941', 623000, '甘南藏族自治州', NULL, '102.911008,34.986354', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3367, '0941', 623022, '卓尼县', NULL, '103.508508,34.588165', 'district', 3366);
INSERT INTO `amapDistrictTable`
VALUES (3368, '0941', 623027, '夏河县', NULL, '102.520743,35.200853', 'district', 3366);
INSERT INTO `amapDistrictTable`
VALUES (3369, '0941', 623001, '合作市', NULL, '102.91149,34.985973', 'district', 3366);
INSERT INTO `amapDistrictTable`
VALUES (3370, '0941', 623021, '临潭县', NULL, '103.353054,34.69164', 'district', 3366);
INSERT INTO `amapDistrictTable`
VALUES (3371, '0941', 623025, '玛曲县', NULL, '102.075767,33.998068', 'district', 3366);
INSERT INTO `amapDistrictTable`
VALUES (3372, '0941', 623024, '迭部县', NULL, '103.221009,34.055348', 'district', 3366);
INSERT INTO `amapDistrictTable`
VALUES (3373, '0941', 623023, '舟曲县', NULL, '104.370271,33.782964', 'district', 3366);
INSERT INTO `amapDistrictTable`
VALUES (3374, '0941', 623026, '碌曲县', NULL, '102.488495,34.589591', 'district', 3366);
INSERT INTO `amapDistrictTable`
VALUES (3375, '0930', 622900, '临夏回族自治州', NULL, '103.212006,35.599446', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3376, '0930', 622927, '积石山保安族东乡族撒拉族自治县', NULL, '102.877473,35.712906', 'district', 3375);
INSERT INTO `amapDistrictTable`
VALUES (3377, '0930', 622926, '东乡族自治县', NULL, '103.389568,35.66383', 'district', 3375);
INSERT INTO `amapDistrictTable`
VALUES (3378, '0930', 622923, '永靖县', NULL, '103.319871,35.938933', 'district', 3375);
INSERT INTO `amapDistrictTable`
VALUES (3379, '0930', 622901, '临夏市', NULL, '103.211634,35.59941', 'district', 3375);
INSERT INTO `amapDistrictTable`
VALUES (3380, '0930', 622921, '临夏县', NULL, '102.993873,35.49236', 'district', 3375);
INSERT INTO `amapDistrictTable`
VALUES (3381, '0930', 622924, '广河县', NULL, '103.576188,35.481688', 'district', 3375);
INSERT INTO `amapDistrictTable`
VALUES (3382, '0930', 622925, '和政县', NULL, '103.350357,35.425971', 'district', 3375);
INSERT INTO `amapDistrictTable`
VALUES (3383, '0930', 622922, '康乐县', NULL, '103.709852,35.371906', 'district', 3375);
INSERT INTO `amapDistrictTable`
VALUES (3384, '0936', 620700, '张掖市', NULL, '100.455472,38.932897', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3385, '0936', 620724, '高台县', NULL, '99.81665,39.376308', 'district', 3384);
INSERT INTO `amapDistrictTable`
VALUES (3386, '0936', 620721, '肃南裕固族自治县', NULL, '99.617086,38.837269', 'district', 3384);
INSERT INTO `amapDistrictTable`
VALUES (3387, '0936', 620722, '民乐县', NULL, '100.816623,38.434454', 'district', 3384);
INSERT INTO `amapDistrictTable`
VALUES (3388, '0936', 620725, '山丹县', NULL, '101.088442,38.784839', 'district', 3384);
INSERT INTO `amapDistrictTable`
VALUES (3389, '0936', 620723, '临泽县', NULL, '100.166333,39.152151', 'district', 3384);
INSERT INTO `amapDistrictTable`
VALUES (3390, '0936', 620702, '甘州区', NULL, '100.454862,38.931774', 'district', 3384);
INSERT INTO `amapDistrictTable`
VALUES (3391, '0934', 621000, '庆阳市', NULL, '107.638372,35.734218', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3392, '0934', 621025, '正宁县', NULL, '108.361068,35.490642', 'district', 3391);
INSERT INTO `amapDistrictTable`
VALUES (3393, '0934', 621027, '镇原县', NULL, '107.195706,35.677806', 'district', 3391);
INSERT INTO `amapDistrictTable`
VALUES (3394, '0934', 621023, '华池县', NULL, '107.986288,36.457304', 'district', 3391);
INSERT INTO `amapDistrictTable`
VALUES (3395, '0934', 621022, '环县', NULL, '107.308754,36.569322', 'district', 3391);
INSERT INTO `amapDistrictTable`
VALUES (3396, '0934', 621026, '宁县', NULL, '107.921182,35.50201', 'district', 3391);
INSERT INTO `amapDistrictTable`
VALUES (3397, '0934', 621002, '西峰区', NULL, '107.638824,35.733713', 'district', 3391);
INSERT INTO `amapDistrictTable`
VALUES (3398, '0934', 621021, '庆城县', NULL, '107.885664,36.013504', 'district', 3391);
INSERT INTO `amapDistrictTable`
VALUES (3399, '0934', 621024, '合水县', NULL, '108.019865,35.819005', 'district', 3391);
INSERT INTO `amapDistrictTable`
VALUES (3400, '0932', 621100, '定西市', NULL, '104.626294,35.579578', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3401, '0932', 621123, '渭源县', NULL, '104.211742,35.133023', 'district', 3400);
INSERT INTO `amapDistrictTable`
VALUES (3402, '0932', 621124, '临洮县', NULL, '103.862186,35.376233', 'district', 3400);
INSERT INTO `amapDistrictTable`
VALUES (3403, '0932', 621126, '岷县', NULL, '104.039882,34.439105', 'district', 3400);
INSERT INTO `amapDistrictTable`
VALUES (3404, '0932', 621125, '漳县', NULL, '104.466756,34.848642', 'district', 3400);
INSERT INTO `amapDistrictTable`
VALUES (3405, '0932', 621102, '安定区', NULL, '104.62577,35.579764', 'district', 3400);
INSERT INTO `amapDistrictTable`
VALUES (3406, '0932', 621122, '陇西县', NULL, '104.637554,35.003409', 'district', 3400);
INSERT INTO `amapDistrictTable`
VALUES (3407, '0932', 621121, '通渭县', NULL, '105.250102,35.208922', 'district', 3400);
INSERT INTO `amapDistrictTable`
VALUES (3408, '0938', 620500, '天水市', NULL, '105.724998,34.578529', 'city', 3310);
INSERT INTO `amapDistrictTable`
VALUES (3409, '0938', 620523, '甘谷县', NULL, '105.332347,34.747327', 'district', 3408);
INSERT INTO `amapDistrictTable`
VALUES (3410, '0938', 620522, '秦安县', NULL, '105.6733,34.862354', 'district', 3408);
INSERT INTO `amapDistrictTable`
VALUES (3411, '0938', 620502, '秦州区', NULL, '105.724477,34.578645', 'district', 3408);
INSERT INTO `amapDistrictTable`
VALUES (3412, '0938', 620503, '麦积区', NULL, '105.897631,34.563504', 'district', 3408);
INSERT INTO `amapDistrictTable`
VALUES (3413, '0938', 620525, '张家川回族自治县', NULL, '106.212416,34.993237', 'district', 3408);
INSERT INTO `amapDistrictTable`
VALUES (3414, '0938', 620521, '清水县', NULL, '106.139878,34.75287', 'district', 3408);
INSERT INTO `amapDistrictTable`
VALUES (3415, '0938', 620524, '武山县', NULL, '104.891696,34.721955', 'district', 3408);
INSERT INTO `amapDistrictTable`
VALUES (3416, NULL, 510000, '四川省', NULL, '104.065735,30.659462', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3417, '0827', 511900, '巴中市', NULL, '106.753669,31.858809', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3418, '0827', 511902, '巴州区', NULL, '106.753671,31.858366', 'district', 3417);
INSERT INTO `amapDistrictTable`
VALUES (3419, '0827', 511923, '平昌县', NULL, '107.101937,31.562814', 'district', 3417);
INSERT INTO `amapDistrictTable`
VALUES (3420, '0827', 511921, '通江县', NULL, '107.247621,31.91212', 'district', 3417);
INSERT INTO `amapDistrictTable`
VALUES (3421, '0827', 511922, '南江县', NULL, '106.843418,32.353164', 'district', 3417);
INSERT INTO `amapDistrictTable`
VALUES (3422, '0827', 511903, '恩阳区', NULL, '106.486515,31.816336', 'district', 3417);
INSERT INTO `amapDistrictTable`
VALUES (3423, '028', 510100, '成都市', NULL, '104.065735,30.659462', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3424, '028', 510182, '彭州市', NULL, '103.941173,30.985161', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3425, '028', 510181, '都江堰市', NULL, '103.627898,30.99114', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3426, '028', 510129, '大邑县', NULL, '103.522397,30.586602', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3427, '028', 510131, '蒲江县', NULL, '103.511541,30.194359', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3428, '028', 510113, '青白江区', NULL, '104.25494,30.883438', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3429, '028', 510185, '简阳市', NULL, '104.550339,30.390666', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3430, '028', 510184, '崇州市', NULL, '103.671049,30.631478', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3431, '028', 510121, '金堂县', NULL, '104.415604,30.858417', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3432, '028', 510183, '邛崃市', NULL, '103.46143,30.413271', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3433, '028', 510132, '新津区', NULL, '103.812449,30.414284', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3434, '028', 510115, '温江区', NULL, '103.836776,30.697996', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3435, '028', 510117, '郫都区', NULL, '103.887842,30.808752', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3436, '028', 510116, '双流区', NULL, '103.922706,30.573243', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3437, '028', 510107, '武侯区', NULL, '104.05167,30.630862', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3438, '028', 510106, '金牛区', NULL, '104.043487,30.692058', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3439, '028', 510114, '新都区', NULL, '104.16022,30.824223', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3440, '028', 510112, '龙泉驿区', NULL, '104.269181,30.56065', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3441, '028', 510108, '成华区', NULL, '104.103077,30.660275', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3442, '028', 510105, '青羊区', NULL, '104.055731,30.667648', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3443, '028', 510104, '锦江区', NULL, '104.080989,30.657689', 'district', 3423);
INSERT INTO `amapDistrictTable`
VALUES (3444, '0838', 510600, '德阳市', NULL, '104.398651,31.127991', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3445, '0838', 510682, '什邡市', NULL, '104.173653,31.126881', 'district', 3444);
INSERT INTO `amapDistrictTable`
VALUES (3446, '0838', 510623, '中江县', NULL, '104.677831,31.03681', 'district', 3444);
INSERT INTO `amapDistrictTable`
VALUES (3447, '0838', 510681, '广汉市', NULL, '104.281903,30.97715', 'district', 3444);
INSERT INTO `amapDistrictTable`
VALUES (3448, '0838', 510603, '旌阳区', NULL, '104.389648,31.130428', 'district', 3444);
INSERT INTO `amapDistrictTable`
VALUES (3449, '0838', 510604, '罗江区', NULL, '104.507126,31.303281', 'district', 3444);
INSERT INTO `amapDistrictTable`
VALUES (3450, '0838', 510683, '绵竹市', NULL, '104.200162,31.343084', 'district', 3444);
INSERT INTO `amapDistrictTable`
VALUES (3451, '0839', 510800, '广元市', NULL, '105.829757,32.433668', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3452, '0839', 510811, '昭化区', NULL, '105.964121,32.322788', 'district', 3451);
INSERT INTO `amapDistrictTable`
VALUES (3453, '0839', 510823, '剑阁县', NULL, '105.527035,32.286517', 'district', 3451);
INSERT INTO `amapDistrictTable`
VALUES (3454, '0839', 510812, '朝天区', NULL, '105.88917,32.642632', 'district', 3451);
INSERT INTO `amapDistrictTable`
VALUES (3455, '0839', 510824, '苍溪县', NULL, '105.939706,31.732251', 'district', 3451);
INSERT INTO `amapDistrictTable`
VALUES (3456, '0839', 510821, '旺苍县', NULL, '106.290426,32.22833', 'district', 3451);
INSERT INTO `amapDistrictTable`
VALUES (3457, '0839', 510822, '青川县', NULL, '105.238847,32.585655', 'district', 3451);
INSERT INTO `amapDistrictTable`
VALUES (3458, '0839', 510802, '利州区', NULL, '105.826194,32.432276', 'district', 3451);
INSERT INTO `amapDistrictTable`
VALUES (3459, '0825', 510900, '遂宁市', NULL, '105.571331,30.513311', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3460, '0825', 510923, '大英县', NULL, '105.252187,30.581571', 'district', 3459);
INSERT INTO `amapDistrictTable`
VALUES (3461, '0825', 510981, '射洪市', NULL, '105.381849,30.868752', 'district', 3459);
INSERT INTO `amapDistrictTable`
VALUES (3462, '0825', 510921, '蓬溪县', NULL, '105.713699,30.774883', 'district', 3459);
INSERT INTO `amapDistrictTable`
VALUES (3463, '0825', 510904, '安居区', NULL, '105.459383,30.346121', 'district', 3459);
INSERT INTO `amapDistrictTable`
VALUES (3464, '0825', 510903, '船山区', NULL, '105.582215,30.502647', 'district', 3459);
INSERT INTO `amapDistrictTable`
VALUES (3465, '0832', 512000, '资阳市', NULL, '104.641917,30.122211', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3466, '0832', 512021, '安岳县', NULL, '105.336764,30.099206', 'district', 3465);
INSERT INTO `amapDistrictTable`
VALUES (3467, '0832', 512002, '雁江区', NULL, '104.642338,30.121686', 'district', 3465);
INSERT INTO `amapDistrictTable`
VALUES (3468, '0832', 512022, '乐至县', NULL, '105.031142,30.275619', 'district', 3465);
INSERT INTO `amapDistrictTable`
VALUES (3469, '0816', 510700, '绵阳市', NULL, '104.741722,31.46402', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3470, '0816', 510704, '游仙区', NULL, '104.770006,31.484772', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3471, '0816', 510725, '梓潼县', NULL, '105.16353,31.635225', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3472, '0816', 510722, '三台县', NULL, '105.090316,31.090909', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3473, '0816', 510781, '江油市', NULL, '104.744431,31.776386', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3474, '0816', 510723, '盐亭县', NULL, '105.391991,31.22318', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3475, '0816', 510726, '北川羌族自治县', NULL, '104.468069,31.615863', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3476, '0816', 510705, '安州区', NULL, '104.560341,31.53894', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3477, '0816', 510703, '涪城区', NULL, '104.740971,31.463557', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3478, '0816', 510727, '平武县', NULL, '104.530555,32.407588', 'district', 3469);
INSERT INTO `amapDistrictTable`
VALUES (3479, '0826', 511600, '广安市', NULL, '106.633369,30.456398', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3480, '0826', 511623, '邻水县', NULL, '106.934968,30.334323', 'district', 3479);
INSERT INTO `amapDistrictTable`
VALUES (3481, '0826', 511622, '武胜县', NULL, '106.292473,30.344291', 'district', 3479);
INSERT INTO `amapDistrictTable`
VALUES (3482, '0826', 511602, '广安区', NULL, '106.632907,30.456462', 'district', 3479);
INSERT INTO `amapDistrictTable`
VALUES (3483, '0826', 511681, '华蓥市', NULL, '106.777882,30.380574', 'district', 3479);
INSERT INTO `amapDistrictTable`
VALUES (3484, '0826', 511603, '前锋区', NULL, '106.893277,30.4963', 'district', 3479);
INSERT INTO `amapDistrictTable`
VALUES (3485, '0826', 511621, '岳池县', NULL, '106.444451,30.533538', 'district', 3479);
INSERT INTO `amapDistrictTable`
VALUES (3486, '0818', 511700, '达州市', NULL, '107.502262,31.209484', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3487, '0818', 511724, '大竹县', NULL, '107.20742,30.736289', 'district', 3486);
INSERT INTO `amapDistrictTable`
VALUES (3488, '0818', 511725, '渠县', NULL, '106.970746,30.836348', 'district', 3486);
INSERT INTO `amapDistrictTable`
VALUES (3489, '0818', 511722, '宣汉县', NULL, '107.722254,31.355025', 'district', 3486);
INSERT INTO `amapDistrictTable`
VALUES (3490, '0818', 511723, '开江县', NULL, '107.864135,31.085537', 'district', 3486);
INSERT INTO `amapDistrictTable`
VALUES (3491, '0818', 511781, '万源市', NULL, '108.037548,32.06777', 'district', 3486);
INSERT INTO `amapDistrictTable`
VALUES (3492, '0818', 511702, '通川区', NULL, '107.501062,31.213522', 'district', 3486);
INSERT INTO `amapDistrictTable`
VALUES (3493, '0818', 511703, '达川区', NULL, '107.507926,31.199062', 'district', 3486);
INSERT INTO `amapDistrictTable`
VALUES (3494, '0817', 511300, '南充市', NULL, '106.082974,30.795281', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3495, '0817', 511323, '蓬安县', NULL, '106.413488,31.027978', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3496, '0817', 511325, '西充县', NULL, '105.893021,30.994616', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3497, '0817', 511322, '营山县', NULL, '106.564893,31.075907', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3498, '0817', 511321, '南部县', NULL, '106.061138,31.349407', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3499, '0817', 511304, '嘉陵区', NULL, '106.067027,30.762976', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3500, '0817', 511324, '仪陇县', NULL, '106.297083,31.271261', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3501, '0817', 511303, '高坪区', NULL, '106.108996,30.781809', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3502, '0817', 511302, '顺庆区', NULL, '106.084091,30.795572', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3503, '0817', 511381, '阆中市', NULL, '105.975266,31.580466', 'district', 3494);
INSERT INTO `amapDistrictTable`
VALUES (3504, '1832', 511000, '内江市', NULL, '105.066138,29.58708', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3505, '1832', 511025, '资中县', NULL, '104.852463,29.775295', 'district', 3504);
INSERT INTO `amapDistrictTable`
VALUES (3506, '1832', 511011, '东兴区', NULL, '105.067203,29.600107', 'district', 3504);
INSERT INTO `amapDistrictTable`
VALUES (3507, '1832', 511024, '威远县', NULL, '104.668327,29.52686', 'district', 3504);
INSERT INTO `amapDistrictTable`
VALUES (3508, '1832', 511083, '隆昌市', NULL, '105.288074,29.338162', 'district', 3504);
INSERT INTO `amapDistrictTable`
VALUES (3509, '1832', 511002, '市中区', NULL, '105.065467,29.585265', 'district', 3504);
INSERT INTO `amapDistrictTable`
VALUES (3510, '0831', 511500, '宜宾市', NULL, '104.630825,28.760189', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3511, '0831', 511526, '珙县', NULL, '104.712268,28.449041', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3512, '0831', 511528, '兴文县', NULL, '105.236549,28.302988', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3513, '0831', 511524, '长宁县', NULL, '104.921116,28.577271', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3514, '0831', 511523, '江安县', NULL, '105.068697,28.728102', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3515, '0831', 511503, '南溪区', NULL, '104.981133,28.839806', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3516, '0831', 511502, '翠屏区', NULL, '104.630231,28.760179', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3517, '0831', 511525, '高县', NULL, '104.519187,28.435676', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3518, '0831', 511527, '筠连县', NULL, '104.507848,28.162017', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3519, '0831', 511529, '屏山县', NULL, '104.162617,28.64237', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3520, '0831', 511504, '叙州区', NULL, '104.541489,28.695678', 'district', 3510);
INSERT INTO `amapDistrictTable`
VALUES (3521, '0830', 510500, '泸州市', NULL, '105.443348,28.889138', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3522, '0830', 510504, '龙马潭区', NULL, '105.435228,28.897572', 'district', 3521);
INSERT INTO `amapDistrictTable`
VALUES (3523, '0830', 510521, '泸县', NULL, '105.376335,29.151288', 'district', 3521);
INSERT INTO `amapDistrictTable`
VALUES (3524, '0830', 510503, '纳溪区', NULL, '105.37721,28.77631', 'district', 3521);
INSERT INTO `amapDistrictTable`
VALUES (3525, '0830', 510524, '叙永县', NULL, '105.437775,28.167919', 'district', 3521);
INSERT INTO `amapDistrictTable`
VALUES (3526, '0830', 510525, '古蔺县', NULL, '105.813359,28.03948', 'district', 3521);
INSERT INTO `amapDistrictTable`
VALUES (3527, '0830', 510502, '江阳区', NULL, '105.445131,28.882889', 'district', 3521);
INSERT INTO `amapDistrictTable`
VALUES (3528, '0830', 510522, '合江县', NULL, '105.834098,28.810325', 'district', 3521);
INSERT INTO `amapDistrictTable`
VALUES (3529, '0837', 513200, '阿坝藏族羌族自治州', NULL, '102.221374,31.899792', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3530, '0837', 513231, '阿坝县', NULL, '101.700985,32.904223', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3531, '0837', 513228, '黑水县', NULL, '102.990805,32.061721', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3532, '0837', 513225, '九寨沟县', NULL, '104.236344,33.262097', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3533, '0837', 513222, '理县', NULL, '103.165486,31.436764', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3534, '0837', 513232, '若尔盖县', NULL, '102.963726,33.575934', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3535, '0837', 513226, '金川县', NULL, '102.064647,31.476356', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3536, '0837', 513233, '红原县', NULL, '102.544906,32.793902', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3537, '0837', 513221, '汶川县', NULL, '103.580675,31.47463', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3538, '0837', 513201, '马尔康市', NULL, '102.221187,31.899761', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3539, '0837', 513224, '松潘县', NULL, '103.599177,32.63838', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3540, '0837', 513223, '茂县', NULL, '103.850684,31.680407', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3541, '0837', 513227, '小金县', NULL, '102.363193,30.999016', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3542, '0837', 513230, '壤塘县', NULL, '100.979136,32.264887', 'district', 3529);
INSERT INTO `amapDistrictTable`
VALUES (3543, '0813', 510300, '自贡市', NULL, '104.773447,29.352765', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3544, '0813', 510311, '沿滩区', NULL, '104.876417,29.272521', 'district', 3543);
INSERT INTO `amapDistrictTable`
VALUES (3545, '0813', 510304, '大安区', NULL, '104.783229,29.367136', 'district', 3543);
INSERT INTO `amapDistrictTable`
VALUES (3546, '0813', 510321, '荣县', NULL, '104.423932,29.454851', 'district', 3543);
INSERT INTO `amapDistrictTable`
VALUES (3547, '0813', 510302, '自流井区', NULL, '104.778188,29.343231', 'district', 3543);
INSERT INTO `amapDistrictTable`
VALUES (3548, '0813', 510322, '富顺县', NULL, '104.984256,29.181282', 'district', 3543);
INSERT INTO `amapDistrictTable`
VALUES (3549, '0813', 510303, '贡井区', NULL, '104.714372,29.345675', 'district', 3543);
INSERT INTO `amapDistrictTable`
VALUES (3550, '0835', 511800, '雅安市', NULL, '103.001033,29.987722', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3551, '0835', 511827, '宝兴县', NULL, '102.813377,30.369026', 'district', 3550);
INSERT INTO `amapDistrictTable`
VALUES (3552, '0835', 511822, '荥经县', NULL, '102.844674,29.795529', 'district', 3550);
INSERT INTO `amapDistrictTable`
VALUES (3553, '0835', 511824, '石棉县', NULL, '102.35962,29.234063', 'district', 3550);
INSERT INTO `amapDistrictTable`
VALUES (3554, '0835', 511823, '汉源县', NULL, '102.677145,29.349915', 'district', 3550);
INSERT INTO `amapDistrictTable`
VALUES (3555, '0835', 511825, '天全县', NULL, '102.763462,30.059955', 'district', 3550);
INSERT INTO `amapDistrictTable`
VALUES (3556, '0835', 511802, '雨城区', NULL, '103.003398,29.981831', 'district', 3550);
INSERT INTO `amapDistrictTable`
VALUES (3557, '0835', 511826, '芦山县', NULL, '102.924016,30.152907', 'district', 3550);
INSERT INTO `amapDistrictTable`
VALUES (3558, '0835', 511803, '名山区', NULL, '103.112214,30.084718', 'district', 3550);
INSERT INTO `amapDistrictTable`
VALUES (3559, '1833', 511400, '眉山市', NULL, '103.831788,30.048318', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3560, '1833', 511423, '洪雅县', NULL, '103.375006,29.904867', 'district', 3559);
INSERT INTO `amapDistrictTable`
VALUES (3561, '1833', 511424, '丹棱县', NULL, '103.518333,30.012751', 'district', 3559);
INSERT INTO `amapDistrictTable`
VALUES (3562, '1833', 511421, '仁寿县', NULL, '104.147646,29.996721', 'district', 3559);
INSERT INTO `amapDistrictTable`
VALUES (3563, '1833', 511403, '彭山区', NULL, '103.8701,30.192298', 'district', 3559);
INSERT INTO `amapDistrictTable`
VALUES (3564, '1833', 511425, '青神县', NULL, '103.846131,29.831469', 'district', 3559);
INSERT INTO `amapDistrictTable`
VALUES (3565, '1833', 511402, '东坡区', NULL, '103.831553,30.048128', 'district', 3559);
INSERT INTO `amapDistrictTable`
VALUES (3566, '0833', 511100, '乐山市', NULL, '103.761263,29.582024', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3567, '0833', 511111, '沙湾区', NULL, '103.549961,29.416536', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3568, '0833', 511126, '夹江县', NULL, '103.578862,29.741019', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3569, '0833', 511124, '井研县', NULL, '104.06885,29.651645', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3570, '0833', 511113, '金口河区', NULL, '103.077831,29.24602', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3571, '0833', 511123, '犍为县', NULL, '103.944266,29.209782', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3572, '0833', 511112, '五通桥区', NULL, '103.816837,29.406186', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3573, '0833', 511129, '沐川县', NULL, '103.90211,28.956338', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3574, '0833', 511132, '峨边彝族自治县', NULL, '103.262148,29.230271', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3575, '0833', 511133, '马边彝族自治县', NULL, '103.546851,28.838933', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3576, '0833', 511102, '市中区', NULL, '103.75539,29.588327', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3577, '0833', 511181, '峨眉山市', NULL, '103.492488,29.597478', 'district', 3566);
INSERT INTO `amapDistrictTable`
VALUES (3578, '0812', 510400, '攀枝花市', NULL, '101.716007,26.580446', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3579, '0812', 510421, '米易县', NULL, '102.109877,26.887474', 'district', 3578);
INSERT INTO `amapDistrictTable`
VALUES (3580, '0812', 510403, '西区', NULL, '101.637969,26.596776', 'district', 3578);
INSERT INTO `amapDistrictTable`
VALUES (3581, '0812', 510422, '盐边县', NULL, '101.851848,26.677619', 'district', 3578);
INSERT INTO `amapDistrictTable`
VALUES (3582, '0812', 510411, '仁和区', NULL, '101.737916,26.497185', 'district', 3578);
INSERT INTO `amapDistrictTable`
VALUES (3583, '0812', 510402, '东区', NULL, '101.715134,26.580887', 'district', 3578);
INSERT INTO `amapDistrictTable`
VALUES (3584, '0834', 513400, '凉山彝族自治州', NULL, '102.258746,27.886762', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3585, '0834', 513425, '会理县', NULL, '102.249548,26.658702', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3586, '0834', 513437, '雷波县', NULL, '103.571584,28.262946', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3587, '0834', 513432, '喜德县', NULL, '102.412342,28.305486', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3588, '0834', 513431, '昭觉县', NULL, '102.843991,28.010554', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3589, '0834', 513429, '布拖县', NULL, '102.808801,27.709062', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3590, '0834', 513401, '西昌市', NULL, '102.258758,27.885786', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3591, '0834', 513428, '普格县', NULL, '102.541082,27.376828', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3592, '0834', 513422, '木里藏族自治县', NULL, '101.280184,27.926859', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3593, '0834', 513433, '冕宁县', NULL, '102.170046,28.550844', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3594, '0834', 513426, '会东县', NULL, '102.578985,26.630713', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3595, '0834', 513434, '越西县', NULL, '102.508875,28.639632', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3596, '0834', 513435, '甘洛县', NULL, '102.775924,28.977094', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3597, '0834', 513436, '美姑县', NULL, '103.132007,28.327946', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3598, '0834', 513423, '盐源县', NULL, '101.508909,27.423415', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3599, '0834', 513430, '金阳县', NULL, '103.248704,27.695916', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3600, '0834', 513424, '德昌县', NULL, '102.178845,27.403827', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3601, '0834', 513427, '宁南县', NULL, '102.757374,27.065205', 'district', 3584);
INSERT INTO `amapDistrictTable`
VALUES (3602, '0836', 513300, '甘孜藏族自治州', NULL, '101.963815,30.050663', 'city', 3416);
INSERT INTO `amapDistrictTable`
VALUES (3603, '0836', 513328, '甘孜县', NULL, '99.991753,31.61975', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3604, '0836', 513332, '石渠县', NULL, '98.100887,32.975302', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3605, '0836', 513337, '稻城县', NULL, '100.296689,29.037544', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3606, '0836', 513329, '新龙县', NULL, '100.312094,30.93896', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3607, '0836', 513330, '德格县', NULL, '98.57999,31.806729', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3608, '0836', 513325, '雅江县', NULL, '101.015735,30.03225', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3609, '0836', 513331, '白玉县', NULL, '98.824343,31.208805', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3610, '0836', 513326, '道孚县', NULL, '101.123327,30.978767', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3611, '0836', 513335, '巴塘县', NULL, '99.109037,30.005723', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3612, '0836', 513327, '炉霍县', NULL, '100.679495,31.392674', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3613, '0836', 513301, '康定市', NULL, '101.964057,30.050738', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3614, '0836', 513334, '理塘县', NULL, '100.269862,29.991807', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3615, '0836', 513336, '乡城县', NULL, '99.799943,28.930855', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3616, '0836', 513324, '九龙县', NULL, '101.506942,29.001975', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3617, '0836', 513338, '得荣县', NULL, '99.288036,28.71134', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3618, '0836', 513333, '色达县', NULL, '100.331657,32.268777', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3619, '0836', 513323, '丹巴县', NULL, '101.886125,30.877083', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3620, '0836', 513322, '泸定县', NULL, '102.233225,29.912482', 'district', 3602);
INSERT INTO `amapDistrictTable`
VALUES (3621, NULL, 220000, '吉林省', NULL, '125.3245,43.886841', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3622, '0436', 220800, '白城市', NULL, '122.841114,45.619026', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3623, '0436', 220881, '洮南市', NULL, '122.783779,45.339113', 'district', 3622);
INSERT INTO `amapDistrictTable`
VALUES (3624, '0436', 220882, '大安市', NULL, '124.291512,45.507648', 'district', 3622);
INSERT INTO `amapDistrictTable`
VALUES (3625, '0436', 220822, '通榆县', NULL, '123.088543,44.80915', 'district', 3622);
INSERT INTO `amapDistrictTable`
VALUES (3626, '0436', 220802, '洮北区', NULL, '122.842499,45.619253', 'district', 3622);
INSERT INTO `amapDistrictTable`
VALUES (3627, '0436', 220821, '镇赉县', NULL, '123.202246,45.846089', 'district', 3622);
INSERT INTO `amapDistrictTable`
VALUES (3628, '0431', 220100, '长春市', NULL, '125.3245,43.886841', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3629, '0431', 220183, '德惠市', NULL, '125.703327,44.533909', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3630, '0431', 220182, '榆树市', NULL, '126.550107,44.827642', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3631, '0431', 220112, '双阳区', NULL, '125.659018,43.525168', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3632, '0431', 220122, '农安县', NULL, '125.175287,44.431258', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3633, '0431', 220103, '宽城区', NULL, '125.342828,43.903823', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3634, '0431', 220113, '九台区', NULL, '125.844682,44.157155', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3635, '0431', 220106, '绿园区', NULL, '125.272467,43.892177', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3636, '0431', 220184, '公主岭市', NULL, '124.817588,43.509474', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3637, '0431', 220104, '朝阳区', NULL, '125.318042,43.86491', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3638, '0431', 220105, '二道区', NULL, '125.384727,43.870824', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3639, '0431', 220102, '南关区', NULL, '125.337237,43.890235', 'district', 3628);
INSERT INTO `amapDistrictTable`
VALUES (3640, '0432', 220200, '吉林市', NULL, '126.55302,43.843577', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3641, '0432', 220211, '丰满区', NULL, '126.560759,43.816594', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3642, '0432', 220283, '舒兰市', NULL, '126.947813,44.410906', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3643, '0432', 220282, '桦甸市', NULL, '126.745445,42.972093', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3644, '0432', 220281, '蛟河市', NULL, '127.342739,43.720579', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3645, '0432', 220203, '龙潭区', NULL, '126.561429,43.909755', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3646, '0432', 220221, '永吉县', NULL, '126.501622,43.667416', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3647, '0432', 220284, '磐石市', NULL, '126.059929,42.942476', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3648, '0432', 220202, '昌邑区', NULL, '126.570766,43.851118', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3649, '0432', 220204, '船营区', NULL, '126.55239,43.843804', 'district', 3640);
INSERT INTO `amapDistrictTable`
VALUES (3650, '0438', 220700, '松原市', NULL, '124.823608,45.118243', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3651, '0438', 220781, '扶余市', NULL, '126.042758,44.986199', 'district', 3650);
INSERT INTO `amapDistrictTable`
VALUES (3652, '0438', 220702, '宁江区', NULL, '124.827851,45.176498', 'district', 3650);
INSERT INTO `amapDistrictTable`
VALUES (3653, '0438', 220723, '乾安县', NULL, '124.024361,45.006846', 'district', 3650);
INSERT INTO `amapDistrictTable`
VALUES (3654, '0438', 220721, '前郭尔罗斯蒙古族自治县', NULL, '124.826808,45.116288', 'district', 3650);
INSERT INTO `amapDistrictTable`
VALUES (3655, '0438', 220722, '长岭县', NULL, '123.985184,44.276579', 'district', 3650);
INSERT INTO `amapDistrictTable`
VALUES (3656, '0437', 220400, '辽源市', NULL, '125.145349,42.902692', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3657, '0437', 220403, '西安区', NULL, '125.151424,42.920415', 'district', 3656);
INSERT INTO `amapDistrictTable`
VALUES (3658, '0437', 220421, '东丰县', NULL, '125.529623,42.675228', 'district', 3656);
INSERT INTO `amapDistrictTable`
VALUES (3659, '0437', 220422, '东辽县', NULL, '124.991995,42.927724', 'district', 3656);
INSERT INTO `amapDistrictTable`
VALUES (3660, '0437', 220402, '龙山区', NULL, '125.145164,42.902702', 'district', 3656);
INSERT INTO `amapDistrictTable`
VALUES (3661, '1433', 222400, '延边朝鲜族自治州', NULL, '129.513228,42.904823', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3662, '1433', 222403, '敦化市', NULL, '128.22986,43.366921', 'district', 3661);
INSERT INTO `amapDistrictTable`
VALUES (3663, '1433', 222404, '珲春市', NULL, '130.365787,42.871057', 'district', 3661);
INSERT INTO `amapDistrictTable`
VALUES (3664, '1433', 222402, '图们市', NULL, '129.846701,42.966621', 'district', 3661);
INSERT INTO `amapDistrictTable`
VALUES (3665, '1433', 222406, '和龙市', NULL, '129.008748,42.547004', 'district', 3661);
INSERT INTO `amapDistrictTable`
VALUES (3666, '1433', 222424, '汪清县', NULL, '129.766161,43.315426', 'district', 3661);
INSERT INTO `amapDistrictTable`
VALUES (3667, '1433', 222401, '延吉市', NULL, '129.51579,42.906964', 'district', 3661);
INSERT INTO `amapDistrictTable`
VALUES (3668, '1433', 222426, '安图县', NULL, '128.901865,43.110994', 'district', 3661);
INSERT INTO `amapDistrictTable`
VALUES (3669, '1433', 222405, '龙井市', NULL, '129.425747,42.771029', 'district', 3661);
INSERT INTO `amapDistrictTable`
VALUES (3670, '0439', 220600, '白山市', NULL, '126.427839,41.942505', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3671, '0439', 220623, '长白朝鲜族自治县', NULL, '128.203384,41.419361', 'district', 3670);
INSERT INTO `amapDistrictTable`
VALUES (3672, '0439', 220605, '江源区', NULL, '126.584229,42.048109', 'district', 3670);
INSERT INTO `amapDistrictTable`
VALUES (3673, '0439', 220622, '靖宇县', NULL, '126.808386,42.389689', 'district', 3670);
INSERT INTO `amapDistrictTable`
VALUES (3674, '0439', 220621, '抚松县', NULL, '127.273796,42.332643', 'district', 3670);
INSERT INTO `amapDistrictTable`
VALUES (3675, '0439', 220602, '浑江区', NULL, '126.428035,41.943065', 'district', 3670);
INSERT INTO `amapDistrictTable`
VALUES (3676, '0439', 220681, '临江市', NULL, '126.919296,41.810689', 'district', 3670);
INSERT INTO `amapDistrictTable`
VALUES (3677, '0435', 220500, '通化市', NULL, '125.936501,41.721177', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3678, '0435', 220521, '通化县', NULL, '125.753121,41.677918', 'district', 3677);
INSERT INTO `amapDistrictTable`
VALUES (3679, '0435', 220503, '二道江区', NULL, '126.045987,41.777564', 'district', 3677);
INSERT INTO `amapDistrictTable`
VALUES (3680, '0435', 220502, '东昌区', NULL, '125.936716,41.721233', 'district', 3677);
INSERT INTO `amapDistrictTable`
VALUES (3681, '0435', 220524, '柳河县', NULL, '125.740536,42.281484', 'district', 3677);
INSERT INTO `amapDistrictTable`
VALUES (3682, '0435', 220581, '梅河口市', NULL, '125.687336,42.530002', 'district', 3677);
INSERT INTO `amapDistrictTable`
VALUES (3683, '0435', 220523, '辉南县', NULL, '126.042821,42.683459', 'district', 3677);
INSERT INTO `amapDistrictTable`
VALUES (3684, '0435', 220582, '集安市', NULL, '126.186204,41.126276', 'district', 3677);
INSERT INTO `amapDistrictTable`
VALUES (3685, '0434', 220300, '四平市', NULL, '124.370785,43.170344', 'city', 3621);
INSERT INTO `amapDistrictTable`
VALUES (3686, '0434', 220303, '铁东区', NULL, '124.388464,43.16726', 'district', 3685);
INSERT INTO `amapDistrictTable`
VALUES (3687, '0434', 220382, '双辽市', NULL, '123.505283,43.518275', 'district', 3685);
INSERT INTO `amapDistrictTable`
VALUES (3688, '0434', 220323, '伊通满族自治县', NULL, '125.303124,43.345464', 'district', 3685);
INSERT INTO `amapDistrictTable`
VALUES (3689, '0434', 220322, '梨树县', NULL, '124.335802,43.30831', 'district', 3685);
INSERT INTO `amapDistrictTable`
VALUES (3690, '0434', 220302, '铁西区', NULL, '124.360894,43.176263', 'district', 3685);
INSERT INTO `amapDistrictTable`
VALUES (3691, '022', 120000, '天津市', NULL, '117.190182,39.125596', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3692, '022', 120100, '天津城区', NULL, '117.190182,39.125596', 'city', 3691);
INSERT INTO `amapDistrictTable`
VALUES (3693, '022', 120102, '河东区', NULL, '117.226568,39.122125', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3694, '022', 120105, '河北区', NULL, '117.201569,39.156632', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3695, '022', 120101, '和平区', NULL, '117.195907,39.118327', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3696, '022', 120115, '宝坻区', NULL, '117.308094,39.716965', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3697, '022', 120110, '东丽区', NULL, '117.313967,39.087764', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3698, '022', 120112, '津南区', NULL, '117.382549,38.989577', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3699, '022', 120116, '滨海新区', NULL, '117.654173,39.032846', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3700, '022', 120118, '静海区', NULL, '116.925304,38.935671', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3701, '022', 120119, '蓟州区', NULL, '117.407449,40.045342', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3702, '022', 120114, '武清区', NULL, '117.057959,39.376925', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3703, '022', 120104, '南开区', NULL, '117.164143,39.120474', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3704, '022', 120103, '河西区', NULL, '117.217536,39.101897', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3705, '022', 120117, '宁河区', NULL, '117.82828,39.328886', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3706, '022', 120106, '红桥区', NULL, '117.163301,39.175066', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3707, '022', 120113, '北辰区', NULL, '117.13482,39.225555', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3708, '022', 120111, '西青区', NULL, '117.012247,39.139446', 'district', 3692);
INSERT INTO `amapDistrictTable`
VALUES (3709, NULL, 140000, '山西省', NULL, '112.549248,37.857014', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3710, '0359', 140800, '运城市', NULL, '111.003957,35.022778', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3711, '0359', 140822, '万荣县', NULL, '110.843561,35.417042', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3712, '0359', 140821, '临猗县', NULL, '110.77493,35.141883', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3713, '0359', 140823, '闻喜县', NULL, '111.220306,35.353839', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3714, '0359', 140802, '盐湖区', NULL, '111.000627,35.025643', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3715, '0359', 140830, '芮城县', NULL, '110.69114,34.694769', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3716, '0359', 140828, '夏县', NULL, '111.223174,35.140441', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3717, '0359', 140829, '平陆县', NULL, '111.212377,34.837256', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3718, '0359', 140881, '永济市', NULL, '110.447984,34.865125', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3719, '0359', 140826, '绛县', NULL, '111.576182,35.49045', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3720, '0359', 140827, '垣曲县', NULL, '111.67099,35.298293', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3721, '0359', 140825, '新绛县', NULL, '111.225205,35.613697', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3722, '0359', 140824, '稷山县', NULL, '110.978996,35.600412', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3723, '0359', 140882, '河津市', NULL, '110.710268,35.59715', 'district', 3710);
INSERT INTO `amapDistrictTable`
VALUES (3724, '0357', 141000, '临汾市', NULL, '111.517973,36.08415', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3725, '0357', 141025, '古县', NULL, '111.920207,36.26855', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3726, '0357', 141026, '安泽县', NULL, '112.251372,36.146032', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3727, '0357', 141030, '大宁县', NULL, '110.751283,36.46383', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3728, '0357', 141034, '汾西县', NULL, '111.563021,36.653368', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3729, '0357', 141031, '隰县', NULL, '110.935809,36.692675', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3730, '0357', 141028, '吉县', NULL, '110.682853,36.099355', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3731, '0357', 141081, '侯马市', NULL, '111.371272,35.620302', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3732, '0357', 141032, '永和县', NULL, '110.631276,36.760614', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3733, '0357', 141082, '霍州市', NULL, '111.723103,36.57202', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3734, '0357', 141029, '乡宁县', NULL, '110.857365,35.975402', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3735, '0357', 141021, '曲沃县', NULL, '111.475529,35.641387', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3736, '0357', 141033, '蒲县', NULL, '111.09733,36.411682', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3737, '0357', 141027, '浮山县', NULL, '111.850039,35.971359', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3738, '0357', 141023, '襄汾县', NULL, '111.442932,35.876139', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3739, '0357', 141024, '洪洞县', NULL, '111.673692,36.255742', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3740, '0357', 141002, '尧都区', NULL, '111.522945,36.080366', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3741, '0357', 141022, '翼城县', NULL, '111.713508,35.738621', 'district', 3724);
INSERT INTO `amapDistrictTable`
VALUES (3742, '0351', 140100, '太原市', NULL, '112.549248,37.857014', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3743, '0351', 140109, '万柏林区', NULL, '112.522258,37.862653', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3744, '0351', 140110, '晋源区', NULL, '112.477849,37.715619', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3745, '0351', 140108, '尖草坪区', NULL, '112.487122,37.939893', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3746, '0351', 140123, '娄烦县', NULL, '111.793798,38.066035', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3747, '0351', 140107, '杏花岭区', NULL, '112.560743,37.879291', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3748, '0351', 140106, '迎泽区', NULL, '112.558851,37.855804', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3749, '0351', 140122, '阳曲县', NULL, '112.673818,38.058797', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3750, '0351', 140121, '清徐县', NULL, '112.357961,37.60729', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3751, '0351', 140105, '小店区', NULL, '112.564273,37.817974', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3752, '0351', 140181, '古交市', NULL, '112.174353,37.908534', 'district', 3742);
INSERT INTO `amapDistrictTable`
VALUES (3753, '0353', 140300, '阳泉市', NULL, '113.583285,37.861188', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3754, '0353', 140321, '平定县', NULL, '113.631049,37.800289', 'district', 3753);
INSERT INTO `amapDistrictTable`
VALUES (3755, '0353', 140311, '郊区', NULL, '113.58664,37.94096', 'district', 3753);
INSERT INTO `amapDistrictTable`
VALUES (3756, '0353', 140303, '矿区', NULL, '113.559066,37.870085', 'district', 3753);
INSERT INTO `amapDistrictTable`
VALUES (3757, '0353', 140322, '盂县', NULL, '113.41223,38.086131', 'district', 3753);
INSERT INTO `amapDistrictTable`
VALUES (3758, '0353', 140302, '城区', NULL, '113.586513,37.860938', 'district', 3753);
INSERT INTO `amapDistrictTable`
VALUES (3759, '0349', 140600, '朔州市', NULL, '112.433387,39.331261', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3760, '0349', 140603, '平鲁区', NULL, '112.295227,39.515603', 'district', 3759);
INSERT INTO `amapDistrictTable`
VALUES (3761, '0349', 140623, '右玉县', NULL, '112.465588,39.988812', 'district', 3759);
INSERT INTO `amapDistrictTable`
VALUES (3762, '0349', 140602, '朔城区', NULL, '112.428676,39.324525', 'district', 3759);
INSERT INTO `amapDistrictTable`
VALUES (3763, '0349', 140622, '应县', NULL, '113.187505,39.559187', 'district', 3759);
INSERT INTO `amapDistrictTable`
VALUES (3764, '0349', 140621, '山阴县', NULL, '112.816396,39.52677', 'district', 3759);
INSERT INTO `amapDistrictTable`
VALUES (3765, '0349', 140681, '怀仁市', NULL, '113.100511,39.820789', 'district', 3759);
INSERT INTO `amapDistrictTable`
VALUES (3766, '0350', 140900, '忻州市', NULL, '112.733538,38.41769', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3767, '0350', 140932, '偏关县', NULL, '111.500477,39.442153', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3768, '0350', 140926, '静乐县', NULL, '111.940231,38.355947', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3769, '0350', 140981, '原平市', NULL, '112.713132,38.729186', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3770, '0350', 140929, '岢岚县', NULL, '111.56981,38.705625', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3771, '0350', 140923, '代县', NULL, '112.962519,39.065138', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3772, '0350', 140928, '五寨县', NULL, '111.841015,38.912761', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3773, '0350', 140925, '宁武县', NULL, '112.307936,39.001718', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3774, '0350', 140930, '河曲县', NULL, '111.146609,39.381895', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3775, '0350', 140922, '五台县', NULL, '113.259012,38.725711', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3776, '0350', 140921, '定襄县', NULL, '112.963231,38.484948', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3777, '0350', 140902, '忻府区', NULL, '112.734112,38.417743', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3778, '0350', 140931, '保德县', NULL, '111.085688,39.022576', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3779, '0350', 140927, '神池县', NULL, '112.200438,39.088467', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3780, '0350', 140924, '繁峙县', NULL, '113.267707,39.188104', 'district', 3766);
INSERT INTO `amapDistrictTable`
VALUES (3781, '0354', 140700, '晋中市', NULL, '112.736465,37.696495', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3782, '0354', 140724, '昔阳县', NULL, '113.706166,37.60437', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3783, '0354', 140723, '和顺县', NULL, '113.572919,37.327027', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3784, '0354', 140725, '寿阳县', NULL, '113.177708,37.891136', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3785, '0354', 140722, '左权县', NULL, '113.377834,37.079672', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3786, '0354', 140721, '榆社县', NULL, '112.973521,37.069019', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3787, '0354', 140781, '介休市', NULL, '111.913857,37.027616', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3788, '0354', 140729, '灵石县', NULL, '111.772759,36.847469', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3789, '0354', 140702, '榆次区', NULL, '112.740056,37.6976', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3790, '0354', 140727, '祁县', NULL, '112.330532,37.358739', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3791, '0354', 140703, '太谷区', NULL, '112.554103,37.424595', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3792, '0354', 140728, '平遥县', NULL, '112.174059,37.195474', 'district', 3781);
INSERT INTO `amapDistrictTable`
VALUES (3793, '0358', 141100, '吕梁市', NULL, '111.134335,37.524366', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3794, '0358', 141130, '交口县', NULL, '111.183188,36.983068', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3795, '0358', 141128, '方山县', NULL, '111.238885,37.892632', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3796, '0358', 141127, '岚县', NULL, '111.671555,38.278654', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3797, '0358', 141124, '临县', NULL, '110.995963,37.960806', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3798, '0358', 141102, '离石区', NULL, '111.134462,37.524037', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3799, '0358', 141125, '柳林县', NULL, '110.89613,37.431664', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3800, '0358', 141129, '中阳县', NULL, '111.193319,37.342054', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3801, '0358', 141123, '兴县', NULL, '111.124816,38.464136', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3802, '0358', 141126, '石楼县', NULL, '110.837119,36.999426', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3803, '0358', 141122, '交城县', NULL, '112.159154,37.555155', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3804, '0358', 141121, '文水县', NULL, '112.032595,37.436314', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3805, '0358', 141182, '汾阳市', NULL, '111.785273,37.267742', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3806, '0358', 141181, '孝义市', NULL, '111.781568,37.144474', 'district', 3793);
INSERT INTO `amapDistrictTable`
VALUES (3807, '0352', 140200, '大同市', NULL, '113.295259,40.09031', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3808, '0352', 140225, '浑源县', NULL, '113.698091,39.699099', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3809, '0352', 140224, '灵丘县', NULL, '114.23576,39.438867', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3810, '0352', 140223, '广灵县', NULL, '114.279252,39.763051', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3811, '0352', 140221, '阳高县', NULL, '113.749871,40.364927', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3812, '0352', 140215, '云州区', NULL, '113.61244,40.040295', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3813, '0352', 140214, '云冈区', NULL, '113.149693,40.005405', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3814, '0352', 140213, '平城区', NULL, '113.298027,40.075667', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3815, '0352', 140222, '天镇县', NULL, '114.09112,40.421336', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3816, '0352', 140212, '新荣区', NULL, '113.141044,40.258269', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3817, '0352', 140226, '左云县', NULL, '112.70641,40.012873', 'district', 3807);
INSERT INTO `amapDistrictTable`
VALUES (3818, '0355', 140400, '长治市', NULL, '113.113556,36.191112', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3819, '0355', 140406, '潞城区', NULL, '113.223245,36.332232', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3820, '0355', 140428, '长子县', NULL, '112.884656,36.119484', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3821, '0355', 140426, '黎城县', NULL, '113.387366,36.502971', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3822, '0355', 140404, '上党区', NULL, '113.056679,36.052438', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3823, '0355', 140405, '屯留区', NULL, '112.892741,36.314072', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3824, '0355', 140431, '沁源县', NULL, '112.340878,36.500777', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3825, '0355', 140425, '平顺县', NULL, '113.438791,36.200202', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3826, '0355', 140423, '襄垣县', NULL, '113.050094,36.532854', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3827, '0355', 140403, '潞州区', NULL, '113.114107,36.187895', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3828, '0355', 140430, '沁县', NULL, '112.70138,36.757123', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3829, '0355', 140429, '武乡县', NULL, '112.8653,36.834315', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3830, '0355', 140427, '壶关县', NULL, '113.206138,36.110938', 'district', 3818);
INSERT INTO `amapDistrictTable`
VALUES (3831, '0356', 140500, '晋城市', NULL, '112.851274,35.497553', 'city', 3709);
INSERT INTO `amapDistrictTable`
VALUES (3832, '0356', 140581, '高平市', NULL, '112.930691,35.791355', 'district', 3831);
INSERT INTO `amapDistrictTable`
VALUES (3833, '0356', 140502, '城区', NULL, '112.853106,35.496641', 'district', 3831);
INSERT INTO `amapDistrictTable`
VALUES (3834, '0356', 140525, '泽州县', NULL, '112.899137,35.617221', 'district', 3831);
INSERT INTO `amapDistrictTable`
VALUES (3835, '0356', 140521, '沁水县', NULL, '112.187213,35.689472', 'district', 3831);
INSERT INTO `amapDistrictTable`
VALUES (3836, '0356', 140522, '阳城县', NULL, '112.422014,35.482177', 'district', 3831);
INSERT INTO `amapDistrictTable`
VALUES (3837, '0356', 140524, '陵川县', NULL, '113.278877,35.775614', 'district', 3831);
INSERT INTO `amapDistrictTable`
VALUES (3838, NULL, 530000, '云南省', NULL, '102.712251,25.040609', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3839, '0870', 530600, '昭通市', NULL, '103.717216,27.336999', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3840, '0870', 530681, '水富市', NULL, '104.415376,28.629688', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3841, '0870', 530626, '绥江县', NULL, '103.961095,28.599953', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3842, '0870', 530629, '威信县', NULL, '105.04869,27.843381', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3843, '0870', 530625, '永善县', NULL, '103.63732,28.231526', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3844, '0870', 530624, '大关县', NULL, '103.891608,27.747114', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3845, '0870', 530622, '巧家县', NULL, '102.929284,26.9117', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3846, '0870', 530602, '昭阳区', NULL, '103.717267,27.336636', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3847, '0870', 530623, '盐津县', NULL, '104.23506,28.106923', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3848, '0870', 530621, '鲁甸县', NULL, '103.549333,27.191637', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3849, '0870', 530628, '彝良县', NULL, '104.048492,27.627425', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3850, '0870', 530627, '镇雄县', NULL, '104.873055,27.436267', 'district', 3839);
INSERT INTO `amapDistrictTable`
VALUES (3851, '0873', 532500, '红河哈尼族彝族自治州', NULL, '103.384182,23.366775', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3852, '0873', 532527, '泸西县', NULL, '103.759622,24.532368', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3853, '0873', 532504, '弥勒市', NULL, '103.436988,24.40837', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3854, '0873', 532524, '建水县', NULL, '102.820493,23.618387', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3855, '0873', 532525, '石屏县', NULL, '102.484469,23.712569', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3856, '0873', 532502, '开远市', NULL, '103.258679,23.713832', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3857, '0873', 532501, '个旧市', NULL, '103.154752,23.360383', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3858, '0873', 532503, '蒙自市', NULL, '103.385005,23.366843', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3859, '0873', 532529, '红河县', NULL, '102.42121,23.369191', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3860, '0873', 532523, '屏边苗族自治县', NULL, '103.687229,22.987013', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3861, '0873', 532531, '绿春县', NULL, '102.39286,22.99352', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3862, '0873', 532528, '元阳县', NULL, '102.837056,23.219773', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3863, '0873', 532530, '金平苗族瑶族傣族自治县', NULL, '103.228359,22.779982', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3864, '0873', 532532, '河口瑶族自治县', NULL, '103.961593,22.507563', 'district', 3851);
INSERT INTO `amapDistrictTable`
VALUES (3865, '0874', 530300, '曲靖市', NULL, '103.797851,25.501557', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3866, '0874', 530326, '会泽县', NULL, '103.300041,26.412861', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3867, '0874', 530304, '马龙区', NULL, '103.578755,25.429451', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3868, '0874', 530324, '罗平县', NULL, '104.309263,24.885708', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3869, '0874', 530323, '师宗县', NULL, '103.993808,24.825681', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3870, '0874', 530322, '陆良县', NULL, '103.655233,25.022878', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3871, '0874', 530381, '宣威市', NULL, '104.09554,26.227777', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3872, '0874', 530325, '富源县', NULL, '104.25692,25.67064', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3873, '0874', 530302, '麒麟区', NULL, '103.798054,25.501269', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3874, '0874', 530303, '沾益区', NULL, '103.819262,25.600878', 'district', 3865);
INSERT INTO `amapDistrictTable`
VALUES (3875, '0886', 533300, '怒江傈僳族自治州', NULL, '98.854304,25.850949', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3876, '0886', 533324, '贡山独龙族怒族自治县', NULL, '98.666141,27.738054', 'district', 3875);
INSERT INTO `amapDistrictTable`
VALUES (3877, '0886', 533323, '福贡县', NULL, '98.867413,26.902738', 'district', 3875);
INSERT INTO `amapDistrictTable`
VALUES (3878, '0886', 533325, '兰坪白族普米族自治县', NULL, '99.421378,26.453839', 'district', 3875);
INSERT INTO `amapDistrictTable`
VALUES (3879, '0886', 533301, '泸水市', NULL, '98.854063,25.851142', 'district', 3875);
INSERT INTO `amapDistrictTable`
VALUES (3880, '0877', 530400, '玉溪市', NULL, '102.543907,24.350461', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3881, '0877', 530425, '易门县', NULL, '102.16211,24.669598', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3882, '0877', 530481, '澄江市', NULL, '102.916652,24.669679', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3883, '0877', 530426, '峨山彝族自治县', NULL, '102.404358,24.173256', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3884, '0877', 530424, '华宁县', NULL, '102.928982,24.189807', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3885, '0877', 530427, '新平彝族傣族自治县', NULL, '101.990903,24.0664', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3886, '0877', 530403, '江川区', NULL, '102.749839,24.291006', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3887, '0877', 530402, '红塔区', NULL, '102.543468,24.350753', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3888, '0877', 530423, '通海县', NULL, '102.760039,24.112205', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3889, '0877', 530428, '元江哈尼族彝族傣族自治县', NULL, '101.999658,23.597618', 'district', 3880);
INSERT INTO `amapDistrictTable`
VALUES (3890, '0875', 530500, '保山市', NULL, '99.167133,25.111802', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3891, '0875', 530581, '腾冲市', NULL, '98.497292,25.01757', 'district', 3890);
INSERT INTO `amapDistrictTable`
VALUES (3892, '0875', 530502, '隆阳区', NULL, '99.165825,25.112144', 'district', 3890);
INSERT INTO `amapDistrictTable`
VALUES (3893, '0875', 530524, '昌宁县', NULL, '99.612344,24.823662', 'district', 3890);
INSERT INTO `amapDistrictTable`
VALUES (3894, '0875', 530521, '施甸县', NULL, '99.183758,24.730847', 'district', 3890);
INSERT INTO `amapDistrictTable`
VALUES (3895, '0875', 530523, '龙陵县', NULL, '98.693567,24.591912', 'district', 3890);
INSERT INTO `amapDistrictTable`
VALUES (3896, '0872', 532900, '大理白族自治州', NULL, '100.225668,25.589449', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3897, '0872', 532931, '剑川县', NULL, '99.905887,26.530066', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3898, '0872', 532932, '鹤庆县', NULL, '100.173375,26.55839', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3899, '0872', 532930, '洱源县', NULL, '99.951708,26.111184', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3900, '0872', 532924, '宾川县', NULL, '100.578957,25.825904', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3901, '0872', 532929, '云龙县', NULL, '99.369402,25.884955', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3902, '0872', 532901, '大理市', NULL, '100.241369,25.593067', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3903, '0872', 532923, '祥云县', NULL, '100.554025,25.477072', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3904, '0872', 532922, '漾濞彝族自治县', NULL, '99.95797,25.669543', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3905, '0872', 532928, '永平县', NULL, '99.533536,25.461281', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3906, '0872', 532927, '巍山彝族回族自治县', NULL, '100.30793,25.230909', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3907, '0872', 532925, '弥渡县', NULL, '100.490669,25.342594', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3908, '0872', 532926, '南涧彝族自治县', NULL, '100.518683,25.041279', 'district', 3896);
INSERT INTO `amapDistrictTable`
VALUES (3909, '0888', 530700, '丽江市', NULL, '100.233026,26.872108', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3910, '0888', 530721, '玉龙纳西族自治县', NULL, '100.238312,26.830593', 'district', 3909);
INSERT INTO `amapDistrictTable`
VALUES (3911, '0888', 530702, '古城区', NULL, '100.234412,26.872229', 'district', 3909);
INSERT INTO `amapDistrictTable`
VALUES (3912, '0888', 530724, '宁蒗彝族自治县', NULL, '100.852427,27.281109', 'district', 3909);
INSERT INTO `amapDistrictTable`
VALUES (3913, '0888', 530722, '永胜县', NULL, '100.750901,26.685623', 'district', 3909);
INSERT INTO `amapDistrictTable`
VALUES (3914, '0888', 530723, '华坪县', NULL, '101.267796,26.628834', 'district', 3909);
INSERT INTO `amapDistrictTable`
VALUES (3915, '0887', 533400, '迪庆藏族自治州', NULL, '99.706463,27.826853', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3916, '0887', 533422, '德钦县', NULL, '98.91506,28.483272', 'district', 3915);
INSERT INTO `amapDistrictTable`
VALUES (3917, '0887', 533401, '香格里拉市', NULL, '99.708667,27.825804', 'district', 3915);
INSERT INTO `amapDistrictTable`
VALUES (3918, '0887', 533423, '维西傈僳族自治县', NULL, '99.286355,27.180948', 'district', 3915);
INSERT INTO `amapDistrictTable`
VALUES (3919, '0691', 532800, '西双版纳傣族自治州', NULL, '100.797941,22.001724', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3920, '0691', 532801, '景洪市', NULL, '100.797947,22.002087', 'district', 3919);
INSERT INTO `amapDistrictTable`
VALUES (3921, '0691', 532822, '勐海县', NULL, '100.448288,21.955866', 'district', 3919);
INSERT INTO `amapDistrictTable`
VALUES (3922, '0691', 532823, '勐腊县', NULL, '101.567051,21.479449', 'district', 3919);
INSERT INTO `amapDistrictTable`
VALUES (3923, '0871', 530100, '昆明市', NULL, '102.712251,25.040609', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3924, '0871', 530113, '东川区', NULL, '103.182,26.08349', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3925, '0871', 530129, '寻甸回族彝族自治县', NULL, '103.257588,25.559474', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3926, '0871', 530102, '五华区', NULL, '102.704412,25.042165', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3927, '0871', 530112, '西山区', NULL, '102.705904,25.02436', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3928, '0871', 530125, '宜良县', NULL, '103.145989,24.918215', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3929, '0871', 530126, '石林彝族自治县', NULL, '103.271962,24.754545', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3930, '0871', 530114, '呈贡区', NULL, '102.801382,24.889275', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3931, '0871', 530115, '晋宁区', NULL, '102.594987,24.666944', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3932, '0871', 530181, '安宁市', NULL, '102.485544,24.921785', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3933, '0871', 530124, '富民县', NULL, '102.497888,25.219667', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3934, '0871', 530128, '禄劝彝族苗族自治县', NULL, '102.46905,25.556533', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3935, '0871', 530111, '官渡区', NULL, '102.723437,25.021211', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3936, '0871', 530103, '盘龙区', NULL, '102.729044,25.070239', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3937, '0871', 530127, '嵩明县', NULL, '103.038777,25.335087', 'district', 3923);
INSERT INTO `amapDistrictTable`
VALUES (3938, '0879', 530800, '普洱市', NULL, '100.972344,22.777321', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3939, '0879', 530823, '景东彝族自治县', NULL, '100.840011,24.448523', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3940, '0879', 530825, '镇沅彝族哈尼族拉祜族自治县', NULL, '101.108512,24.005712', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3941, '0879', 530822, '墨江哈尼族自治县', NULL, '101.687606,23.428165', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3942, '0879', 530824, '景谷傣族彝族自治县', NULL, '100.701425,23.500278', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3943, '0879', 530821, '宁洱哈尼族彝族自治县', NULL, '101.04524,23.062507', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3944, '0879', 530802, '思茅区', NULL, '100.973227,22.776595', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3945, '0879', 530829, '西盟佤族自治县', NULL, '99.594372,22.644423', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3946, '0879', 530828, '澜沧拉祜族自治县', NULL, '99.931201,22.553083', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3947, '0879', 530826, '江城哈尼族彝族自治县', NULL, '101.859144,22.58336', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3948, '0879', 530827, '孟连傣族拉祜族佤族自治县', NULL, '99.585406,22.325924', 'district', 3938);
INSERT INTO `amapDistrictTable`
VALUES (3949, '0876', 532600, '文山壮族苗族自治州', NULL, '104.24401,23.36951', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3950, '0876', 532626, '丘北县', NULL, '104.194366,24.040982', 'district', 3949);
INSERT INTO `amapDistrictTable`
VALUES (3951, '0876', 532627, '广南县', NULL, '105.056684,24.050272', 'district', 3949);
INSERT INTO `amapDistrictTable`
VALUES (3952, '0876', 532622, '砚山县', NULL, '104.343989,23.612301', 'district', 3949);
INSERT INTO `amapDistrictTable`
VALUES (3953, '0876', 532623, '西畴县', NULL, '104.675711,23.437439', 'district', 3949);
INSERT INTO `amapDistrictTable`
VALUES (3954, '0876', 532601, '文山市', NULL, '104.244277,23.369216', 'district', 3949);
INSERT INTO `amapDistrictTable`
VALUES (3955, '0876', 532624, '麻栗坡县', NULL, '104.701899,23.124202', 'district', 3949);
INSERT INTO `amapDistrictTable`
VALUES (3956, '0876', 532625, '马关县', NULL, '104.398619,23.011723', 'district', 3949);
INSERT INTO `amapDistrictTable`
VALUES (3957, '0876', 532628, '富宁县', NULL, '105.62856,23.626494', 'district', 3949);
INSERT INTO `amapDistrictTable`
VALUES (3958, '0878', 532300, '楚雄彝族自治州', NULL, '101.546046,25.041988', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3959, '0878', 532326, '大姚县', NULL, '101.323602,25.722348', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3960, '0878', 532328, '元谋县', NULL, '101.870837,25.703313', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3961, '0878', 532325, '姚安县', NULL, '101.238399,25.505403', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3962, '0878', 532323, '牟定县', NULL, '101.543044,25.312111', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3963, '0878', 532324, '南华县', NULL, '101.274991,25.192408', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3964, '0878', 532331, '禄丰县', NULL, '102.075694,25.14327', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3965, '0878', 532301, '楚雄市', NULL, '101.546145,25.040912', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3966, '0878', 532322, '双柏县', NULL, '101.63824,24.685094', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3967, '0878', 532329, '武定县', NULL, '102.406785,25.5301', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3968, '0878', 532327, '永仁县', NULL, '101.671175,26.056316', 'district', 3958);
INSERT INTO `amapDistrictTable`
VALUES (3969, '0883', 530900, '临沧市', NULL, '100.08697,23.886567', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3970, '0883', 530921, '凤庆县', NULL, '99.91871,24.592738', 'district', 3969);
INSERT INTO `amapDistrictTable`
VALUES (3971, '0883', 530922, '云县', NULL, '100.125637,24.439026', 'district', 3969);
INSERT INTO `amapDistrictTable`
VALUES (3972, '0883', 530923, '永德县', NULL, '99.253679,24.028159', 'district', 3969);
INSERT INTO `amapDistrictTable`
VALUES (3973, '0883', 530924, '镇康县', NULL, '98.82743,23.761415', 'district', 3969);
INSERT INTO `amapDistrictTable`
VALUES (3974, '0883', 530902, '临翔区', NULL, '100.086486,23.886562', 'district', 3969);
INSERT INTO `amapDistrictTable`
VALUES (3975, '0883', 530926, '耿马傣族佤族自治县', NULL, '99.402495,23.534579', 'district', 3969);
INSERT INTO `amapDistrictTable`
VALUES (3976, '0883', 530925, '双江拉祜族佤族布朗族傣族自治县', NULL, '99.824419,23.477476', 'district', 3969);
INSERT INTO `amapDistrictTable`
VALUES (3977, '0883', 530927, '沧源佤族自治县', NULL, '99.2474,23.146887', 'district', 3969);
INSERT INTO `amapDistrictTable`
VALUES (3978, '0692', 533100, '德宏傣族景颇族自治州', NULL, '98.578363,24.436694', 'city', 3838);
INSERT INTO `amapDistrictTable`
VALUES (3979, '0692', 533123, '盈江县', NULL, '97.93393,24.709541', 'district', 3978);
INSERT INTO `amapDistrictTable`
VALUES (3980, '0692', 533122, '梁河县', NULL, '98.298196,24.80742', 'district', 3978);
INSERT INTO `amapDistrictTable`
VALUES (3981, '0692', 533124, '陇川县', NULL, '97.794441,24.184065', 'district', 3978);
INSERT INTO `amapDistrictTable`
VALUES (3982, '0692', 533103, '芒市', NULL, '98.577608,24.436699', 'district', 3978);
INSERT INTO `amapDistrictTable`
VALUES (3983, '0692', 533102, '瑞丽市', NULL, '97.855883,24.010734', 'district', 3978);
INSERT INTO `amapDistrictTable`
VALUES (3984, '010', 110000, '北京市', NULL, '116.405285,39.904989', 'province', 282);
INSERT INTO `amapDistrictTable`
VALUES (3985, '010', 110100, '北京城区', NULL, '116.405285,39.904989', 'city', 3984);
INSERT INTO `amapDistrictTable`
VALUES (3986, '010', 110119, '延庆区', NULL, '115.985006,40.465325', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3987, '010', 110116, '怀柔区', NULL, '116.637122,40.324272', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3988, '010', 110109, '门头沟区', NULL, '116.105381,39.937183', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3989, '010', 110113, '顺义区', NULL, '116.653525,40.128936', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3990, '010', 110117, '平谷区', NULL, '117.112335,40.144783', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3991, '010', 110114, '昌平区', NULL, '116.235906,40.218085', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3992, '010', 110101, '东城区', NULL, '116.418757,39.917544', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3993, '010', 110105, '朝阳区', NULL, '116.486409,39.921489', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3994, '010', 110108, '海淀区', NULL, '116.310316,39.956074', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3995, '010', 110107, '石景山区', NULL, '116.195445,39.914601', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3996, '010', 110111, '房山区', NULL, '116.139157,39.735535', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3997, '010', 110106, '丰台区', NULL, '116.286968,39.863642', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3998, '010', 110102, '西城区', NULL, '116.366794,39.915309', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (3999, '010', 110115, '大兴区', NULL, '116.338033,39.728908', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (4000, '010', 110112, '通州区', NULL, '116.658603,39.902486', 'district', 3985);
INSERT INTO `amapDistrictTable`
VALUES (4001, '010', 110118, '密云区', NULL, '116.843352,40.377362', 'district', 3985);
COMMIT;

-- ----------------------------
-- Table structure for brandInfo
-- ----------------------------
DROP TABLE IF EXISTS `brandInfo`;
CREATE TABLE `brandInfo`
(
    `brandId`       int                                             NOT NULL AUTO_INCREMENT COMMENT '品牌ID',
    `brandName`     varchar(255)                                             DEFAULT NULL COMMENT '品牌名',
    `brandPhotoUrl` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌图片路径',
    `parameter`     json                                                     DEFAULT NULL COMMENT '商品参数JSON',
    `updateTime`    datetime                                        NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`brandId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='品牌信息';

-- ----------------------------
-- Records of brandInfo
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for commodityInformation
-- ----------------------------
DROP TABLE IF EXISTS `commodityInformation`;
CREATE TABLE `commodityInformation`
(
    `commodityId`       int                                                     NOT NULL AUTO_INCREMENT COMMENT '商品ID',
    `commodityName`     varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
    `brandId`           int                                                              DEFAULT NULL COMMENT '品牌ID',
    `classifyId`        int                                                     NOT NULL COMMENT '商品分类ID',
    `commodityPrice`    decimal(10, 2)                                          NOT NULL COMMENT '商品价格',
    `commodityPhotoUrl` text CHARACTER SET utf8 COLLATE utf8_general_ci         NOT NULL COMMENT '商品图片路径',
    `commodityStatus`   int                                                     NOT NULL COMMENT '商品状态',
    `parameter`         json                                                             DEFAULT NULL COMMENT '商品参数JSON',
    `updateTime`        datetime                                                NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodityId`) USING BTREE,
    KEY `brandId` (`brandId`),
    CONSTRAINT `commodityInformation_ibfk_1` FOREIGN KEY (`brandId`) REFERENCES `brandInfo` (`brandId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='商品信息';

-- ----------------------------
-- Records of commodityInformation
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for countryCode
-- ----------------------------
DROP TABLE IF EXISTS `countryCode`;
CREATE TABLE `countryCode`
(
    `countryId`   int NOT NULL,
    `letterCode2` varchar(2)   DEFAULT NULL,
    `letterCode3` varchar(3)   DEFAULT NULL,
    `isoId`       varchar(50)  DEFAULT NULL,
    `countryEN`   varchar(255) DEFAULT NULL,
    `countryCN`   varchar(255) DEFAULT NULL,
    `note`        text,
    PRIMARY KEY (`countryId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='国家代码表';

-- ----------------------------
-- Records of countryCode
-- ----------------------------
BEGIN;
INSERT INTO `countryCode`
VALUES (4, 'AF', 'AFG', 'ISO 3166-2:AF', 'Afghanistan', '阿富汗', NULL);
INSERT INTO `countryCode`
VALUES (8, 'AL', 'ALB', 'ISO 3166-2:AL', 'Albania', '阿尔巴尼亚', NULL);
INSERT INTO `countryCode`
VALUES (10, 'AQ', 'ATA', 'ISO 3166-2:AQ', 'Antarctica', '南极洲', NULL);
INSERT INTO `countryCode`
VALUES (12, 'DZ', 'DZA', 'ISO 3166-2:DZ', 'Algeria', '阿尔及利亚', NULL);
INSERT INTO `countryCode`
VALUES (16, 'AS', 'ASM', 'ISO 3166-2:AS', 'American Samoa', '美属萨摩亚', NULL);
INSERT INTO `countryCode`
VALUES (20, 'AD', 'AND', 'ISO 3166-2:AD', 'Andorra', '安道尔', NULL);
INSERT INTO `countryCode`
VALUES (24, 'AO', 'AGO', 'ISO 3166-2:AO', 'Angola', '安哥拉', NULL);
INSERT INTO `countryCode`
VALUES (28, 'AG', 'ATG', 'ISO 3166-2:AG', 'Antigua & Barbuda', '安提瓜和巴布达', NULL);
INSERT INTO `countryCode`
VALUES (31, 'AZ', 'AZE', 'ISO 3166-2:AZ', 'Azerbaijan', '阿塞拜疆', NULL);
INSERT INTO `countryCode`
VALUES (32, 'AR', 'ARG', 'ISO 3166-2:AR', 'Argentina', '阿根廷', NULL);
INSERT INTO `countryCode`
VALUES (36, 'AU', 'AUS', 'ISO 3166-2:AU', 'Australia', '澳大利亚', NULL);
INSERT INTO `countryCode`
VALUES (40, 'AT', 'AUT', 'ISO 3166-2:AT', 'Austria', '奥地利', NULL);
INSERT INTO `countryCode`
VALUES (44, 'BS', 'BHS', 'ISO 3166-2:BS', 'The Bahamas', '巴哈马', NULL);
INSERT INTO `countryCode`
VALUES (48, 'BH', 'BHR', 'ISO 3166-2:BH', 'Bahrain', '巴林', NULL);
INSERT INTO `countryCode`
VALUES (50, 'BD', 'BGD', 'ISO 3166-2:BD', 'Bangladesh', '孟加拉', NULL);
INSERT INTO `countryCode`
VALUES (51, 'AM', 'ARM', 'ISO 3166-2:AM', 'Armenia', '亚美尼亚', NULL);
INSERT INTO `countryCode`
VALUES (52, 'BB', 'BRB', 'ISO 3166-2:BB', 'Barbados', '巴巴多斯', NULL);
INSERT INTO `countryCode`
VALUES (56, 'BE', 'BEL', 'ISO 3166-2:BE', 'Belgium', '比利时', NULL);
INSERT INTO `countryCode`
VALUES (60, 'BM', 'BMU', 'ISO 3166-2:BM', 'Bermuda', '百慕大', NULL);
INSERT INTO `countryCode`
VALUES (64, 'BT', 'BTN', 'ISO 3166-2:BT', 'Bhutan', '不丹', NULL);
INSERT INTO `countryCode`
VALUES (68, 'BO', 'BOL', 'ISO 3166-2:BO', 'Bolivia', '玻利维亚', NULL);
INSERT INTO `countryCode`
VALUES (70, 'BA', 'BIH', 'ISO 3166-2:BA', 'Bosnia & Herzegovina', '波黑', NULL);
INSERT INTO `countryCode`
VALUES (72, 'BW', 'BWA', 'ISO 3166-2:BW', 'Botswana', '博茨瓦纳', NULL);
INSERT INTO `countryCode`
VALUES (74, 'BV', 'BVT', 'ISO 3166-2:BV', 'Bouvet Island', '布韦岛', NULL);
INSERT INTO `countryCode`
VALUES (76, 'BR', 'BRA', 'ISO 3166-2:BR', 'Brazil', '巴西', NULL);
INSERT INTO `countryCode`
VALUES (84, 'BZ', 'BLZ', 'ISO 3166-2:BZ', 'Belize', '伯利兹', NULL);
INSERT INTO `countryCode`
VALUES (86, 'IO', 'IOT', 'ISO 3166-2:IO', 'British Indian Ocean Territory', '英属印度洋领地', NULL);
INSERT INTO `countryCode`
VALUES (90, 'SB', 'SLB', 'ISO 3166-2:SB', 'Solomon Islands', '所罗门群岛', NULL);
INSERT INTO `countryCode`
VALUES (92, 'VG', 'VGB', 'ISO 3166-2:VG', 'British Virgin Islands', '英属维尔京群岛', NULL);
INSERT INTO `countryCode`
VALUES (96, 'BN', 'BRN', 'ISO 3166-2:BN', 'Brunei', '文莱', NULL);
INSERT INTO `countryCode`
VALUES (100, 'BG', 'BGR', 'ISO 3166-2:BG', 'Bulgaria', '保加利亚', NULL);
INSERT INTO `countryCode`
VALUES (104, 'MM', 'MMR', 'ISO 3166-2:MM', 'Myanmar (Burma)', '缅甸', NULL);
INSERT INTO `countryCode`
VALUES (108, 'BI', 'BDI', 'ISO 3166-2:BI', 'Burundi', '布隆迪', NULL);
INSERT INTO `countryCode`
VALUES (112, 'BY', 'BLR', 'ISO 3166-2:BY', 'Belarus', '白俄罗斯', NULL);
INSERT INTO `countryCode`
VALUES (116, 'KH', 'KHM', 'ISO 3166-2:KH', 'Cambodia', '柬埔寨', NULL);
INSERT INTO `countryCode`
VALUES (120, 'CM', 'CMR', 'ISO 3166-2:CM', 'Cameroon', '喀麦隆', NULL);
INSERT INTO `countryCode`
VALUES (124, 'CA', 'CAN', 'ISO 3166-2:CA', 'Canada', '加拿大', NULL);
INSERT INTO `countryCode`
VALUES (132, 'CV', 'CPV', 'ISO 3166-2:CV', 'Cape Verde', '佛得角', NULL);
INSERT INTO `countryCode`
VALUES (136, 'KY', 'CYM', 'ISO 3166-2:KY', 'Cayman Islands', '开曼群岛', NULL);
INSERT INTO `countryCode`
VALUES (140, 'CF', 'CAF', 'ISO 3166-2:CF', 'Central African Republic', '中非', NULL);
INSERT INTO `countryCode`
VALUES (144, 'LK', 'LKA', 'ISO 3166-2:LK', 'Sri Lanka', '斯里兰卡', NULL);
INSERT INTO `countryCode`
VALUES (148, 'TD', 'TCD', 'ISO 3166-2:TD', 'Chad', '乍得', NULL);
INSERT INTO `countryCode`
VALUES (152, 'CL', 'CHL', 'ISO 3166-2:CL', 'Chile', '智利', NULL);
INSERT INTO `countryCode`
VALUES (156, 'CN', 'CHN', 'ISO 3166-2:CN', 'China', '中国 内地',
        '“ GB/T 2659-2000”的“CN”适用于整个 中华人民共和国辖区（包括 中国大陆、 香港、 澳门）。而“ISO 3166-1”和“ CNS 12842”的“CN”则仅适用于中国大陆，不含 港澳地区。');
INSERT INTO `countryCode`
VALUES (158, 'TW', 'TWN', 'ISO 3166-2:TW', 'Taiwan', '中华民国（台湾）',
        '所用英文名称系依据 国际标准化组织之称呼 [1] [2]所示。台湾地区的国际政治地位可参见 未被国际普遍承认的国家列表、 台海现状以及 旧金山条约。');
INSERT INTO `countryCode`
VALUES (162, 'CX', 'CXR', 'ISO 3166-2:CX', 'Christmas Island', '圣诞岛', NULL);
INSERT INTO `countryCode`
VALUES (166, 'CC', 'CCK', 'ISO 3166-2:CC', 'Cocos (Keeling) Islands', '科科斯群岛', NULL);
INSERT INTO `countryCode`
VALUES (170, 'CO', 'COL', 'ISO 3166-2:CO', 'Colombia', '哥伦比亚', NULL);
INSERT INTO `countryCode`
VALUES (174, 'KM', 'COM', 'ISO 3166-2:KM', 'The Comoros', '科摩罗', NULL);
INSERT INTO `countryCode`
VALUES (175, 'YT', 'MYT', 'ISO 3166-2:YT', 'Mayotte', '马约特', NULL);
INSERT INTO `countryCode`
VALUES (178, 'CG', 'COG', 'ISO 3166-2:CG', 'Republic of the Congo', '刚果（布）',
        '中国大陆主要使用“刚果（布）”一词，意指“首都为 布拉柴维尔的 刚果（共和国）”，而“刚果”一词亦普遍为民间所用。');
INSERT INTO `countryCode`
VALUES (180, 'CD', 'COD', 'ISO 3166-2:CD', 'Democratic Republic of the Congo', '刚果（金）',
        '中国大陆主要使用“刚果（金）”一词，意指“首都为 金沙萨的 刚果（共和国）”，而“民主刚果”一词亦普遍为民间所用。');
INSERT INTO `countryCode`
VALUES (184, 'CK', 'COK', 'ISO 3166-2:CK', 'Cook Islands', '库克群岛', '台湾和 香港亦普遍采用“ 科克群岛”（ CNS 12842译名）一词于其它场合');
INSERT INTO `countryCode`
VALUES (188, 'CR', 'CRI', 'ISO 3166-2:CR', 'Costa Rica', '哥斯达黎加', NULL);
INSERT INTO `countryCode`
VALUES (191, 'HR', 'HRV', 'ISO 3166-2:HR', 'Croatia', '克罗地亚', NULL);
INSERT INTO `countryCode`
VALUES (192, 'CU', 'CUB', 'ISO 3166-2:CU', 'Cuba', '古巴', NULL);
INSERT INTO `countryCode`
VALUES (196, 'CY', 'CYP', 'ISO 3166-2:CY', 'Cyprus', '塞浦路斯', NULL);
INSERT INTO `countryCode`
VALUES (203, 'CZ', 'CZE', 'ISO 3166-2:CZ', 'Czech Republic', '捷克', NULL);
INSERT INTO `countryCode`
VALUES (204, 'BJ', 'BEN', 'ISO 3166-2:BJ', 'Benin', '贝宁', NULL);
INSERT INTO `countryCode`
VALUES (208, 'DK', 'DNK', 'ISO 3166-2:DK', 'Denmark', '丹麦', NULL);
INSERT INTO `countryCode`
VALUES (212, 'DM', 'DMA', 'ISO 3166-2:DM', 'Dominica', '多米尼克', NULL);
INSERT INTO `countryCode`
VALUES (214, 'DO', 'DOM', 'ISO 3166-2:DO', 'Dominican Republic', '多米尼加', NULL);
INSERT INTO `countryCode`
VALUES (218, 'EC', 'ECU', 'ISO 3166-2:EC', 'Ecuador', '厄瓜多尔', NULL);
INSERT INTO `countryCode`
VALUES (222, 'SV', 'SLV', 'ISO 3166-2:SV', 'El Salvador', '萨尔瓦多', NULL);
INSERT INTO `countryCode`
VALUES (226, 'GQ', 'GNQ', 'ISO 3166-2:GQ', 'Equatorial Guinea', '赤道几内亚', NULL);
INSERT INTO `countryCode`
VALUES (231, 'ET', 'ETH', 'ISO 3166-2:ET', 'Ethiopia', '埃塞俄比亚', '亦有部份人士使用“ 埃塞俄比亚”一词于 台湾');
INSERT INTO `countryCode`
VALUES (232, 'ER', 'ERI', 'ISO 3166-2:ER', 'Eritrea', '厄立特里亚', NULL);
INSERT INTO `countryCode`
VALUES (233, 'EE', 'EST', 'ISO 3166-2:EE', 'Estonia', '爱沙尼亚', NULL);
INSERT INTO `countryCode`
VALUES (234, 'FO', 'FRO', 'ISO 3166-2:FO', 'Faroe Islands', '法罗群岛', NULL);
INSERT INTO `countryCode`
VALUES (238, 'FK', 'FLK', 'ISO 3166-2:FK', 'Falkland Islands', '马尔维纳斯群岛（ 福克兰）', NULL);
INSERT INTO `countryCode`
VALUES (239, 'GS', 'SGS', 'ISO 3166-2:GS', 'South Georgia and the South Sandwich Islands', '南乔治亚岛和南桑威奇群岛', NULL);
INSERT INTO `countryCode`
VALUES (242, 'FJ', 'FJI', 'ISO 3166-2:FJ', 'Fiji', '斐济群岛', NULL);
INSERT INTO `countryCode`
VALUES (246, 'FI', 'FIN', 'ISO 3166-2:FI', 'Finland', '芬兰', NULL);
INSERT INTO `countryCode`
VALUES (248, 'AX', 'ALA', 'ISO 3166-2:AX', '?aland Island', '奥兰群岛', NULL);
INSERT INTO `countryCode`
VALUES (250, 'FR', 'FRA', 'ISO 3166-2:FR', 'France', '法国', NULL);
INSERT INTO `countryCode`
VALUES (254, 'GF', 'GUF', 'ISO 3166-2:GF', 'French Guiana', '法属圭亚那', NULL);
INSERT INTO `countryCode`
VALUES (258, 'PF', 'PYF', 'ISO 3166-2:PF', 'French polynesia', '法属波利尼西亚', NULL);
INSERT INTO `countryCode`
VALUES (260, 'TF', 'ATF', 'ISO 3166-2:TF', 'French Southern Territories', '法属南部领地',
        '台湾亦普遍采用“ 法属南方及南极陆地”一词于其它场合（如 MSN台湾）');
INSERT INTO `countryCode`
VALUES (262, 'DJ', 'DJI', 'ISO 3166-2:DJ', 'Djibouti', '吉布提', NULL);
INSERT INTO `countryCode`
VALUES (266, 'GA', 'GAB', 'ISO 3166-2:GA', 'Gabon', '加蓬', NULL);
INSERT INTO `countryCode`
VALUES (268, 'GE', 'GEO', 'ISO 3166-2:GE', 'Georgia', '格鲁吉亚', NULL);
INSERT INTO `countryCode`
VALUES (270, 'GM', 'GMB', 'ISO 3166-2:GM', 'Gambia', '冈比亚', '亦有部份人士使用“ 刚比亚”一词于 港澳地区');
INSERT INTO `countryCode`
VALUES (275, 'PS', 'PSE', 'ISO 3166-2:PS', 'Palestinian territories', '巴勒斯坦', NULL);
INSERT INTO `countryCode`
VALUES (276, 'DE', 'DEU', 'ISO 3166-2:DE', 'Germany', '德国', NULL);
INSERT INTO `countryCode`
VALUES (288, 'GH', 'GHA', 'ISO 3166-2:GH', 'Ghana', '加纳', NULL);
INSERT INTO `countryCode`
VALUES (292, 'GI', 'GIB', 'ISO 3166-2:GI', 'Gibraltar', '直布罗陀', NULL);
INSERT INTO `countryCode`
VALUES (296, 'KI', 'KIR', 'ISO 3166-2:KI', 'Kiribati', '基里巴斯', NULL);
INSERT INTO `countryCode`
VALUES (300, 'GR', 'GRC', 'ISO 3166-2:GR', 'Greece', '希腊', NULL);
INSERT INTO `countryCode`
VALUES (304, 'GL', 'GRL', 'ISO 3166-2:GL', 'Greenland', '格陵兰', NULL);
INSERT INTO `countryCode`
VALUES (308, 'GD', 'GRD', 'ISO 3166-2:GD', 'Grenada', '格林纳达', NULL);
INSERT INTO `countryCode`
VALUES (312, 'GP', 'GLP', 'ISO 3166-2:GP', 'Guadeloupe', '瓜德罗普', NULL);
INSERT INTO `countryCode`
VALUES (316, 'GU', 'GUM', 'ISO 3166-2:GU', 'Guam', '关岛', NULL);
INSERT INTO `countryCode`
VALUES (320, 'GT', 'GTM', 'ISO 3166-2:GT', 'Guatemala', '危地马拉', NULL);
INSERT INTO `countryCode`
VALUES (324, 'GN', 'GIN', 'ISO 3166-2:GN', 'Guinea', '几内亚', NULL);
INSERT INTO `countryCode`
VALUES (328, 'GY', 'GUY', 'ISO 3166-2:GY', 'Guyana', '圭亚那', NULL);
INSERT INTO `countryCode`
VALUES (332, 'HT', 'HTI', 'ISO 3166-2:HT', 'Haiti', '海地', NULL);
INSERT INTO `countryCode`
VALUES (334, 'HM', 'HMD', 'ISO 3166-2:HM', 'Heard Island and McDonald Islands', '赫德岛和麦克唐纳群岛', NULL);
INSERT INTO `countryCode`
VALUES (336, 'VA', 'VAT', 'ISO 3166-2:VA', 'Vatican City (The Holy See)', '梵蒂冈', NULL);
INSERT INTO `countryCode`
VALUES (340, 'HN', 'HND', 'ISO 3166-2:HN', 'Honduras', '洪都拉斯', NULL);
INSERT INTO `countryCode`
VALUES (344, 'HK', 'HKG', 'ISO 3166-2:HK', 'Hong Kong', '香港', NULL);
INSERT INTO `countryCode`
VALUES (348, 'HU', 'HUN', 'ISO 3166-2:HU', 'Hungary', '匈牙利', NULL);
INSERT INTO `countryCode`
VALUES (352, 'IS', 'ISL', 'ISO 3166-2:IS', 'Iceland', '冰岛', NULL);
INSERT INTO `countryCode`
VALUES (356, 'IN', 'IND', 'ISO 3166-2:IN', 'India', '印度', NULL);
INSERT INTO `countryCode`
VALUES (360, 'ID', 'IDN', 'ISO 3166-2:ID', 'Indonesia', '印尼', NULL);
INSERT INTO `countryCode`
VALUES (364, 'IR', 'IRN', 'ISO 3166-2:IR', 'Iran', '伊朗', NULL);
INSERT INTO `countryCode`
VALUES (368, 'IQ', 'IRQ', 'ISO 3166-2:IQ', 'Iraq', '伊拉克', NULL);
INSERT INTO `countryCode`
VALUES (372, 'IE', 'IRL', 'ISO 3166-2:IE', 'Ireland', '爱尔兰', NULL);
INSERT INTO `countryCode`
VALUES (376, 'IL', 'ISR', 'ISO 3166-2:IL', 'Israel', '以色列', NULL);
INSERT INTO `countryCode`
VALUES (380, 'IT', 'ITA', 'ISO 3166-2:IT', 'Italy', '意大利', NULL);
INSERT INTO `countryCode`
VALUES (384, 'CI', 'CIV', 'ISO 3166-2:CI', 'C?te d\'Ivoire', '科特迪瓦', '香港亦普遍采用“科特迪瓦”一词于其它场合（如 香港邮政的邮政指南附录表）');
INSERT INTO `countryCode`
VALUES (388, 'JM', 'JAM', 'ISO 3166-2:JM', 'Jamaica', '牙买加', NULL);
INSERT INTO `countryCode`
VALUES (392, 'JP', 'JPN', 'ISO 3166-2:JP', 'Japan', '日本', NULL);
INSERT INTO `countryCode`
VALUES (398, 'KZ', 'KAZ', 'ISO 3166-2:KZ', 'Kazakhstan', '哈萨克斯坦', '香港习惯略去“斯坦”后缀，有必要会用全称');
INSERT INTO `countryCode`
VALUES (400, 'JO', 'JOR', 'ISO 3166-2:JO', 'Jordan', '约旦', NULL);
INSERT INTO `countryCode`
VALUES (404, 'KE', 'KEN', 'ISO 3166-2:KE', 'Kenya', '肯尼亚', '香港亦普遍采用“ 肯尼亚”一词于其它场合');
INSERT INTO `countryCode`
VALUES (408, 'KP', 'PRK', 'ISO 3166-2:KP', 'North Korea', '朝鲜 北朝鲜', '澳门习惯称之为“ 北朝鲜”');
INSERT INTO `countryCode`
VALUES (410, 'KR', 'KOR', 'ISO 3166-2:KR', 'South Korea', '韩国 南朝鲜', '澳门习惯称之为“ 韩国”');
INSERT INTO `countryCode`
VALUES (414, 'KW', 'KWT', 'ISO 3166-2:KW', 'Kuwait', '科威特', NULL);
INSERT INTO `countryCode`
VALUES (417, 'KG', 'KGZ', 'ISO 3166-2:KG', 'Kyrgyzstan', '吉尔吉斯斯坦', '香港习惯略去“斯坦”后缀，有必要会用全称');
INSERT INTO `countryCode`
VALUES (418, 'LA', 'LAO', 'ISO 3166-2:LA', 'Laos', '老挝', '新加坡与 马来西亚均将之译作“老挝”');
INSERT INTO `countryCode`
VALUES (422, 'LB', 'LBN', 'ISO 3166-2:LB', 'Lebanon', '黎巴嫩', NULL);
INSERT INTO `countryCode`
VALUES (426, 'LS', 'LSO', 'ISO 3166-2:LS', 'Lesotho', '莱索托', NULL);
INSERT INTO `countryCode`
VALUES (428, 'LV', 'LVA', 'ISO 3166-2:LV', 'Latvia', '拉脱维亚', NULL);
INSERT INTO `countryCode`
VALUES (430, 'LR', 'LBR', 'ISO 3166-2:LR', 'Liberia', '利比里亚', NULL);
INSERT INTO `countryCode`
VALUES (434, 'LY', 'LBY', 'ISO 3166-2:LY', 'Libya', '利比亚', NULL);
INSERT INTO `countryCode`
VALUES (438, 'LI', 'LIE', 'ISO 3166-2:LI', 'Liechtenstein', '列支敦士登', NULL);
INSERT INTO `countryCode`
VALUES (440, 'LT', 'LTU', 'ISO 3166-2:LT', 'Lithuania', '立陶宛', NULL);
INSERT INTO `countryCode`
VALUES (442, 'LU', 'LUX', 'ISO 3166-2:LU', 'Luxembourg', '卢森堡', NULL);
INSERT INTO `countryCode`
VALUES (446, 'MO', 'MAC', 'ISO 3166-2:MO', 'Macao', '澳门', NULL);
INSERT INTO `countryCode`
VALUES (450, 'MG', 'MDG', 'ISO 3166-2:MG', 'Madagascar', '马达加斯加', NULL);
INSERT INTO `countryCode`
VALUES (454, 'MW', 'MWI', 'ISO 3166-2:MW', 'Malawi', '马拉维', NULL);
INSERT INTO `countryCode`
VALUES (458, 'MY', 'MYS', 'ISO 3166-2:MY', 'Malaysia', '马来西亚', NULL);
INSERT INTO `countryCode`
VALUES (462, 'MV', 'MDV', 'ISO 3166-2:MV', 'Maldives', '马尔代夫', NULL);
INSERT INTO `countryCode`
VALUES (466, 'ML', 'MLI', 'ISO 3166-2:ML', 'Mali', '马里', NULL);
INSERT INTO `countryCode`
VALUES (470, 'MT', 'MLT', 'ISO 3166-2:MT', 'Malta', '马耳他', NULL);
INSERT INTO `countryCode`
VALUES (474, 'MQ', 'MTQ', 'ISO 3166-2:MQ', 'Martinique', '马提尼克', NULL);
INSERT INTO `countryCode`
VALUES (478, 'MR', 'MRT', 'ISO 3166-2:MR', 'Mauritania', '毛里塔尼亚', NULL);
INSERT INTO `countryCode`
VALUES (480, 'MU', 'MUS', 'ISO 3166-2:MU', 'Mauritius', '毛里求斯', '香港亦普遍采用“ 毛里求斯”一词于其它场合');
INSERT INTO `countryCode`
VALUES (484, 'MX', 'MEX', 'ISO 3166-2:MX', 'Mexico', '墨西哥', NULL);
INSERT INTO `countryCode`
VALUES (492, 'MC', 'MCO', 'ISO 3166-2:MC', 'Monaco', '摩纳哥', NULL);
INSERT INTO `countryCode`
VALUES (496, 'MN', 'MNG', 'ISO 3166-2:MN', 'Mongolia', '蒙古国 蒙古', '香港亦普遍采用“ 蒙古”一词于其它场合');
INSERT INTO `countryCode`
VALUES (498, 'MD', 'MDA', 'ISO 3166-2:MD', 'Moldova', '摩尔多瓦', NULL);
INSERT INTO `countryCode`
VALUES (499, 'ME', 'MNE', 'ISO 3166-2:ME', 'Montenegro', '黑山', NULL);
INSERT INTO `countryCode`
VALUES (500, 'MS', 'MSR', 'ISO 3166-2:MS', 'Montserrat', '蒙塞拉特岛', NULL);
INSERT INTO `countryCode`
VALUES (504, 'MA', 'MAR', 'ISO 3166-2:MA', 'Morocco', '摩洛哥', NULL);
INSERT INTO `countryCode`
VALUES (508, 'MZ', 'MOZ', 'ISO 3166-2:MZ', 'Mozambique', '莫桑比克', '中国大陆和 台湾均曾将之普遍译作“ 莫三比给”');
INSERT INTO `countryCode`
VALUES (512, 'OM', 'OMN', 'ISO 3166-2:OM', 'Oman', '阿曼', NULL);
INSERT INTO `countryCode`
VALUES (516, 'NA', 'NAM', 'ISO 3166-2:NA', 'Namibia', '纳米比亚', NULL);
INSERT INTO `countryCode`
VALUES (520, 'NR', 'NRU', 'ISO 3166-2:NR', 'Nauru', '瑙鲁', NULL);
INSERT INTO `countryCode`
VALUES (524, 'NP', 'NPL', 'ISO 3166-2:NP', 'Nepal', '尼泊尔', NULL);
INSERT INTO `countryCode`
VALUES (528, 'NL', 'NLD', 'ISO 3166-2:NL', 'Netherlands', '荷兰', NULL);
INSERT INTO `countryCode`
VALUES (533, 'AW', 'ABW', 'ISO 3166-2:AW', 'Aruba', '阿鲁巴', NULL);
INSERT INTO `countryCode`
VALUES (535, 'BQ', 'BES', 'ISO 3166-2:BQ', 'Caribbean Netherlands', '荷兰加勒比区', NULL);
INSERT INTO `countryCode`
VALUES (540, 'NC', 'NCL', 'ISO 3166-2:NC', 'New Caledonia', '新喀里多尼亚', '亦有部份人士使用“ 新喀尔多尼亚”一词于 港澳地区');
INSERT INTO `countryCode`
VALUES (548, 'VU', 'VUT', 'ISO 3166-2:VU', 'Vanuatu', '瓦努阿图', '亦有部份人士使用“ 瓦努阿图”一词于 港澳地区');
INSERT INTO `countryCode`
VALUES (554, 'NZ', 'NZL', 'ISO 3166-2:NZ', 'New Zealand', '新西兰', '新加坡与 马来西亚均将之译作“ 新西兰”。 香港亦普遍采用“新西兰”一词于其它场合');
INSERT INTO `countryCode`
VALUES (558, 'NI', 'NIC', 'ISO 3166-2:NI', 'Nicaragua', '尼加拉瓜', NULL);
INSERT INTO `countryCode`
VALUES (562, 'NE', 'NER', 'ISO 3166-2:NE', 'Niger', '尼日尔', NULL);
INSERT INTO `countryCode`
VALUES (566, 'NG', 'NGA', 'ISO 3166-2:NG', 'Nigeria', '尼日利亚', NULL);
INSERT INTO `countryCode`
VALUES (570, 'NU', 'NIU', 'ISO 3166-2:NU', 'Niue', '纽埃', '台湾亦普遍采用“ 纽威岛”（ CNS 12842译名）一词于其它场合（如 MSN台湾）');
INSERT INTO `countryCode`
VALUES (574, 'NF', 'NFK', 'ISO 3166-2:NF', 'Norfolk Island', '诺福克岛', NULL);
INSERT INTO `countryCode`
VALUES (578, 'NO', 'NOR', 'ISO 3166-2:NO', 'Norway', '挪威', NULL);
INSERT INTO `countryCode`
VALUES (580, 'MP', 'MNP', 'ISO 3166-2:MP', 'Northern Mariana Islands', '北马里亚纳群岛', '亦有部份人士使用“ 北玛利安娜群岛”一词于 港澳地区');
INSERT INTO `countryCode`
VALUES (581, 'UM', 'UMI', 'ISO 3166-2:UM', 'United States Minor Outlying Islands', '美国本土外小岛屿',
        '台湾亦普遍采用“ 美国外岛”一词于其它场合（如 MSN台湾）');
INSERT INTO `countryCode`
VALUES (583, 'FM', 'FSM', 'ISO 3166-2:FM', 'Federated States of Micronesia', '密克罗尼西亚联邦', NULL);
INSERT INTO `countryCode`
VALUES (584, 'MH', 'MHL', 'ISO 3166-2:MH', 'Marshall islands', '马绍尔群岛', NULL);
INSERT INTO `countryCode`
VALUES (585, 'PW', 'PLW', 'ISO 3166-2:PW', 'Palau', '帕劳', NULL);
INSERT INTO `countryCode`
VALUES (586, 'PK', 'PAK', 'ISO 3166-2:PK', 'Pakistan', '巴基斯坦', NULL);
INSERT INTO `countryCode`
VALUES (591, 'PA', 'PAN', 'ISO 3166-2:PA', 'Panama', '巴拿马', NULL);
INSERT INTO `countryCode`
VALUES (598, 'PG', 'PNG', 'ISO 3166-2:PG', 'Papua New Guinea', '巴布亚新几内亚', NULL);
INSERT INTO `countryCode`
VALUES (600, 'PY', 'PRY', 'ISO 3166-2:PY', 'Paraguay', '巴拉圭', NULL);
INSERT INTO `countryCode`
VALUES (604, 'PE', 'PER', 'ISO 3166-2:PE', 'Peru', '秘鲁', NULL);
INSERT INTO `countryCode`
VALUES (608, 'PH', 'PHL', 'ISO 3166-2:PH', 'The Philippines', '菲律宾', NULL);
INSERT INTO `countryCode`
VALUES (612, 'PN', 'PCN', 'ISO 3166-2:PN', 'Pitcairn Islands', '皮特凯恩群岛', NULL);
INSERT INTO `countryCode`
VALUES (616, 'PL', 'POL', 'ISO 3166-2:PL', 'Poland', '波兰', NULL);
INSERT INTO `countryCode`
VALUES (620, 'PT', 'PRT', 'ISO 3166-2:PT', 'Portugal', '葡萄牙', '澳门民间亦普遍称之为葡国');
INSERT INTO `countryCode`
VALUES (624, 'GW', 'GNB', 'ISO 3166-2:GW', 'Guinea-Bissau', '几内亚比绍', NULL);
INSERT INTO `countryCode`
VALUES (626, 'TL', 'TLS', 'ISO 3166-2:TP', 'Timor-Leste (East Timor)', '东帝汶', NULL);
INSERT INTO `countryCode`
VALUES (630, 'PR', 'PRI', 'ISO 3166-2:PR', 'Puerto Rico', '波多黎各', NULL);
INSERT INTO `countryCode`
VALUES (634, 'QA', 'QAT', 'ISO 3166-2:QA', 'Qatar', '卡塔尔', NULL);
INSERT INTO `countryCode`
VALUES (638, 'RE', 'REU', 'ISO 3166-2:RE', 'Réunion', '留尼汪', NULL);
INSERT INTO `countryCode`
VALUES (642, 'RO', 'ROU', 'ISO 3166-2:RO', 'Romania', '罗马尼亚', NULL);
INSERT INTO `countryCode`
VALUES (643, 'RU', 'RUS', 'ISO 3166-2:RU', 'Russian Federation', '俄罗斯', NULL);
INSERT INTO `countryCode`
VALUES (646, 'RW', 'RWA', 'ISO 3166-2:RW', 'Rwanda', '卢旺达', NULL);
INSERT INTO `countryCode`
VALUES (652, 'BL', 'BLM', 'ISO 3166-2:BL', 'Saint Barthélemy', '圣巴泰勒米岛', NULL);
INSERT INTO `countryCode`
VALUES (654, 'SH', 'SHN', 'ISO 3166-2:SH', 'St. Helena & Dependencies', '圣赫勒拿',
        '香港亦普遍采用“ 圣赫勒拿岛”一词于其它场合（如 香港邮政的邮政指南附录表）。亦有部份人士使用“ 圣海伦娜岛”一词于 港澳地区');
INSERT INTO `countryCode`
VALUES (659, 'KN', 'KNA', 'ISO 3166-2:KN', 'St. Kitts & Nevis', '圣基茨和尼维斯',
        '香港亦普遍采用“ 圣克里斯托佛岛及尼维斯岛”一词于其它场合（如 香港邮政的邮政指南附录表）。亦有部份人士使用“ 圣基茨和尼维斯”一词于 港澳地区');
INSERT INTO `countryCode`
VALUES (660, 'AI', 'AIA', 'ISO 3166-2:AI', 'Anguilla', '安圭拉', NULL);
INSERT INTO `countryCode`
VALUES (662, 'LC', 'LCA', 'ISO 3166-2:LC', 'St. Lucia', '圣卢西亚', '香港亦普遍采用“ 圣路西亚”一词于其它场合');
INSERT INTO `countryCode`
VALUES (663, 'MF', 'MAF', 'ISO 3166-2:MF', 'Saint Martin (France)', '法属圣马丁', NULL);
INSERT INTO `countryCode`
VALUES (666, 'PM', 'SPM', 'ISO 3166-2:PM', 'Saint-Pierre and Miquelon', '圣皮埃尔和密克隆',
        '香港亦普遍采用“ 圣皮埃兰和密克隆群岛”一词于其它场合（如 香港邮政的邮政指南附录表）');
INSERT INTO `countryCode`
VALUES (670, 'VC', 'VCT', 'ISO 3166-2:VC', 'St. Vincent & the Grenadines', '圣文森特和格林纳丁斯', '台湾将之简称为“ 圣文森”');
INSERT INTO `countryCode`
VALUES (674, 'SM', 'SMR', 'ISO 3166-2:SM', 'San Marino', '圣马力诺', NULL);
INSERT INTO `countryCode`
VALUES (678, 'ST', 'STP', 'ISO 3166-2:ST', 'Sao Tome & Principe', '圣多美和普林西比', NULL);
INSERT INTO `countryCode`
VALUES (682, 'SA', 'SAU', 'ISO 3166-2:SA', 'Saudi Arabia', '沙特阿拉伯', '新加坡与 马来西亚均将之译作“ 沙特阿拉伯”。 香港亦普遍采用“沙特阿拉伯”一词于其它场合');
INSERT INTO `countryCode`
VALUES (686, 'SN', 'SEN', 'ISO 3166-2:SN', 'Senegal', '塞内加尔', NULL);
INSERT INTO `countryCode`
VALUES (688, 'RS', 'SRB', 'ISO 3166-2:RS', 'Serbia', '塞尔维亚', NULL);
INSERT INTO `countryCode`
VALUES (690, 'SC', 'SYC', 'ISO 3166-2:SC', 'Seychelles', '塞舌尔', NULL);
INSERT INTO `countryCode`
VALUES (694, 'SL', 'SLE', 'ISO 3166-2:SL', 'Sierra Leone', '塞拉利昂', NULL);
INSERT INTO `countryCode`
VALUES (702, 'SG', 'SGP', 'ISO 3166-2:SG', 'Singapore', '新加坡', NULL);
INSERT INTO `countryCode`
VALUES (703, 'SK', 'SVK', 'ISO 3166-2:SK', 'Slovakia', '斯洛伐克', NULL);
INSERT INTO `countryCode`
VALUES (704, 'VN', 'VNM', 'ISO 3166-2:VN', 'Vietnam', '越南', NULL);
INSERT INTO `countryCode`
VALUES (705, 'SI', 'SVN', 'ISO 3166-2:SI', 'Slovenia', '斯洛文尼亚', NULL);
INSERT INTO `countryCode`
VALUES (706, 'SO', 'SOM', 'ISO 3166-2:SO', 'Somalia', '索马里', NULL);
INSERT INTO `countryCode`
VALUES (710, 'ZA', 'ZAF', 'ISO 3166-2:ZA', 'South Africa', '南非', NULL);
INSERT INTO `countryCode`
VALUES (716, 'ZW', 'ZWE', 'ISO 3166-2:ZW', 'Zimbabwe', '津巴布韦', NULL);
INSERT INTO `countryCode`
VALUES (724, 'ES', 'ESP', 'ISO 3166-2:ES', 'Spain', '西班牙', NULL);
INSERT INTO `countryCode`
VALUES (728, 'SS', 'SSD', 'ISO 3166-2:SS', 'South Sudan', '南苏丹', NULL);
INSERT INTO `countryCode`
VALUES (729, 'SD', 'SDN', 'ISO 3166-2:SD', 'Sudan', '苏丹', NULL);
INSERT INTO `countryCode`
VALUES (732, 'EH', 'ESH', 'ISO 3166-2:EH', 'Western Sahara', '西撒哈拉', NULL);
INSERT INTO `countryCode`
VALUES (740, 'SR', 'SUR', 'ISO 3166-2:SR', 'Suriname', '苏里南', NULL);
INSERT INTO `countryCode`
VALUES (744, 'SJ', 'SJM', 'ISO 3166-2:SJ', 'Template:Country data SJM Svalbard', '斯瓦尔巴群岛和 扬马延岛', NULL);
INSERT INTO `countryCode`
VALUES (748, 'SZ', 'SWZ', 'ISO 3166-2:SZ', 'Swaziland', '斯威士兰', NULL);
INSERT INTO `countryCode`
VALUES (752, 'SE', 'SWE', 'ISO 3166-2:SE', 'Sweden', '瑞典', NULL);
INSERT INTO `countryCode`
VALUES (756, 'CH', 'CHE', 'ISO 3166-2:CH', 'Switzerland', '瑞士', NULL);
INSERT INTO `countryCode`
VALUES (760, 'SY', 'SYR', 'ISO 3166-2:SY', 'Syria', '叙利亚', NULL);
INSERT INTO `countryCode`
VALUES (762, 'TJ', 'TJK', 'ISO 3166-2:TJ', 'Tajikistan', '塔吉克斯坦', '香港习惯略去“斯坦”后缀，有必要会用全称');
INSERT INTO `countryCode`
VALUES (764, 'TH', 'THA', 'ISO 3166-2:TH', 'Thailand', '泰国', NULL);
INSERT INTO `countryCode`
VALUES (768, 'TG', 'TGO', 'ISO 3166-2:TG', 'Togo', '多哥', NULL);
INSERT INTO `countryCode`
VALUES (772, 'TK', 'TKL', 'ISO 3166-2:TK', 'Tokelau', '托克劳', NULL);
INSERT INTO `countryCode`
VALUES (776, 'TO', 'TON', 'ISO 3166-2:TO', 'Tonga', '汤加', NULL);
INSERT INTO `countryCode`
VALUES (780, 'TT', 'TTO', 'ISO 3166-2:TT', 'Trinidad & Tobago', '特立尼达和多巴哥', '台湾和 香港均将之简称为“ 特立尼达”');
INSERT INTO `countryCode`
VALUES (784, 'AE', 'ARE', 'ISO 3166-2:AE', 'United Arab Emirates', '阿联酋', NULL);
INSERT INTO `countryCode`
VALUES (788, 'TN', 'TUN', 'ISO 3166-2:TN', 'Tunisia', '突尼斯', NULL);
INSERT INTO `countryCode`
VALUES (792, 'TR', 'TUR', 'ISO 3166-2:TR', 'Turkey', '土耳其', NULL);
INSERT INTO `countryCode`
VALUES (795, 'TM', 'TKM', 'ISO 3166-2:TM', 'Turkmenistan', '土库曼斯坦', '香港习惯略去“斯坦”后缀，有必要会用全称');
INSERT INTO `countryCode`
VALUES (796, 'TC', 'TCA', 'ISO 3166-2:TC', 'Turks & Caicos Islands', '特克斯和凯科斯群岛', NULL);
INSERT INTO `countryCode`
VALUES (798, 'TV', 'TUV', 'ISO 3166-2:TV', 'Tuvalu', '图瓦卢', NULL);
INSERT INTO `countryCode`
VALUES (800, 'UG', 'UGA', 'ISO 3166-2:UG', 'Uganda', '乌干达', NULL);
INSERT INTO `countryCode`
VALUES (804, 'UA', 'UKR', 'ISO 3166-2:UA', 'Ukraine', '乌克兰', NULL);
INSERT INTO `countryCode`
VALUES (807, 'MK', 'MKD', 'ISO 3166-2:MK', 'Republic of Macedonia (FYROM)', '马其顿', NULL);
INSERT INTO `countryCode`
VALUES (818, 'EG', 'EGY', 'ISO 3166-2:EG', 'Egypt', '埃及', NULL);
INSERT INTO `countryCode`
VALUES (826, 'GB', 'GBR', 'ISO 3166-2:GB', 'Great Britain (United Kingdom; England)', '英国',
        '台湾和 香港亦普遍采用“ 联合王国”一词于其它场合');
INSERT INTO `countryCode`
VALUES (831, 'GG', 'GGY', 'ISO 3166-2:GG', 'Guernsey', '根西岛', '中国大陆曾将之普遍译作“ 格恩西岛”');
INSERT INTO `countryCode`
VALUES (832, 'JE', 'JEY', 'ISO 3166-2:JE', 'Jersey', '泽西岛', NULL);
INSERT INTO `countryCode`
VALUES (833, 'IM', 'IMN', 'ISO 3166-2:IM', 'Isle of Man', '马恩岛', NULL);
INSERT INTO `countryCode`
VALUES (834, 'TZ', 'TZA', 'ISO 3166-2:TZ', 'Tanzania', '坦桑尼亚', NULL);
INSERT INTO `countryCode`
VALUES (840, 'US', 'USA', 'ISO 3166-2:US', 'United States of America (USA)', '美国', NULL);
INSERT INTO `countryCode`
VALUES (850, 'VI', 'VIR', 'ISO 3166-2:VI', 'United States Virgin Islands', '美属维尔京群岛', NULL);
INSERT INTO `countryCode`
VALUES (854, 'BF', 'BFA', 'ISO 3166-2:BF', 'Burkina', '布基纳法索', NULL);
INSERT INTO `countryCode`
VALUES (858, 'UY', 'URY', 'ISO 3166-2:UY', 'Uruguay', '乌拉圭', NULL);
INSERT INTO `countryCode`
VALUES (860, 'UZ', 'UZB', 'ISO 3166-2:UZ', 'Uzbekistan', '乌兹别克斯坦', '香港习惯略去“斯坦”后缀，有必要会用全称');
INSERT INTO `countryCode`
VALUES (862, 'VE', 'VEN', 'ISO 3166-2:VE', 'Venezuela', '委内瑞拉', NULL);
INSERT INTO `countryCode`
VALUES (876, 'WF', 'WLF', 'ISO 3166-2:WF', 'Wallis and Futuna', '瓦利斯和富图纳', NULL);
INSERT INTO `countryCode`
VALUES (882, 'WS', 'WSM', 'ISO 3166-2:WS', 'Samoa', '萨摩亚', NULL);
INSERT INTO `countryCode`
VALUES (887, 'YE', 'YEM', 'ISO 3166-2:YE', 'Yemen', '也门', NULL);
INSERT INTO `countryCode`
VALUES (894, 'ZM', 'ZMB', 'ISO 3166-2:ZM', 'Zambia', '赞比亚', NULL);
COMMIT;

-- ----------------------------
-- Table structure for discountDistributionList
-- ----------------------------
DROP TABLE IF EXISTS `discountDistributionList`;
CREATE TABLE `discountDistributionList`
(
    `distributionId` int      NOT NULL AUTO_INCREMENT COMMENT '折扣发放ID',
    `discountId`     int      NOT NULL COMMENT '优惠产品ID',
    `userId`         int      NOT NULL COMMENT '用户ID',
    `status`         int               DEFAULT NULL COMMENT '优惠状态',
    `parameter`      json              DEFAULT NULL COMMENT '商品参数JSON',
    `updateTime`     datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`distributionId`) USING BTREE,
    KEY `discountId` (`discountId`),
    KEY `userId` (`userId`),
    CONSTRAINT `discountDistributionList_ibfk_1` FOREIGN KEY (`discountId`) REFERENCES `discountInfo` (`discountId`),
    CONSTRAINT `discountDistributionList_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `userInfo` (`userId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='折扣发放列表';

-- ----------------------------
-- Records of discountDistributionList
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for discountInfo
-- ----------------------------
DROP TABLE IF EXISTS `discountInfo`;
CREATE TABLE `discountInfo`
(
    `discountId`     int                       NOT NULL AUTO_INCREMENT COMMENT '优惠产品ID',
    `discountType`   int(10) unsigned zerofill NOT NULL COMMENT '优惠类型',
    `startTime`      datetime                  NOT NULL COMMENT '开始时间',
    `stopTime`       datetime                  NOT NULL COMMENT '结束时间',
    `discountNum`    int                                DEFAULT NULL COMMENT '可使用的优惠数量',
    `discountAmount` decimal(10, 2)            NOT NULL COMMENT '优惠金额',
    `status`         int                                DEFAULT NULL COMMENT '优惠状态',
    `parameter`      json                               DEFAULT NULL COMMENT '商品参数JSON',
    `updateTime`     datetime                  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`discountId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='优惠信息\ndiscountType 优惠类型\n0 优惠券\n1 红包';

-- ----------------------------
-- Records of discountInfo
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for favoriteCommodity
-- ----------------------------
DROP TABLE IF EXISTS `favoriteCommodity`;
CREATE TABLE `favoriteCommodity`
(
    `collectionId`     int                       NOT NULL AUTO_INCREMENT COMMENT '收藏夹ID',
    `commodityId`      int                       NOT NULL COMMENT '商品ID',
    `userId`           int                       NOT NULL COMMENT '用户ID',
    `collectionStatus` int(10) unsigned zerofill NOT NULL COMMENT '收藏状态',
    `parameter`        json                               DEFAULT NULL COMMENT '商品参数JSON',
    `updateTime`       datetime                  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`collectionId`),
    KEY `commodityId` (`commodityId`),
    KEY `userId` (`userId`),
    CONSTRAINT `favoriteCommodity_ibfk_1` FOREIGN KEY (`commodityId`) REFERENCES `commodityInformation` (`commodityId`),
    CONSTRAINT `favoriteCommodity_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `userInfo` (`userId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户商品收藏夹\n\n此表数据不允许删除，用户手工删除字段使用';

-- ----------------------------
-- Records of favoriteCommodity
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for orderInfo
-- ----------------------------
DROP TABLE IF EXISTS `orderInfo`;
CREATE TABLE `orderInfo`
(
    `orderId`           int NOT NULL AUTO_INCREMENT COMMENT '订单ID',
    `transactionId`     int NOT NULL COMMENT '父订单（交易信息）ID',
    `commodityId`       int NOT NULL COMMENT '商品ID',
    `transactionAmount` decimal(10, 2) DEFAULT NULL COMMENT '成交金额',
    `transactionNum`    decimal(10, 2) DEFAULT NULL COMMENT '成交数量',
    `parameter`         json           DEFAULT NULL COMMENT '商品参数JSON',
    PRIMARY KEY (`orderId`) USING BTREE,
    KEY `commodityId` (`commodityId`),
    KEY `orderInfo_ibfk_1` (`transactionId`),
    CONSTRAINT `orderInfo_ibfk_1` FOREIGN KEY (`transactionId`) REFERENCES `transactionInformation` (`transactionId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT `orderInfo_ibfk_2` FOREIGN KEY (`commodityId`) REFERENCES `commodityInformation` (`commodityId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='订单信息';

-- ----------------------------
-- Records of orderInfo
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for passwordTable
-- ----------------------------
DROP TABLE IF EXISTS `passwordTable`;
CREATE TABLE `passwordTable`
(
    `passId`     int                                                   NOT NULL AUTO_INCREMENT COMMENT '密码ID',
    `original`   varchar(255)                                          NOT NULL COMMENT '原始密码',
    `encryption` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '加密密码',
    PRIMARY KEY (`passId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='密码对照表\n';

-- ----------------------------
-- Records of passwordTable
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for shoppingCart
-- ----------------------------
DROP TABLE IF EXISTS `shoppingCart`;
CREATE TABLE `shoppingCart`
(
    `itemId`      int          NOT NULL AUTO_INCREMENT COMMENT '购物车项目ID',
    `userId`      int          NOT NULL COMMENT '用户ID',
    `commodityId` int          NOT NULL COMMENT '商品ID',
    `itemNum`     int          NOT NULL COMMENT '项目购物车加入数',
    `parameter`   json                  DEFAULT NULL COMMENT '商品参数JSON',
    `checkStatus` varchar(255) NOT NULL COMMENT '用户勾选状态',
    `updateTime`  datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`itemId`) USING BTREE,
    KEY `userId` (`userId`),
    KEY `commodityId` (`commodityId`),
    CONSTRAINT `shoppingCart_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `userList` (`userId`),
    CONSTRAINT `shoppingCart_ibfk_3` FOREIGN KEY (`commodityId`) REFERENCES `commodityInformation` (`commodityId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户购物车';

-- ----------------------------
-- Records of shoppingCart
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for systemParameters
-- ----------------------------
DROP TABLE IF EXISTS `systemParameters`;
CREATE TABLE `systemParameters`
(
    `parameterId`    int                                                     NOT NULL AUTO_INCREMENT COMMENT '参数ID',
    `parameterType`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '参数类型',
    `parameterValue` text CHARACTER SET utf8 COLLATE utf8_general_ci         NOT NULL COMMENT '参数值',
    `parameter`      json                                                             DEFAULT NULL COMMENT '其他参数',
    `updateTime`     datetime                                                NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `note`           varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci          DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`parameterId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='系统参数';

-- ----------------------------
-- Records of systemParameters
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for systemPermissions
-- ----------------------------
DROP TABLE IF EXISTS `systemPermissions`;
CREATE TABLE `systemPermissions`
(
    `privilegeId`     int                                                     NOT NULL AUTO_INCREMENT COMMENT '权限ID',
    `permissionTypes` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限类型',
    `stateAuthority`  int                                                     NOT NULL DEFAULT '0' COMMENT '权限状态',
    `parameter`       json                                                             DEFAULT NULL COMMENT '参数',
    `updateTime`      datetime                                                NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `note`            varchar(255)                                                     DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`privilegeId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='系统权限';

-- ----------------------------
-- Records of systemPermissions
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for transactionInformation
-- ----------------------------
DROP TABLE IF EXISTS `transactionInformation`;
CREATE TABLE `transactionInformation`
(
    `transactionId`     int                       NOT NULL AUTO_INCREMENT COMMENT '交易ID',
    `userId`            int                       NOT NULL COMMENT '用户ID',
    `addressId`         int                       NOT NULL COMMENT '用户地址ID',
    `transactionStatus` int(10) unsigned zerofill NOT NULL COMMENT '交易状态',
    `note`              varchar(255)                       DEFAULT NULL COMMENT '交易备注',
    `parameter`         json                               DEFAULT NULL COMMENT '商品参数JSON',
    `updateTime`        datetime                  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`transactionId`),
    KEY `transactionId` (`transactionId`),
    KEY `userId` (`userId`),
    KEY `addressId` (`addressId`),
    CONSTRAINT `transactionInformation_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `userInfo` (`userId`),
    CONSTRAINT `transactionInformation_ibfk_2` FOREIGN KEY (`addressId`) REFERENCES `userAddress` (`addressId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='交易信息\ntransactionStatus交易状态\n0 正常\n1 关闭';

-- ----------------------------
-- Records of transactionInformation
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for userAddress
-- ----------------------------
DROP TABLE IF EXISTS `userAddress`;
CREATE TABLE `userAddress`
(
    `addressId`       int NOT NULL AUTO_INCREMENT COMMENT '地址ID',
    `userId`          int NOT NULL COMMENT '用户ID',
    `countryId`       int                                                     DEFAULT NULL COMMENT '国家ID',
    `userAddPhone`    varchar(255)                                            DEFAULT NULL COMMENT '用户手机号',
    `province`        int                                                     DEFAULT NULL COMMENT '省',
    `city`            int                                                     DEFAULT NULL COMMENT '市',
    `area`            int                                                     DEFAULT NULL COMMENT '区',
    `detailedAddress` varchar(255)                                            DEFAULT NULL COMMENT '详细地址',
    `postcode`        varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '区',
    `label`           varchar(255)                                            DEFAULT NULL COMMENT '标签',
    `note`            varchar(255)                                            DEFAULT NULL COMMENT '备注',
    `realSurname`     varchar(255)                                            DEFAULT NULL COMMENT '用户姓氏',
    `realGivenName`   varchar(255)                                            DEFAULT NULL COMMENT '用户名字',
    PRIMARY KEY (`addressId`),
    KEY `userId` (`userId`),
    KEY `countryId` (`countryId`),
    KEY `province` (`province`),
    KEY `city` (`city`),
    KEY `area` (`area`),
    CONSTRAINT `userAddress_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `userList` (`userId`),
    CONSTRAINT `userAddress_ibfk_2` FOREIGN KEY (`countryId`) REFERENCES `countryCode` (`countryId`),
    CONSTRAINT `userAddress_ibfk_3` FOREIGN KEY (`province`) REFERENCES `amapDistrictTable` (`districtId`),
    CONSTRAINT `userAddress_ibfk_4` FOREIGN KEY (`city`) REFERENCES `amapDistrictTable` (`districtId`),
    CONSTRAINT `userAddress_ibfk_5` FOREIGN KEY (`area`) REFERENCES `amapDistrictTable` (`districtId`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8 COMMENT ='用户地址';

-- ----------------------------
-- Records of userAddress
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for userBrowsingRecords
-- ----------------------------
DROP TABLE IF EXISTS `userBrowsingRecords`;
CREATE TABLE `userBrowsingRecords`
(
    `recordId`    int      NOT NULL AUTO_INCREMENT COMMENT '记录ID',
    `commodityId` int      NOT NULL COMMENT '商品ID',
    `userId`      int               DEFAULT NULL COMMENT '用户ID',
    `districtId`  int               DEFAULT NULL COMMENT '访问地区ID',
    `parameter`   json              DEFAULT NULL COMMENT '商品参数JSON',
    `updateTime`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`recordId`) USING BTREE,
    KEY `userId` (`userId`),
    KEY `commodityId` (`commodityId`),
    KEY `areaId` (`districtId`),
    CONSTRAINT `userBrowsingRecords_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `userList` (`userId`),
    CONSTRAINT `userBrowsingRecords_ibfk_2` FOREIGN KEY (`commodityId`) REFERENCES `commodityInformation` (`commodityId`),
    CONSTRAINT `userBrowsingRecords_ibfk_3` FOREIGN KEY (`districtId`) REFERENCES `amapDistrictTable` (`districtId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户浏览记录';

-- ----------------------------
-- Records of userBrowsingRecords
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for userInfo
-- ----------------------------
DROP TABLE IF EXISTS `userInfo`;
CREATE TABLE `userInfo`
(
    `userId`    int NOT NULL COMMENT '用户ID',
    `userNick`  varchar(50) DEFAULT NULL COMMENT '用户昵称',
    `userAge`   int         DEFAULT NULL COMMENT '用户年龄',
    `userEmail` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
    `userPhone` varchar(50) DEFAULT NULL COMMENT '用户手机号',
    PRIMARY KEY (`userId`),
    CONSTRAINT `userInfo_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `userList` (`userId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户详细信息\n';

-- ----------------------------
-- Records of userInfo
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for userList
-- ----------------------------
DROP TABLE IF EXISTS `userList`;
CREATE TABLE `userList`
(
    `userId`            int                                                    NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `userName`          varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
    `passId`            int                                                    NOT NULL COMMENT '用户密码ID',
    `accStatus`         int(1) unsigned zerofill                               NOT NULL DEFAULT '0' COMMENT '账户状态',
    `regTime`           datetime                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
    `userConfiguration` json                                                            DEFAULT NULL COMMENT '用户参数',
    `flag`              json                                                            DEFAULT NULL COMMENT '用户标记',
    PRIMARY KEY (`userId`) USING BTREE,
    UNIQUE KEY `userName` (`userName`),
    KEY `userID` (`userId`),
    KEY `passId` (`passId`),
    CONSTRAINT `userList_ibfk_1` FOREIGN KEY (`passId`) REFERENCES `passwordTable` (`passId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='存储用户基本信息';

-- ----------------------------
-- Records of userList
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for userPrivileges
-- ----------------------------
DROP TABLE IF EXISTS `userPrivileges`;
CREATE TABLE `userPrivileges`
(
    `userId`     int      NOT NULL COMMENT '用户ID',
    `consumer`   int      NOT NULL DEFAULT '1' COMMENT '普通用户',
    `dev`        int      NOT NULL DEFAULT '1' COMMENT '开发',
    `manager`    int      NOT NULL DEFAULT '1' COMMENT '管理',
    `test`       int      NOT NULL DEFAULT '1' COMMENT '测试',
    `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`userId`),
    CONSTRAINT `userPrivileges_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `userList` (`userId`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='用户权限表';

-- ----------------------------
-- Records of userPrivileges
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Triggers structure for table userList
-- ----------------------------
DROP TRIGGER IF EXISTS `insertUser`;
delimiter ;;
CREATE TRIGGER `insertUser`
    AFTER INSERT
    ON `userList`
    FOR EACH ROW
BEGIN
    INSERT INTO userList(userId)
    VALUES (userId);

    INSERT INTO userPrivileges(userId, consumer, dev, manager, test) VALUES (userId, 1, 1, 1, 1);
    INSERT INTO userAddress(userId) VALUES (userId);
#     INSERT INTO passwordTable(original, encryption) VALUES ('Abc123', SELECT SHA('Abc123'));

END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
