-- MySQL dump 10.13  Distrib 5.7.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jsp
-- ------------------------------------------------------
-- Server version	5.7.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accadmintbl`
--

DROP TABLE IF EXISTS `accadmintbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accadmintbl` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `loginID` varchar(50) NOT NULL,
  `loginPass` varchar(50) NOT NULL,
  `state` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accadmintbl`
--

LOCK TABLES `accadmintbl` WRITE;
/*!40000 ALTER TABLE `accadmintbl` DISABLE KEYS */;
INSERT INTO `accadmintbl` (`uid`, `loginID`, `loginPass`, `state`) VALUES (1,'kevin','0921',1),(2,'a','1',1);
/*!40000 ALTER TABLE `accadmintbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `accusertbl`
--

DROP TABLE IF EXISTS `accusertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accusertbl` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `loginID` varchar(50) NOT NULL,
  `loginPass` varchar(50) NOT NULL,
  `state` int(1) NOT NULL DEFAULT '1',
  `phoneNum` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accusertbl`
--

LOCK TABLES `accusertbl` WRITE;
/*!40000 ALTER TABLE `accusertbl` DISABLE KEYS */;
INSERT INTO `accusertbl` (`uid`, `loginID`, `loginPass`, `state`, `phoneNum`) VALUES (1,'kevin','0921',1,'17607130921'),(2,'a','1',1,'1'),(3,'b','1',1,'1'),(4,'c','1',1,'1'),(5,'d','1',1,'1'),(6,'abc','abc',1,'1'),(7,'e','1',1,'1'),(8,'f','1',1,'1'),(9,'z','1',1,'1'),(10,'bcd','123',1,NULL),(11,'bc','123',1,NULL),(12,'io','123',1,NULL);
/*!40000 ALTER TABLE `accusertbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drivers`
--

DROP TABLE IF EXISTS `drivers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drivers` (
  `DriversID` int(11) NOT NULL,
  `DriversName` varchar(50) NOT NULL,
  `UnitPrice` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`DriversID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drivers`
--

LOCK TABLES `drivers` WRITE;
/*!40000 ALTER TABLE `drivers` DISABLE KEYS */;
INSERT INTO `drivers` (`DriversID`, `DriversName`, `UnitPrice`) VALUES (1,'喜力',18.00),(2,'嘉士伯',20.00),(3,'百威',15.00),(4,'长城干红',88.00),(5,'话梅',8.50),(6,'葡萄干',12.50),(7,'薯片',7.50),(8,'鸡爪',14.00),(9,'开心果',20.00);
/*!40000 ALTER TABLE `drivers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expense`
--

DROP TABLE IF EXISTS `expense`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expense` (
  `ExpenseID` int(11) NOT NULL,
  `ExpenseDate` date DEFAULT NULL,
  `DrinksID` int(11) DEFAULT NULL,
  `Num` int(11) DEFAULT NULL,
  PRIMARY KEY (`ExpenseID`),
  KEY `DrinksID` (`DrinksID`),
  CONSTRAINT `expense_ibfk_1` FOREIGN KEY (`DrinksID`) REFERENCES `drivers` (`DriversID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expense`
--

LOCK TABLES `expense` WRITE;
/*!40000 ALTER TABLE `expense` DISABLE KEYS */;
INSERT INTO `expense` (`ExpenseID`, `ExpenseDate`, `DrinksID`, `Num`) VALUES (1,'2013-05-28',2,3),(2,'2013-05-28',3,2),(3,'2013-05-28',5,1),(4,'2013-05-28',8,6),(5,'2013-05-30',1,5),(6,'2013-05-30',4,1),(7,'2013-05-30',6,3),(8,'2013-05-30',9,2),(9,'2013-05-30',8,4);
/*!40000 ALTER TABLE `expense` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lang`
--

DROP TABLE IF EXISTS `lang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lang` (
  `indexWord` varchar(20) NOT NULL,
  `zh_cn` varchar(20) DEFAULT NULL,
  `en_us` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`indexWord`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lang`
--

LOCK TABLES `lang` WRITE;
/*!40000 ALTER TABLE `lang` DISABLE KEYS */;
INSERT INTO `lang` (`indexWord`, `zh_cn`, `en_us`) VALUES ('1','个人申请认证',NULL),('2','身份认证',NULL),('3','兴趣认证',NULL),('4','自媒体认证',NULL),('5','金V认证',NULL),('6','微博认证体系',NULL),('login','登陆','Login'),('register','注册','Register'),('weibo','微博','Weibo');
/*!40000 ALTER TABLE `lang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `singer`
--

DROP TABLE IF EXISTS `singer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `singer` (
  `SingerID` int(11) NOT NULL,
  `SingerName` varchar(50) NOT NULL,
  `SingerType` varchar(10) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `Area` varchar(50) DEFAULT NULL,
  `PhotoPath` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`SingerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `singer`
--

LOCK TABLES `singer` WRITE;
/*!40000 ALTER TABLE `singer` DISABLE KEYS */;
INSERT INTO `singer` (`SingerID`, `SingerName`, `SingerType`, `Birthday`, `Area`, `PhotoPath`) VALUES (6,'薛之谦','男','1983-07-17','大陆','薛之谦.jpg'),(7,'后弦','男','1979-12-14','大陆','后弦.jpg'),(8,'李宇春','女','1984-03-10','大陆','李宇春.jpg'),(9,'方大同','男','1983-07-14','香港','方大同.jpg'),(10,'何韵诗','女','1977-05-10','香港','何韵诗.jpg'),(11,'侧田','男','1976-07-01','香港','侧田.jpg'),(12,'周杰伦','男','1979-01-18','台湾','周杰伦.jpg'),(13,'苏打绿','男女组合',NULL,'台湾','苏打禄.jpg'),(14,'SHE','女子组合',NULL,'台湾','SHE.jpg'),(15,'王若琳','女','1988-08-01','台湾','王若琳.jpg'),(16,'蔡依林','女','1980-09-15','台湾','蔡依林.jpg'),(17,'后街男孩','组合',NULL,'欧美','后街男孩.jpg'),(18,'林肯公园','男子组合','1996-01-01','欧美','林肯公园.jpg'),(19,'Michael Jackson','男','1958-08-29','欧美','Michael Jackson.jpg'),(20,'Avril Ramona Lavigne','女','1984-09-27','欧美','Avril Ramona Lavigne.jpg'),(21,'super junior ','男子组合',NULL,'日韩','super junior.jpg '),(22,'东方神起','男子组合',NULL,'日韩','东方神起.jpg'),(23,'李孝利','女','1979-05-10','日韩','李孝利.jpg'),(24,'Rain','男','1982-06-25','日韩','Rain.jpg'),(25,'安室奈美惠','女','1977-09-20','日韩','安室奈美惠.jpg'),(28,'张学友','男','1961-07-10','香港','张学友.jpg'),(29,'李谷一','女','1944-11-10','大陆','李谷一.jpg'),(30,'蔡琴','女','1957-12-12','台湾','蔡琴.jpg'),(31,'张国荣','男','1956-09-12','香港','张国荣.jpg'),(32,'费玉清','男','1955-07-17','台湾','费玉清.jpg'),(33,'那英','女','1967-11-27','大陆','那英.jpg'),(34,'张信哲','男','1967-03-26','台湾','张信哲.jpg'),(35,'胡彦斌','男','1983-07-04','大陆','胡彦斌.jpg'),(36,'蔡国庆','男','1968-09-17','大陆','蔡国庆.jpg');
/*!40000 ALTER TABLE `singer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `song`
--

DROP TABLE IF EXISTS `song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `song` (
  `SongID` int(11) NOT NULL,
  `Title` varchar(50) NOT NULL,
  `PingTitle` varchar(20) DEFAULT NULL,
  `TypeID` int(11) DEFAULT NULL,
  `SingerID` int(11) DEFAULT NULL,
  `Hit` int(11) NOT NULL,
  `Url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`SongID`),
  KEY `SingerID` (`SingerID`),
  KEY `TypeID` (`TypeID`),
  CONSTRAINT `song_ibfk_1` FOREIGN KEY (`SingerID`) REFERENCES `singer` (`SingerID`),
  CONSTRAINT `song_ibfk_2` FOREIGN KEY (`TypeID`) REFERENCES `type` (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `song`
--

LOCK TABLES `song` WRITE;
/*!40000 ALTER TABLE `song` DISABLE KEYS */;
INSERT INTO `song` (`SongID`, `Title`, `PingTitle`, `TypeID`, `SingerID`, `Hit`, `Url`) VALUES (1,'传说','cs',1,6,12,'传说.mp3'),(2,'伤城秘密','scmm',1,10,34,'伤城秘密.mp3'),(5,'super star',NULL,1,14,8,'super star.mp3'),(6,'菊花台','jht',1,12,78,'菊花台.wma'),(7,'千山万水','qsws',1,12,29,'千山万水.mp3'),(8,'够不够','gbg',1,9,4,'够不够.mp3'),(9,'黑白','hb',1,9,26,'黑白.mp3'),(10,'I\'m So Blue',NULL,7,19,7,'I\'m So Blue.mp3'),(11,'Bad Girls',NULL,1,23,2,'Bad Girls.mp3'),(12,'等你等到我心痛','dnddwx',2,28,23,'等你等到我心痛.mp3'),(13,'人间道','rjd',3,28,13,'人间道.mp3'),(14,'难忘今宵','nwjx',2,29,34,'难忘今宵.mp3'),(15,'明月几时有','myjsy',2,30,11,'明月几时有.mp3'),(16,'征服','zf',2,33,56,'征服.mp3'),(17,'倩女幽魂','qnyh',3,31,15,'倩女幽魂.mp3'),(18,'一剪梅','yjm',3,32,6,'一剪梅.mp3'),(19,'月光','yg',NULL,35,3,'月光.mp3'),(20,'爱就一个字','ajygz',NULL,34,7,'爱就一个字.mp3'),(21,'我心中的故事','wxzdgs',2,36,11,'我心中的故事.mp3');
/*!40000 ALTER TABLE `song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `song_dm`
--

DROP TABLE IF EXISTS `song_dm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `song_dm` (
  `SongID` int(11) NOT NULL,
  `Title` varchar(50) NOT NULL,
  `PingTitle` varchar(20) DEFAULT NULL,
  `Type` int(11) DEFAULT NULL,
  `Singer` int(11) DEFAULT NULL,
  `Hit` int(11) NOT NULL,
  `Url` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `song_dm`
--

LOCK TABLES `song_dm` WRITE;
/*!40000 ALTER TABLE `song_dm` DISABLE KEYS */;
INSERT INTO `song_dm` (`SongID`, `Title`, `PingTitle`, `Type`, `Singer`, `Hit`, `Url`) VALUES (19,'月光','yg',4,35,1,'月光.mp3'),(20,'爱就一个字','ajygz',4,34,1,'爱就一个字.mp3');
/*!40000 ALTER TABLE `song_dm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_admin`
--

DROP TABLE IF EXISTS `t_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) DEFAULT NULL COMMENT '超级管理员账号',
  `password` varchar(100) DEFAULT NULL COMMENT '超级管理员密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='超级管理员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_admin`
--

LOCK TABLES `t_admin` WRITE;
/*!40000 ALTER TABLE `t_admin` DISABLE KEYS */;
INSERT INTO `t_admin` (`id`, `username`, `password`) VALUES (1,'admin','123456'),(2,'kevin','0921');
/*!40000 ALTER TABLE `t_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_customer`
--

DROP TABLE IF EXISTS `t_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) DEFAULT NULL COMMENT '账号',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `phone` varchar(100) DEFAULT NULL COMMENT '手机',
  `sex` varchar(100) DEFAULT NULL COMMENT '性别',
  `age` varchar(100) DEFAULT NULL COMMENT '年龄',
  `address` varchar(100) DEFAULT NULL COMMENT '家庭住址',
  `idcard` varchar(100) DEFAULT NULL COMMENT '身份证',
  `insertDate` datetime DEFAULT NULL COMMENT '入库日期',
  `headPic` varchar(100) DEFAULT NULL COMMENT '头像',
  `level` varchar(100) DEFAULT NULL COMMENT '层级',
  `isft` varchar(100) DEFAULT NULL COMMENT '发帖权限',
  `ispl` varchar(100) DEFAULT NULL COMMENT '评论权限',
  `mb1` varchar(100) DEFAULT NULL COMMENT '密保1',
  `mb2` varchar(100) DEFAULT NULL COMMENT '密保2',
  `mb3` varchar(100) DEFAULT NULL COMMENT '密保3',
  `beijing` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_customer`
--

LOCK TABLES `t_customer` WRITE;
/*!40000 ALTER TABLE `t_customer` DISABLE KEYS */;
INSERT INTO `t_customer` (`id`, `username`, `password`, `name`, `phone`, `sex`, `age`, `address`, `idcard`, `insertDate`, `headPic`, `level`, `isft`, `ispl`, `mb1`, `mb2`, `mb3`, `beijing`) VALUES (1,'kevin','0921','kevin','17607130921','男','20',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'');
/*!40000 ALTER TABLE `t_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_ltsm`
--

DROP TABLE IF EXISTS `t_ltsm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_ltsm` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(100) DEFAULT NULL COMMENT '论坛说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='论坛说明';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_ltsm`
--

LOCK TABLES `t_ltsm` WRITE;
/*!40000 ALTER TABLE `t_ltsm` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_ltsm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_pinglun`
--

DROP TABLE IF EXISTS `t_pinglun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_pinglun` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `wdxxId` int(11) DEFAULT NULL COMMENT '评论信息',
  `customerId` int(11) DEFAULT NULL COMMENT '评论人',
  `content` varchar(100) DEFAULT NULL COMMENT '评论内容',
  `insertDate` datetime DEFAULT NULL COMMENT '评论日期',
  `status` varchar(100) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_pinglun`
--

LOCK TABLES `t_pinglun` WRITE;
/*!40000 ALTER TABLE `t_pinglun` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_pinglun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_wdhy`
--

DROP TABLE IF EXISTS `t_wdhy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_wdhy` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `customerId` int(11) DEFAULT NULL COMMENT '我',
  `hhId` int(11) DEFAULT NULL COMMENT '好友',
  `insertDate` datetime DEFAULT NULL COMMENT '关注日期',
  `types` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='我的好友';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_wdhy`
--

LOCK TABLES `t_wdhy` WRITE;
/*!40000 ALTER TABLE `t_wdhy` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_wdhy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_wdxx`
--

DROP TABLE IF EXISTS `t_wdxx`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_wdxx` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `customerId` int(11) DEFAULT NULL COMMENT '我',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `pic` varchar(100) DEFAULT NULL COMMENT '图片',
  `content` varchar(100) DEFAULT NULL COMMENT '内容',
  `zan` int(11) DEFAULT NULL COMMENT '赞',
  `insertDate` datetime DEFAULT NULL COMMENT '发布日期',
  `nologin` varchar(100) DEFAULT NULL COMMENT '游客是否可见',
  `bkId` int(11) DEFAULT NULL,
  `ship` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='我的消息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_wdxx`
--

LOCK TABLES `t_wdxx` WRITE;
/*!40000 ALTER TABLE `t_wdxx` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_wdxx` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type` (
  `TypeID` int(11) NOT NULL,
  `TypeName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`TypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type`
--

LOCK TABLES `type` WRITE;
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
INSERT INTO `type` (`TypeID`, `TypeName`) VALUES (1,'热门流行'),(2,'经典老歌'),(3,'影视金曲'),(7,'摇滚');
/*!40000 ALTER TABLE `type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-24  8:59:52
