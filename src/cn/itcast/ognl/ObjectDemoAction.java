package cn.itcast.ognl;

import cn.itcast.entity.User;

import com.opensymphony.xwork2.ActionSupport;

public class ObjectDemoAction extends ActionSupport{
	//定义对象变量
	//生成get方法
	//向值栈对象的user中放置数据
	private User user=new User();
	public User getUser(){
		return user;
	}
	@Override
	public String execute() throws Exception{
		user.setUsername("黄先生");
		user.setPassword("pxxy");
		user.setAddress("2380110794@qq.com");
		return SUCCESS;
	}
}
