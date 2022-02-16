--1.
select job_id, max(SALARY), min(SALARY)
  from  employees e 
  where job_id = 'SA_MAN'
    or job_id = 'SA_REP'
    group by job_id;
    
--2.
select job_id, max(SALARY)
  from  employees e 
  group by job_id
  order by max(salary) desc;
  
--3.
 select e.employee_id, e.first_name, e.salary
  from  employees e 
  inner join jobs j 
     on j.job_title = 'Programmer'
    and salary between min_salary and max_salary;
   
--4.   
select e.first_name 이름, e.last_name 성, e.salary 연봉
  from  employees e , jobs j 
  where e.job_id = j.job_id
   and j.job_title = 'Sales Representative'
   and salary >= 9000
   and salary <= 10000;
   
--5.
select e.EMPLOYEE_ID 사번, e.first_name 이름, j.JOB_TITLE 업무명, d.department_name 부서명
  from  employees e 
  inner join jobs j
  on e.JOB_ID = j.JOB_ID
  inner join departments d
  on e.DEPARTMENT_ID = d.DEPARTMENT_ID
  inner join locations l
  on d.location_id = l.location_id
   where l.city = 'Seattle';
   
--6.
 select j.JOB_TITLE 업무명, sum(SALARY) 연봉
  from jobs j 
  inner join employees e
     on j.JOB_ID  = e.JOB_ID 
  group by j.JOB_TITLE
  having   sum(SALARY) > 30000
  order by sum(salary) desc;s
  
  
--7  
 select e.last_name 이름, e.salary 연봉
  from employees e 
  inner join employees m
     on e.manager_id = m.employee_id 
  where e.salary > m.salary;
  
--8
  select e.employee_id 사번, e.last_name 이름, d.department_name 부서명, m.last_name 매니저이름
  from employees e 
  inner join employees m
    on m.EMPLOYEE_ID = e.MANAGER_ID 
  inner join DEPARTMENTS d
     on e.DEPARTMENT_ID = d.department_id;  
     
 --9
   select e.employee_id 사번, 
        e.first_name 이름, 
        nvl(m.first_name, '관리자없음') "관리자이름"
   from employees e , employees m
  where e.MANAGER_ID = m.EMPLOYEE_ID(+) 
    and e.first_name like '%v%';
    
--10
   select e.employee_id 사번, 
        e.last_name 이름, 
        e.hire_date 채용일,
        m.hire_date 매니저입사일
   from employees e , employees m
  where e.MANAGER_ID = m.EMPLOYEE_ID(+) 
    and e.hire_date < m.HIRE_DATE;
    
 --11
    select m.EMPLOYEE_ID 사번,
        m.FIRST_NAME 이름,
        COUNT(*) 직원수
   from employees e 
   inner join employees m
      on e.MANAGER_ID = m.EMPLOYEE_ID(+)
   group by m.employee_id, m.first_name
    having  COUNT(*) >= 8;   
  
  --12
  select e.employee_id 사번,
         e.last_name 이름,
         e.salary 급여,
         e.DEPARTMENT_ID 부서번호,
         m.a 부서별평균급여
    from employees e
   inner join (select department_id, avg(salary) a
                 from employees
                 group by DEPARTMENT_ID) m
      on e.department_id = m.DEPARTMENT_ID
   where e.salary > m.a ;
  
 --13
 select e.first_name 이름, 
       e.salary 급여,
       d.DEPARTMENT_NAME 부서명
 from employees e ,departments d 
    where e.department_id = d.department_id
    and d.department_name = 'Sales'
    and  e.salary  <  (select avg(salary)
                        from employees
                        where DEPARTMENT_ID = 100
                )
                
    order by e.salary;
   
    