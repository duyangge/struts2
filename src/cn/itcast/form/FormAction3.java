package cn.itcast.form;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/*使用接口注入方法
 * 
 */
public class FormAction3 extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
	public String execute() throws Exception {
		System.out.println(request.getParameter("username")+
				"\n"+request.getParameter("password")+"\n"+request.getParameter("address"));
		return NONE;
	}

}
