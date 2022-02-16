/**
 * ----------------------------------
 * DDL 명령어
 * create
 * comment
 * drop
 * truncate
 * rename
 * alter
 * 
 * desc
 * 
 * DML 명령어
 * insert 
 * update
 * delete
 * ----------------------------------
 */


 create 객체타입 이름
 
 테이블 생성
 create table 테이블명(
    컬럼,
    컬럼,
    컬럼,
    컬럼
    )
    테이블 생성 시 오라클 내부적으로 테이블명과 컬럼명은 대문자로 관리된다
    
    
    자바의 VO클래스 연결??
    
      클래스명 -> 테이블명
 멤버변수(필드) -> 컬럼명
 
 create table 테이블명 (
    컬럼명  컬럼타입(크기),
    컬럼명  컬럼타입(크기),
    컬럼명  컬럼타입(크기),
    ....
 );
 
 테이블명 naming rule : tbl_board , tb_board, t_board, board_tbl 
 
 
 테이블명, 컬럼명 : 길이 제한(오라클 30자 이하)
 약어(단축어) 사용: count - cnt..
 
 
<테이블만들 때 컬럼의 데이터 타입>
문자 - char(고정길이), 
      varchar2(가변길이) : 가변길이를 필수지정해야한다. 없으면 에러. 나머지는 상관없는데...
                         한글 한 자를 3byte로 인식.. 가변길이(3)을 주면 한 자밖에 사용못한다
숫자 - number
날짜 - date

 
 --테이블을 만들어보자
 --에러에러
 create table tb_char(
      id number,
      a char, 
      b varchar2 --크기가 설정되지 않아 에러발생
 
 );
 
 
-- 테이블 생성 성공
 create table tb_char(
      id number,
      a char, 
      b varchar2(1) --크기지정
 
 );
 
 
 --테이블 삭제
 drop table 삭제할 테이블명
 drop table tb_char;
 
 
--char에 값을 줬다
--char와 varchar의 차이를 이해하기 위해
  create table tb_char(
      id number,
      a char(5), 
      b varchar2(5) --크기지정
 
 );
 
 --데이터 추가하기
 insert into 테이블이름(컬럼명, 컬럼명2, 컬럼명3, ...) values (컬럼명1값, 컬럼2값, 컬럼3값,....);
 ----------------------------------------------------
 insert into tb_char(id, a, b) values(1, 'x', 'x');
 insert into tb_char(id, a, b) values(2, 'x', 'x ');
commit; 
 ----------------------------------------------------
-- 길이를 찍었더니 a길이는 5, b길이는 2
-- char(값) 을 준 만큼 크기를 확보.
-- varchar2는 최대 (크기지정값) 만큼만 들어갈 수 있다.
-- char 모든 사람들의 고정된 값은 char를 주고
-- varchar2는 나머지들.. 검색이 빠르다

-- char 공백 채우기 비교 사용 : 검색 성능이 좋지 않다
select id, a, b, length(a), length(b)
  from tb_char;
 

-- number
--number에 크기를 지정해주지 않으면 38자리로 지정된다(무한대로..).. 꼭 해줘야한다
-- number(a) a 전체 자릿수 
-- number(a,b) a는 전체자릿수 b는 소수점자릿수 확보
--ex) number(3, 1) --정수는 두 자리까지만 가능하다는 뜻.. 22.1 3자 
  create table tb_num(
     a number(3),
     b number(3, 1)
);


-- b 컬럼 중심 
insert into tb_num(a, b) values(100, 10);  --10
insert into tb_num(a, b) values(100, 0.1); --0.1
insert into tb_num(a, b) values(100, 0.5); --0.5
insert into tb_num(a, b) values(100, 0.51);--0.5 자동 반올림해준다
insert into tb_num(a, b) values(100, 0.55);--0.6 자동 반올림해준다
 
insert into tb_num(a, b) values(999, 99);--0.6 자동 반올림해준다
insert into tb_num(a, b) values(999, 100);--오류 소수점 포함 3자리인데 정수만 3자리면 안된다
 
insert into tb_num(a, b) values(999, 99.9); --99.9
insert into tb_num(a, b) values(999, 99.91); --99.9
insert into tb_num(a, b) values(999, 99.95); --오류.. 반올림되어서 3자리를 넘는다


insert into tb_num(a, b) values(1000, 99); --오류.. a의 크기는 3자리인데  3자리를 넘는다
insert into tb_num(a, b) values(999.5, 99); --오류.. a의 크기는 3자리인데  반올림되어 1000 3자리를 넘는다
 
 
insert into tb_num(a, b) values(0.1, 99); -- 0, 99 
insert into tb_num(a, b) values(0.6, 99); -- 1, 99 
insert into tb_num(a, b) values(22.449, 99); -- 22, 99  소수점 첫번째 자리에서만 반올림


