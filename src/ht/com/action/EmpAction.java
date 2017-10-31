package ht.com.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.jmx.remote.util.EnvHelp;

import ht.com.vo.EmpVo;
import ht.com.vo.NationVo;

public class EmpAction extends ActionSupport{
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1397759590445232364L;

	private EmpVo emp;
	
	private List<NationVo> nations;
	
	
	public List<NationVo> getNations() {
		return nations;
	}
	public void setNations(List<NationVo> nations) {
		this.nations = nations;
	}
	public String init() throws Exception{
		nations = new ArrayList<NationVo>();
		NationVo n1 = new NationVo(1,"汉族");
		NationVo n2 = new NationVo(2,"维吾尔族");
		nations.add(n1);
		nations.add(n2);
//		setEmp(new EmpVo());
		//所有的返回值都是struts.xml文件中配置的result
		return INPUT;
	}
	public String save() throws Exception{
		return null;
	}
	
	public String execute() throws Exception {
		return INPUT;
	}
	
	public EmpVo getEmp() {
		return emp;
	}
	public void setEmp(EmpVo emp) {
		this.emp = emp;
	}
}
