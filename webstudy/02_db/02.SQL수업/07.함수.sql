--오라클 함수 : 내장함수(그룹함수 count sum max min, 단일행 함수), 사용자 정의 함수

--함수 - 단일행 함수
--문자함수
--숫자함수
--날짜함수
--변환형 함수 (문자 -> 숫자, 숫자 -> 문자 ...)
--기타 함수 : nvl
--그룹핑 함수 : 통계
--분석 함수


---------------------------
--<문자형 함수>
--오라클에서 dual이란 더미 테이블을 만들어줬다
--dual : 하나의 값만 나오게.
--concat : (A , B) : A와 B를 결합한 결과를 준다
---------------------------
select upper('a')
  from employees;

  
--concat, length
select upper('a'), 
       lower('A'), 
       concat('홍길동', '의적') 컨캣, 
       length('정윤오')
  from dual;
  
  
  
--괄호안에 를 먼저 실행  
select first_name, 
       last_name, 
       concat(upper(last_name), (lower(first_name)) 
  from employees;
  
  
--substr(A, 시작값, 범위) A(문자열)를 시작값부터 크기 범위를 자르겠다. 시작값은 1부터 시작한다 
--substr(A, 1) A를 끝까지 자르겠다.
select substr('hello', 1, 2), substr('hello', 1, 5), substr('hello', 3, 2)
  from dual;
  
 
-- instr(문자열, 찾을 값 ) : 찾을 값의 위치를 찾아준다 없으면 0 
-- instr(문자열, 찾을 값, n번째부터 찾을 값) 
select instr('hello', 'h'), instr('cheerybomb', 'e', 4)
  from dual;
  
--2019-08-07 문자열에서 2019 , 08 , 07
select substr('2019-08-07', 1, 4), 
       substr('2019-08-07', 6, 2), 
       substr('2019-08-07', 9, 2)
  from dual;
  
  
 -- 032)123-1231
 -- 02)123-1231
 -- 010)1232-1231
 
   select substr(data, 1, instr(data , ')')-1 )
     from (select '02)123-1234' as data from dual);
  
     
  --문자열 채우기
  --lpad(문자열, 확보할 범위값, 찍을 대체 문자) left, : 공간이 남는다면 대체문자가 왼쪽부터 찍힌다 
  --rpad(문자열, 확보할 범위값, 찍을 대체 문자) right : 공간이 남는다면 대체문자가 오른쪽부터 찍힌다 
  
  select lpad('test', 10, '*'), rpad('test', 10, '*') 
    from dual;
  
 --문자열 변환 : translate, replace
 --translate(문자열, 찾을 문자, 바꿀문자) : 하나 하나 다 따로 생각해준다
 --replace(문자열, 찾을 문자, 바꿀문자) : 통으로 인식해서 붙어있는 것만 바꿔준다
 select 'hi hello sql',
         translate('hi hello sql', 'el', 'am'),
         replace('hi hello sql', 'el', 'am'),
   from dual;
   
 --숫자는 별표로 변경 : hong****won  
  select 'hong1234won',
          translate('hong1234won', '0123456789', '**********')
  from dual;
  
  
  --사원 테이블에서 사원의 이름이 5자 미만인 사원의 정보 출력
  select last_name
    from employees
    where length(last_name) < 5
   
    
    
---------------------------
--<숫자형 함수>
--abs(숫자) : 절대값 
--mod(A ,B ); A를 B로 나눈 나머지값
--------------------------- 
    
select abs(100), abs(-100), mod(5 , 2);
  from dual;    
    
  
  
---------------------------
/*
 * ceil(n) : 천장. 입력된 수보다 크거나 같으면서 가장 작은 정수
 * floor(n) : 입력된 수보다 작거나 같으면서 가장 큰 정수
 */
--------------------------- 
 select ceil(1.1) , ceil(1)
   from dual;
 select floor(1.1) , floor(1)
   from dual;
   
/*
 * sign(n) : 입력된 수가 음수일 때 -1, 
 *           0일때는 0
 *           양수일 때는 1 
 */   
   
 select sign(-10), sign(0), sign(10)
   from dual;

   