insert into tb_num(a, b) values('A', 99); -- 에러.. 문자열
insert into tb_num(a, b) values('1', 99); -- 숫자는 된다. 묵시적 형변환
 
 
 
 ------------------------------------------
 제약조건 이해하기
 ------------------------------------------
 1. PK : Primary Key
     - 테이블당 하나만 설정 가능(여러개의 컬럼을 묶어서 하나의 PK생성 가능)
     - 입력된 데이터를 구분하는 역할 수행
     - 컬럼으로 묶을 때 두 개 이상이여야한다
     - Not Null + Unique

 2. NN : Not Null
     - 널을 허용하지 않는다
     - 무조건 값을 입력해야한다
 
 3. UN : UNIQUE
     - 고유한 값이 입력(중복되면 안된다)
     - null 값 입력 가능

 4. CK : CHECK(조건)
     - 입력된 값을 체크(체크할 조건을 설정)
     
 5. FK : FOREIGN KEY
     - 다른 테이블의 컬럼의 값을 참조
      ex) employees department_id = departments department_id
          department_name 갖고오기
     - 자기 자신 테이블의 다른 컬럼의 값을 참조     

디폴트 옵션
- 값이 입력되지 않은 경우 자동으로 입력할 값을 설정
<형태>
 - 컬럼 타입(크기) default 설정할 값
------------------------------------------
   <제약조건 설정 방식>
 1. 테이블 레벨 제약조건 설정
 2. 컬럼 레벨 제약조건 설정
------------------------------------------
 
------------------------------------------
        컬럼 레벨 제약조건 설정
------------------------------------------
create table 테이블명(
   컬럼명 데이터타입(크기) 제약조건,
   컬럼명 데이터타입(크기) 제약조건,
   컬럼명 데이터타입(크기) 제약조건   
); 

create table tb_book1(
    id number(5) primary key,
    name varchar2(20) not null,
    price number(8) check(price > 0),
    isbn varchar2(14) unique,
    pub_date date default sysdate

);

--휴지통
 drop table 테이블명;

--휴지통에 보내지 않고 완전 삭제
 drop table 테이블명 purge;
 drop table tb_book purge;

--휴지통 비우기
 purge recyclebin;
     
----------------------------------     
         테이블 제약조건    
 : not null 은 컬럼레벨에서만 사용가능하다
 : 여러개의 컬럼을 묶어서 pk 제약조건 설정은 테이블만 가능
 : default는 제약조건이 아니라 내려오지 않는다.
----------------------------------     
 create table 테이블명(
   컬럼명 데이터타입(크기),
   컬럼명 데이터타입(크기),
   컬럼명 데이터타입(크기),
   제약조건,
   제약조건,
   제약조건...
); 

--primary key 누구한테 줄것인지 안나왔다
create table tb_book(
    id number(5),
    name varchar2(20) not null,
    price number(8) check(price > 0),
    isbn varchar2(14) unique,
    pub_date date default sysdate,
    primary key
);    
     
--primary key(제약조건을 할 컬럼명)     // primary key(a, b,...) 다중제약
--default는 제약조건이 아니다
-- 제약조건 이름을 설정하지 않으면 constraint_name은 SYS_C숫자 형태로 자동 생성됨
   create table tb_book(
    id number(5),
    name varchar2(20) not null,
    price number(8),
    isbn varchar2(14),
    pub_date date default sysdate,
    primary key(id),
    check (price > 0),
    unique(isbn)
    );      
     
     

 ---------------------------------------------
            설정된 제약조건 확인하기
  from 절에 준다          
  --user_constraints 테이블제약조건 확인
  --user_cons_columns 컬럼 제약조건 확인   
 select
   constraint_name 제약조건 준 
 ---------------------------------------------
  select *
    from user_constraints;
     
  select constraint_name, constraint_type, table_name
  from user_constraints;
     
  --제약조건의 컬럼을 확인하기   
  select constraint_name, constraint_type, table_name
  from user_cons_columns;
  
  
  -- 제약조건명, 제약조건 타입, 테이블명, 컬럼명을 출력
 select uc.constraint_name,
        uc.constraint_type,
        uc.table_name,
        ucc.column_name
  from user_constraints uc
  inner join user_cons_columns ucc
   on uc.constraint_name = ucc.constraint_name
  where uc.table_name = 'TB_BOOK';
  
  
---------------------------------------  
      제약조건의 이름을 설정해보자
-테이블명_컬럼명_제약조건타입
 컬럼명 타입(크기) constraint 제약조건명 제약조건타입,
