package ht.com.vo;

import java.io.Serializable;

public class NationVo implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 12072445398052487L;
	private int nationid;
	private String nationName;
	
	public NationVo() {
 
	}
	public NationVo(int nationid,String nationName) {
		this.nationid = nationid;
		this.nationName = nationName;
	}
	public int getNationid() {
		return nationid;
	}

	public String getNationName() {
		return nationName;
	}

	public void setNationid(int nationid) {
		this.nationid = nationid;
	}

	public void setNationName(String nationName) {
		this.nationName = nationName;
	}


	

}
