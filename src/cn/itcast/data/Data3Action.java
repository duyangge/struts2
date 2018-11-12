package cn.itcast.data;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.itcast.entity.User;

import com.opensymphony.xwork2.ActionSupport;
/*
 * 使用属性封装提交表单数据
 */
public class Data3Action extends ActionSupport{
	//声明实体类变量
	private User user;
	//实体类变量的set和get方法
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception {
		System.out.println(user);
		return NONE;
	}


}
