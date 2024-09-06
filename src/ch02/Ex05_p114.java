package ch02;

import java.io.IOException;

//키보드에서 입력된 내용을 변수에 저장하기
public class Ex05_p114 {

	public static void main(String[] args) throws IOException {

		System.out.println("글자를 입력 및 엔터/종료시 q 또는 Q를 입력");
		
		int keyCode;  //유저가 입력한 (키보드)값을 저장하기위한 변수
		
		//조건을 충족하는=>참true  동안 반복문은 실행된다
        //따라서 무한루프에 빠지지않도록 주의해야한다.
		//조건을 만족시키지않으면된다=>false
		while(true) {
			keyCode = System.in.read();
			System.out.println(keyCode);
			if(keyCode == 113 || keyCode == 81) {  //소문자q를 입력했다면 또는 대문자Q를 입력했다면
				System.out.println("113 또는 81 이군요!");
				break;//반복문종료
			}//if끝
			//System.out.println("if문밖");
		}//while

		System.out.println("while문 밖.종료");

	}
}
