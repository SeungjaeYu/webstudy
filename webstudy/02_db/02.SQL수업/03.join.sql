--조인(join)
-- : 논리적으로 2개 이상의 테이블을 연결해서 정보를 추출 ( 여러개의 테이블을 묶어서 원하는 결과를 갖고온다)
-- from 테이블 이름, 테이블 이름, .., 주절주절
from employees, departments,...
   조인조건(증거조건) : (테이블 개수 -1) 
-- 조인 조건을 사용하지 않을 경우 결과행의 수
 : 테이블 A (행의 수) * 테이블 B(행의 수)
 
 select employee_id,
        last_name,
        department_id
   from employees; 
   
 select department_id,
        department_name
   from departments;     
 
   
 --사원의 정보를 출력하시오
 -- 이름, 사원번호, 부서명(departments 테이블에 있다)  
 --employees의 정보에 departments의 정보 중 하나도 같이 사용하고 싶다
 -- join을 해보자
 -- 증거조건을 사용하지 않아서 결과가 각테이블의 행의 곱의 수가 나옴
 -- Cartesian Product
  select last_name,  
         employee_id,      
         department_name
    from employees, departments; 
  
    
 --증거조건을 사용해서 해보자
 -- 공통으로 들어가는 컬럼을 사용해보자
 --A테이블.컬럼 = B테이블.컬럼
  select last_name,  
         employee_id,      
         department_name
    from employees, departments
   where employees.department_id = departments.department_id;   
  select last_name,  
         employee_id,      
         department_name
    from employees, departments
   where employees.department_id = departments.department_id;   
   
   
   
   
--출력결과에 부서번호 추가하기 <에러>
-- department_id 는 양 테이블에 있어서 어떤 테이블에 있는지 정의해줘야한다 
-- 테이블명.컬럼  으로 명시해줘야한다
  select last_name,  
         employee_id,      
         department_name,
        -- department_id
         employees.department_id
    from employees, 
         departments
   where employees.department_id = departments.department_id;   
   
   
 -- Equi 조인(비교연산자 = 을 사용)  
 --ex)employees.department_id = departments.department_id;   
 
   
 --<권장> : 어느 테이블에 있는지 다 명시..
   select employees.last_name,  
          employees.employee_id,      
         -- department_id
          employees.department_id
          departments.department_name,
     from employees, 
          departments
    where employees.department_id = departments.department_id; 
   
--<권장> : 글이 길어져서 쿼리가 복잡해 보임. 
--  해결 : table alias 이용. 테이블명 별칭   
   select e.last_name,  
          e.employee_id,      
          e.department_id,
          d.department_name
     from employees e, 
          departments d
    where e.department_id = d.department_id; 

 --사원번호 사원이름 부서번호 부서이름, 도시명 출력   
   select e.employee_id,      
          e.last_name,  
          e.department_id,
          d.department_name,
          l.city
     from employees e, 
          departments d,
          locations l
    where e.department_id = d.department_id
      and d.location_id = l.location_id;
      
 --Canada에 근무하는 사원의 도시명, 부서명, 사원명을 출력하세요     
   select l.city,      
          d.department_name,
          e.last_name
     from employees e, 
          departments d,
          locations l,
          countries c
    where (e.department_id = d.department_id
      and d.location_id = l.location_id)
      and l.country_id = 'CA';
      
    
    
 -- 각 사원의 직무에서 받을 수 있는 최소 급여와 최대 급여를 화면에 출력하시오
 -- 사원명, 직무명, 최소급여, 최대급여   

   select j.job_title,
          j.min_salary,
          j.max_salary        
     from employees e, 
          jobs j
    where e.job_id = j.job_id
    group by j.job_title, j.min_salary, j.max_salary;
   
    
 create table tb_salgrade(
     grade number(1),
     min_sal number(6),
     max_sal number(6)
 
 );
 
 
 insert into tb_salgrade(grade, min_sal, max_sal) values(1, 20000, 100000);
 insert into tb_salgrade(grade, min_sal, max_sal) values(2, 10000, 19999);
 insert into tb_salgrade(grade, min_sal, max_sal) values(3, 6000, 9999);
 insert into tb_salgrade(grade, min_sal, max_sal) values(4, 3000, 5999);
 insert into tb_salgrade(grade, min_sal, max_sal) values(5, 1, 2999);
 commit;

 -- NonEqui 조인(= 연산자 이외)
 -- 직원의 사번, 이름, 급여, 등급 출력

 select e.employee_id, 
        e.last_name, 
        e.salary, 
        t.grade
   from employees e,
        tb_salgrade t
  where e.salary between t.min_sal and t.max_sal;     
  
  
  
