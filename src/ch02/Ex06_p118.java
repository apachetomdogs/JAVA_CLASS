package ch02;

import java.util.Scanner;

//키보드에서 입력된 내용을 문자열로 얻기
public class Ex06_p118 {

	public static void main(String[] args) {
		System.out.println("이름을 입력하세요. ");
		System.out.println("종료는 q 또는 Q입력.");

		//Scanner클래스의 객체를 생성하여  참조sc에 주소를 저장
		Scanner sc = new Scanner(System.in);
		//System.out.println(sc);

		//참조sc를 이용하여 Scanner클래스의  nextLine() method를 호출
		//문자열을 읽어 String타입의 변수inputData에 저장
		while(true) {
			String inputData = sc.nextLine();
			System.out.println("입력한 이름:"+inputData);
			if(   inputData.equals("q")   ||     inputData.equals("Q")    ) {  //입력된 문자열이 소문자q와 일치하면
				break;//반복문종료
			}//if
		}//while
		
		System.out.println("프로그램을 종료합니다.");
	}

}
