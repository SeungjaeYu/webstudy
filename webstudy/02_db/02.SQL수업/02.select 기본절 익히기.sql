 -- hr 유저 계정에 제공되는 테이블 확인하기
 
 --현재 접속한 사용자의 테이블 확인
 --기본 절 넘김을 생활화하자
 select * from tab; 
 select * 
   from tab;
  
 
 기본 SELECT
 - SQL 문장은 한 줄로 입력하거나 여러 줄로 보기좋게 입력
 - SQL 문장은 대소문자를 가리지않는다.
  : sElEct * fRoM Tab; 
   == select * from tab; 
 - data값은 대소문자를 가린다 // column의 이름은 대소문자 상관X
  : select * from employees where last_name = 'king';
  : select * from employees where last_name = 'King'; => 두 개는 다르다.
   
 - 최소한 SELECT절과 from 절은 있어야 한다.
 
 -기본 절 6개
 <필 수>
 select 
   from 

 <선택적 사용> 
  where
  group by
 having 
  order by
  
 --------------------------------------------------------------
 --select 절
 -- 데이터를 조회할 때 컬럼 정보를 설정
 -- from : 테이블명
 -- * : 테이블의 모든 컬럼을 다 조회한다
 -- select 컬럼명[, 컬럼명, 컬럼명,...]*
--    from 테이블 명  : 테이블의 일부 컬럼을 조회
 -------------------------------------------------------------
 select *
   from employees;
  
  
 --jobs 테이블의 모든 칼럼 조회
  select *
    from jobs;
    
-- jobs 테이블에서 job_title 컬럼의 데이터만 화면에 표시하기오
     select job_title
       from jobs;
       
       
--사원테이블에서(employees) 이름, 급여, 이메일 정보를 출력
 select first_name, salary, email       
   from employess;
 
-- 부서테이블에서 부서번호와 부서명 출력
 select department_id, department_name
  from departments;
  
  
  
  
  
-- 테이블의 컬럼 확인하기
desc 테이블명 

-- 부서테이블의 컬럼 확인
desc departments;
desc jobs;

--컬럼의 산술연산

--사원의 연봉 출력하시오(단, 연봉은 : 급여 * 15)
 select last_name, salary * 15  
   from employees;
   
--컬럼의 이름을 변경(조회된 컬럼의 이름) : 별칭(alias)   
--1. select 컬럼명 as 별칭
--2. select 컬럼명(공백)별칭
 
 --사원의 이름과 급여와 연봉을 출력하시오(연봉은 급여 * 15입니다)
 --컬럼의 이름을 변경 - last_name : 이름, salary * 15 : 연봉  
 select last_name as 이름, salary 급여, salary * 15 as 연봉    
   from employees;
   
   
--합성연산자 : 데이터의 출력결과 조합 (컬럼+컬럼 결과, 컬럼 + 문자, 컬럼 + 숫자...)   
--오라클은 || 자바에서의 "+"를 생각하자  
  select last_name || salary * 15
    from employees;
--별칭적용   
  select last_name || salary * 15 as 사원정보
   from employees;  
--결과 바꾸기 ex)last_name의 연봉은 360000원.. SQL의 문자열은 '' 더블쿼티션 사용하지 않는다
  select last_name|| '의 연봉은 ' || salary * 15 || '원입니다.' as 사원정보
   from employees;
   
--중복행 제거하기(distinct)
--부서테이블의 부서 번호를 화면에 출력하시오
  select departments_id
    from departments;
--사원의 부서 번호를 출력
select DEPARTMENT_id 
    from employees;  
--중복 제거 : distinct 중복된 데이터는 한 번만 나온다
--distinct 키워드 뒤에 나오는 모든 컬럼을 결합한 값이 같은 것을 제거..     
   select distinct DEPARTMENT_id, last_name 
    from employees;
    
    
---------------------------
--where 절
--전체 행 데이터에서 원하는 행만 추출하기
--연산자 : 논리 연산자, 비교 연산자, SQL 연산자
---------------------------    

 --사원중에서 급여가 10000이상인 사원의 정보를 출력
 
--사원의 정보
 select * 
 --사원
 from employees
 --급여가 10000이상인
 where salary >= 10000;

 
