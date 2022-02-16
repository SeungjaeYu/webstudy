--1.
select department_name ||substr('1234567890',length(department_name)+1,10)
  from departments
where length(department_name) < 10;


--2.

 select DEPT_ID as 부서번호,
        sum(case title when '과장' then salary
           else 0
             end) as 과장 ,
             
           sum(case title when '사원' then salary
           else 0
             end) as 사원,
              sum(case when title in ('과장', '사원') then 0
           else salary
             end) as 그외, 
         sum(salary) as 부서합계
 from s_emp
 group by DEPT_ID
 order by dept_id;
 
 
 
 --3. 
 --테이블 추가해라
 CREATE TABLE TESTDB(
ID VARCHAR2(10),
TYPE1   VARCHAR2(5),
TYPE2   VARCHAR2(5),
TYPE3   VARCHAR2(5)
);

INSERT  INTO TESTDB(ID, TYPE1, TYPE2, TYPE3) 
        VALUES ('T1', 'A', NULL, NULL);
INSERT  INTO TESTDB(ID, TYPE1, TYPE2, TYPE3) 
        VALUES ('T1', NULL, 'B', NULL);    
INSERT  INTO TESTDB(ID, TYPE1, TYPE2, TYPE3) 
        VALUES ('T1', NULL, NULL, 'C');
INSERT  INTO TESTDB(ID, TYPE1, TYPE2, TYPE3) 
        VALUES ('T2', 'A', NULL, NULL);
INSERT  INTO TESTDB(ID, TYPE1, TYPE2, TYPE3) 
        VALUES ('T2', NULL, NULL, 'C');
INSERT  INTO TESTDB(ID, TYPE1, TYPE2, TYPE3)
        VALUES ('T3', NULL, NULL, 'C');
 commit;
 
 
 select *
   from testdb;
   
 select case type1 when 'a' then sum(type1)
                   when null then 0
        end 
   from testdb
  group by id; 
   
   
   