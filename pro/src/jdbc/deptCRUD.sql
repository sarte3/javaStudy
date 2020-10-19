select * from DEPT;

--90번부서 삭제
delete from dept where deptno=90;

--90부서의 지역을 독도로 수정
update DEPT set loc='독도' where deptno=90;

--DEPT 테이블에 90,IT,서울
insert into DEPT values (90,'IT','서울');

--sequence 생성
--create sequence 시퀀스명
--start with 시작값
--increment by 증감값
--maxvalue 최대값
--minvalue 최소값
--cycle | nocycle

create sequence eno_seq 
start with 8000 
increment by 1 
maxvalue 9999 
nocycle;

--TABLE 생성
--create table 테이블명(
--	컬럼1 데이터타입(자릿수) [제약조건],
--	컬럼2 데이터타입(자릿수) [제약조건],
--	컬럼2 데이터타입(자릿수) [constraint 제약조건명 제약조건],
--	컬럼2 데이터타입(자릿수) [constraint 제약조건명 제약조건 default 기본값]...
--  
--)

--sequence 사용 시퀀스명.nextval
insert into emp(empno,ename,sal,hiredate) 
values(eno_seq.nextval,'홍1',3000,sysdate);

select empno,ename,sal,hiredate 
from emp 
where empno>=7900
order by empno desc;

update emp 
set sal=sal+100
where empno=8000;

delete from EMP
where empno=8000;

--*delete 문법
--delete [from] 테이블명 [where 조건];

--*update 문법
--update 테이블명 set 칼럼명1=값, 칼럼명2=값,... [where 조건];

--*insert 문법
--insert into 테이블명 (칼럼명1, 칼럼명2, ...) values (값1,값2,...);

--*select 문법
--select [distinct] *(칼럼명1 [as] 별칭, 칼럼명2, ...) from 테이블명
--[where 조건]
--[group by 그룹기준]
--[having 조건;]
--[order by 정렬기준 정렬방식];
--정렬방식
--- 오름차순(기본값, asc) : 숫자 작->큰, A->Z, ㄱ->ㅎ, 예전->최근
--- 내림차순(desc)