--사원중에서 100번 부서에 근무하는 사원의 정보를 출력
 select *
 from employees
 where department_id = 100;
--100번 부서가 아닌 사원들
 select *
 from employees
-- where department_id != 100;
 where department_id <> 100;
 
 
 --사원중에서 이름(last_name)이 'King'인 사원 출력
 select *
   from employees
  where last_name = 'King';
  
-- 사원의 부서가 100번 이면서 급여가 10000이상인 사원의 정보를 출력
select *
  from employees
 where department_id = 100 
   and salary >= 10000;
   
--사원의 부서가 100번이거나 110번에 속하는 사원의 정보를 출력
select *
  from employees
  where department_id = 100
     or department_id = 110;
   
   
--사원의 부서가 90번 또는 100번에 속하는 사원 중에서 급여가 10000원 이상인 사원 정보를 출력
-- 연산자 우선순위로 인해 버그 발생 () 써줘야 한다 (and>or>not)
-- or 와 and 가 둘다 쓰면 and 먼저 처리 where 나중에... not이 있으면 제일 마지막
 select *
   from employees
  where (department_id = 90
     or department_id = 100)
    and salary >= 10000; 
    
        
 -- SQL 연산자
 --1. 컬럼 between A(표현식) and B(표현식) : A와 B 사이의 값을 선택(A, B 포함)A가 B보다 값이 작아야한다
 --2. 컬럼 in (값,...) : 컬럼의 값이 괄호안의 값과 일치하는지 체크. 값이 같은 것이 있으면 참으로 출력
 --3. 컬럼 like '포멧문자열' : 컬럼의 값이 특정 포멧형태인지 체크.
 --패턴문자 : _ (한문자), % (0개 이상의 문자)

-- 컬럼 between A(표현식) and B(표현식)
-- 사원의 급여가 10000 이상이고 15000이하인 사원의 정보를 출력
select *
  from employees
 where salary >= 10000
   and salary <= 15000;
    
select *
  from employees
 where salary between 10000
   and 15000;

 --2. 컬럼 in (값, 값, ...)
 --사원의 부서가 90, 10, 110, 120번에 근무하는 사원의 정보를 출력
 select *
   from employees
  where department_id = 90 
     or department_id = 10 
     or department_id = 110 
     or department_id = 120; 
   
 select *
   from employees
  where department_id in (90, 100, 110, 120);

 --사원의 이름이 'L'로 시작하는 사원의 정보 출력 
  select *
    from employees
   where last_name like 'L%';


   
  --사원의 이메일이 5자인 사원의 정보 출력 아래언더바 5개
  select * 
    from employees
  where email like '_____';  
  
  
  --사원의이름의 두번 째 글자가 'h'인 사원의 정보 출력
  select * 
    from employees
  where last_name like '_h%';  
  
  
  -- 사원의 이메일의 첫글자가 'D'이고 마지막 글자가 'T'인 사원 출력
  
  select * 
    from employees
  where email like 'D%T';  
  
  
 --이름이 'Nancy'인 사원 출력 
  select * 
    from employees
  where last_name = 'Nancy';  
  
  
--컬럼 is null : 컬럼의 값이 null 인 상태일때 참
--null은 값이 미정인 상태 where = 거짓
--null과의 비교연산은 false 반환
--null과의 산술연산은 null
  select last_name, commission_pct
  from employees
 where department_id = 30;
 
--사원중에서 커미션을 받지 않는 사원을 출력하시오;
 select last_name, commission_pct
   from employees
  where commission_pct is null;
  

--사원중에서 커미션을 받는 사원을 출력하시오;
 select last_name, commission_pct
   from employees
  where commission_pct is not null;
  
  
-----------------------------------  
--order by 절
-- 조회된 데이터를 정렬해서 출력
-- 연산자 : 논리 연산자, 비교 연산자, SQL 연산자

 --오름차순 : asc
 --내림차순 : desc
 --select 절 중에서 가장 마지막에 위치해야한다.
 --order by 컬럼:표현식(salary * 15) | 컬럼의 alias(별칭) | [ASC | DESC], ... 또 나올 수있다..
 --default asc
-----------------------------------  

