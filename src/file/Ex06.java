package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex06 {

	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/2021수업내용들/test/aaa.txt");
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Test05 t = (Test05)ois.readObject(); //object타입으로 가져오기 땜누에 형변환해야한다
		t.print();
	}

}
