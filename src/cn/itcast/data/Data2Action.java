package cn.itcast.data;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.itcast.entity.User;

import com.opensymphony.xwork2.ActionSupport;
/*
 * 使用属性封装提交表单数据
 */
public class Data2Action extends ActionSupport{
	private String username;
	private String password;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "DataAction [username=" + username + ", password=" + password
				+ ", address=" + address + "]";
	}
	public String execute() throws Exception {
		System.out.println(username+"\n"+password+"\n"+address);
		return NONE;
	}


}
