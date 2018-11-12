package cn.itcast.ognl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackAction extends ActionSupport{
/*	//定义变量
	private String username;
	//生成变量的get方法
	public  String getUsername(){
		return username;
	}*/
	@Override
	public String execute() throws Exception {
		//在执行方法中向变量设置值
		//username="huangxinsheng";
		//第一中方式使用值栈对象中的set方法实现
		ActionContext context=ActionContext.getContext();
		//创建值栈对象
		ValueStack stack=context.getValueStack();
		//调用set方法
		stack.set("username", "huangxinsheng");
		//调用push
		stack.push("abcd");
		return "valuestack";
	}
}
