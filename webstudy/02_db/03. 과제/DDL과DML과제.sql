create table groupcode(
  gcode char(1) constraint group_gco_pk primary key,
  gname varchar2(20) constraint group_gna_nn not null

)




create table product(
      code char(3) constraint pro_code_pk primary key,
      pname varchar2(20) constraint pro_pna_nn not null,
      cost number,
      pnum number,
      jnum number,
      sale number,
      gcode char(1) constraint pro_gco_fk references groupcode(gcode)

);


insert into product(
   code,
   pname,
   cost,
   pnum,
   jnum,
   sale,
   gcode

) value (
  

);

