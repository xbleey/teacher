/*
 Navicat Premium Data Transfer

 Source Server         : apple
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : teacher

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 12/06/2019 16:36:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade`  (
  `grade_id` int(5) NOT NULL AUTO_INCREMENT,
  `grade_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `grade_number` int(5) NOT NULL,
  `grade_open_time` date NOT NULL,
  `grade_end_time` date NOT NULL,
  `grade_type` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`grade_id`) USING BTREE,
  UNIQUE INDEX `index_grade_id`(`grade_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES (1, '计算机班', 70, '2016-09-01', '2019-08-22', '专业班');
INSERT INTO `grade` VALUES (2, '肥猪班', 90, '2018-01-07', '2019-12-31', '普通班');

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info`  (
  `info_id` int(10) NOT NULL AUTO_INCREMENT,
  `info_mess` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `info_stu_id` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`info_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO `info` VALUES (1, '🌶🐔', 1);
INSERT INTO `info` VALUES (2, '🌶️💉💧🐮🍺', 2);
INSERT INTO `info` VALUES (3, '你打球真像蔡徐坤', 1);
INSERT INTO `info` VALUES (4, '🌶️💉💧🐮🍺啊', 2);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `stu_id` int(5) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `stu_for_course` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `stu_for_grade_id` int(5) NOT NULL,
  `stu_begin_time` date NOT NULL,
  `stu_phone` bigint(11) NOT NULL,
  PRIMARY KEY (`stu_id`) USING BTREE,
  UNIQUE INDEX `index_stu_id`(`stu_id`) USING BTREE,
  INDEX `FK_grade_id`(`stu_for_grade_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'Jimson', '计算机科学与技术', 1, '2018-02-21', 15917378888);
INSERT INTO `student` VALUES (2, 'tom', '药学', 2, '2019-02-06', 15253217899);
INSERT INTO `student` VALUES (3, 'Jerry', '科学', 2, '2019-02-07', 15556785678);
INSERT INTO `student` VALUES (4, 'Larry', '英语', 1, '2010-06-19', 15556785678);

-- ----------------------------
-- Table structure for zan
-- ----------------------------
DROP TABLE IF EXISTS `zan`;
CREATE TABLE `zan`  (
  `zan_id` int(5) NOT NULL AUTO_INCREMENT,
  `zan_level` int(1) NOT NULL,
  `zan_stu_id` int(5) NOT NULL,
  `zan_teacher_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`zan_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zan
-- ----------------------------
INSERT INTO `zan` VALUES (1, 5, 1, '大老师');
INSERT INTO `zan` VALUES (2, 4, 2, '小老师');
INSERT INTO `zan` VALUES (3, 2, 2, '哈喽老师');

SET FOREIGN_KEY_CHECKS = 1;
