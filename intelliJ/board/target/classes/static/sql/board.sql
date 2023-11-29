
use koreaitdb;

create table board(
id int not null auto_increment,
subject varchar(255) not null,
writer varchar(10) not null,
content text,
visit int,
regdate date,
orgName varchar(255),
savedFileName varchar(255),
savedFilePathName varchar(255),
savedFileSize bigint,
folderName varchar(10),
ext varchar(20),
grp int,
seq int,
depth int,
primary key(id)
);










