--------------------------
--서브쿼리(subquery)
--------------------------
-- Chen의 부서번호 
select department_id
  from employees
  where last_name = 'Chen';
  
 --Chen과 같은 부서에 근무하는 사원의 정보를 출력
  select *
  from employees
  where department_id = ??;
  
  --?? 는 쿼리를 통해서 알아낼 수 있다.
  -- ?? 자리에 (값을 알수 있는 쿼리) 를 주자
  --Single Row Subquery(서브쿼리의 실행결과 행이 하나인 것)
  -- sub의 연산결과 하나의 값이 나오는 것...
  select *
  from employees
  where department_id = (
                         select department_id
                         from employees
                         where last_name = 'Chen'
  );
  
 -- 관리자 연봉

  
  
  
  --King과 같은 부서에 근무하는 사원의 정보를 출력
  --두명의 King이 있어서 싱글쿼리X  
  --Multy Row Subquery(서브쿼리가 여러개) 연산자 in 사용
  --연산자 : in (서브쿼리 형태) 
  --비교연산자(값비교) >ALL,  <ALL : 다 만족
  --                >ANY,  <ANY : 하나만 만족
  
  
  select *
   from employees
  where department_id in (
                         select department_id
                         from employees
                         where last_name = 'King'
  );
  
  
  
  -- 급여비교
  select last_name, salary
  from employees
  where salary > 10000;


  
  select last_name, salary
  from employees
  where salary > (select salary 
                  from employees 
                  where department_id = 30);
  
  --30번 부서의 속한 급여
  -- 값 중에서 다 해서 포함하는 값 보다 커야한다. 최대값
  select last_name, salary
  from employees
  where salary > ALL (11000, 3100, 2900, 2800, 2600, 2500);
  --같은 개념. max, min 상황에따라
  select last_name, salary
  from employees
  where salary > (select max(salary) 
                  from employees 
                  where department_id = 30);
  
  
  
  --아무거나
  select last_name, salary
  from employees
  where salary > ANY (11000, 3100, 2900, 2800, 2600, 2500);
  --같은 개념 min, max 상황에따라
  select last_name, salary
  from employees
  where salary > (select min(salary) 
                  from employees 
                  where department_id = 30);
  
  
  
  
  
  -- 각 부서에서 가장 작은 급여를 받는 사원 정보를 출력
  -- 부서 department_id, 사원 이름 last_name, 급여...
  -- Multi Column Subquery : 서브쿼리의 실행된 결과 컬럼이 여러개인것
  select *
    from employees
    where  (department_id, salary) in (select department_id, min(salary)
                             from employees
                             group by department_id
                              );
   
 -- 서브쿼리의 사용 위치 
 ---------------------
 -- select 절에서의 사용
 ---------------------
 -- 사원명, 부서번호, 부서명
select e.last_name, e.department_id, d.department_name
  from employees e
 inner join departments d
    on e.edpartment_id = d.department_id;  
  
--부서이름 갖고오기
 select department_name
 from departments
 where department_id = 30;
    
 --서브쿼리사용
 select e.last_name, 
        e.department_id, 
        (select department_name
           from departments
          where department_id = e.department_id)
  from employees e;
  
  
  ---------------------------
  --from 절의 서브쿼리
  --Inline view     view 메모리 상에서 잠깐 갖고있다 사라지는 개념..
  --특정한 컬럼을 앞에서 보고 나머지도 다 보고 싶을때
  -- select 컬럼명, 테이블명.*
  ---------------------------
  select * 
    from (select emloyee_id as eid, salary sal
            from employees
            order by sal
    ) a;
  
  
  --게시판의 페이징 쿼리 이해하기(부분범위 쿼리)
  --정렬상태에서 데이터를 부분으로 가져와야한다.
  --사원중에서 가장 많은 급여를 받는 5명을 조회하라
  --rownum 범위가 ++
  ----------------------------
  --rownum의 규칙
  --1. 1번이 나와야한다
  --2. 순차적으로 나와야한다 ex) 1,3,5를 주면 1만 출력 2로 바껴야하는데 값이 3이기 때문에 조건을 만족하지 않음
  --3. 떨어지면 안된다
    
  ----------------------------
    select rownum, employee_id, last_name, salary
    from employees ;
    
  select employee_id, last_name, salary
    from employees
   
   order by salary desc;
 
  -----------결과가 잘 출력됨.. 
   select rownum, employee_id, last_name, salary
    from employees
    where rownum < 6;
  
   select rownum, employee_id, last_name, salary
    from employees
    where rownum between 1 and 5;
    
   select rownum, employee_id, last_name, salary
    from employees
    where rownum in(1,3,5);
    
    
      select rownum, employee_id, last_name, salary
    from employees
    where rownum in(1,2,3,5);
    
    ---출력안됨
   select rownum, employee_id, last_name, salary
    from employees
    where rownum = 2;
    
--사원중에서 가장 많은 급여를 받는 5명을 조회하라
-- order by 보다 where가 먼저 선언되어서 salary순이 아니라 그냥 5명만 잘린다 
-- row 보다 앞서기 위해서 from에서 급여순으로 만들어줘라
-- top의 서브쿼리
  select employee_id, last_name, salary
   from employees 
   where rownum < 6
   order by salary desc;
   
   
  select a.employee_id, a.last_name, a.salary
   from (select * 
           from employees 
           order by salary desc) a
   where rownum < 6;
  
  --------------------------
   --부분범위 서브쿼리.. ^-ㅜ
   --------------------------
  
   
  select a.employee_id, a.last_name, a.salary
   from (select * 
           from employees 
           order by salary desc) a
   where rownum between 1 and 5;
  
   -- 1부터 5까지 갖고오기.. 다시 6~10, 11~15, 16~20 ... 갖고오고싶다
   --rownum rnum alias로 새로 또 메모리를 만들어줘서 rownum의 특성을 없애줬다
   select *
     from(select rownum rnum, a.employee_id, a.last_name, a.salary
            from (select * 
            from employees 
            order by salary desc) a        
     )      
       
   where rnum between 1 and 5;
  
  
  

  