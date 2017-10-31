package ht.com.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import ht.com.vo.ClassVo;
import ht.com.vo.NationVo;
import ht.com.vo.StudentVo;

public class StudentAction1 extends ActionSupport implements ModelDriven<StudentVo>{
	//把页面的值读取到student javaBean中
	//在action中定义的成员变量，如果生成了setter和getter方法，那么在页面与action之间可以随便传值
	private StudentVo stud = new StudentVo();
	private List<NationVo> nationList;
	private List<ClassVo> classList;
	

	public StudentAction1() {
		
	}
//	public StudentVo getStud() {
//		return stud;
//	}
//	public void setStud(StudentVo stud) {
//		this.stud = stud;
//	}
	public List<NationVo> getNationList() {
		return nationList;
	}
	public List<ClassVo> getClassList() {
		return classList;
	}
	public void setNationList(List<NationVo> nationList) {
		this.nationList = nationList;
	}
	public void setClassList(List<ClassVo> classList) {
		this.classList = classList;
	}
	@Override
	public String execute() throws Exception {
		init();
		if (stud!=null) {
			System.out.println("studname="+stud.getStudname());
		}

		return INPUT;
	}
	
	public void init() {
		nationList =  new ArrayList<NationVo>();
		NationVo n1 =  new NationVo(1,"汉族");
		NationVo n2 =  new NationVo(2,"壮族");
		NationVo n3 =  new NationVo(3,"蒙古族");
		nationList.add(n1);
		nationList.add(n2);
		nationList.add(n3);
		
		classList = new ArrayList<ClassVo>();
		ClassVo c1 = new ClassVo(1,"1班");
		ClassVo c2 = new ClassVo(2,"2班");
		ClassVo c3 = new ClassVo(4,"3班");
		classList.add(c1);
		classList.add(c2);
		classList.add(c3);	
	}
	@Override
	public StudentVo getModel() {

		return this.stud;
	}

}
