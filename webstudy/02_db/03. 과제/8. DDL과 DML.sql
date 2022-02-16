/*
 * ------------------------------
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
 */
create 객체타입 이름
create table 테이블명 (
	컬럼,
	컬럼,
	컬럼,
	...
)
테이블 생성 시 오라클 내부적으로 테이블명과 컬럼명은 대문자로 관리된다.

자바의 VO 클래스 연결??

클래스명 -> 테이블명
멤버변수(필드) -> 컬럼명

create table 테이블명 (
	컬럼명  컬럼타입(크기),
	컬럼명  컬럼타입(크기),
	컬럼명  컬럼타입(크기),
	....
);

테이블명 네이밍룰 : tbl_board, tb_board, t_board, board_tbl

테이블명, 컬럼명 : 길이 제한(오라클 - 30)
약어(단축어) 사용 : 3, 4자로 단축.. 
count -> cnt

데이터 타입 
문자 - char(고정길이), varchar2(가변길이) - 크기를 필수로 지정해야 한다.
숫자 - number
날짜 - date

create table tb_char (
	id number,
	a char,
	b varchar2  -- 크기가 설정되지 않아 에러발생
);

-- 테이블 생성 성공
create table tb_char (
	id number,
	a char,
	b varchar2(1)
);

테이블 삭제
drop table 테이블명;
drop table tb_char;

-- char, varchar2 의 차이를 이해하자
create table tb_char (
	id number,
	a char(5),
	b varchar2(5)
);

insert into tb_char(id, a, b) values(1, 'x', 'x');
insert into tb_char(id, a, b) values(2, 'x ', 'x ');
commit;

-- char는 공백채우기 비교 사용 : 검색 성능이 좋지 않다.
select id, a, b, length(a), length(b)
  from tb_char;
 
-- number 타입의 이해
number(3) -> 정수의 전체 자리수가 3자리까지 가능
number(3, 1) -> 전체 자리수가 3자리까지 가능(소수점 아래 한자리 확보되어야 함)
             -> 정수 2자리까지 가능(소수점 아래 한자리 확보되어야 함)
create table tb_num (
	a number(3),
	b number(3, 1)
);   

-- b 컬럼 중심
insert into tb_num(a, b) values(100, 10);   -- 10
insert into tb_num(a, b) values(100, 0.1);  -- 0.1
insert into tb_num(a, b) values(100, 0.5);  -- 0.5
insert into tb_num(a, b) values(100, 0.51); -- 0.5
insert into tb_num(a, b) values(100, 0.55); -- 0.6  :  자동 반올림 처리된다.

insert into tb_num(a, b) values(999, 99);
insert into tb_num(a, b) values(999, 100);

insert into tb_num(a, b) values(99, 99.9);  -- 99, 99.9
insert into tb_num(a, b) values(99, 99.91); -- 99, 99.9
insert into tb_num(a, b) values(99, 99.95); -- 반올림 되어 100이 되기 때문에 에러

insert into tb_num(a, b) values(1000, 99);  -- 에러발생
insert into tb_num(a, b) values(999.5, 99);  -- 에러발생

insert into tb_num(a, b) values(0.1, 99);  -- 0 입력
insert into tb_num(a, b) values(0.6, 99);  -- 1 입력
insert into tb_num(a, b) values(22.449, 99);  -- 22 입력

insert into tb_num(a, b) values('A', 99);  -- 에러
insert into tb_num(a, b) values('1', 99);  -- 1 입력됨

--------------------------------------------
제약조건 이해하기

5가지 종류

1. PK : Primary Key
   - 테이블당 하나만 설정 가능(여러개의 컬럼을 묶어서 하나의 PK 생성 가능)
   - 입력된 데이터를 구분하는 역활 수행
   - Not Nul + Unique
   
2. NN : Not Null
   - 널을 허용하지 않는다.
   - 반드시 값을 입력해야 한다.
   
3. UN : UNIQUE
   - 입력되는 값이 고유해야 한다.(중복허용하지 않는다.)
   - 널값 입력이 가능
   
