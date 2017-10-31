package ht.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport{
	/*
	 * 页面可以动态的访问action中个各种函数，但是必须在struts.xml中配置参数
	 * <!-- 可以动态的访问函数 -->
	 * <constant name="struts.enable.DynamicMethodInvocation" value="true"/>
	 * 所有需要页面访问的函数都需要有String返回值，并且为public函数
	 * 1. 连接地址中使用action!方法名.action
	 * 2. 在struts.xml文件中配置action时，指定方法名称
	 * 	<action name="methodAction1" class="ht.com.action.MethodAction" method="add">
	 *	<result name="input" type="redirectAction">studAction.action</result>
	 * </action>
	 * 3.通过通配符配置action(性能差)
	 */
	
	private String action;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("页面调用了execute函数");
		System.out.println("action=" + action);
		return null;
	}
	
	public String add() throws Exception{
		System.out.println("页面调用了add函数");
		System.out.println("action=" + action);
		return INPUT;
	}
	
	public String del() throws Exception{
		System.out.println("页面调用了del函数");
		System.out.println("action=" + action);
		return null;
	}
	public String update() throws Exception{
		System.out.println("页面调用了update函数");
		System.out.println("action=" + action);
		return INPUT;
	}
	public String list() throws Exception{
		System.out.println("页面调用了list函数");
		System.out.println("action=" + action);
		return "list";
	}
	public String save() throws Exception{
		System.out.println("页面调用了save函数");
		System.out.println("action=" + action);
		return "save";
	}
}
