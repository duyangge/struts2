package cn.itcast.ognl;

import java.util.ArrayList;
import java.util.List;

import cn.itcast.entity.User;

import com.opensymphony.xwork2.ActionSupport;

public class ListDemoAction extends ActionSupport {
	private List<User> list=new ArrayList<User>();
	public  List<User> getList(){
		return list;
	}
	
	@Override
	public String execute() throws Exception {
		User u1=new User();
		u1.setUsername("黄行");
		u1.setPassword("hxs");
		u1.setAddress("75421");
		
		User u2=new User();
		u2.setUsername("黄信胜");
		u2.setPassword("hxs01");
		u2.setAddress("75524521");
		
		list.add(u1);
		list.add(u2);
		
		// TODO Auto-generated method stub
		return super.execute();
	}
}
