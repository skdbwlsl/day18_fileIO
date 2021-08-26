package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/2021수업내용들/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Scanner input = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = input.next();
		
		
		Test05 t= new Test05();
		t.setName(name);
		
		oos.writeObject(t);
		oos.close();
		
//객체 형태로 저장해서 한다 그 이유는 파일에 객체 자체를 저장할 수 없기 때문에 byte로 변환해 저장을 할 수 밖에 없다
	}

}
