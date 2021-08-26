package quiz02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileClass {
	//단계3.
	
	private FileInputStream fis;
	private BufferedInputStream bis;
	private ObjectInputStream ois;
	
	private FileOutputStream fos;
	private BufferedOutputStream bos;
	private ObjectOutputStream oos;
	private File filePath;
	
	//생성자를 만든다.
	public FileClass() {
		//기본경로 만들기
		filePath = new File("C:/2021수업내용들/java/java-workspace/day18_fileIO/src/quiz02" );
	}
	
	//사용자가 입력한 값 저장하게끔 만들기
	public void outFile(StudentClass sc){  //main에서 넘어와서 studentclass sc로 받아준다.
		//파일클래스를 main으로 넘어가서 객체를 만들어준다.
		
		//그런다음에 해당하는 값 저장하기
		try {
			fos = new FileOutputStream(filePath+sc.getStNum()+".txt"); //그냥 이것만 적으면 오류나기 때문에 try,catch로 묶어준다
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(sc);
		
			System.out.println("저장 완료");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		
	}
}
