package cn.itcast.http;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test0 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
		Student s1 = new Student("001", "张笑娜", "女", "13");
		bw.write(s1.getId()+","+s1.getName()+","+s1.getSex()+","+s1.getAge());
		bw.newLine();
		Student s2 = new Student("002","李居秀","女","13");
		bw.write(s2.getId()+","+s2.getName()+","+s2.getSex()+","+s2.getAge());
		bw.close();
		BufferedReader br = new BufferedReader(new FileReader("name.txt"));
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		br.close();
	}
}
