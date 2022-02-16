/**
create table tb_member (
    id varchar2(20) primary key,
    pass varchar2(20) not null,
    name varchar2(30) not null
);
insert into tb_member(id, pass, name) values('admin', '1111', '관리자');
insert into tb_member(id, pass, name) values('kim', '1111', '김연아');
commit;
 */
package kr.co.mlec.repository.vo;

public class Member {
	private String id;
	private String pass;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}