---------------------------------------  
  --제약 조건의 이름을 설정하기 위해 테이블 삭제
  drop table tb_book purge;
  
  --다시 만들기  
   create table tb_book(
    id number(5) constraint book_id_pk primary key,
    name varchar2(20) constraint book_name_nn not null,
    price number(8) constraint book_price_ck check(price > 0),
    isbn varchar2(14) constraint book_isbn_un unique,
    pub_date date default sysdate
    );      
  

    
    
 insert into tb_book(id, name, price, isbn, pub_date)
 values(1, '허균', 10000, '12-123-1234', to_date('2019-08-08', 'yyyy-mm-dd'));
 
 --default 옵션 확인하기
 insert into tb_book(id, name, price, isbn)
 values(2, '김영하', 13000, '22-222-2222');
 
 --pk 제약조건 확인
 -- id에 같은 값을 넣어보자 
  insert into tb_book(id, name, price, isbn)
 values(2, '박경리', 15000, '33-333-3333');
 
--pk의 Not null 확인. id를 빼보자  
  insert into tb_book(name, price, isbn)
 values('박경리', 15000, '33-333-3333');
 
 
 
 
-- 제약조건 NN을 준 name 확인
 insert into tb_book(id, price, isbn)
 values(3,  13000, '22-222-2222'); 
 
 
 --제약조건 CK 확인하기 price > 0
  insert into tb_book(id, name, price, isbn)
 values(3, '김영하', -13000, '22-222-2222');
 
 --제약조건 unique 확인
 
  insert into tb_book(id, name, price, isbn)
 values(3, '박경리', 15000, '22-222-2222');
 
 
 
---------------------------------------  
      제약조건 FOREIGN KEY 연습
   -- 컬럼에서 제약조건을 줄 때
     컬럼명 타입 constraint references 참조할테이블명(컬럼명)
      foreign key(컬럼명) references 참조할테이블명(컬럼명)
      
--------------------------------------- 
--테이블을 만들어준다
create table tb_board(
   no number constraint board_no_pk primary key,
   title varchar2(200) constraint board_title_nn not null,
   writer varchar2(30) constraint board_writer_nn not null,
   content varchar2(4000),
   view_cnt number(6) default 0,
   reg_date date default sysdate
);


--게시물 1개에 대한 댓글 주르르륵,,, 1대 다의 관계 
create table tb_comment(
   comment_no number(6) not null,
--게시물에서 받을 컬럼이름과 타입을 동일하게 준다
   no number,
   writer varchar2(30) not null,
   content varchar2(500) not null,
   reg_date date default sysdate,
   constraint cmt_comment_no_pk primary key(comment_no),
   constraint cmt_no_fk foreign key(no) references tb_board(no)

);


parent        child
tb_board(no)  tb_comment(no)




--에러
--참조된 테이블 삭제 불가..
--tb_comment에서 foreingn key 해서..
drop table tb_board; 



--내가 삭제되는데 ,, 내가 삭제되지 못하게 참조되는 제약 조건들을 없애고 나를 지워라
--두 개 다 지워줘라 
drop table tb_board cascade constraints purge; 
 
drop table tb_tb_comment purge; 
 
--다시 테이블만들어주기
-- 참조하고싶은 테이블을 먼저 생성한다



--값 넣어주기
insert into tb_board(no, writer, title, content)
values(1, 'hong', 'foreign key', '연습');

insert into tb_comment(comment_no, no, writer, content)
--    (  ,tb_board의 no,  , '   ')  
values(1, 1, 'kim', '댓글달기');


-- 먼저 인설트 해주면 오류,, 부모가 없어서
insert into tb_comment(comment_no, no, writer, content)
--    (  ,tb_board의 no,  , '   ')  
values(1, 1, 'kim', '댓글달기');



-- 부모 데이터의 게시글 삭제하기
-- 1번 게시글을 참조하는 자식 데이터가 있는 경우에는 삭제가 불가능하다.
delete from tb_board
 where no = 1;
--삭제하기 위해서. 먼저 자식을 삭제하고 부모 데이터를 삭제해야한다
--부모를 지울때 자식을 하나하나 다 찾아줘서 삭제해야한다.. 복잡쓰..
delete from tb_comment
  where no = 1;
  
delete from tb_board
 where no = 1;
 
 --부모의 게시판을 지울 때 자식테이블도 다 한꺼번에 삭제하는 방법
 -- 자식한테 설정을 해놔야한다
  
 drop table tb_comment purge;
 drop table tb_board purge;


--부모 테이블의 데이터를 삭제할 때 자식 테이블의 데이터도 같이 삭제하는방법!!!
 create table tb_board(
   no number constraint board_no_pk primary key,
   title varchar2(200) constraint board_title_nn not null,
   writer varchar2(30) constraint board_writer_nn not null,
   content varchar2(4000),
   view_cnt number(6) default 0,
   reg_date date default sysdate
);


