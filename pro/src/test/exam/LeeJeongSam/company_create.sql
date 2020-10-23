create table company(
	cno number primary key,
	cname varchar2(30) not null,
	ceo varchar2(30),
	tel varchar2(20),
	dam varchar2(30)
)

insert into company values(1,'aaa','aaa','02-222','aaa');
insert into company values(2,'bbb','bbb','02-233','bbb');
insert into company values(3,'ccc','ccc','03-333','ccc');
