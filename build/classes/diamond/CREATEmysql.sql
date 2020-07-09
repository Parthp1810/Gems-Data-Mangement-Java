use DIAMOND;

drop table if exists roughdiamond;
create table roughdiamond
(
    date varchar(10) not null,
    name varchar(20) not null,
    kapan varchar(20) not null,
    packet varchar(20),
    SUBPACKET varchar(10),
    roughw double not null,
    polishw double not null,
    colour varchar(36) not null,
    clearity varchar(20) not null,
    shape varchar(20) not null,
    flurescence  varchar(20) not null,
    cut varchar(20) not null,
    symmetry varchar(20) not null,
    polish varchar(20) not null,
    DOLLAR double not null,
    AVREAGE double not null
);
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists POLISHREPORT;
create table POLISHREPORT
(
    date varchar(10) not null,
    kapan varchar(20)  not null,
    packet varchar(20),
    SUBPACKET varchar(10),
    polishw double not null,
    colour varchar(36) not null,
    clearity varchar(20) not null,
    shape varchar(20) not null,
    flurescence  varchar(20) not null,
    cut varchar(20) not null,
    symmetry varchar(20) not null,
    polish varchar(20) not null,
    MEASUREMENT varchar(20) not null,
    LAB varchar(20) not null,
    REPORT  varchar(20) not null,
    DEPTH double not null,
    TABLE_ double not null,
    GTHIN  varchar(20) not null,
    GTHICK varchar(20) not null,
    GIRDLE double not null,
    GCONDITION varchar(20) not null,
    CSIZE varchar(20) not null,
    CCONDITION varchar(20) not null,
    DOLLAR double not null
);
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists diamondimage;
create table diamondimage
(
    kapan varchar(20) not null,
    packet varchar(20),
    subpacket varchar(10),
    polishw double not null,
    colour varchar(36) not null,
    clearity varchar(20) not null,
    shape varchar(20) not null,
    flurescence  varchar(20) not null,
    img longblob not null
);
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists Registration;
create table Registration (
  Username varchar(10) primary key not null,
  Password varchar(20) not null,
  NameOfUser varchar(20) not null  
);
insert into Registration values("Admin","12345678","Admin");
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS Users;
create table Users (
  Username varchar(20) primary key not null,
  Password varchar(20) not null,
  CONSTRAINT Users_1 FOREIGN KEY (Username)  REFERENCES registration(Username)
);
insert into Users values("Admin","12345678");
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists super_login_detail;
create table super_login_detail
(
UserName varchar(20)  not null,
Date_login varchar(10) not null,
Login_time varchar(25) not null,
Logout_time varchar(25) 
);
