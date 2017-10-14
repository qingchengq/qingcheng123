package cn.itcast.http;

public class lijuxiu extends zhangxiaona{
	String sex;
	void play(){
		System.out.println("你是猪？？");
	}
	//extends是伸展的意思	在java中作为关键字是类的继承 
	public static void main(String[] args) {
		lijuxiu ljx = new lijuxiu();
		ljx.name = "李居秀";
		ljx.age = "13";
		ljx.sex = "女";
		ljx.show();
		ljx.play();
	}
}
