create schema if not exists `BEDU_JSE2`;

create user if not exists 'developer'@'localhost' identified by 'DEV_PWD';

GRANT SELECT, INSERT, UPDATE, DELETE ON BEDU_JSE2.* TO 'developer'@'localhost';

flush privileges;
