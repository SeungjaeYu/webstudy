--SET 연산자
 : 여러개의 select 절을 연결해서 사용
 : 집합 개념 이해 필요...(합집합, 교집합, 차집합)
 -합집합 : A + B; , 교집합 : A와 B의 공통, 차집합 : A - B
 -합집합 union(중복된 결과는 하나만 나옴, 정렬, 시간이 걸린다), 
       union all(중복된것도 다 나온다)
 -교집합 : intersect
 -차집합 : minus
 -order by 는 제일 마지막에 올 수 있다.
 
 
 create table tb_seta(
        no number,
        data varchar(2)
 );
 create table tb_setb(
        no number,
        data varchar(2)
 );
 
 insert into tb_seta(no, data) values (1, 'a');
 insert into tb_seta(no, data) values (2, 'b');
 insert into tb_seta(no, data) values (3, 'c');
 insert into tb_seta(no, data) values (4, 'd');
 
 
 insert into tb_setb(no, data) values (5, 'e');
 insert into tb_setb(no, data) values (6, 'f');
 insert into tb_setb(no, data) values (3, 'c');
 insert into tb_setb(no, data) values (4, 'd');
 
 commit;
 
--합집합 union 중복된 결과 제거, 정렬 
  select no, data 
  from tb_seta
 union 
  select no, data 
  from tb_setb; 
  
--합집합 union all 중복된 값도 같이나옴
   select no, data 
  from tb_seta
 union 
  select no, data 
  from tb_setb;
  
 --교집합 intersect 
select no, data 
  from tb_seta
 intersect 
select no, data 
  from tb_setb; 
  
  
--차집합 minus A - B 면 A의 남는 것들만 나온다  
select no, data 
  from tb_seta
 minus
select no, data 
  from tb_setb;   
  

-- 집합의 조건
-- 1. 컬럼의 수가 동일해야한다.
-- 2. 대응되는 타입이 동일해야한다. 컬럼의 수가 동일하더라도 ex)select 컬럼 문자, 숫자 /union all/  select 문자, 문자 (X)
-- 3. order by 는 맨 마지막에만 사용가능
--참고) 첫번째 select절의 column명으로 전체 column명 생성.
  
 select last_name
  from employees
  union all
  select department_name
  from departments
  order by last_name;
  
 --두 개를 결합하고 싶다
 -- 구조상으로 안된다 
select employee_id, last_name, salary
 from employees;
 select sum(salary)
  from employees;
 -- 해결
 -- 숫자를 문자열로 바꿔주고 타입을 맞춰준다
select employee_id||'', last_name, salary
 from employees
 union all
 select '총합', '', sum(salary)
  from employees;
  