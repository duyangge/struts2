package cn.itcast.form;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class FormAction2 implements Action {
	@Override
	public String execute() throws Exception {
		//第一中方式，使用ServletActionContext类实现
		//1.使用servletActionContext类获取request
		//2.电泳request中相应的方法
		HttpServletRequest request=ServletActionContext.getRequest();
		System.out.println(request.getParameter("username")+
		"\n"+request.getParameter("password")+"\n"+request.getParameter("address"));
		return NONE;
	}

}
