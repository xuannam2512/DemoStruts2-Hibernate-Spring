create schema db_struts2;

use db_struts2;


create table user (
	id int(11) unique not null auto_increment,
	username varchar(50) unique not null,
    password varchar(50) not null,
    role varchar(20) not null,
    studentId int(11) not null unique,
    primary key (id),
    foreign key (studentId) references student(id)
);

create table student(
	id int(11) not null unique auto_increment,
    firstname varchar(50) not null,
    lastname varchar(50) not null,
    cardStudent varchar(10) not null unique,
    birthday date,
    username varchar(40) not null,
    password varchar(40) not null,
    primary key (id)
);

create table student_subject (
	id int(11) not null unique auto_increment,
    studentId int(11) not null,
    subjectId int(11) not null,
    primary key (id),
    foreign key (studentId) references student(id),
    foreign key (subjectId) references subject(id)
);

create table subject (
	id int(11) not null unique auto_increment,
    name varchar(50) not null,
    teacherId int(11) not null,
    primary key (id),
    foreign key (teacherId) references teacher(id)
);

create table teacher(
	id int(11) not null unique auto_increment,
    firstname varchar(40) not null,
    lastname varchar(40) not null,
    salary bigint not null,
    primary key(id)
);

insert into db_struts2.teacher (id, firstname, lastname, salary) values (1, "Hai", "Pham", 500);
insert into db_struts2.teacher (id, firstname, lastname, salary) values (2, "Huy", "Nguyen", 600);
insert into db_struts2.teacher (id, firstname, lastname, salary) values (3, "Khanh", "Nguyen", 700);
insert into db_struts2.teacher (id, firstname, lastname, salary) values (4, "Tuyen", "Nguyen", 500);
insert into db_struts2.teacher (id, firstname, lastname, salary) values (5, "Dung", "Nguyen", 1000);
insert into db_struts2.teacher (id, firstname, lastname, salary) values (6, "Loc", "Truong", 1000);

insert into db_struts2.subject (id, name, teacherId) values (1, "Cong Nghe Moi Trong Phat Trien Phan Mem", 1);
insert into db_struts2.subject (id, name, teacherId) values (2, "Kiem Chung Phan Mem", 6);
insert into db_struts2.subject (id, name, teacherId) values (3, "Mau Thiet Ke Huong Doi Tuong Va Ung Dung", 2);
insert into db_struts2.subject (id, name, teacherId) values (4, "Mo Hinh Hoa Phan Mem", 3);
insert into db_struts2.subject (id, name, teacherId) values (5, "Thiet Ke Giao Dien", 5);

alter table db_struts2.student add column username varchar(20) not null unique;
alter table db_struts2.student add column password varchar(20) not null;














