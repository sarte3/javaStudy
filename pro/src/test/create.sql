create table board(
	no number(4) primary key,
	writer varchar2(100) not null,
	title varchar2(300) not null,
	content varchar2(3000) not null,
	writeDate date default sysdate,
	hit number(10) default 0
);