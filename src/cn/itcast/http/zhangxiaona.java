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
		System.out.println("����" + name + "����" + age + "��,����Ҷ�����");
	}
	void play(){
		System.out.println("�ú���");
	}
	public static void main(String[] args) {
		zhangxiaona zxn = new zhangxiaona();
		zxn.setName("��Ц��");
		zxn.setAge("13");
		zxn.setSex("Ů");
		zxn.show();
	}
}
