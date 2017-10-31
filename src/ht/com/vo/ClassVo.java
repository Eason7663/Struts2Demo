package ht.com.vo;

import java.io.Serializable;

public class ClassVo implements Serializable{
	private int classid;
	private String classname;
	
	public ClassVo() {
 
	}
	public ClassVo(int classid, String classname) {
		this();
		 this.classid = classid;
		 this.classname = classname;
	}
	
	public int getClassid() {
		return classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
}
