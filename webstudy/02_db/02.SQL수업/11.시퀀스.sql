-- 시퀀스(sequence) 객체
 : 자동으로 고유한 숫자값을 생성
  주록 기본 키 값을 생성하기 위해 사용된다.
  
  
--시퀀스 생성 : 이름주는 방법      공용객체 seq_common_개별이름
--                       특정테이블 seq__테이블명_컬럼명
create sequence 이름
옵션
;

create sequence 이름
옵션
;

옵션 : 
increment by 증가할 값 -> 시퀀스 값이 얼마씩 증가해야할지 default 1
start with 값         -> 맨 처음 시작할 번호 지정 default 1
maxvalue 값           -> 최대 얼마까지 가게 할 것인가 default 9,999,999,9.....
minvalue 값           -> 최소
nocache y/n          -> y 캐시를 사용하겠다. n 캐시를 사용하지않겠다.
                        시퀀스를 켰는데 7번까지 썻다..20개를 미리 갖고와서.. 내일 번호를 달라그러면 21 번을 준다. 붕붕 뜬다???
nocycle y/n          -> 재활용하겠냐? yes,,, no,,,,

create sequence seq_board_no;



--번호 가져오기 
시퀀스명.nextval;   // 약간 번호표 개념.. 1->2->3->... 
select seq_board_no.nextval
  from dual;
  
insert into tb_board(no, title, writer, content) 
values (seq_board_no.nextval, '토지', '박경리', 'aaa');

--사용자가 생성한 시퀀스 확인
select * from user_sequences;























