문제 공통 사항
모든 결과를 컬럼의 Alias 까지 동일하게 나오도록 쿼리문을 작성합니다.

1. 아래와 같은 결과가 출력되도록 SQL 문을 작성하시오(전체행)
   조건 > concat 함수만을 사용합니다.

선수정보

고종수 선수의 포지션은 MF이고 키는 176입니다.
고창현 선수의 포지션은 MF이고 키는 170입니다.
김기범 선수의 포지션은 MF이고 키는 173입니다.
김동현 선수의 포지션은 MF이고 키는 175입니다.

select concat(concat( concat(player_name, '선수의 포지션은 '), concat( position, '이고 키는 ')), concat(to_char(height), '입니다'))
  from player_t;


2. 10월이 생일인 선수들의 정보를 아래와 같이 출력하는 쿼리를 작성하시오(35행)
   생일이 빠른 선수부터 출력합니다.

팀명	선수명	포지션	생일

드래곤즈	이회택	TM	1946-10-11
드래곤즈	서현옥	TC	1949-10-27
LG치타스	이영진	TC	1963-10-27
드래곤즈	김상호	TC	1964-10-05

select t.team_name as 팀명,
       p.player_name as 선수명,
       p.position as 포지션,
       to_char(p.birth, 'yyyy-mm-dd') as 생일
  from player_t p, team_t t
  where p.team_id = t.team_id
    and to_char(p.birth, 'mm') = 10
   order by  to_char(p.birth, 'yyyy-mm-dd');





3. 각 선수들의 포지션을 아래와 같이 보일 수 있도록 쿼리를 작성하시오(전체행)
   TM - 감독
   TC - 코치
   TD - 닥터
   MF - 미드필더
   FW - 포워드  
   DF - 디펜더
   GK - 골키퍼
   나머지는 없음
  
   
선수명	포지션

가비	미드필더
가이모토	디펜더
강대희	미드필더
강성일	골키퍼

select player_name as 선수명 ,      
       case when position = 'TM' then '감독'
            when position = 'TC' then '닥터'
            when position = 'MF' then '미드필더'
            when position = 'FW' then '포워드'
            when position = 'DF' then '디펜더'
            when position = 'GK' then '골키퍼'
            else '나머지없음'
       end as 포지션
  from player_t
  order by player_name;










4. K리그 선수들의 포지션별 평균키를 소수점 아래 두 자리에서 반올림하여 출력되도록 쿼리를 작성하시오(7행)
   단, 포지션이 널인 경우는 제외합니다.

포지션	평균키

TD	176.50
GK	186.55
DF	180.68
FW	180.04
TM	175.00
TC	178.83
MF	176.41


select position as 포지션,
        to_char(to_char(round(avg(height),2)), '000.00') as 평균키
  from player_t
 group by position
 having position is not null;






