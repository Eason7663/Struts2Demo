package ht.com.action;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @ClassName: LoginAction 
* @Description: 创建action 
* @author Eason
* @date 2017年10月29日 下午6:46:54 
*  
*/
public class LoginAction extends ActionSupport{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = -2357883969530806361L;

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}
	//当客户端有该action请求时，进入自动执行
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("username="+this.username);
		System.out.println("password="+this.password);
		return LOGIN;
	}
	//验证函数
//	@Override
//	public void validate() {
//		System.out.println("validate");
//	}
//	public String login() throws Exception{
//		return INPUT;
//	}

	
}