select last_name, salary
  from employees
 order by salary;
  
 
--사원의 급여순으로 출력한다(낮은 사람부터), 단 급여가 같을 때에는 이름순으로 출력한다

select last_name, salary
  from employees
 order by salary, last_name;
 
--사원의 급여순으로 출력한다(많은 사람부터), 단 급여가 같을 때에는 이름순으로 출력한다
  
select last_name, salary
  from employees
 order by salary desc, last_name;
 
 
 --hire date 입사일
 select last_name, hire_date
   from employees
 order by hire_date;
 
 
 --연봉이 많은 사원부터 출력
 select last_name, (salary * 15)
  from  employees
 order by  (salary * 15) desc;
  
 select last_name, salary * 15 as year_sal
  from  employees
 order by  year_sal desc;
  
 
 ------------------
 --효율적인 순서
 -- from > where > select > order by
 ------------------

  
 ------------------
 -- group by 절
 -- 데이터들을 소그룹화 한다.
 -- 그룹함수와 같이 사용 ( count, sum, max, min, avg....)
 -- 여러개의 데이터를 받아서 하나의 결과를 반환
 ------------------
 
 --사원들의 수와 최대 급여를 출력하시오
 select count(*), max(salary), min(salary), avg(salary), sum(salary) 
   from employees;
   
--100번 부서에 근무하는 사원들의 수와 최대 급여 출력   
 select count(*), max(salary)	
   from employees
  where department_id = 100;   		
  
--각 부서의 근무하는 사원들의 수와 최대급여 select에는 group한 네임만 올 수 있다
 select department_id, count(*), max(salary)	
   from employees
  group by department_id;
  
  
-- 그룹핑 테스트용 테이블 DDL
--tb_group으로 테이블을 만들겠다 클래스
create table tb_group (
-- 멤버변수 varchar2(크기) number 숫자타입
  id varchar2(2),
  sal number,
  job_id varchar2(2),
  dept_id number 
);

insert into tb_group(id, sal, job_id, dept_id) values('a', 1000, 'SA', 10);
insert into tb_group(id, sal, job_id, dept_id) values('b', 2000, 'CM', 30);
insert into tb_group(id, sal, job_id, dept_id) values('c', 3000, 'CM', 20);
insert into tb_group(id, sal, job_id, dept_id) values('d', 4000, 'LA', 10);
insert into tb_group(id, sal, job_id, dept_id) values('e', 3000, 'SA', 30);
insert into tb_group(id, sal, job_id, dept_id) values('f', 2000, 'SA', 10);

 
select dept_id, count(*), max(sal), min(sal)
  from tb_group
 group by dept_id, job_id;
 
 
 -- 각 부서별 부서번호와 최대 급여를 출력합니다
 -- 단, 최대 급여가 높은 부서부터 출력
 select department_id, max(salary) as max
   from employees 
   group by department_id
 order by max desc;
 
 
 -- 각 부서별 부서번호와 최대 급여를 출력합니다
 -- 최대급여가 10000 이상인 부서를 대상으로
 -- 단, 최대 급여가 높은 부서부터 출력
 -- where 절에서는 group 함수를 같이 사용할 수 없다
 
 select department_id, max(salary) as max
   from employees
  where max(salary) >= 10000 
  group by department_id
 order by max desc;
 
 
 ------------------
 -- having 절
 -- 그룹에 대한 제약
 ------------------
 select department_id, max(salary) as max
   from employees
  group by department_id
 having max(salary) >= 10000 
  order by max desc;
 
 -----부서별 평균 급여를 출렵합니다
 -- 단 100번보다 큰 부서는 제외하고
 -- 부서의 편균 급여가 5000 이상인 부서만 출력
 -- 평균 급여가 높은 부서부터 출력 
 select department_id, avg(salary) 
  from employees
  group by department_id
 having department_id < 100 and avg(salary) >= 5000
   order by avg(salary) desc;
   
   
 select department_id, avg(salary) 
   from employees
  where department_id <= 100
  group by department_id
 having   avg(salary) >= 5000
  order by avg(salary) desc;
  
  /
-- from -> where -> group by -> having -> select -> order by
--table alias                             column alias  
  

  