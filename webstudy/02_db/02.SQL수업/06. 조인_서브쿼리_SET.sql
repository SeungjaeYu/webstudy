--------------------
JOIN 또는 SubQuery 활용해서 풀어주세요
--------------------

1. 선수들의 이름, 등번호, 연고지명, 팀명을 화면에 출력하시오
 
선수명	등번호	연고지명	팀명

고종수	22	수원	삼성블루윙즈
고창현	8	수원	삼성블루윙즈
김기범	28	수원	삼성블루윙즈
김동현	25	수원	삼성블루윙즈
.....
select p.player_name 선수명, p.back_no 등번호, t.region_name 연고지명, t.team_name 팀명
  from player_t p, team_t t
 where p.team_id = t.team_id;






2. K리그 선수중에서 포지션이 "GK"인 선수의 정보를 출력하시오. 단, 등번호 순으로 출력(42행)

선수명	백넘버	연고지명	팀명

이창민	1	전북	현대모터스
박종문	1	전남	드래곤즈
권정혁	1	울산	현대호랑이
최현	1	부천	SK
김병지	1	포항	스틸러스
.....


select p.player_name 선수명, p.back_no 등번호, t.region_name 연고지명, t.team_name 팀명
  from player_t p, team_t t
 where (p.team_id = t.team_id)
    and p.position = 'GK';







3. 각 팀의 연고지명, 팀명, 구장명, 좌석수를 화면에 출력하시오(10행)

연고지명	팀명	구장명	좌석수

부산	아이콘스	부산구장	30000
부천	SK	부천구장	35000
성남	일화천마	성남구장	27000
수원	삼성블루윙즈	수원월드컵구장	50000
.....
select t.region_name 연고지명, t.team_name 팀명, s.stadium_name 구장명, s.seat_count 좌석수
  from team_t t, stadium_t s
 where (t.stadium_id = s.stadium_id);
 







4. 각 구장의 정보와 구장을 전용으로 사용하는 팀의 정보도 출력합니다.(17행)
   구장을 전용으로 사용하는 팀이 존재하지 않는 경우도 같이 출력합니다..

연고지명	팀명	    구장명	        좌석수

		        서울 월드컵경기장	63930
부천	    SK	    부천구장	        35000
성남	    일화천마	성남구장	        27000
		        수원구장	
수원	삼성블루윙즈	수원월드컵구장	    50000



select t.region_name 연고지명, t.team_name 팀명, s.stadium_name 구장명, s.seat_count 좌석수
  from team_t t, stadium_t s
  where t.team_id(+) = s.hometeam_id; 




5. 선수의 이름, 포지션, 연고지명, 팀명, 구장명을 화면에 출력하시오
   단, 선수의 이름 순으로 출력합니다.
 
선수명	포지션	연고지명	팀명	구장명

가비	MF	수원	삼성블루윙즈	수원월드컵구장
가이모토	DF	성남	일화천마	성남구장
강대희	MF	수원	삼성블루윙즈	수원월드컵구장
강성일	GK	대전	시티즌	대전월드컵구장
강용	DF	포항	스틸러스	포항구장
강정훈	MF	대전	시티즌	대전월드컵구장

select p.player_name 선수명, 
       p.position 포지션, 
       t.region_name 연고지명, 
       t.team_name 팀명, 
       s.stadium_name 구장명
  from player_t p, team_t t, stadium_t s
 where p.team_id = t.team_id
   and t.stadium_id = s.stadium_id
 order by p.player_name;


6. 선수의 포지션이 "MF"인 선수들의 이름, 포지션, 연고지명, 팀명, 구장명을 화면에 출력하시오(159행)
   단, 선수의 팀명 순으로 출력합니다.

선수명	포지션	연고지명	팀명	구장명

안성훈	MF	안양	LG치타스	안양구장
히카르도	MF	안양	LG치타스	안양구장
김민성	MF	안양	LG치타스	안양구장
신재필	MF	안양	LG치타스	안양구장
신현국	MF	안양	LG치타스	안양구장
안드레	MF	안양	LG치타스	안양구장

select p.player_name 선수명, p.position 포지션, t.region_name 연고지명, t.team_name 팀명, s.stadium_name 구장명
  from player_t p, team_t t, stadium_t s
 where p.team_id = t.team_id
   and t.stadium_id = s.stadium_id
   and p.position = 'MF' 
 order by t.team_name;









--------------------
SET 연산자를 활용해서 풀어주세요
--------------------
1. "K02" 팀과 "K07"팀에 소속된 선수들의 정보를 출력하시오(100행)
 
팀코드	선수명	포지션	백넘버	키

K02	고종수	MF	22	176
K02	고창현	MF	8	170
K02	김기범	MF	28	173
.....
K07	이회택	TM		
K07	서현옥	TC		
K07	김상호	TC		
K07	김영광	GK	41	185
K07	박종문	GK	1	185
.....
 select team_id 팀코드, player_name 선수명, position 포지션, back_no 백넘버, height 키
   from player_t
  where team_id = 'K02' 
  union all
 select team_id 팀코드, player_name 선수명, position 포지션, back_no 백넘버, height 키
   from player_t
  where team_id = 'K07' 
 
 

2. 포지션별 선수들의 정보와 팀별 팀의 정보를 다음과 같이 출력하시오
   출력 시 포지션으로 정렬합니다.(18행)
   구분코드 : 포지션(P), 팀(T)

구분코드	포지션	평균키

P	DF	180.677165354331
P	FW	180.041666666667
P	GK	186.547619047619
T	K01	180.088888888889
T	K02	179.066666666667
.....

select 'P' as 구분코드, position 포지션, avg(height) 평균키
 from player_t
 group by position
 union
 select 'T', team_id, avg(height)
 from player_t
 group by team_id;
 
 
 
 


