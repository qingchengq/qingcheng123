package cn.itcast.http;

public class zhangxiaona {
	String name;
	String age;
	private String sex;
	public zhangxiaona(String name, String age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public zhangxiaona() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	void show(){
		System.out.println("我是" + name + "今年" + age + "岁,望大家多多关照");
	}
	void play(){
		System.out.println("好好玩");
	}
	public static void main(String[] args) {
		zhangxiaona zxn = new zhangxiaona();
		zxn.setName("张笑娜");
		zxn.setAge("13");
		zxn.setSex("女");
		zxn.show();
	}
}
