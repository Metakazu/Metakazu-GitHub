use datebase;
drop table if exists category;
create table category(
ID int auto_increment,
name Varchar(20),
primary key (id));

iNSERT INTO CATEGORY VALUES (null,'food');
iNSERT INTO CATEGORY VALUES (null,'drink');


drop table if exists product;
create table product(
ID int auto_increment,
NAME varchar(20),
PRICE double,
CID int,
primary key (ID)
);

INSERT INTO product VALUES (null,'rice',20.8,1);
INSERT INTO product VALUES (null,'hamburger',20,1);
INSERT INTO product VALUES (null,'noodle',7,1);
INSERT INTO product VALUES (null,'cola',5,2);
INSERT INTO product VALUES (null,'orange juice',6.5,2);
INSERT INTO product VALUES (null,'beer',9,2);


select c.id cid,c.name cname,p.id pid,p.name pname,price from category c join product p on c.id=p.cid;

drop table if exists order_;
create table order_(
ID int auto_increment,
name varchar(20),
primary key (ID)
);
INSERT INTO order_ VALUES (null,'小小的订单');
INSERT INTO order_ VALUES (null,'大大的订单');

drop table if exists order_ITEM;
create table order_ITEM(
ID int auto_increment,
oid int,
pid int,
number int,
primary key (ID)
);

INSERT INTO order_ITEM VALUES (null,'1','4','100');
INSERT INTO order_ITEM VALUES (null,'1','5','500');
INSERT INTO order_ITEM VALUES (null,'1','6','50');

