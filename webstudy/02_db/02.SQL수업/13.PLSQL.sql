---------------------------------------------------------------
-프로그램 유닛 : 함수, 프로시져, 트리거, 패키지,...
---------------------------------------------------------------

 PL / SQL
- 에이다 라는 객체지향 언어를 본따서 만들어졌다.
- SQL + 절차지향 언어(조건, 반복 처리를 하는 언어)

특징
- 블럭 구조로 되어있어 각 기능별로 모듈화 가능
- 변수, 상수 등을 선언하여 SQL에서 사용이 가능
- 조건문, 반복문 등의 사용이 가능
- 오라클에서도 사용자 정의 에러를 생성 할 수 있다
- 변수에 값을 대입시 ":="을 사용
- select 절의 결과를 변수에 담을 때 "into" 사용
  변수가 미리 선언 되어있어야한다.

  c number := 0;
  d number := 0;

 select a, b into c, d
   from ...;
   
   
-- 기본 PL/SQL 블럭 구조
 declare// 생략가능
   변수 및 인수에 대한 정의
 begin
	개발자가 처리할 SQL과 로직 작성
	
exception --예외처리가 필요X 생략가능
    SQL 발생 에러 처리부	
 end;
 
 
 
 --출력해보자
 
 set SERVEROUTPUT ON; --해줘야 값이 나온다 DBMS_OUTPUT에 대한 설정
 
 declare
     v_result number := 0;
 begin
    select max(salary) 
      into v_result
      from employees;
      DBMS_OUTPUT.PUT_LINE(v_result); --변수에 담긴 값을 출력하겠다
	 
 end;
 
 
 
 
 
 ----------------------------------------------------------

 함수(Function)
 
 - 하나의 값을 반드시 돌려줘야 한다
 - 함수 정의시 선언부에 return 될 데이터 타입을 선언한다.
 - PL/SQL 블럭에서 return 문을 이용해서 돌려줄 값을 정의
 
 형태
 create [or replace] function 이름[(파라미터이름 타입(in) 데이터타입)]
 return 돌려줄 데이터타입 
 is --declare
  변수 선언(declare생략된 형태)
 begin
	 처리할 SQL문.. 
	 return 돌려줄값 --필수
[exception]	 
 end ;
 
 
 
 제거하기
 drop function 함수명;
 
 
 
 --함수 예시(오늘 년도 가져오기)
 --함수명 : today_year
 
 create or replace function today_year
 return number
 is
  v_year number(4) := 0;
 begin
	select to_char(sysdate, 'yyyy') into v_year
	  from dual;
    return v_year;
 end ;
 /
 
 
 
 
 -- 보기
  select today_year from dual;
 
 -- 함수예시..  
 --사용자 정의 함수. 절대값을 반환하는 함수
 -- 함수명 my_abs
 
 create or replace function my_abs(num in number)
 return number
 is
   v_num number := num; 
 begin
	if (v_num < 0) then v_num := v_num * -1;
	end if;
	--if 와 end if 는 같이 사용되어야 한다
	return v_num;
	 
 end; 
 /
  
 
 -- 부서번호를 받아서 해당 부서의 최대 급여를 반환하는 함수 작성
 -- 함수명 : dept_max_salary
 create or replace function dept_max_salary(dep_id in number)
 return number
 is
  v_maxSal number;
 begin
  select max(salary) into v_maxSal
    from employees
  where department_id = deptId;
   return v_maxSal;
   
 end;
 /
 
 
  ----------------------------------------------------------
  
 프로시져 (procedure)
 - 처리할 일들을 정의
 
 형태
 create [or replace] procedure 이름[(파라미터이름 타입(in, out, inout) 데이터 타입, ...)]
 is
 begin
 [exception]	 
 end ;
 /
 
실행
execute 프로시져명;

삭제
drop procedure 프로시져명;




--프로시져 연습
create table temp_board(
      no number,
      title varchar2(200),
      writer varchar2(30)
);


create sequence seq_temp_board_no;

--temp_board 테이블에 데이터를 등록하는 프로시져
--프로시져명 : insert_board
--프로시져 파라미터 : v_title, v_writer

create or replace procedure insert_board(v_title in varchar2, v_writer in varchar2) --return 할 것이 없다
is
 
begin
   insert into temp_board(no, title, writer)
   valuse(seq_temp_board_no.nextval, v_title, v_writer);
   commit; -- 완벽하게 저장
end;
/

--확인하기
select * from temp_board;


--실행하기 
execute insert_board('탐정홈즈', '코난도일');

  select max(salary) into v_maxSal
    from employees
  where department_id = deptId;
   return v_maxSal;


-- 글번호를 받아서 삭제해주는 프로시져 만들기
-- delete_board
create or replace procedure delete_board(v_num in number)
is
begin
    delete
	  from temp_board
	 where no = v_num; 
	
end;
/




 