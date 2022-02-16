문제 공통 사항
모든 결과를 컬럼의 Alias 까지 동일하게 나오도록 쿼리문을 작성합니다.

1. 각 선수의 이름, 키, 몸무게, 키 + 몸무게의 합을 다음과 같이 출력하시오

선수명	키	몸무게	키와 몸무게의 합

고종수	176	70	246
고창현	170	64	234
......
김준	170	65	235

select player_name as 선수명, height as 키, weight as 몸무게, height+weight as "키와 몸무게"
  from PLAYER_T

  order by 선수명;


2. 각 선수의 표준 체중을 구해서 화면에 출력하시오((표준체중 : (키 - 100) * 0.9)

선수명	표준체중

고종수	68.4
고창현	63
김기범	65.7
.....

select player_name as 선수명, (height-100)*0.9 as 표준체중
  from PLAYER_T;


3. 선수의 이름을 아래와 같이 출력하시오

선수이름

고종수 선수
고창현 선수
.....

select player_name  || ' 선수' as 선수이름
  
  from PLAYER_T;

4. 아래와 같이 선수의 정보를 출력하시오

선수정보

고종수:MF:176cm:70kg
고창현:MF:170cm:64kg
김기범:MF:173cm:65kg
김동현:MF:175cm:72kg


 
select player_name || ':' || position || ':' || height ||'cm'|| ':'|| weight||'kg' as 선수정보 
  from PLAYER_T;


5. K02 팀에 소속된 선수들의 정보를 아래와 같이 출력하시오

선수이름	포지션	백넘버	 키

고종수	    MF	    22	    176
고창현	    MF	    8	    170
.....


select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where team_id = 'K02';

6. 선수들 중에 키가 입력되지 않은 선수들의 정보를 출력하시오(33행)

선수이름	포지션	백넘버	키

김귀화	TC		
김상수	TC		
......
김학범			
김형주	DF	42	

select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where HEIGHT is null;
  


7. 선수의 키가 등록된 선수들의 정보를 아래와 같이 출력하시오(434행)

선수이름	포지션	백넘버	키

고종수	MF	22	176
고창현	MF	8	170
김기범	MF	28	173
김동현	MF	25	175
김두현	MF	4	175
.....

select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where 키 is not null
  order by 키 desc;



8. K02 또는 K07팀에 소속된 선수의 정보를 아래와 같이 출력하시오(100행)

선수이름	포지션	백넘버	키

고종수	MF	22	176
고창현	MF	8	170
김기범	MF	28	173
김동현	MF	25	175


select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where team_id = 'K02'
     or team_id = 'K07';


9. 포지션이 MF인 선수의 정보를 아래와 같이 출력하시오(159행)

선수이름	포지션	백넘버	키

고종수	MF	22	176
고창현	MF	8	170
김기범	MF	28	173
김동현	MF	25	175
김두현	MF	4	175

select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where position = 'MF';
    



10. "고"씨인 선수들의 정보를 출력하시오(5행)

선수이름	포지션	백넘버	키

고종수	MF	22	176
고창현	MF	8	170
고병운	DF	16	180
고관영	MF	32	180
고민기	FW	24	178

select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where player_name like '고%';



11. K04팀의 선수중에서 170이상인 선수들의 정보를 출력하시오(45행)

선수이름	포지션	백넘버	키

고종수	MF	22	176
고창현	MF	8	170
김기범	MF	28	173
김동현	MF	25	175
김두현	MF	4	175
.....


select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where team_id = 'K04' and height >= 170;



12. 선수의 포지션이 "T" 로 시작되는 선수들의 정보를 출력하시오(39행)

선수이름	포지션	백넘버	키

최윤겸	TM		178
하재훈	TC		174
이충호	TC		185
임기한	TC		177
이경태	TD		

select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where position like 'T%';


13. 키가 170부터 180 사이인 선수의 정보를 출력하시오(249행)

선수이름	포지션	백넘버	키

고종수	MF	22	176
고창현	MF	8	170
김기범	MF	28	173
김동현	MF	25	175

select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
 where HEIGHT >= 170
   and HEIGHT <= 180;



14. K02 또는 K07팀에 소속된 선수중에서 포지션이 "MF"인 선수의 정보를 출력하시오(40행)

선수이름	포지션	백넘버	키

고종수	MF	22	176
고창현	MF	8	170
김기범	MF	28	173
김동현	MF	25	175

select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where (team_id = 'K02' 
    or team_id = 'K07')
    and position = 'MF';



15. K02 또는 K07팀에 소속된 선수중에서 포지션이 "MF"이고 키가 170에서 180 사이인 선수의 정보를 출력(33행)

선수이름	포지션	백넘버	키

고종수	MF	22	176
고창현	MF	8	170
김기범	MF	28	173
김동현	MF	25	175
select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where (team_id = 'K02' 
    or team_id = 'K07')
    and position = 'MF'
    and HEIGHT >= 170
    and HEIGHT <= 180;




16.  "K02" 팀의 선수 중에서 포지션이 "MF"가 아니면서 키가 175미만이거나 186이상인 선수의 정보를 출력(8행)

선수이름	포지션	백넘버	키

서정원	FW	14	173
손대호	DF	17	186
이선우	FW	33	174
최성용	DF	20	173
미트로	FW	19	192
.....
select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where team_id = 'K02' 
    and position != 'MF'
    and (HEIGHT < 175
    or HEIGHT >= 186);


17. 포지션별 평균키를 출력하시오(8)

포지션	평균키
	
TD	176.5
GK	186.547619047619
DF	180.677165354331
FW	180.041666666667


select position as 포지션, avg(height) as 평균키
  from PLAYER_T
 group by position;


18. 포지션별 최대키를 출력하시오(8)

포지션	최대키
	
TD	180
GK	196
DF	190
FW	194

select position as 포지션, max(height) as 최대키
  from PLAYER_T
 group by position;



19. 포지션별 평균키를 출력하시오. 단, 평균키가 180이상인 포지션만 출력(3)

포지션	평균키

GK	186.547619047619
DF	180.677165354331
FW	180.041666666667

select position as 포지션, avg(height) as 평균키
  from PLAYER_T

 group by position
 having avg(height) >= 180;



20. 선수의 정보를 출력하시오. 단, 등번호 순서로 오름차순

선수명	포지션	백넘버

최현	GK	1
이승준	GK	1
정유석	GK	1
김병지	GK	1
박종문	GK	1
이창민	GK	1

select player_name as 선수이름, position as 포지션, back_no as 백넘버
from PLAYER_T
order by back_no;




21. 선수의 정보를 출력하시오. 단, 포지션으로 내림차순

선수명	포지션	백넘버

김학범		
차상광		
안익수		
김호	TM	
김호곤	TM	

select player_name as 선수이름, position as 포지션, back_no as 백넘버
from PLAYER_T
order by position desc;


22.  "K02"팀의 선수 중에서 포지션이 "MF"이고 키가 175부터 185 사이인 선수의 정보를 출력하시오. 
     출력은 키가 큰 선수부터 나오고 키가 같은 경우 등번호 순으로 출력합니다(13행)

선수이름	포지션	백넘버	키

이반코비	MF	47	185
하태근	MF	29	182
조재민	MF	35	180
이여성	MF	36	179
오규찬	MF	24	178
가비	MF	10	177
조현두	MF	12	176
고종수	MF	22	176
.....

select player_name as 선수이름, POSITION as 포지션, BACK_NO as 백넘버, HEIGHT as 키
  from PLAYER_T
  where team_id = 'K02' 
   and (position = 'MF')
   and height between 175 and 185
 order by height desc, back_no; 
   




23. 선수의 포지션별 평균키를 정보를 출력하시오. 단, 평균키가 180인 포지션만 출력하고 포지션의 평균키로 내림차순하시오(3행)

포지션	평균키

GK	186.547619047619
DF	180.677165354331
FW	180.041666666667

select position as 포지션, avg(height) as 평균키
  from PLAYER_T
 group by position
having avg(height) >= 180
 order by avg(height) desc;


24. 각팀의 포지션별 평균키를 출력하시오. 출력 순서는 팀코드로 오름차순(62)

팀코드	포지션	평균키

K01	DF	181.692307692308
K01	FW	177.083333333333
K01	GK	188.8
K01	MF	178.2
K02	DF	181.307692307692
...
select team_id as 팀코드, position as 포지션, avg(height) as 평균키
  from PLAYER_T
 group by team_id, position
 order by team_id;
