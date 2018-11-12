package cn.itcast.ognl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class UserOgnlAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		//1.获取ActionContext类的对象
		ActionContext context=ActionContext.getContext();
		//2.调用其中的方法得到值栈对象；
		ValueStack stack1=context.getValueStack();
		//比较一个action是否仅有一个值栈对象
		ValueStack stack2=context.getValueStack();
		
		System.out.print(stack1==stack2);
		return NONE;
	}
}
