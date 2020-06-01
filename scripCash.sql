create schema cash;

USE `cash`;

CREATE TABLE `loan` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `total` DOUBLE NULL DEFAULT NULL,
  `id_user` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE  `user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(50) NULL DEFAULT NULL,
  `first_name` VARCHAR(50) NULL DEFAULT NULL,
  `last_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('1', 'test1@user.com', 'Homero', 'Simpson');
INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('2', 'test2@user.com', 'Apu', 'Nahasapeemapetilon');
INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('3', 'test3@user.com', 'Montgomery', 'Burns');
INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('4', 'test4@user.com', 'Ned', 'Flanders');
INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('5', 'test5@user.com', 'Troy', 'McClure');

INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('1', '1500', '3');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('2', '100', '2');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('3', '2000', '1');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('4', '2000', '1');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('5', '410', '2');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('6', '524', '3');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('7', '6700', '3');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('8', '6300', '2');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('9', '150', '5');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('10', '3500', '4');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('11', '5000', '4');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('12', '2500', '4');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('13', '1552', '2');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('14', '45700', '2');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('15', '45000', '5');
