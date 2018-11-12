package cn.itcast.data;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.itcast.entity.User;

import com.opensymphony.xwork2.ActionSupport;
/*
 * 使用属性封装提交表单数据
 */
public class MapAction extends ActionSupport{
	//声明实体类变量
	
	private Map<String,User> map;
	//实体类变量的set和get方法
	public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}
	
	public String execute() throws Exception {
		System.out.println(map);
		return NONE;
	}


}