/*
 *round(A , n) : A만 써주면 반올림. A의 소수점 n번째까지 출력
 *               -1을 주면 정수로 넘어가는데 .. 반올림 대상이면 반올림으로 반환된다
 *trunc : 버림 
 */   
  
  select round(73.732), round(73.732, 2), round(78.732, -1)
         trunc(73.732), trunc(73.732, 2), trunc(73.732, -1)
    from dual;
  
---------------------------
--<날짜형 함수>
---------------------------  
--현재 시간 정보
 select sysdate
  from dual;
  
/*
 * add_months(날짜, 숫자)
 * 월을 더해주는 함수
 * 
 */  
 --1개월 후 오늘 날짜 
 select sysdate,
       add_months(sysdate, 1)
   from dual;

--각사원의 입사일로부터 1년뒤의 날짜를 출력
select hire_date,
        add_months(hire_date, 12)
   from employees;

   
   /*
    * months_between(날짜, 날짜)
    * 날짜 - 날짜 해서 개월수로 출력시켜준다
    * 각 사원의 근무개월수를 출력 
    */

select  sysdate,
        hire_date,
        trunc(months_between(sysdate, hire_date))
   from employees;
   
 /*
  * last_day(날짜) : 날짜가 갖는 달의 마지막 날.. 
  */  
   
 select sysdate,
        last_day(sysdate)
   from dual;     
   
   
-----------------
/*
 * 날짜 + 숫자(日數) = 날짜
 * sysdate + 7 = 일주일 후
 * 날짜 - 숫자(日數) = 날짜
 * sysdate - 7 = 일주일 전
 * 날짜 - 날짜 = 일수
 */
-----------------
   select sysdate + 7 일주일후,
          sysdate - 7 일주일전,
          sysdate + 5/24 다섯시간 뒤     
     from dual;
   
  select sysdate - hire_date
    from employees;
   
   
--15년이상 근무한 사원의 정보를 출력합니다
-- 출력시 사원의 이름은 소문자, 근무기간은 소수점 이하는 버립니다
--사원번호, 근무일수
-- 근무개월이 긴 사원부터 출력 

select employee_id 사원번호,
       lower(last_name) 사원이름,
       trunc(sysdate - hire_date) 근무일수       
  from employees
  where trunc(sysdate - hire_date) > 15*365
  order by trunc(sysdate - hire_date) desc;
   
   
   
---------------------------
--<변환형 함수> : 문자로변경   
------------------------------------ 
--to_char(날짜, '패턴') : 날짜를 문자로 변경
------------------------------------ 
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss")
String sDate = sdf.format(new Date())
--hh24 24를 붙여주면 24시간으로 인식
select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss'),
       to_char(sysdate, 'yyyy-mm-dd'),
       to_char(sysdate, 'hh24:mi:ss'),
       to_char(sysdate, 'mm')
  from dual;

------------------------------------ 
--to_char(숫자, '패턴')    0, 9 자리수. 0은 비어있는 수에 0을 채워주겠다는 의미
------------------------------------ 
/* 9자릿수를 줬을 때 없으면 안나온다.
*  숫자가 자릿수보다 커지면 ### 오류가나온다
*  0은 앞에서부터 채워진다
*  to_char(9000212312) - > 9,000,212,312 ,가 들어가면 문자열로 바뀜
*/
------------------------------------ 
select to_char(1),
       to_char(1987, '999,999'), to_char(1987, '000,000')
  from dual;
    
------------------------------------ 
--날짜 형태의 문자열을 날짜로 바꾸겠다
/*
 * to_date(문자, '패턴')  
 *  
 */ 
------------------------------------ 
  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss")
    Date date = sdf.parse("20190807 171127")
    
select to_date('20190214', 'yyyy-mm-dd')
  from dual;

  
 
  
--숫자로 바꾸겠다
-----------------------
--to_number(문자, '패턴')
-----------------------
select '100', to_number('100'), '1,298', to_number('1,298', '9,999')
  from dual;
  
 

--사원중에서 5월에 입사한 사원들의 정보를 출력
select *
  from employees
 where to_char(hire_date, 'mm') = '05';
  
