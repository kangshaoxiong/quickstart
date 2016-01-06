/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50709
Source Host           : 127.0.0.1:3306
Source Database       : my_quickstart

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2016-01-06 21:10:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT '',
  `caddress` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course
-- ----------------------------
INSERT INTO `t_course` VALUES ('1', '数学', '1号楼');
INSERT INTO `t_course` VALUES ('2', '化学', '综合楼');
INSERT INTO `t_course` VALUES ('3', '英语', '外教楼');

-- ----------------------------
-- Table structure for t_course_user
-- ----------------------------
DROP TABLE IF EXISTS `t_course_user`;
CREATE TABLE `t_course_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `course_user_info_ibfk_1` (`cid`),
  KEY `uid` (`uid`),
  CONSTRAINT `t_course_user_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `t_course` (`id`),
  CONSTRAINT `t_course_user_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course_user
-- ----------------------------
INSERT INTO `t_course_user` VALUES ('1', '1', '1');
INSERT INTO `t_course_user` VALUES ('2', '1', '3');
INSERT INTO `t_course_user` VALUES ('3', '2', '2');
INSERT INTO `t_course_user` VALUES ('4', '2', '3');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) DEFAULT '',
  `unumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'kang', '1');
INSERT INTO `t_user` VALUES ('2', 'shao', '2');
INSERT INTO `t_user` VALUES ('5', 'xiong', '4');
