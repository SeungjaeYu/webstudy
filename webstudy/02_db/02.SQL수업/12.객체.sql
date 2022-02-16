 객체 :
- 테이블,
- 시퀀스

- 뷰(view) : - 하나 또는 그 이상의 테이블로부터 논리적으로 데이터를 추출한 부분 집합
            - 가상의 테이블
            - 실질적으로 쿼리 문장을 가진다
            - 뷰는 alter 명령어가 제공되지 않는다 
            - 뷰는 생성 또는 변경할 때 or replace 를 활용한다
            - 복잡한 쿼리를 간단하게 실행할 수 있다.
  <뷰(view) 생성>
  create [or replace] view 이름  //[or replace]-> 들어가면 기존에 있는 것을 수정을 하겠다. 생략하면 수정X 없으면 생성
  AS
  Subquery;
  
  <뷰(view) 삭제>
  drop view 이름;
  
  
  --예제
  create or replace view enp100_view
  as
  select e.employment_id, e.first_name, e.last_name, e.salary, d.department_name
    from employees e
   inner join departments d
     on e.department_id = d.department_id
  where e.department_id = 100
  order by e.salary desc;
  
  --oracle에서 제공하는 생성된 view확인
  user_views
  
  -- 제한
   삭제, 추가는 X
   
   
  -- 뷰 삭제
  drop view enp100_views; 
  
  
  
  ----------------------------------------------------
  <인덱스(index) 객체>
  - 데이터를 빠르게 검색하기 위한 객체
  - B트리 검색방식으로 디스크 입출력 횟수를 줄인다.
    B트리 :  
  - 어떤 행에 대한 엑서스 획수도 동일하게 처리하는 이진 탐색 구조
  - 데이터가 정렬된 상태로 관리된다
  - 논리적 물리적으로 독립적인 공간을 갖고있다
  
  
 -- 인덱스를 사용자가 별도로 만들지 않아도 자동으로 만들어지는 인덱스
  primary key, unique키로 설정된 컬럼들은 unique index 자동 생성
    
  --row id..실제 순서..? 주소값이라생각..?
  
 단점 : 독립적인 공간을 관리해서 많은 인덱스를 만들게 되면 등록, 삭제, 수정 작업이 발생하면
      시스템에 부하가 생길 수 있다. 다시 재작업 해줘야해서 
      
 인덱스는 언제 만들어야 하나..?
 - 컬럼의 비율이 8% 미만인 경우...
 
 
 <인덱스(index) 생성>
 create index 인덱스명
 on 테이블명(컬럼[, , ,..]);
 
 => 여러개가 되면 결합컬럼, 복합컬럼
 
 create index temp_player
 on player_t(position);
  
  
 -- index를 확인해보자
 select * from user_indexes; 
  
 --index의 생성된 컬럼을 보자
 select * 
   from user_ind_columns; 
  
 -- index 삭제
 drop index 인덱스이름명;
 drop index temp_player;
  
  
  
  
  
  
  
  
  