4. CK : CHECK
   - 입력되는 값을 체크(체크할 조건을 설정)
   
5. FK : FOREIGN KEY
   - 다른 테이블의 컬럼의 값을 참조
   - 자기 자신 테이블의 다른 컬럼의 값을 참조
   
디폴트 옵션
- 값이 입력되지 않은 경우 기본적으로 입력할 값을 설정
- 컬럼 타입(크기) default 설정할값
--------------------------------------------

제약조건 설정 방식
- 컬럼 레벨 제약조건 설정
- 테이블 레벨 제약조건 설정

-------------------------------------------
컬럼레벨 제약조건 설정하기
-------------------------------------------
create table 테이블명 (
	컬럼명 데이터타입(크기) 제약조건, 
	컬럼명 데이터타입(크기) 제약조건,
	.....
);

create table tb_book (
	id number(5) primary key,
	name varchar2(20) not null,
	price number(8) check (price > 0),
	isbn varchar2(14) unique,
	pub_date date default sysdate 
);

-- 삭제테이블은 휴지통 으로 이동됨
drop table tb_book;

-- 휴지통으로 보내지 않고 완전 삭제
drop table 테이블명 purge;
drop table tb_book purge;

-- 휴지통에 있는 테이블 삭제
purge recyclebin;


-------------------------------------------
테이블레벨 제약조건 설정하기
: not null 제약조건은 컬럼레벨만 가능
: 여러개의 컬럼을 묶어서 PK 제약조건 설정은 테이블만 가능
-------------------------------------------
create table 테이블명 (
	컬럼명 데이터타입(크기), 
	컬럼명 데이터타입(크기),
	제약조건,
	제약조건
);

-- 제약조건 이름을 설정하지 않으면 SYS_C숫자 형태로 자동 생성됨
create table tb_book (
	id number(5),
	name varchar2(20) not null,
	price number(8),
	isbn varchar2(14),
	pub_date date default sysdate, 
	primary key(id),
	check (price > 0),
	unique(isbn)
);

-------------------------------------------------
-- 설정된 제약조건 확인하기
-- user_constraints, user_cons_columns
-------------------------------------------------
select *
  from user_constraints;

-- 테이블의 이름은 대문자로 관리
select constraint_name, constraint_type, table_name 
  from user_constraints
 where table_name = 'tb_book';

select constraint_name, constraint_type, table_name 
  from user_constraints
 where table_name = 'TB_BOOK';

-- 제약조건의 컬럼을 확인하자
select *
  from user_cons_columns;


select *
  from user_cons_columns
 where table_name = 'TB_BOOK';


-- 제약조건명, 제약조건타입, 테이블명, 컬럼명을 출력
select a.constraint_name, 
       a.constraint_type, 
       a.table_name, 
       b.column_name
  from user_constraints a
 inner join user_cons_columns b 
    on a.constraint_name = b.constraint_name 
 where a.table_name = 'TB_BOOK'; 


----------------------------------
제약조건 이름을 직접 설정하기
테이블명_컬럼명_타입
----------------------------------
drop table tb_book purge;

컬럼명 타입(크기) constraint 제약조건명 제약조건,

create table tb_book (
	id number(5) constraint book_id_pk primary key,
	name varchar2(20) constraint book_name_nn not null,
	price number(8) constraint book_price_ck check (price > 0),
	isbn varchar2(14) constraint book_isbn_un unique,
	pub_date date default sysdate
); 

insert into tb_book(id, name, price, isbn, pub_date)
values(1, '홍길동', 10000, '12-123-1234', to_date('2019-08-08', 'yyyy-mm-dd'));

-- default 옵션 확인하기
insert into tb_book(id, name, price, isbn)
values(2, '임꺽정', 20000, '22-222-2222');

-- pk 제약조건 확인 : id가 중복되어 에러발생
insert into tb_book(id, name, price, isbn)
values(2, '박보검', 30000, '33-333-3333');

-- pk 제약조건 확인 : null 관련 에러발생
insert into tb_book(name, price, isbn)
values('박보검', 30000, '33-333-3333');

