/*
Navicat MySQL Data Transfer

Source Server         : amanb
Source Server Version : 50013
Source Host           : localhost:3306
Source Database       : genewhisper_db

Target Server Type    : MYSQL
Target Server Version : 50013
File Encoding         : 65001

Date: 2018-02-26 09:57:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `customer_profiles_tbl`
-- ----------------------------
DROP TABLE IF EXISTS `customer_profiles_tbl`;
CREATE TABLE `customer_profiles_tbl` (
  `fid` int(11) NOT NULL auto_increment,
  `name` varchar(100) default NULL,
  `email` varchar(100) default NULL,
  `doe` timestamp NULL default NULL,
  PRIMARY KEY  (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of customer_profiles_tbl
-- ----------------------------
INSERT INTO `customer_profiles_tbl` VALUES ('100', 'Nagendra', 'nagendra@gmail.com', '2018-02-26 09:08:40');
INSERT INTO `customer_profiles_tbl` VALUES ('200', 'Maks', 'maks@gmail.com', '2018-02-26 09:08:40');
INSERT INTO `customer_profiles_tbl` VALUES ('300', 'Kens', 'kens@gmail.com', '2018-02-26 09:56:24');
