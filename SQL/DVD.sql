use datebase;
drop table if exists DVD;
-- 表名 列名（物理名）
-- 数据类型
-- 默认值
-- 制约
-- 伦理名
create table if not exists DVD(
-- auto_increment自动递增 和主键绑定
ID integer auto_increment comment 'DVD_ID',
DVD_state integer default 1 not null comment '状态',
name varchar(50) not null comment '名称',
count integer default 0 not null comment '借出次数',
delete_flag integer default 0 not null comment '删除FLAG',
create_time timestamp default current_timestamp not null comment '创建时间',
last_update_time timestamp default current_timestamp not null comment '更新日期',
primary key(ID)
)comment '我的DVD';

drop table if exists DVD_Record;
create table if not exists DVD_Record(
-- auto_increment自动递增 
ID integer not null comment 'DVD_ID',
lend_date date not null comment '借出日期',
return_date date comment '归还日期',
price integer default 1 not null comment '单价',
cost integer comment '花费',
create_time timestamp default current_timestamp not null comment '创建时间',
last_update_time timestamp default current_timestamp not null comment '更新日期'
)comment '租借记录';

-- 初始化1
insert into DVD(DVD_state,name,count) values (0,'罗马假日',15);
insert into DVD(name,count) values ('风声鹤唳',12);
insert into DVD(name,count) values ('浪漫满屋',34);
-- 初始化2
insert into DVD_Record(ID,lend_date) values(1,'2022-09-01');

-- 新增DVD
-- insert into DVD(name) values ('驯龙高手');
-- 查看DVD
-- select d.ID,DVD_state,name,lend_date,count
-- from DVD d
-- left join DVD_Record r
-- on d.ID=r.ID
-- and r.return_date is null
-- where delete_flag = 0 -- 存在的DVD
-- order by d.ID;

-- 删除DVD
-- update DVD set delete_flag =1 where ID= 4 AND DVD_STATE = 1 AND DELETE_FLAG = 0;

-- 借出DVD 
-- update DVD set DVD_state = 0, count=count+1,last_update_time = current_timestamp where id = 2 and DVD_state = 1 and delete_flag = 0;
-- insert into DVD_Record(ID,lend_date) values (2,current_date);

-- select d.ID,d.name,r.lend_date,d.count 
-- from DVD as d
-- join DVD_Record as r
-- on d.ID=r.ID
-- and  r.return_date is null
-- where delete_flag = 0;

-- 归还DVD
-- update DVD set DVD_state = 1,last_update_time = current_date where id = 2 and DVD_state = 0 and delete_flag = 0;


-- update DVD_Record
-- set return_date=current_date,
-- cost = case 
-- when datediff(return_date,lend_date)=0 then 1
-- else datediff(return_date,lend_date)*price
-- end,
-- Last_update_time=current_timestamp
--  where ID=1
--  and return_date is null;
 
-- update DVD_Record set return_date = current_date, 
-- cost = if(
-- datediff (current_date,lend_date)*price=0,
-- 1,
-- datediff (current_date,lend_date)* price), 
-- last_update_time = current_timestamp  where id = 2;

-- SELECT DVD.ID,DVD_state,name,cost
-- from DVD
-- join DVD_Record as r
-- on DVD.ID=r.ID
-- where DVD.ID=1
-- order by r.last_update_time desc limit 1;