-- not null 제약조건 확인 : name은 not null 제약조건이기 때문에 에러발생
insert into tb_book(id, price, isbn)
values(3, 20000, '22-222-2222');

-- check 제약 옵션 확인 : price는 0보다 커야한다.
insert into tb_book(id, name, price, isbn)
values(3, '임꺽정', -20000, '22-222-2222'); 

-- unique 제약 조건 확인
insert into tb_book(id, name, price, isbn)
values(3, '임꺽정', 30000, '22-222-2222'); 
 
 
-- foreign key 제약조건 이해하기
create table tb_board (
	no number constraint board_no_pk primary key,
	title varchar2(200) constraint board_title_nn not null,
	writer varchar2(30) constraint board_writer_nn not null,
	content varchar2(4000),
	view_cnt number(6) default 0,
	reg_date date default sysdate
);
 
create table tb_comment (
	comment_no number(6) not null,
	no number,
--	no number constraint cmt_no_fk references tb_board(no),
	writer varchar2(30) not null,
	content varchar2(500) not null,
	reg_date date default sysdate,
	constraint cmt_comment_no_pk primary key(comment_no),
	constraint cmt_no_fk foreign key(no) references tb_board(no)
); 

parent         child
tb_board(no) - tb_comment(no)

-- 에러가 발생
drop table tb_board;

-- 테이블 삭제 처리
drop table tb_board cascade constraints purge;
drop table tb_comment purge;

-- 에러발생 : 부모(tb_board-no) 컬럼에 1이 없음..
insert into tb_comment(comment_no, no, writer, content)
values(1, 1, 'kim', '댓글 달기');

insert into tb_board(no, writer, title, content)
values(1, 'hong', 'foreign key', '연습');

insert into tb_comment(comment_no, no, writer, content)
values(1, 1, 'kim', '댓글 달기');

-- 부모 데이터 삭제하기
-- 1번 게시글을 참조하는 자식 데이터가 있는 경우에는 삭제가 불가능하다.
delete from tb_board
 where no = 1;

-- 자식 데이터를 삭제하고 부모 데이터를 삭제해야 한다.
delete from tb_comment 
 where no = 1;
 
delete from tb_board
 where no = 1;
 

-- 참조되는 부모테이블의 데이터를 삭제할 때 자식테이블의 데이터도 같이 삭제한다.
drop table tb_comment purge;
drop table tb_board purge;

create table tb_board (
	no number constraint board_no_pk primary key,
	title varchar2(200) constraint board_title_nn not null,
	writer varchar2(30) constraint board_writer_nn not null,
	content varchar2(4000),
	view_cnt number(6) default 0,
	reg_date date default sysdate
);
 
create table tb_comment (
	comment_no number(6) not null,
	no number,
	writer varchar2(30) not null,
	content varchar2(500) not null,
	reg_date date default sysdate,
	constraint cmt_comment_no_pk primary key(comment_no),
	constraint cmt_no_fk foreign key(no) references tb_board(no) on delete cascade
); 

insert into tb_board(no, writer, title, content)
values(1, 'hong', 'foreign key', '연습');

insert into tb_comment(comment_no, no, writer, content)
values(1, 1, 'kim', '댓글 달기');

select * from tb_board;

-- 게시글이 삭제되면서 참조하는 댓글 테이블도 같이 삭제
delete from tb_board
where no = 1;

select * from tb_comment;

commit;

/*
-- 각 게시물에 대해서 추천 할 수 있다.
-- 단, 한 사용자가 하나의 게시물에 대해서 한번만 추천이 가능합니다.
-- 화면에서 게시물의 총 추천수를 확인 가능하게 해야 합니다.
 */
create table tb_recom (
	id varchar2(30),
	no number(7),
	constraint recom_id_no_pk primary key(id, no)
);

id   no
a    1
a    2

---------------------------------
-- 서브쿼리를 이용한 테이블 생성
---------------------------------
-- 구조와 데이터 모두 복사
create table employees_copy
as
select * from employees;

drop table employees_copy purge;

