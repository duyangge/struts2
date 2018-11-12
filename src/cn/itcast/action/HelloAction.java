package cn.itcast.action;

public class HelloAction {
		/*1.每次访问servlet时，都会执行service方法
		 * 
		 * 2.每次访问action，默认执行名称execute方法
		 * 
		 * 
		 * */
	public String execute(){
		return "Hello";
	}
	public String add(){
		return "add";
	}
	public String update(){
		return "update";
	}
}
