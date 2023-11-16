use koreaitdb;

create table users(
id int not null auto_increment,
email varchar(50),
passwd varchar(20),
primary key(id)
);