-- 구조만 복사
create table employees_copy
as
select * from employees where 1 != 1;

-- 테이블의 이름을 변경하자
rename old to new;

rename employees_copy to tb_emp;

-- 테이블의 모든 데이터를 복구 불가능하게 삭제
truncate table 테이블명;

insert into tb_board(no, writer, title, content)
values(1, 'hong', 'foreign key', '연습');

insert into tb_comment(comment_no, no, writer, content)
values(1, 1, 'kim', '댓글 달기');

commit;

truncate table tb_comment;

select * from tb_comment;

insert into tb_comment(comment_no, no, writer, content)
values(1, 1, 'kim', '댓글 달기');

commit;

delete from tb_comment;

rollback;

-----------------------------------
테이블 변경하기
alter
-- 컬럼 추가, 컬럼 삭제
-- 컬럼 변경(타입, 크기, default, not null)
-----------------------------------
alter table 테이블명
add (email varchar2(20) not null, ..);

alter table 테이블명
drop (컬럼명);

alter table 테이블명
modify (컬럼 내용);

alter table 테이블명
rename column a to b;

alter table 테이블명
add constraint 제약조건명 제약조건(컬럼명);

alter table 테이블명
drop constraint 제약조건;

create table tb_alter (
	name varchar2(10),
	age varchar2(3)
);

-- 컬럼 추가
alter table tb_alter
add (email varchar2(20));

-- 제약조건 추가
alter table tb_alter
add constraint alter_email_un unique(email);

-- 컬럼 이름 변경 : name -> user_name
alter table tb_alter
rename column name to user_name;

-- 컬럼 타입 변경 : age varchar2 -> number
alter table tb_alter
modify (age number(3));

-- 제약조건 삭제하기
alter table tb_alter
drop constraint alter_email_un;

-- 컬럼 삭제하기
alter table tb_alter
drop (email);

drop table tb_alter purge;

---------------------------
-- 주석 설정하기
---------------------------
-- 테이블 주석 추가
comment on table 테이블명 is '설명';
-- 컬럼 주석 추가
comment on column 테이블명.컬럼명 is '설명';

comment on table tb_board is '자유게시판';

-- 테이블 주석 확인
select * from user_tab_comments;

comment on column tb_board.no is '번호';
comment on column tb_board.title is '제목';
comment on column tb_board.content is '내용';
comment on column tb_board.writer is '글쓴이';
comment on column tb_board.reg_date is '등록일';
comment on column tb_board.view_cnt is '조회수';

select * from user_col_comments where table_name = 'TB_BOARD';

-- 오라클 자체 관리 데이터 확인하기
select * from  dictionary;
select * from  dictionary where table_name like 'USER_%COM%';

--------------------------------------------
-- DML 문장 익히기
--------------------------------------------
-- insert
insert into 테이블명(컬럼명, ...) values(값1, ..);
insert into 테이블명 values(값1, ..);  // 테이블의 모든 컬럼에 값을 입력해야 한다.

insert into tb_board(
	no, 
	title, 
	writer, 
	content
) values (
	2, 
	'a', 
	'b', 
	'c'
);

insert into tb_board(
	no, 
	title, 
	writer, 
	content
) values (
	(select nvl(max(no), 0) + 1 from tb_board), 
	'a', 
	'b', 
	'c'
);

-- update
-- 전체 변경
update 테이블명
   set 컬럼명 = 변경할값,
       컬럼명 = 변경할값;
       
-- 일부 변경
update 테이블명
   set 컬럼명 = 변경할값,
       컬럼명 = 변경할값
 where 조건절
 
-- 3번 게시글의 글쓴이를 'LEE'로 변경하고 제목을 '수정된 제목'으로 변경 
update tb_board
   set writer = 'LEE',
       title = '수정된 제목'
 where no = 3;      

-- delete
delete from 테이블명;  -- 전체데이터 삭제

delete 
  from 테이블명
 where 조건.. 

-- 5번인 게시글을 삭제하라..
delete 
  from tb_board
 where no = 5;
 
 
 
 
 
 
 
 
 
 














