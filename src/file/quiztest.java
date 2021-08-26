package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class quiztest {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/2021수업내용들/abcd1234/test.txt");
		FileOutputStream fos = new FileOutputStream(filePath,true);
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		//String name = "test";
		String name = "홍길동";  //한글도 가능
		
		fos.write(name.getBytes());
		Scanner input = new Scanner(System.in);
		name = input.next();
		String age = input.next();
		String addr = input.next();
		name += "\n";
		fos.write(name.getBytes());
		fos.write(age.getBytes());
		fos.write(addr.getBytes());
		
	}

}
