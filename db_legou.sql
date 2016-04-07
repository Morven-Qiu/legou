/*
Navicat MySQL Data Transfer

Source Server         : morven
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : db_legou

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2016-04-04 23:43:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_bigsort
-- ----------------------------
DROP TABLE IF EXISTS `t_bigsort`;
CREATE TABLE `t_bigsort` (
  `bigsortId` int(11) NOT NULL,
  `bigsortName` varchar(200) NOT NULL,
  PRIMARY KEY (`bigsortId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_bigsort
-- ----------------------------

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `goodsID` int(11) NOT NULL,
  `description` varchar(200) NOT NULL,
  `stock` int(11) NOT NULL,
  `condition` varchar(10) NOT NULL,
  `goodsName` varchar(100) NOT NULL,
  `secPrice` double(11,0) NOT NULL,
  `picture` varchar(50) NOT NULL,
  `userId` int(11) NOT NULL,
  `price` double(11,0) NOT NULL,
  `smallsortId` int(11) NOT NULL,
  `bigsortId` int(11) NOT NULL,
  PRIMARY KEY (`goodsID`),
  KEY `userId` (`userId`),
  KEY `smallsortId` (`smallsortId`),
  KEY `bigsortId` (`bigsortId`),
  CONSTRAINT `t_goods_ibfk_3` FOREIGN KEY (`bigsortId`) REFERENCES `t_bigsort` (`bigsortId`),
  CONSTRAINT `t_goods_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `t_user` (`id`),
  CONSTRAINT `t_goods_ibfk_2` FOREIGN KEY (`smallsortId`) REFERENCES `t_smallsort` (`smallsortId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_goods
-- ----------------------------

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `orderId` int(11) NOT NULL,
  `buyerName` varchar(20) NOT NULL,
  `sellerName` varchar(20) NOT NULL,
  `cneeName` varchar(20) NOT NULL,
  `cneeAddress` varchar(200) NOT NULL,
  `telephone` varchar(200) NOT NULL,
  `ordertime` datetime NOT NULL,
  `cost` double NOT NULL,
  `delivery` varchar(10) NOT NULL,
  `state` int(2) NOT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_order
-- ----------------------------

-- ----------------------------
-- Table structure for t_order_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_order_goods`;
CREATE TABLE `t_order_goods` (
  `contentId` int(11) NOT NULL,
  `orderId` int(11) NOT NULL,
  `goodsId` int(11) NOT NULL,
  `goodsName` varchar(200) NOT NULL,
  `goodsPrice` double NOT NULL,
  `goodsNum` int(11) NOT NULL,
  `goodsCost` int(11) NOT NULL,
  PRIMARY KEY (`contentId`),
  KEY `orderId` (`orderId`),
  KEY `goodsId` (`goodsId`),
  CONSTRAINT `t_order_goods_ibfk_2` FOREIGN KEY (`goodsId`) REFERENCES `t_goods` (`goodsID`),
  CONSTRAINT `t_order_goods_ibfk_1` FOREIGN KEY (`orderId`) REFERENCES `t_order` (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_order_goods
-- ----------------------------

-- ----------------------------
-- Table structure for t_smallsort
-- ----------------------------
DROP TABLE IF EXISTS `t_smallsort`;
CREATE TABLE `t_smallsort` (
  `smallsortId` int(11) NOT NULL,
  `smallsortName` varchar(200) NOT NULL,
  PRIMARY KEY (`smallsortId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_smallsort
-- ----------------------------

-- ----------------------------
-- Table structure for t_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_tag`;
CREATE TABLE `t_tag` (
  `tagId` int(11) NOT NULL,
  `tagName` varchar(200) NOT NULL,
  `url` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`tagId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_tag
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `identityID` varchar(18) NOT NULL,
  `telephone` varchar(11) NOT NULL,
  `birthday` datetime NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  `sex` varchar(2) NOT NULL,
  `trueName` varchar(255) NOT NULL,
  `status` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of t_user
-- ----------------------------
