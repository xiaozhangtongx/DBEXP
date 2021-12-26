/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.26 : Database - buyer
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`buyer` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `buyer`;

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `GID` int NOT NULL COMMENT '商品货号',
  `Name` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `Maker` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '生产厂商',
  `GRest` int DEFAULT NULL COMMENT '剩余的某种货物的数量',
  `LowLimit` int DEFAULT NULL COMMENT '低于该量则需补货',
  `Descri` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '商品描述',
  `Price` float DEFAULT NULL COMMENT '单价',
  `Kinds` varchar(10) DEFAULT NULL COMMENT '商品种类',
  `Photo` text COMMENT '商品照片',
  `Gstate` int DEFAULT '1' COMMENT '商品状态，1-表示上架，表示下架',
  PRIMARY KEY (`GID`),
  KEY `GG` (`GRest`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `goods` */

insert  into `goods`(`GID`,`Name`,`Maker`,`GRest`,`LowLimit`,`Descri`,`Price`,`Kinds`,`Photo`,`Gstate`) values (1001,'华为P40','华为',1,10,'good',10,'手机数码','https://res.vmallres.com/pimages//product/6901443381562/group//78_78_5A80D2B1B139D414A346E059CC6BAEEAEDFB92B80D370281.png',1),(1002,'小米6','小米',30,40,'not bad',20,'手机数码','https://res.vmallres.com/pimages//product/6901443381562/group//78_78_5A80D2B1B139D414A346E059CC6BAEEAEDFB92B80D370281.png',1),(1003,'iPhone13','苹果',10,5,'pretty',1000,'手机数码','https://res.vmallres.com/pimages//product/6901443381562/group//78_78_5A80D2B1B139D414A346E059CC6BAEEAEDFB92B80D370281.png',1),(1004,'oppo find2','oppo',10,1,'wonderful',50,'手机数码','https://res.vmallres.com/pimages//product/6901443381562/group//78_78_5A80D2B1B139D414A346E059CC6BAEEAEDFB92B80D370281.png',1),(1005,'小米11','小米',45,15,'hhh',100,'手机数码','https://res.vmallres.com/pimages//product/6901443381562/group//78_78_5A80D2B1B139D414A346E059CC6BAEEAEDFB92B80D370281.png',0),(1006,'牛仔外套','卡宾',500,100,'卡宾夹克男外套牛仔男士上衣男装休闲百搭宽松长袖茄克2022春新款衣服 天蓝色37 50/175/L',579,'服装','https://img11.360buyimg.com/n1/s350x449_jfs/t1/207950/40/13422/249982/61c14baaE0c212006/b69684b0d89835a6.jpg!cc_350x449.jpg',1),(1007,'加绒外套','海澜之家',99,20,'海澜之家旗下AEX男装联名风·衣夹克外套男士秋冬季2021新款加绒加厚中青年休闲潮流装立领衣服 墨绿立领加绒加厚 2XL 120-135斤\n',138,'服装','https://img14.360buyimg.com/n1/s546x546_jfs/t1/209488/25/6230/195509/61718185E0b83c6f6/f51ea88c0e3aa740.jpg',1),(1008,'牛仔裤','playboy',99,30,'花花公子 牛仔裤男2021秋冬季新款加绒加厚休闲裤男士裤子修身休闲弹力裤百搭男装直筒工装长裤 CC8002深蓝色 30码/2尺3\n',139,'服装','https://img14.360buyimg.com/n1/s546x546_jfs/t1/214761/34/795/307392/616be9edE03d79961/aba336080cf30b7c.png',1),(1009,'羽绒服','CHRDNN',50,10,'CHRDNN 香港潮牌女装 羽绒服女短款 2020秋冬新款轻薄纯色立领连帽显瘦轻便白鸭绒大码女装外套 湖蓝(立领) M\n',568,'服装','https://img14.360buyimg.com/n1/s546x546_jfs/t25666/149/1506650923/172252/e047b48a/5bb33654Nc3a2811b.jpg',1),(1010,'裙子','BaLei',200,50,'当季新品 魅芭琪秋冬连衣裙女21年新款韩版女装蕾丝拼接小个子钉钻丝绒气质显瘦赫本风不规则礼服小黑裙 黑色 请选择合适尺码，如不确认可联系客服\n',158,'服装','https://img14.360buyimg.com/n0/jfs/t1/202780/8/18037/386423/61b3619fE0c5e6cb7/9e039ca606214c54.jpg',1),(1011,'华为畅享30','华为',20,10,'华为智选 优畅享30e 5G 智慧双5G 22.5W安全快充 5000mAh大容量电池 4GB+128GB雅致黑 全网通手机',1499,'手机数码','https://img12.360buyimg.com/n1/s450x450_jfs/t1/193144/24/19025/62592/611f62e1Ece59d417/2de3b44af3a0a047.jpg',1),(1012,'荣耀50','荣耀',20,10,'荣耀50 Pro 1亿像素超清影像 5G 6.72英寸超曲屏 100W超级快充 前置视频双摄 全网通版8GB+256GB 初雪水晶',3499,'手机数码','https://img14.360buyimg.com/n0/jfs/t1/200907/4/20199/244417/61c5af2dEc9eb18b1/779d70c387f28b20.jpg',1),(1013,'红米9A','小米',30,5,'5000mAh大电量 1300万AI相机 八核处理器 人脸解锁 4GB+64GB 砂石黑 智能手机 小米 红米',999,'手机数码','https://img14.360buyimg.com/n0/jfs/t1/221575/27/2350/74227/618e3127E9fb7d023/10ff2e72d91aaf6b.jpg',1),(1014,'小米11','小米',30,5,'青春活力版 骁龙778G处理器 AMOLED柔性直屏 冰峰黑提 8GB+128GB 5G时尚手机',1999,'手机数码','https://img14.360buyimg.com/n0/jfs/t1/199007/13/19628/126926/61b06f15E98c8aa10/1aa236cc1934bca7.jpg',0),(1015,'vivo X60','vivo',20,5,'vivo X60 Pro 12GB+256GB 华彩 5G手机 蔡司光学镜头 超稳微云台四摄 三星5nm旗舰芯片 双模5G全网通手机',4199,'手机数码','https://img14.360buyimg.com/n0/jfs/t1/142816/10/19407/65026/5fe19acaE4f43823b/dc5413470e1eb83c.jpg',1),(1016,'三星电视','三星',20,10,'65英寸QX2 超薄全面屏 4K超高清HDR 120Hz 智能补帧QLED量子点HDMI2.1游戏电视QA65QX2AAJXXZ',6999,'家用电器','https://img14.360buyimg.com/n0/jfs/t1/222676/28/6816/144455/61c40d1dE50f273ba/edb9e0861656440a.jpg',1),(1017,'美菱(MELING)629','MELING',5,2,'双开门电冰箱对开门家用风冷无霜双变频净味-32度速冻大容量BCD-629WPUCX一级能效节能',3099,'家用电器','https://img14.360buyimg.com/n0/jfs/t1/92925/15/20183/150199/61c5cdefE25de058f/4e7f322a2527f6d6.jpg',1),(1018,'Robam燃气灶','Robam',5,2,'4.5kW嵌入式钢化玻璃灶具 家用可调节灶具 65%热效率（天然气）以旧换新',1699,'家用电器','https://img14.360buyimg.com/n0/jfs/t1/172836/19/23818/130249/61c577a6E3a176710/2f8768d6a65fbee3.jpg',1),(1019,'米家除螨仪','小米',50,20,'小米除螨仪家用手持除螨机 床上去螨虫 UV-C杀菌除螨虫 大吸力热风除湿MJCMY01DY',199,'家用电器','https://img14.360buyimg.com/n0/jfs/t1/220641/6/8941/65801/61c53750Edfd3b6e1/c084242194111e88.jpg',1),(1020,'方太抽油烟机 ','方太 ',10,5,'灶具套装 家用抽吸油烟机燃气灶 欧式顶吸一键瞬吸烟灶套装 EMC5+HT8BE.S天然气',2999,'家用电器','https://img14.360buyimg.com/n0/jfs/t1/176060/29/24388/144185/61c3d111E4ca0c16e/26ce1eba991ebfd4.jpg',1),(1021,'智能马桶盖','松下',30,10,'智能马桶盖即热式经典宽幅款马桶盖子洁身器DL-5209CWS',1399,'家具家装','https://img14.360buyimg.com/n0/jfs/t1/222968/40/7117/165915/61c57335E0644fd0a/8100b27a08085ca0.jpg',1),(1022,'智能门锁','小米',30,10,'智能门锁 E C级锁芯 指纹锁电子锁密码锁防盗门锁',899,'家具家装','https://img14.360buyimg.com/n0/jfs/t1/172246/15/24406/300118/61c19bf4Eb51d1511/afc6bd1eba28d36d.jpg',1),(1023,'插座','公牛',100,50,'无线遥控开关 免布线开关 遥控智能家用开关 一开双控套装：1个主开关+1个随意贴',99,'家具家装','https://img14.360buyimg.com/n0/jfs/t1/183512/3/20043/113691/611e26beE1e95f72a/c37aa79b4b9fbc0b.jpg',1),(1024,'电钻','欧莱德',200,50,'德国欧莱德手电钻电动螺丝刀充电式电起子双速12v锂电钻家用手钻电动工具充电电钻五金工具箱套装电动工具 ',99,'家具家装','https://img14.360buyimg.com/n0/jfs/t1/220065/25/7807/224794/61b95f73E017167fc/246cf7c36449aa19.jpg',1),(1025,'不锈钢柜体','卡贝',20,5,'厨房拉篮橱柜304不锈钢柜内碗架抽屉式双层碗篮调味拉蓝碗碟架 适用800柜体\n',418,'家具家装','https://img14.360buyimg.com/n0/jfs/t1/155910/34/27555/156554/61c329f6Ee4eb4b00/d28447ff0fcb0c3a.jpg',1);

/*Table structure for table `guestinfo` */

DROP TABLE IF EXISTS `guestinfo`;

CREATE TABLE `guestinfo` (
  `Uid` int NOT NULL COMMENT '用户ID',
  `Location` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '地址',
  `Borrow` float NOT NULL DEFAULT '0' COMMENT '赊额',
  `Rest` float NOT NULL DEFAULT '0' COMMENT '余额',
  `Cheap` float NOT NULL DEFAULT '1' COMMENT '折扣',
  `Uname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'user' COMMENT '用户名',
  KEY `Uid` (`Uid`),
  CONSTRAINT `guestinfo_ibfk_1` FOREIGN KEY (`Uid`) REFERENCES `user` (`Uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `guestinfo` */

insert  into `guestinfo`(`Uid`,`Location`,`Borrow`,`Rest`,`Cheap`,`Uname`) values (100001,'武汉理工大学',1146,218,0.7,'user03'),(100002,'武汉理工大学计算机学院',1038.4,920,0.8,'user02'),(123465,NULL,0,0,1,'user');

/*Table structure for table `listout` */

DROP TABLE IF EXISTS `listout`;

CREATE TABLE `listout` (
  `LNo` int NOT NULL AUTO_INCREMENT COMMENT '订单号',
  `SmallID` varchar(20) NOT NULL COMMENT '细则号',
  `Location` varchar(50) DEFAULT NULL COMMENT '收货地址',
  `BDate` date DEFAULT NULL COMMENT '订货日期',
  `CNo` int DEFAULT NULL COMMENT '顾客号',
  `Lstate` int DEFAULT '1' COMMENT '1表示未被删除 0表示该订单已被删除 2表示订单已完成',
  PRIMARY KEY (`LNo`,`SmallID`),
  KEY `SmallID` (`SmallID`),
  KEY `CNo` (`CNo`),
  CONSTRAINT `listout_ibfk_1` FOREIGN KEY (`CNo`) REFERENCES `user` (`Uid`)
) ENGINE=InnoDB AUTO_INCREMENT=1000078 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `listout` */

insert  into `listout`(`LNo`,`SmallID`,`Location`,`BDate`,`CNo`,`Lstate`) values (100001,'1640348324251','北京市市辖区东城区456123','2021-12-24',100001,0),(1000041,'1640409930519','北京市市辖区东城区武汉理工大学','2021-12-25',100001,0),(1000042,'1640409966866','北京市市辖区东城区123','2021-12-25',100001,1),(1000043,'1640410101618','北京市市辖区东城区45641321','2021-12-25',100001,1),(1000044,'1640411103040','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000045,'1640411488581','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000046,'1640411529367','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000047,'1640421610102','北京市市辖区东城区哈哈哈哈哈是','2021-12-25',100002,1),(1000048,'1640423092892','北京市市辖区东城区武汉理工大学计算机学院','2021-12-25',100002,1),(1000049,'1640426058043','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000050,'1640426077426','北京市市辖区西城区武汉理工大学','2021-12-25',100001,1),(1000051,'1640426240625','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000052,'1640429071957','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000053,'1640429330970','北京市市辖区东城区武汉理工大学','2021-12-25',100001,2),(1000054,'1640432435811','北京市市辖区东城区武汉理工大学','2021-12-25',100001,2),(1000055,'1640432473018','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000056,'1640432491790','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000057,'1640432538433','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000058,'1640437246857','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000059,'1640437384374','湖北省武汉市武昌区武汉理工大学','2021-12-25',100001,1),(1000060,'1640437415167','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000061,'1640437440207','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000062,'1640437577298','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000063,'1640437759316','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000064,'1640437991182','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000065,'1640438015037','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000066,'1640438126650','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000067,'1640438252679','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000068,'1640438292488','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000069,'1640439139646','北京市市辖区东城区武汉理工大学计算机学院','2021-12-25',100002,1),(1000070,'1640439632761','北京市市辖区东城区武汉理工大学','2021-12-25',100001,1),(1000071,'1640483595661','北京市市辖区东城区武汉理工大学计算机学院','2021-12-26',100002,1),(1000072,'1640483633888','北京市市辖区东城区武汉理工大学计算机学院','2021-12-26',100002,2),(1000073,'1640483948906','北京市市辖区东城区武汉理工大学计算机学院','2021-12-26',100002,2),(1000074,'1640485756773','北京市市辖区东城区武汉理工大学计算机学院','2021-12-26',100002,1),(1000075,'1640485809538','北京市市辖区东城区武汉理工大学计算机学院','2021-12-26',100002,1),(1000076,'1640485872997','北京市市辖区东城区武汉理工大学计算机学院','2021-12-26',100002,1),(1000077,'1640498831924','北京市市辖区东城区武汉理工大学','2021-12-26',100001,2);

/*Table structure for table `shopcat` */

DROP TABLE IF EXISTS `shopcat`;

CREATE TABLE `shopcat` (
  `Uid` int NOT NULL,
  `Gid` int DEFAULT NULL,
  `GNum` int DEFAULT NULL,
  KEY `Gid` (`Gid`),
  KEY `Uid` (`Uid`),
  CONSTRAINT `shopcat_ibfk_2` FOREIGN KEY (`Gid`) REFERENCES `goods` (`GID`),
  CONSTRAINT `shopcat_ibfk_3` FOREIGN KEY (`Uid`) REFERENCES `user` (`Uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `shopcat` */

insert  into `shopcat`(`Uid`,`Gid`,`GNum`) values (100002,1002,1),(100002,1001,1),(100001,1001,1),(100001,1003,1),(100002,1004,1),(100001,1005,1),(100001,1016,1),(100001,1007,3),(100002,1003,1),(100002,1007,1),(100002,1008,1);

/*Table structure for table `smallout` */

DROP TABLE IF EXISTS `smallout`;

CREATE TABLE `smallout` (
  `SmallID` varchar(20) NOT NULL COMMENT '细则号',
  `GNum` int DEFAULT NULL COMMENT '购物数量',
  `Money` float DEFAULT NULL COMMENT '总共结果',
  `GID` int DEFAULT NULL COMMENT '货物ID',
  KEY `GID` (`GID`),
  KEY `SmallID` (`SmallID`),
  CONSTRAINT `smallout_ibfk_1` FOREIGN KEY (`GID`) REFERENCES `goods` (`GID`),
  CONSTRAINT `smallout_ibfk_2` FOREIGN KEY (`SmallID`) REFERENCES `listout` (`SmallID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `smallout` */

insert  into `smallout`(`SmallID`,`GNum`,`Money`,`GID`) values ('1640348324251',45,4545,1001),('1640409930519',14,140,1001),('1640409966866',4,40,1001),('1640410101618',1,100,1005),('1640410101618',1,1000,1003),('1640411103040',4,40,1001),('1640411103040',4,80,1002),('1640411103040',1,1000,1003),('1640411103040',1,100,1005),('1640411488581',4,40,1001),('1640411488581',4,80,1002),('1640411488581',1,1000,1003),('1640411488581',1,100,1005),('1640411529367',4,40,1001),('1640411529367',4,80,1002),('1640411529367',1,1000,1003),('1640411529367',1,100,1005),('1640421610102',2,40,1002),('1640423092892',1,50,1004),('1640426058043',1,10,1001),('1640426077426',1,1000,1003),('1640426240625',1,10,1001),('1640429071957',1,10,1001),('1640429330970',1,1000,1003),('1640432435811',1,10,1001),('1640432473018',1,10,1001),('1640432491790',1,10,1001),('1640432538433',1,1000,1003),('1640437246857',3,414,1007),('1640437246857',1,10,1001),('1640437384374',1,10,1001),('1640437415167',1,100,1005),('1640437440207',10,100,1001),('1640437577298',1,10,1001),('1640437759316',1,10,1001),('1640437991182',1,10,1001),('1640438015037',1,10,1001),('1640438126650',1,10,1001),('1640438252679',1,100,1005),('1640438292488',1,10,1001),('1640439139646',1,1000,1003),('1640439632761',3,30,1001),('1640483595661',1,20,1002),('1640483633888',1,10,1001),('1640483948906',1,10,1001),('1640485756773',1,10,1001),('1640485809538',1,138,1007),('1640485809538',1,139,1008),('1640485872997',10,100,1001),('1640498831924',1,10,1001);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `Uid` int NOT NULL COMMENT '用户账号',
  `Upward` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '123456' COMMENT '用户密码',
  `Role` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT 'user' COMMENT '用户角色',
  `State` int DEFAULT '1' COMMENT '用户状态',
  PRIMARY KEY (`Uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user` */

insert  into `user`(`Uid`,`Upward`,`Role`,`State`) values (100000,'123456','admin',1),(100001,'123456','user',1),(100002,'123456','user',1),(123465,'123456','user',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
