package net04.xml;

public class Family {
	private String father;
	private String mother;
	private String me;
	
	public Family() { }
	public Family(String father, String mother, String me) {
		this.father = father;
		this.mother = mother;
		this.me = me;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getMe() {
		return me;
	}
	public void setMe(String me) {
		this.me = me;
	}
	@Override
	public String toString() {
		return "Family [father=" + father + ", mother=" + mother + ", me=" + me + "]";
	}
	
}
