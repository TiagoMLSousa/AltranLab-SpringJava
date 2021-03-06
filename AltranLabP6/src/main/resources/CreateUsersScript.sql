CREATE DATABASE IF NOT EXISTS AltranSpring;

USE AltranSpring;

CREATE TABLE IF NOT EXISTS Users (
  id int(6) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar(255) NOT NULL,
  emailaddress varchar(255) NULL,
  username varchar(255) NOT NULL UNIQUE KEY,
  password varchar(255) NOT NULL
);

INSERT IGNORE INTO Users (name, emailaddress, username, password) 
	VALUES ('Pedro Costa', 'pedro.costa@altran.com', 'pedro.costa', 'altran');
INSERT IGNORE INTO Users (name, emailaddress, username, password) 
	VALUES ('Tiago Sousa', 'tiago.sousa@altran.com', 'tiago.sousa', 'altran');
INSERT IGNORE INTO Users (name, emailaddress, username, password) 
	VALUES ('Consultor 1', 'consultor.1@altran.com', 'consultor.1', 'altran123');


insert into user_roles (username, userRole) values ("pedro.costa", "ROLE_ADMIN");
insert into user_roles (username, userRole) values ("tiago.sousa", "ROLE_USER");
