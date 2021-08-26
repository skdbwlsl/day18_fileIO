package file;

import java.io.Serializable;

public class Test05 implements Serializable{//이게 알아서 직렬화를 시켜준다 implements seral이거쓰면
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}
	public void print() {
		System.out.println("name : " +name);
	}
	

}
