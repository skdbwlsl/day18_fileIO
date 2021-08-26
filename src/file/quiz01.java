package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class quiz01 {
	File filePath = new File("C:/2021수업내용들/abcd1234/test.txt");
	FileOutputStream fos = new FileOutputStream(filePath);
	BufferedOutputStream bos = new BufferedOutputStream(fos); 
	
	ObjectOutputStream oos = new ObjectOutputStream(bos);
	

}
