create schema health_sync;

use health_sync;

create table user (
	id int NOT NULL AUTO_INCREMENT,
    first_name varchar(45) NOT NULL,
    last_name varchar(45) DEFAULT NULL ,
    email varchar(45) NOT NULL,
    phone varchar(45) NOT NULL,
    password varchar(100) NOT NULL,
    UNIQUE(email),
    UNIQUE(phone),
    PRIMARY KEY (id)
);

create table role(
	id int NOT NULL AUTO_INCREMENT,
    name varchar(45),
    UNIQUE(name),
    PRIMARY KEY (id)
);

INSERT INTO `role` (`id`, `name`) VALUES ('1', 'DOOCTOR');
INSERT INTO `role` (`id`, `name`) VALUES ('2', 'PATIENT');

create table user_role_mapping(
	id int NOT NULL AUTO_INCREMENT,
    role_id int NOT NULL,
    user_id int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (role_id) REFERENCES role(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE `doctor` (
  `id` INT NOT NULL,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `description` MEDIUMTEXT NULL,
  `department_id` INT NULL,
  `isVerified` TINYINT NULL,
  `status` INT NULL,
  `status_date` DATE NULL,
  `status_reason` VARCHAR(45) NULL,
  UNIQUE(email),
  PRIMARY KEY (`id`));

CREATE TABLE `doctor_configuration` (
    `id` int NOT NULL,
    `doctor_id` INT NOT NULL,
    `configuration` json DEFAULT NULL,
    PRIMARY KEY (`id`)
  )

CREATE TABLE `appointment` (
    `id` INT NOT NULL,
    `doctor_id` INT NULL,
    `patient_id` INT NULL,
    `appointment_time` DATETIME NULL,
    `duration` INT NULL,
    `status` INT NULL,
    `status_reason` VARCHAR(100) NULL,
    `status_date` DATETIME NULL,
    PRIMARY KEY (`id`));


CREATE TABLE `review` (
  `id` INT NOT NULL,
  `doctor_id` INT NULL,
  `rating` VARCHAR(45) NULL,
  `review` TEXT NULL,
  `posted_by` INT NULL,
  `is_anonymous` TINYINT NULL,
  `created_on` DATETIME NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `medical_records` (
  `id` INT NOT NULL,
  `doctor_id` INT NULL,
  `patient_id` INT NULL,
  `department_id` INT NULL,
  `findings` LONGTEXT NULL,
  `prescription` LONGTEXT NULL,
  `created_on` DATETIME NULL,
  PRIMARY KEY (`id`));