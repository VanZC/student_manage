
SET NAMES utf8mb4 ;

DROP TABLE IF EXISTS `score`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `score` (
  `user_id` VARCHAR(20) PRIMARY KEY NOT NULL,
  `math` INT (4) NOT NULL DEFAULT 0,
  `chinese` INT (4) NOT NULL DEFAULT 0,
  `english` INT (4) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `user_id` VARCHAR(20) PRIMARY KEY NOT NULL,
  `user_name` VARCHAR(10) NOT NULL DEFAULT '',
  `password` VARCHAR(32) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO user (user_id, user_name, password) VALUES ('admin','管理员','e10adc3949ba59abbe56e057f20f883e');
INSERT INTO user (user_id, user_name, password) VALUES ('1628424060','周昌凡','e10adc3949ba59abbe56e057f20f883e');
INSERT INTO score(user_id, math, chinese, english) VALUES ('1628424060','82','80','88');