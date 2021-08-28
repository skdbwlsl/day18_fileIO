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
	
	//3-1단계. 생성자를 만든다.
	public FileClass() {
		//기본경로 만들기
		filePath = new File("C:/2021수업내용들/java/java-workspace/day18_fileIO/src/quiz02" );
	}
	
	//3-2단계. 사용자가 입력한 값 저장하게끔 만들고, main으로 넘어가서 파일클래스를 객체를 만든다.
	public void outFile(StudentClass sc){  //3-5단계. main에서 넘어와서 studentclass sc로 받아준다.
		
		
		//3-6단계. 그런다음에 해당하는 값 저장하기
		try {
			fos = new FileOutputStream(filePath + "/" + sc.getStNum() + ".txt"); //그냥 이것만 적으면 오류나기 때문에 try,catch로 묶어준다
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			oos.writeObject(sc);
			oos.close();
			System.out.println("저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		/*
		 finally {
		 
			if(oos != null) oos.close(); 닫아줄땐 역순으로 닫아준다
			*/
		}
	
	
	//3-8단계. 사용자가 넘겨준 학번을 이용해 비교한다.
	public boolean fileExists(	String stNum) {
		//오류가 나서 파일경로를 다시 만들어줘도 된다
		File fileCheck = new File(filePath +"/"+ stNum+ ".txt");  //File이라는 자료형으로 경로를 만들어야지만 특정 기능을 쓸 수 있다
		//System.out.println(filePath + stNum + ".txt");
		//System.out.println(fileCheck.exists());
		return fileCheck.exists(); //파일이 존재하면 true, 없으면 false
	}
	//3-10. case 2번 등록 기능 만들기(inFile만들기)
	public StudentClass inFile(String stNum) {
		if(fileExists(stNum)) { //fileExists를 불러와 stNum을 넘겨주고, if문을 통해
			try {//true일 경우
				fis = new FileInputStream(filePath+"/"+stNum+".txt"); //해당파일 불러오기
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);
				return (StudentClass)ois.readObject();
			} catch (Exception e) {//false일 경우
				e.printStackTrace();
			}
		}
	return null; //null값은 해당값이 없다는 것
}
}

