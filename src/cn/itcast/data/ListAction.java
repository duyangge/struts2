package cn.itcast.data;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import cn.itcast.entity.User;
import com.opensymphony.xwork2.ActionSupport;
/*
 * 使用属性封装提交表单数据
 */
public class ListAction extends ActionSupport{
	//声明实体类变量
	private List<User> list;
	//实体类变量的set和get方法
	public List<User> getlist() {
		return list;
	}
	public void setlist(List<User> list) {
		this.list = list;
	}
	public String execute() throws Exception {
		System.out.println(list);
		return NONE;
	}


}
