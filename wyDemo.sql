/*
Navicat MySQL Data Transfer

Source Server         : tw37
Source Server Version : 50716
Source Host           : 192.168.0.37:3306
Source Database       : wyDemo

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2016-12-16 18:29:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `BOOK_ID` varchar(64) NOT NULL,
  `BOOK_KEY` varchar(64) DEFAULT NULL,
  `CATEGORY_ID` int(64) NOT NULL,
  `TITLE` varchar(64) NOT NULL,
  `URL` varchar(255) DEFAULT NULL,
  `PRICE` int(32) NOT NULL,
  `PAY_TYPE` int(32) DEFAULT NULL,
  `COVER_PIC` varchar(255) DEFAULT NULL,
  `COVER_URL` varchar(255) DEFAULT NULL,
  `AUTHOR` varchar(128) NOT NULL,
  `PUBLISHER` varchar(255) DEFAULT NULL,
  `ISBN` varchar(255) DEFAULT NULL,
  `STATUS` int(32) DEFAULT NULL,
  `PUBLISH_TIME` int(64) DEFAULT NULL,
  `DESCRIPTION` text,
  `BOOK_TYPE` int(32) DEFAULT NULL,
  `COVER` varchar(255) DEFAULT NULL,
  `VIP_PRICE` int(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', 'ts_001', '1', '校园里的故事', 'http://test.yuedu.163.com/source/ts_f81e72377065445a925022c69e689c3d_4', '2', '0', null, null, '无名', null, null, null, '0', '本书以一个孩子的视角，描述了住扎在充满佛教遗迹部队大院里的故事。整部作品以时间为轴线，写了在六十年代初至七十年代初这个期间内，围绕在作者身边的人和事，真实还原了历史，还原了风俗、人情和社会。在文中，作者以饱满的笔触写了亲人的一次反革命事件开起了作者的学生期代，接下来的一次对特务的抓扑，又让她大来眼界，启蒙老师的污点又让她震惊于人性的残酷，山那边奇特的佛像引起她无限的联想·····作者用一个个小故事将那个时代发生的事连缀成了一张大网，透过它，你可以看到整个曾经。', '1', 'http://easyread.ph.126.net/w1aEx-Tk2agsxWIvrzR2nQ==/6597170921726099743.jpg?param=200x0&type=1.jpg', '0');
INSERT INTO `book` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', 'ts_002', '1', '大院里的童年', 'http://test.yuedu.163.com/source/ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', '2', '0', null, null, '一束干花', null, null, null, '0', '', '1', 'http://easyread.ph.126.net/w1aEx-Tk2agsxWIvrzR2nQ==/6597170921726099743.jpg?param=200x0&type=1.jpg', '0');

-- ----------------------------
-- Table structure for chapter
-- ----------------------------
DROP TABLE IF EXISTS `chapter`;
CREATE TABLE `chapter` (
  `BOOK_ID` varchar(64) DEFAULT NULL,
  `BOOK_KEY` varchar(64) DEFAULT NULL,
  `PRE_CHAPTER_ID` varchar(64) DEFAULT NULL,
  `PRE_CHAPTER_KEY` varchar(64) DEFAULT NULL,
  `CHAPTER_KEY` varchar(64) DEFAULT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `PICS` varchar(255) DEFAULT NULL,
  `DESCRIPTION` text,
  `CHAPTER_ID` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chapter
-- ----------------------------
INSERT INTO `chapter` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, null, null, 'tsc_001', '第一卷', null, '', 'de340b76eb21498e8150d4b5d8641bb9_4');
INSERT INTO `chapter` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, null, null, 'tsc_001', '第一卷', null, '', 'ff481f053ee144ccaee4adca6e997f3d_4');

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section` (
  `BOOK_ID` varchar(64) DEFAULT NULL,
  `BOOK_KEY` varchar(64) DEFAULT NULL,
  `CHAPTER_ID` varchar(64) DEFAULT NULL,
  `CHAPTER_KEY` varchar(64) DEFAULT NULL,
  `PRE_SECTION_ID` varchar(64) DEFAULT NULL,
  `PRE_SECTION_KEY` varchar(64) DEFAULT NULL,
  `SECTION_KEY` varchar(64) DEFAULT NULL,
  `TITLE` varchar(255) NOT NULL,
  `PICS` varchar(255) DEFAULT NULL,
  `PUBLISH_TIME` int(64) DEFAULT NULL,
  `NEED_PAY` int(32) NOT NULL,
  `PRICE` int(32) NOT NULL,
  `WORDCOUNT` int(32) DEFAULT NULL,
  `CONTENT` text,
  `SECTION_ID` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, null, null, 'tss_005', '第五章 幸福的一天', null, '0', '0', '2', '0', '', '5781bb4e3f0a4b8e817abf5dc3ccb5fd_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, null, null, 'tss_006', '第六章 秋天的故事', null, '0', '0', '2', '0', '', '800e5241f20d4075afe8ec06aef13d2f_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, '800e5241f20d4075afe8ec06aef13d2f_4', 'tss_006', 'tss_007', '第七章 秋天的故事', null, '0', '0', '2', '0', '', 'f65ea8adbd284d73a9bd3cb7803ef5dc_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, 'f65ea8adbd284d73a9bd3cb7803ef5dc_4', 'tss_007', 'tss_008', '第八章 部队里的童养媳', null, '0', '0', '2', '0', '', '9ba013de83c24678ba9f63d8e2eba240_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, '9ba013de83c24678ba9f63d8e2eba240_4', 'tss_008', 'tss_009', '第九章 石狮子的学校', null, '0', '0', '2', '0', '', 'c70c01bb8bfb45db8d65e295547126b2_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, 'c70c01bb8bfb45db8d65e295547126b2_4', 'tss_009', 'tss_010', '第十章 夜幕上的信号弹', null, '0', '0', '2', '0', '', 'bd806fe6510043129d4d3a60be34ae25_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, 'bd806fe6510043129d4d3a60be34ae25_4', 'tss_010', 'tss_011', '第十一章 永不融化的雪', null, '0', '0', '2', '0', '', 'aa7d433c3fde4115b43243f09b86a2bc_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, 'aa7d433c3fde4115b43243f09b86a2bc_4', 'tss_011', 'tss_012', '第十二章 遥远的冬天', null, '0', '0', '2', '0', '', 'bd21b9c9f74944dba87137e800df300c_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, 'bd21b9c9f74944dba87137e800df300c_4', 'tss_012', 'tss_013', '第十三章 山里来了特务', null, '0', '0', '2', '0', '', '33547d91562e4c579a4c41eac6471001_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, '33547d91562e4c579a4c41eac6471001_4', 'tss_013', 'tss_014', '第十四章 变形的电视', null, '0', '0', '2', '0', '', '3bd8e96fca5c4a74b27c66675b214b01_4');
INSERT INTO `section` VALUES ('ts_f81e72377065445a925022c69e689c3d_4', null, 'de340b76eb21498e8150d4b5d8641bb9_4', null, '3bd8e96fca5c4a74b27c66675b214b01_4', 'tss_014', 'tss_015', '第十五章 水底的恐惧', null, '0', '0', '2', '0', '', 'ea322182c9414cd598d6ea1b4e30bc2f_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, null, null, 'tss_001', '第一章 丑小鸭', null, '0', '0', '2', '0', '', '49780aed1c5a46199c287cd1b833ccaa_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '49780aed1c5a46199c287cd1b833ccaa_4', 'tss_001', 'tss_002', '第二章 初到人间', null, '0', '0', '2', '0', '', '5246be8239dd483f8bdb25841bc35b26_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '5246be8239dd483f8bdb25841bc35b26_4', 'tss_002', 'tss_003', '第三章 父亲的希望', null, '0', '0', '2', '0', '', '24fd44094f594713a2c0d67c0ebf114c_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '24fd44094f594713a2c0d67c0ebf114c_4', 'tss_003', 'tss_004', '第四章 玻璃菊花', null, '0', '0', '2', '0', '', '75006e8ca39b4670975c075ff19a6b72_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '75006e8ca39b4670975c075ff19a6b72_4', 'tss_004', 'tss_005', '第五章 幸福的一天', null, '0', '0', '2', '0', '', '6aa968fcf21643ae8f1119b2f2943806_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '6aa968fcf21643ae8f1119b2f2943806_4', 'tss_005', 'tss_006', '第六章 秋天的故事', null, '0', '0', '2', '0', '', '728137f7edb542c4bcfcfcca7990f8ae_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '728137f7edb542c4bcfcfcca7990f8ae_4', 'tss_006', 'tss_007', '第七章 抓鬏娃娃', null, '0', '0', '2', '0', '', '5d2273fe19434585954d4fa6968a0aed_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '5d2273fe19434585954d4fa6968a0aed_4', 'tss_007', 'tss_008', '第八章 部队里的童养媳', null, '0', '0', '2', '0', '', 'e42a4e21c4a346c9afffcd28538b8667_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, 'e42a4e21c4a346c9afffcd28538b8667_4', 'tss_008', 'tss_009', '第九章 石狮子的学校', null, '0', '0', '2', '0', '', '4b46ab38b12f4a99ab03065321572c05_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '4b46ab38b12f4a99ab03065321572c05_4', 'tss_009', 'tss_010', '第十章 夜幕上的信号弹', null, '0', '0', '2', '0', '', '5ccaa66851a24d38a11875c8776016a5_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '5ccaa66851a24d38a11875c8776016a5_4', 'tss_010', 'tss_011', '第十一章 永不融化的雪', null, '0', '0', '2', '0', '', '787dcb6581b94bde90bd7b83f4cb103d_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '787dcb6581b94bde90bd7b83f4cb103d_4', 'tss_011', 'tss_012', '第十二章 永遥远的冬天', null, '0', '0', '2', '0', '', 'b4d4b24464454c79beeb193f8799ace8_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, 'b4d4b24464454c79beeb193f8799ace8_4', 'tss_012', 'tss_013', '第十三章 山里来了特务', null, '0', '0', '2', '0', '', 'd6e10b51ea574057a3a144b5a628e48e_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, 'd6e10b51ea574057a3a144b5a628e48e_4', 'tss_013', 'tss_014', '第十四章 变形的电视', null, '0', '0', '2', '0', '', '3992d740351e4d8b99cf4e6a5c9fc6ba_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, '3992d740351e4d8b99cf4e6a5c9fc6ba_4', 'tss_014', 'tss_015', '第十五章 水底的恐惧', null, '0', '0', '2', '0', '', 'f8653338e9ee47958efaea3b14292fde_4');
INSERT INTO `section` VALUES ('ts_f5dfb9a7b07542e2a3f3de9d993da0b4_4', null, 'ff481f053ee144ccaee4adca6e997f3d_4', null, 'f8653338e9ee47958efaea3b14292fde_4', 'tss_015', 'tss_016', '第十六章 后记', null, '0', '0', '2', '0', '', '2e0be3a77d734aa5a091b7dcdcb5ea5f_4');
SET FOREIGN_KEY_CHECKS=1;
