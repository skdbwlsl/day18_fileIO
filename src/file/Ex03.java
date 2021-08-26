package file;

import java.io.BufferedOutputStream;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/2021수업내용들/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		//보조스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos); //기본스트림 fos를 이용해서 보조스트림(bufferedouputstream)을 만들겠다
		//자기만의 저장소에 따로 저장된다.파일로 들어가면 안보이는 이유가 이것이다. 다른 곳에 저장하고 있는중이라서
		
		
		for(char i = '1'; i< '9';i++) {
			//Thread.sleep(1000);
			//fos.write(i);
			bos.write(i);//보조스트림을 쓰면 이렇게 써야한다.
			
		}
		bos.close();//접속을 끊고 데이터를 전송하고 
		//bos.flush(); //bos에 저장돼 있는 값을 비워줘라. 우리가 보는 파일로 내요이 들어오게된다
		bos.write('a'); //다시쓰거
		bos.flush(); //다시 비우기. 얘는 접속은 끊지 않은데 데이터를 전송한다
		
		

	}

}