-- 자식에게 삭제 허가 값을 주자
create table tb_comment(
   comment_no number(6) not null,
   no number,
   writer varchar2(30) not null,
   content varchar2(500) not null,
   reg_date date default sysdate,
   constraint cmt_comment_no_pk primary key(comment_no),
   constraint cmt_no_fk foreign key(no) references tb_board(no) on delete cascade

);
 
 
 
 --다시 인설트
 insert into tb_board(no, writer, title, content)
values(1, 'hong', 'foreign key', '연습');

insert into tb_comment(comment_no, no, writer, content)
--    (  ,tb_board의 no,  , '   ')  
values(1, 1, 'kim', '댓글달기');
 
 --삭제
 delete from tb_board
where no = 1;

--삭제되었다
--자식 테이블을 확인해보자
select * from tb_comment;
--삭제되었다.



/**
 * 각 게시물에 대해서 추천할 수 있다
 * 단, 한 사용자가 하나의 게시물에 대해서 한번만 추천이 가능합니다
 * 화면에서 게시물의 총 추천수를 확인 가능하게 해야 합니다.
 * 
 */

create table tb_recom (
     id varchar2(30),
     no number(7),
     constraint recom_id_no_pk primary key(id, no)
);

id     no
a       1
a       2
a       1 X




------------------------------------
--서브쿼리를 이용한 테이블 생성
------------------------------------
create table employees_copy
as
select * from employees;


--삭제
drop table employees_copy purge;

--테이블의 타입과 컬럼만 갖고와라
create table employees_copy
as
select * from employees
where 1 != 1;

 
--테이블이름 변경
rename A to B A를 B 이름으로 바꿔라

rename employees_copy to tb_emp;


--테이블의 모든 데이터를 복구 불가능하게 삭제
truncate table 테이블명;

insert into tb_comment(comment_no, no, writer, content)
--    (  ,tb_board의 no,  , '   ')  
values(1, 1, 'kim', '댓글달기');

-- delete한 테이블 데이터 복구하기 rollback
insert -> commit -> select 확인 -> delete -> select 확인 -> rollback


------------------------------------
  테이블 변경하기
  
  alter
  -- 컬럼 추가하거나 삭제할 수 있다
  -- 컬럼 변경(타입, 크기, default, not null ) 추가 가능
  -- 제약조건에 대한 추가 삭제 가능
------------------------------------
alter table 테이블명
add (컬럼);

alter table 테이블명
add (email varchar2(20) not null, ...);


alter table 테이블명
drop (컬럼명);
alter table 테이블명
drop (email varchar2(20) not null, ...);



alter table 테이블명
modify (컬럼 내용);

alter table 테이블명
rename column a to b;

--제약조건 추가
alter table 테이블명
add constraint 제약조건명 제약조건블라블라(컬럼명);

--제약조건 삭제
alter table 테이블명
drop constraint 제약조건;


create table tb_alter(
   name varchar2(10),
   age varchar2(3)

);

-- 이메일 추가
alter table tb_alter
add (email varchar2(20));


select * from tb_alter;

desc tb_alter;

-- 타입추가
alter table tb_alter
add constraint alter_email_un unique(email);

--컬럼 이름변경 : name -> user_name

alter table tb_alter
rename name to user_name;

--한눈에 확인
DESCRIBE tb_alter;


--컬럼타입변경 : age varchar2 -> number
alter table tb_alter
modify (age number(3));



--제약조건 삭제
alter table tb_alter
drop constraint alter_email_un;

--컬럼 삭제하기
alter table tb_alter
drop (email);




------------------------------------
  주석 설정하기
 -- 테이블 주석추가
 comment on table 테이블명 is '설명';
 -- 컬럼 주석 추가 
 comment on column 테이블명.컬럼명 is '설명';
------------------------------------
--테이블 주석 추가하기
 comment on table tb_board is '자유게시판';
 
 --테이블 주석 확인하기
  select * from user_tab_comments;
 
 --컬럼 주석 추가
  comment on column tb_board.no is '게시판번호';
   comment on column tb_board.title is '제목';
 comment on column tb_board.content is '내용';
 comment on column tb_board.writer is '글쓴이';
 comment on column tb_board.reg_date is '등록일';
 comment on column tb_board.view_cnt is '조회수';

 
 --컬럼 주석 확인
 select * 
   from user_col_comments
 where table_name = 'TB_BOARD';
 
 
 
 
 
 -----tip
 select * from dictionary;
 
 ------------------------------------
    DML
 ------------------------------------
