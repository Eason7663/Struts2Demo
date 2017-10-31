package ht.com.vo;

import java.io.Serializable;

public class EmpVo implements Serializable{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -3237191506837268426L;
	
	private int empid;
	private String empname;
	private String cardno;
	private String sex;
	private String nation;
	
	public String getEmpname() {
		return empname;
	}
	public String getCardno() {
		return cardno;
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
