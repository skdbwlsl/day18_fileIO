package file;

import java.io.File;
import java.io.FileInputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception{
		File filePath = new File("C:/2021수업내용들/test/aaa.txt");
		FileInputStream fis = new FileInputStream(filePath);
		while(true) {
			int res = fis.read(); //read는 내용을 하나씩 가져오는것
		if(res<0) { //res는 파일의 끝
			System.out.println("res : " + res); //-1이 출력돼는데 이것은 원래 파일 마지막엔 -1이 있는데 파일의 내용이 더이상 없다는 의미
			break;
		}
		System.out.println((char)res);

		}
	}
}