--self join(물리적으로 테이블이 1개이나 논리적으로 2개 이상)
 select employee_id, 
        last_name, 
        manager_id --나를 관리하는 사람의 사번 상사..? 사수??
   from employees
  where manager_id = employee_id -- 같은 행에서 찾기 때문에 내가 나를 관리하지 않는 이상 조건이 맞지않아 에러
  
 --사원 테이블과 관리자 테이블을 만들어서 사용해야한다
 select e.employee_id, 
        e.last_name, 
        m.last_name 
   from employees e, employees m 
  where e.manager_id = m.employee_id; 
  
 
 -- outer join
 -- 조인조건을 만족하지 않더라도 결과에 포함
 -- ex) 킹 is 사장. 사장은 관리하는 사람이 없어서 나오지않는다. but 사원이니까 뽑고 싶다. 
 -- (+) 연산자 : 모자른 쪽에 붙인다. 킹에 대한 관리자가 없으니.. 이 경우 관리자
 select e.employee_id, 
        e.last_name, 
        m.last_name 
   from employees e, employees m 
  where e.manager_id = m.employee_id(+)
  order by e.employee_id; 
 
  -- null 일 때 값을 넣어주기 nvl(컬럼, '이름')
 select e.employee_id, 
        e.last_name, 
        nvl(m.last_name, "나는 사장") 
   from employees e, employees m 
  where e.manager_id = m.employee_id(+)
  order by e.employee_id; 
 
  
  
  

  
  
  --Ansi Join 방식으로 변경
 --표준. 어느 데이터나 똑같이 사용가능하다
 -- 증거조건을 사용하지 않아서 결과가 각테이블의 행의 곱의 수가 나옴
 -- cross join
    select e.last_name,  
           e.employee_id,      
           d.department_name
    from employees e cross join departments d; 
  
    
 --증거조건을 사용해서 해보자
 -- 공통으로 들어가는 컬럼을 사용해보자
 --A테이블.컬럼 = B테이블.컬럼
  select last_name,  
         employee_id,      
         department_name
    from employees, departments
   where employees.department_id = departments.department_id;   
  select last_name,  
         employee_id,      
         department_name
    from employees, departments
   where employees.department_id = departments.department_id;   
   
   
   
   
--출력결과에 부서번호 추가하기 <에러>
-- department_id 는 양 테이블에 있어서 어떤 테이블에 있는지 정의해줘야한다 
-- 테이블명.컬럼  으로 명시해줘야한다
  select last_name,  
         employee_id,      
         department_name,
        -- department_id
         employees.department_id
    from employees, 
         departments
   where employees.department_id = departments.department_id;   
   
 
 -- inner join ~ on 조인조건 : Equi, NonEqui, Self  
   select e.last_name,  
          e.employee_id,      
          e.department_id,
          d.department_name
     from employees e 
    inner join departments d
       on e.department_id = d.department_id; 

 --사원번호 사원이름 부서번호 부서이름, 도시명 출력   
   select e.employee_id,      
          e.last_name,  
          e.department_id,
          d.department_name,
          l.city
     from employees e 
    inner join departments d
       on e.department_id = d.department_id
    inner join locations l
       on d.location_id = l.location_id;
      
 --Canada에 근무하는 사원의 도시명, 부서명, 사원명을 출력하세요     
   select l.city,      
          d.department_name,
          e.last_name
     from employees e 
    inner join departments d
       on e.department_id = d.department_id
    inner join locations l
       on d.location_id = l.location_id
    inner join countries c
       on l.country_id = c.country_id
      where c.country_name = 'Canada';
      
    
    
 -- 각 사원의 직무에서 받을 수 있는 최소 급여와 최대 급여를 화면에 출력하시오
 -- 사원명, 직무명, 최소급여, 최대급여   

   select j.job_title,
          j.min_salary,
          j.max_salary        
     from employees e 
     inner join jobs j
        on e.job_id = j.job_id
    group by j.job_title, j.min_salary, j.max_salary;
   
    
 create table tb_salgrade(
     grade number(1),
     min_sal number(6),
     max_sal number(6)
 
 );
 
 
 insert into tb_salgrade(grade, min_sal, max_sal) values(1, 20000, 100000);
 insert into tb_salgrade(grade, min_sal, max_sal) values(2, 10000, 19999);
 insert into tb_salgrade(grade, min_sal, max_sal) values(3, 6000, 9999);
 insert into tb_salgrade(grade, min_sal, max_sal) values(4, 3000, 5999);
 insert into tb_salgrade(grade, min_sal, max_sal) values(5, 1, 2999);
 commit;

 -- NonEqui 조인(= 연산자 이외)
 -- 직원의 사번, 이름, 급여, 등급 출력
 select e.employee_id, 
        e.last_name, 
        e.salary, 
        t.grade
   from employees e 
   inner join tb_salgrade t
  on e.salary between t.min_sal and t.max_sal;     
  
  
  
--self join(물리적으로 테이블이 1개이나 논리적으로 2개 이상)
 select employee_id, 
        last_name, 
        manager_id --나를 관리하는 사람의 사번 상사..? 사수??
   from employees
  where manager_id = employee_id -- 같은 행에서 찾기 때문에 내가 나를 관리하지 않는 이상 조건이 맞지않아 에러
  
 --사원 테이블과 관리자 테이블을 만들어서 사용해야한다
 select e.employee_id, 
        e.last_name, 
        m.last_name 
   from employees e 
  inner join employees m 
     on e.manager_id = m.employee_id; 
  
 
 -- outer join
 --(full | left | right) outer join
 --(양쪽다| 남는쪽 = 많은쪽)
 -- (+) 연산자 : 모자른 쪽에 붙인다. 킹에 대한 관리자가 없으니.. 이 경우 관리자
 select e.employee_id, 
        e.last_name, 
        m.last_name 
   from employees e
   left outer join employees m 
     on e.manager_id = m.employee_id
  order by e.employee_id; 
 
  -- null 일 때 값을 넣어주기 nvl(컬럼, '이름')
 select e.employee_id, 
        e.last_name, 
        nvl(m.last_name, "나는 사장") 
   from employees e, employees m 
  where e.manager_id = m.employee_id(+)
  order by e.employee_id; 