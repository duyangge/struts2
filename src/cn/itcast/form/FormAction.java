package cn.itcast.form;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class FormAction implements Action {
	@Override
	public String execute() throws Exception {
		//第一步获取ActionContext对象
		ActionContext context=ActionContext.getContext();
		//第二步调用方法得到表单数据
		//key是表单的name属性值，value是输入的值
		Map<String,Object> map=context.getParameters();
		Set<String> keys=map.keySet();
		for (String key : keys) {
			//根据key得到value
			//数组形式：因为输入项里面可能有复选框情况
			Object[] obj=(Object[]) map.get(key);
			System.out.println(Arrays.toString(obj));
		}
		return NONE;
	}

}
