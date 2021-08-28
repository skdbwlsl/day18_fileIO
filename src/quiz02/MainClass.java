package quiz02;

import java.util.Scanner;

public class MainClass {
	//단계 2. 메인 부분을 작성한다.
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		
		//3-3단계. 파일클래스에서 잠깐 넘어와서 객체를 만든다.
		FileClass fc = new FileClass();
		
		//2-1단계
		while(true) {
			System.out.println("1.등록 2.확인  3.종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
			case 1 :
				StudentClass sc = new StudentClass();
				while(true) {
				System.out.println("학번 입력 :  ");
				sc.setStNum(input.next());
				
				
				//3-7단계.
				if(fc.fileExists(sc.getStNum())){ //만약 파일이 존재한다면..
					System.out.println("존재하는 학번");
					continue;  //존재하지 않으면 continue로 다시 올리기
				}
				
				System.out.println("이름 입력 : ");
				sc.setName(input.next());
				//2-1.간단하게 case1의 학번,이름을 입력한 후에 지금까지 입력한 것을 저장해주기 위해서 FileClass로 넘어간다.
			
				//3-4단계. 3-3단계인 파일클래스 객체를 만들고나서 outfile을 호출한다.
				fc.outFile(sc); //sc에 모든값이 저장돼있기 때문에 sc를 넘겨준다. 그런다음에  다시 fileclass로 넘어간다.즉, 저장
				break;
			
			}break;
			
			//3-9단계. case1번 후 case2만들기
			case 2 :
				System.out.println("찾을 학번 입력 :  ");
				StudentClass sc01 = fc.inFile(input.next()); //찾고자하는 학번을 inFile로 넘겨주면 결과값을 객체를 만들어서 받아줘야한다
				//3-11단계. 
				if(sc01==null) {
					System.out.println("해당 학번은 없다");
				}else {
					System.out.println(sc01.getName());
					System.out.println(sc01.getStNum());
				}
				break;
				
	}

		}
	}

}
	