--현재 월과 동일한 월에 입사한 사원의 정보를 출력
select * 
  from employees
 where to_char(hire_date, 'mm') = to_char(sysdate, 'mm');
 
-- 2005년 1월부터 6월 사이에 입사한 사원들의 정보를 출력
 
select * 
  from employees
 where to_char(hire_date, 'yyyymm') between '200501' and '200506';
  
  
select *
  from employees
 where hire_date between to_date('2005-01-01', 'yyyy-mm-dd')
                     and to_date('2005-06-30 23:59:59', 'yyyy-mm-dd hh24:mi:ss');
  
  

-- 직원의 년도별 직원수, 최대급여, 최소급여, 급여합계, 평균급여를 출력
select to_char(hire_date, 'yyyy'),
       count(*) 직원수, 
       max(salary) 최대급여, 
       min(salary) 최소급여, 
       sum(salary) 급여합계,
       avg(salary) 평균급여
  from employees                     
 group by to_char(hire_date, 'yyyy')
 order by to_char(hire_date, 'yyyy');
  
    
-----------------------------
-- 기타함수
-----------------------------
--nvl(컬럼, '널일경우 대체할 값')  
-----------------------------
  select salary, nvl(commission_pct,0),
         salary + salary * nvl(commission_pct, 0)
    from employees;
  
-- 그룹함수는 null값을 제외하고 계산한다 (오류나지않는다)
  select sum(commission_pct)
    from employees;
  
 
-- 커미션이 없는 경우 화면에 '커미션 없음' 으로 출력    
 -- 오류,, 범위값은 숫자고, 대체값은 문자열이라.. 숫자를 문자열로 바꿔준다
 -- 문자열로 바꾸는 방법 || '' 을 써주거나 to_char() 를 이용한다
  select salary, nvl(commission_pct,'커미션없음'),
         salary + salary * nvl(commission_pct, '커미션없음')
    from employees;
  
  
   
-----------------------------
--decode : 자바의 switch 문과 유사함
--   단점 : 값을 하나에 하나밖에 못준다..   
-----------------------------
--<자바>
switch(수식){
   case 1: 
   case 2:  
   default :
 }
----------------------------- 
--<수식>   
 decode(컬럼, 값1, 처리할 것,
             값2, 처리할 것,
             값3, 처리할 것,
             값123가 아닐때 처리할 것)
----------------------------- 


 select job_id,
        decode(job_id, 'IT_PROG', '개발자',
                       'SA_MAN', '영업',
                                 '사원')
   from employees;
   
    
    
  ---------------------------
  --case 절 : decode의 단점을 극복
  ---------------------------
  <case 1번> 
   case 컬럼 when 값1 then 처리할 일 //컬럼이 값1과 같다면 ~라고 처리해라
           when 값2 then 처리할 일
           when 값3 then 처리할 일
           else                  //default 개념
    end 끝나는 절에 써준다
  --------------------------- 
  <case 2번>  
  case     when 조건 then 처리할 일 
           when 조건 then 처리할 일
           when 조건 then 처리할 일
           else                  
    end
  --------------------------- 
  --(오류)
    select job_id,
           case job_id when 'IT_PROG' then '개발자'
                       when 'SA_MAN','SA_REP' then '영업'
                       else '사원'
           end as job_title      
     from employees;
     
     
  --(해결)   
    select job_id,
           case when job_id = 'IT_PROG' then '개발자'
                when job_id in ('SA_MAN','SA_REP') then '영업'
                       else '사원'
           end as job_title      
     from employees;
  ---------------------------
  --조건식을 줄때. case 뒤에 column 을 빼라.. 
  ---------------------------
    select job_id,
           cass when 'IT_PROG' then '개발자'
                when job_id = 'SA_MAN'  then '영업'
                       else '사원'
           end as job_title      
     from employees;       
--------------------------------
--사원의 급여에 따라서 다음과 같이 출력
/*
 * 급여가 15000 이상이라면 '고급'
 * 급여가 10000 ~ 14999 사이라면 '중급'
 * 급여가 10000 미만이면 '초급' 이라고 출력
 * 
 * 사원명, 급여, 급여타입
 * 
 */
     
