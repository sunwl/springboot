# springboot
maven springboot jdk1.7,jsp ,redis,mysql ,thymeleaf,html

搭建mysql数据库jdbc:mysql://192.168.99.100:3306/T6?useUnicode=true&characterEncoding=UTF-8&useSSL=false
spring.datasource.username: myu
spring.datasource.password: myu
/*
Navicat MySQL Data Transfer

Source Server         : docker
Source Server Version : 80020
Source Host           : 192.168.99.100:3306
Source Database       : T6

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-10-11 20:26:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `nb_user`
-- ----------------------------
DROP TABLE IF EXISTS `nb_user`;
CREATE TABLE `nb_user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` varchar(25) NOT NULL COMMENT '用户工号',
  `name` varchar(80) NOT NULL COMMENT '姓名',
  `tellno` varchar(12) DEFAULT NULL COMMENT '手机号码',
  `passw` varchar(50) NOT NULL COMMENT '密码',
  `info` varchar(100) DEFAULT NULL COMMENT '介绍',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of nb_user
-- ----------------------------
INSERT INTO `nb_user` VALUES ('1', 'L00595', '火影忍者', '17600148912', '123456', null, '1305443419@qq.com');
INSERT INTO `nb_user` VALUES ('2', 'L005951', '火影忍者', '17600148911', '123450', '中国的火影忍者用户', '13054434190@qq.com');

-- ----------------------------
-- Table structure for `see`
-- ----------------------------
DROP TABLE IF EXISTS `see`;
CREATE TABLE `see` (
  `v_date` varchar(4000) DEFAULT NULL,
  `v_desc` varchar(4000) DEFAULT NULL,
  `info` varchar(4000) DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of see
-- ----------------------------
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee0', '学而不思则罔0', '1');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee1', '学而不思则罔1', '2');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee2', '学而不思则罔2', '3');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee3', '学而不思则罔3', '4');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee4', '学而不思则罔4', '5');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee5', '学而不思则罔5', '6');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee0', '学而不思则罔0', '7');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee1', '学而不思则罔1', '8');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee2', '学而不思则罔2', '9');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee3', '学而不思则罔3', '10');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee4', '学而不思则罔4', '11');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee5', '学而不思则罔5', '12');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee0', '学而不思则罔0', '13');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee1', '学而不思则罔1', '14');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee2', '学而不思则罔2', '15');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee3', '学而不思则罔3', '16');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee4', '学而不思则罔4', '17');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee5', '学而不思则罔5', '18');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee0', '学而不思则罔0', '19');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee1', '学而不思则罔1', '20');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee2', '学而不思则罔2', '21');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee3', '学而不思则罔3', '22');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee4', '学而不思则罔4', '23');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee5', '学而不思则罔5', '24');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee0', '学而不思则罔0', '25');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee1', '学而不思则罔1', '26');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee2', '学而不思则罔2', '27');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee3', '学而不思则罔3', '28');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee4', '学而不思则罔4', '29');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee5', '学而不思则罔5', '30');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee0', '学而不思则罔0', '31');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee1', '学而不思则罔1', '32');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee2', '学而不思则罔2', '33');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee3', '学而不思则罔3', '34');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee4', '学而不思则罔4', '35');
INSERT INTO `see` VALUES ('2020-06-07', 'zhangsandeeeee5', '学而不思则罔5', '36');

-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(4000) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `info` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('2', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('3', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('4', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('5', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('6', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('7', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('8', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('9', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('10', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('11', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('12', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('13', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('14', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('15', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('16', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('17', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('18', 'jack', '20', '我是一个爱学习的好青年01');
INSERT INTO `test` VALUES ('19', 'jack', '20', '我是一个爱学习的好青年0');
INSERT INTO `test` VALUES ('20', 'jack', '20', '我是一个爱学习的好青年01');

搭建redis数据库
JedisPool jedisPool = new JedisPool(jedisPoolConfig, "192.168.99.100", 6378,300,"footbar");
