--회원테이블삭제
drop table member;

--회원테이블 : 이름,전번,id,비번,나이,email,nick,...
create table member(
	mno number(5) constraint member_mno_p primary key,  --회원번호
	mname varchar2(30),	--이름
	mid varchar2(20),	--id
	mpwd varchar2(20),	--비번
	mdate date default sysdate	--가입일
);

select mno,mname,mid,mpwd,mdate from member;

-- insert into MEMBER values(mno,mname,mid,mpwd,mdate);
insert into MEMBER 
values(eno_seq.nextval,'홍1','hid','1234',sysdate);
insert into MEMBER values(eno_seq.nextval,'홍2','kid','1234',sysdate);
insert into MEMBER values(eno_seq.nextval,'홍3','qid','1234',sysdate);

update member 
set mname='홍new1', mpwd='111'
where mno=8002;

delete from MEMBER
where mno=8002;