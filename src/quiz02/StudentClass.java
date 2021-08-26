package quiz02;

import java.io.Serializable;

public class StudentClass implements Serializable{ //이것을 쓰지않으면 main 실행시 학생등록할 때 저장돼지 않고 오류난다.
	//단계 1. 정보들을 입력한다. 
	
	private String stNum;
	private String name;
	
	
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

//정보들을 입력했다면 main으로 넘어가서 main을 작성한다.