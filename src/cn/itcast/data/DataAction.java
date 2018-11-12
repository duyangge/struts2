package cn.itcast.data;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.itcast.entity.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/*
 * 使用模型驱动模型获取表单数据
 */
public class DataAction extends ActionSupport implements ModelDriven<User>{
//创建对象
	//前提要求：实体类中的属性名与表单项中的name值一样
	private User user=new User();
	@Override
	public User getModel() {
		return user;
	}
	public String execute() throws Exception {
		System.out.println(user);
		return NONE;
	}

}
