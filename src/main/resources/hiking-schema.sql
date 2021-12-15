DROP TABLE IF EXISTS `Hiking` CASCADE;

CREATE TABLE `Hiking` (
	`id` INTEGER PRIMARY KEY AUTO_INCREMENT,
	`mountainName` VARCHAR(255) NOT NULL,
	`region` VARCHAR(255) NOT NULL,
	`height` INTEGER NOT NULL,
	`country` VARCHAR(255) NOT NULL
);