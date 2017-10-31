package ht.com.vo;

import java.io.Serializable;

public class StudentVo implements Serializable{
	private String studid;
	private String studname;
	private int age;
	private String sex;
	private int cardno;
	private int nation;
	private int classid;
	
	
	
	public String getStudid() {
		return studid;
	}
	public String getStudname() {
		return studname;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public int getCardno() {
		return cardno;
	}
	public int getNation() {
		return nation;
	}
	public int getClassid() {
		return classid;
	}
	public void setStudid(String studid) {
		this.studid = studid;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public void setNation(int nation) {
		this.nation = nation;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
}
