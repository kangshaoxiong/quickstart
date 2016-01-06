-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.62-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema shop
--

CREATE DATABASE IF NOT EXISTS shop;
USE shop;

--
-- Definition of table `course_info`
--

DROP TABLE IF EXISTS `course_info`;
CREATE TABLE `course_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT '',
  `caddress` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course_info`
--

/*!40000 ALTER TABLE `course_info` DISABLE KEYS */;
INSERT INTO `course_info` (`id`,`cname`,`caddress`) VALUES 
 (1,'数学','1号楼'),
 (2,'化学','综合楼'),
 (3,'英语','外教楼');
/*!40000 ALTER TABLE `course_info` ENABLE KEYS */;


--
-- Definition of table `course_user_info`
--

DROP TABLE IF EXISTS `course_user_info`;
CREATE TABLE `course_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `course_user_info_ibfk_1` (`cid`),
  KEY `uid` (`uid`),
  CONSTRAINT `course_user_info_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `course_info` (`id`),
  CONSTRAINT `course_user_info_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `user_info` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course_user_info`
--

/*!40000 ALTER TABLE `course_user_info` DISABLE KEYS */;
INSERT INTO `course_user_info` (`id`,`uid`,`cid`) VALUES 
 (1,1,1),
 (2,1,3),
 (3,2,2),
 (4,2,3);
/*!40000 ALTER TABLE `course_user_info` ENABLE KEYS */;


--
-- Definition of table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) DEFAULT '',
  `unumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_info`
--

/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
INSERT INTO `user_info` (`id`,`uname`,`unumber`) VALUES 
 (1,'andy',1),
 (2,'zty',2),
 (5,'xiaoming',4);
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
