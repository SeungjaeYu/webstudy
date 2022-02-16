DCL = 사용자 추가, 권한 부여, 회수 

-- 사용자 추가
commane

create user 사용자명 identified by 패스워드;

create user peach214 identified by peach214;

--접속하기 
 sql에서 새로계정만들기 
 접속이름 local_peach214
 name peach214
 password peach214
 
 --오류,,,접속 권한이 없어서
 
 -- 기본으로 접속할 수 있는 권한을 부여하기
 grant create session to 사용자명;
 grant create session to peach214;
 
 --다시 계정만들어서 접속
 
 -- 새 테이블을 만들어준다
 -- 오류.. 권한이 없어서 
 
 -- system 관리자 접속 후 테이블 생성 권한 부여
 grant create table to peach214;

 --다시 peach에서 테이블 생성 시도..
 -- 오류.. 시스템에 테이블공간을 이용할 권한이 없다..
 -- 해결
 --다시 관리자 system으로 가서 권한을 주자
 grant unlimited tablespace to peach214;
 
--peach214에서 다시 테이블 만들기. 성공

 --oracle에서 권한을 한번에 묶은 객체가 있다. role..
 
 --만들어준 사용자 peach214를 삭제해준다
 drop user peach214 cascade;
 
 --현재 system 계정에서 작업.
 --롤 생성하기 
 create role 롤의이름;
 create role user_basic;
 
 --롤에 권한 부여하기
 grant create session, create table, unlimited tablespace, create view, create sequence to 유저명;
 grant create session, create table, unlimited tablespace, create view, create sequence to user_basic;
 
 
 -- 유저만들기 
create user peach214 identified by peach214;

--권한부여하기
grant user_basic to peach214;
 
-- unlimited tablespace권한이 안들어갔다.. 다시 주자 




--다시 삭제...
 접속창에서 삭제하고.. 관리자 게시판에서 삭제
drop user peach214 cascade;


--기본권한을 묵어서 제공하는 롤을 활용(connect , resourch)
-- dba to 사용자명. 모든 권한 부여
create user peach214 identified by peach214;



grant connect, resource, dba to peach214;



--권한 회수. revoke
revoke 권한명 from 사용자명
revoke connect, resourch, dba from preach214;

--시스템계정에서 사용자 삭제하기
drop user 사용자명 cascade;

 
 

