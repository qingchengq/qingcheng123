package cn.itcast.http;

public class lijuxiu extends zhangxiaona{
	String sex;
	void play(){
		System.out.println("��������");
	}
	//extends����չ����˼	��java����Ϊ�ؼ�������ļ̳� 
	public static void main(String[] args) {
		lijuxiu ljx = new lijuxiu();
		ljx.name = "�����";
		ljx.age = "13";
		ljx.sex = "Ů";
		ljx.show();
		ljx.play();
	}
}
