use DIAMOND;

drop table if exists roughdiamond;
create table roughdiamond
(
    date varchar(10) not null,
    name varchar(20) not null,
    kapan varchar(20) not null,
    packet int(4) not null,
    SUBPACKET varchar(10) not null,
    roughw float not null,
    polishw float not null,
    colour varchar(36) not null,
    clearity varchar(20) not null,
    shape varchar(20) not null,
    flurescence  varchar(20) not null,
    cut varchar(20) not null,
    symmetry varchar(20) not null,
    polish varchar(20) not null,
    DOLLAR float not null,
    AVREAGE float not null
);
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists POLISHREPORT;
create table POLISHREPORT
(
    date varchar(10) not null,
    kapan varchar(20) not null,
    packet int(4)  not null,
    SUBPACKET varchar(10) not null,
    polishw float not null,
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
    TABLE_ float not null,
    GTHIN  varchar(20) not null,
    GTHICK varchar(20) not null,
    GIRDLE float not null,
    GCONDITION varchar(20) not null,
    CSIZE varchar(20) not null,
    CCONDITION varchar(20) not null,
    DOLLAR float not null
);
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists diamondimage;
create table diamondimage
(
    kapan varchar(20) not null,
    packet int(4) primary key not null,
    subpacket varchar(10) not null,    
    img image not null
);
/*-------------------------------------------------------------------------------------------------------------------------------------------*/

