/*
 Navicat Premium Data Transfer

 Source Server         : loen-mysql
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : 47.106.162.220:3306
 Source Schema         : loenblog

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 21/08/2020 18:08:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for send_result
-- ----------------------------
DROP TABLE IF EXISTS `send_result`;
CREATE TABLE `send_result`  (
  `article_id` int(10) NOT NULL COMMENT '文章id',
  `result` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发送至百度收录结果',
  `time_stamp` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '时间戳',
  `result_json` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '返回结果json',
  `residue_num` int(10) NULL DEFAULT NULL COMMENT '剩余可发送数目',
  INDEX `index_timestamp`(`time_stamp`) USING BTREE COMMENT '时间戳索引'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
