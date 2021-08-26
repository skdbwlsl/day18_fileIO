package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//파일 입출력
public class Ex01 {
	public static void main(String[] args) throws Exception { //예외전가
		File filePath = new File("C:/2021수업내용들/test/aaa.txt");//경로만들기
		FileOutputStream fos = new FileOutputStream(filePath,true);//stream이 통로로 자바에서 나갈수 있는(output) 연결통로로 filePath(해당경로)로 내보내기
		//input은 외부에서 자바로 들어오는것 input\
		//true는 해당기능에서 내용을 이어써라는 의미로 uptend?라고 한다
		
		//만들어진 파일(fos)에 글을 써라
		fos.write(100);
		fos.write('E');
		
		
		//String name = "test";
		String name = "반갑다";  //한글도 가능
		
		fos.write(name.getBytes()); //그냥 String을 쓰면 오류가 나기 때문에(바이트형태만 받기 때문에) .getBytes로 변환해서 실행한다
		
	}

}
