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