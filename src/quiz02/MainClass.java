package quiz02;

import java.util.Scanner;

public class MainClass {
	//단계 2. 메인 부분을 작성한다.
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		//파일클래스에서 잠깐 넘어와서 객체를 만든다.
		FileClass fc = new FileClass();
		
		while(true) {
			System.out.println("1.학생검색 2.등록  3.종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
			case 1 :
				StudentClass sc = new StudentClass();
				System.out.println("학번 입력 :  ");
				sc.setStNum(input.next());
				System.out.println("이름 입력 : ");
				sc.setName(input.next());
				
				//파일클래스 객체를 만들고나서 outfile을 호출한다.
				fc.outFile(sc); //sc에 모든값이 저장돼있기 때문에 sc를 넘겨준다. 그런다음에  다시 fileclass로 넘어간다.
				break;
			//간단하게 case1을 입력한 후에 지금까지 입력한 것을 저장해주기 위해서 FileClass로 넘어간다.
			
			
				
	}

}
	}
}
