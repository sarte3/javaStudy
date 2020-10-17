select * from DEPT;

--90번부서 삭제
delete from dept where deptno=90;

--90부서의 지역을 독도로 수정
update DEPT set loc='독도' where deptno=90;

--DEPT 테이블에 90,IT,서울
insert into DEPT values (90,'IT','서울');

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