select last_name as 사원명,
       salary as 급여,
       case when salary >= 15000 then '고급'
            when salary between 10000 and 14999 then '중급'
            else '초급'
       end as 급여타입         
  from employees;  
     
     
     
----------------------------------    
-- 데이터 그룹 생성 : rollup, grouping
---------------------------------- 
/*   <rollup>
 * -group by 절의 그룹 조건에 따라 전체 행을 그룹화하고
 *  각 그룹에 대해 부분합을 구하는 연산자
 * - 정렬해준다
 * - 맨 마지막 시트에 총 합을 구해준다
 * 
 *  1. rollup(a, b, bb...) 안의 것들을 먼저 처리
 *  2. a를 처리
 *  3. 전체 처리
 *------- 식  ------- 
 * group by rollup(컬럼)
 */
---------------------------------- 
   select department_id, count(*), sum(salary)
     from employees
    where department_id is not null
    group by department_id;
--rollup     
   select department_id, count(*), sum(salary)
     from employees
    where department_id is not null
    group by rollup(department_id);
     
--각 부서, 직무별     
   select department_id, job_id, count(*), sum(salary)
     from employees
    where department_id is not null
    group by department_id, job_id;
--rollup
--1 부서번호와 직무아이디
--2 부서번호
--3 전체값     
   select department_id, job_id, count(*), sum(salary)
     from employees
    where department_id is not null
    group by rollup(department_id, job_id);
     
     
     
 --null 값일 때 총계 라고 나오게 하자
    select nvl(department_id || '', '총계'), count(*), sum(salary)
     from employees
    where department_id is not null
    group by rollup(department_id);    
     
    
    
-------------------------------------    
--grouping(컬럼)
--컬럼이 그룹핑을 사용됐으면 0, 아니면 1
-------------------------------------    
    
    select case when grouping(department_id) = 0 then to_char(department_id)
            else '총계'
           end as title, count(*), sum(salary)
    from employees
    where department_id is not null
    group by rollup(department_id);    
     
    
 -- null 값에 소계 총계 넣기
 --     
 select case when grouping(department_id) = 0 
              and grouping(job_id)=1 then '소계'
              when grouping (department_id) = 1 and
                   grouping(job_id) = 1 then '총계'
               else to_char(department_id)    
           end as titme,
           count(*), sum(salary)
     from employees
    where department_id is not null
    group by rollup(department_id, job_id);  
    
    
-------------------------------------    
--분석함수 : count(컬럼), over (partition by 컬럼 order by 컬럼) 
/*                          ->group by랑 비슷  
 * row_number()
 * rank
 * dense_rank
 * 
 */                                 
-------------------------------------    
 select department_id, 
        last_name, 
        count(*)over(partition by department_id order by department_id ) 카운트를 구하는데 부서번호로 나눈 것
   from employees
  order by department_id;
    
    
 select department_id, 
        last_name, 
        sum(salary)over(partition by department_id order by department_id )    
   from employees
  order by sum(salary);
    
    
    
 select row_number()over(order by salary desc) as rum,
        salary,
        last_name, 
   from employees
  order by salary;
    
    
    
    
    select *
     from(select rownum rnum, a.employee_id, a.last_name, a.salary
            from (select * 
            from employees 
            order by salary desc) a        
     )      
       
   where rnum between 1 and 5;
   
   -- 수정해보자
    select *
     from(select row_number()over(order by salary desc) as rnum, 
            employee_id, last_name, salary 
            from employees) 
    where rnum between 1 and 5;
   
 
    
    
    
   --rank() 중복건너뛴다.  1,2,2,4
   --dense_rank() 중복있게 1,2,2,3
       select department_id,
            last_name,
            salary,
            rank() over(order by salary desc) rank,
            dense_rank() over(order by salary desc) denrank
      from employees;  
    
    
    
    
    
    select department_id,
            last_name,
            salary,
            rank() over(partition by department_id order by salary desc) rank
      from employees
      order by department_id;      
   
   
   
   
   
   
   
   
   
   
    
    
    
    
    
    