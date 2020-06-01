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

INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('1', 'test@user.com', 'lucas', 'melian');
INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('2', 'test@user.com', 'santiago', 'nevado');
INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('3', 'test@user.com', 'flor', 'forneron');
INSERT INTO `cash`.`user` (`id`, `email`, `first_name`, `last_name`) VALUES ('4', 'test@user.com', 'valen', 'mora');

INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('1', '1500', '3');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('2', '100', '2');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('3', '2000', '1');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('4', '2000', '1');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('5', '410', '2');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('6', '524', '3');
INSERT INTO `cash`.`loan` (`id`, `total`, `id_user`) VALUES ('7', '1552', '4');
