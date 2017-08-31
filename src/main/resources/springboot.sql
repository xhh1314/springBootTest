create table orders(
o_id int(50) primary key auto_increment,
sumPrice double
);
create table users(
u_id int(50)  primary key auto_increment,
name varchar(255) not null,
password varchar(255) not null,
email varchar(50) default null,
o_id int(50) not null,
constraint order_foreignkey foreign key(o_id) references orders(o_id)
);
