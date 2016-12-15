/*
Navicat MySQL Data Transfer

Source Server         : tw37
Source Server Version : 50716
Source Host           : 192.168.0.37:3306
Source Database       : testDemo

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2016-12-15 19:14:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for BOOK
-- ----------------------------
DROP TABLE IF EXISTS `BOOK`;
CREATE TABLE `BOOK` (
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
  `STATUS` int(32) NOT NULL,
  `PUBLISH_TIME` int(64) DEFAULT NULL,
  `DESCRIPTION` text,
  `BOOK_TYPE` int(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of BOOK
-- ----------------------------

-- ----------------------------
-- Table structure for CHAPTER
-- ----------------------------
DROP TABLE IF EXISTS `CHAPTER`;
CREATE TABLE `CHAPTER` (
  `BOOK_ID` varchar(64) DEFAULT NULL,
  `BOOK_KEY` varchar(64) DEFAULT NULL,
  `PRECHAPTER_ID` varchar(64) DEFAULT NULL,
  `PRECHAPTER_KEY` varchar(64) DEFAULT NULL,
  `CHAPTER_KEY` varchar(64) DEFAULT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `PICS` varchar(255) DEFAULT NULL,
  `DESCRIPTION` text,
  `CHAPTER_ID` int(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of CHAPTER
-- ----------------------------

-- ----------------------------
-- Table structure for SECTION
-- ----------------------------
DROP TABLE IF EXISTS `SECTION`;
CREATE TABLE `SECTION` (
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
  `WORLD_COUNT` int(32) DEFAULT NULL,
  `CONTENT` text,
  `SECTION_ID` int(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of SECTION
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
