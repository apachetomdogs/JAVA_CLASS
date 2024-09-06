package ch05Array;

//배열(Array)-p200
/*배열
 - 같은 타입의 데이터를 연속된 공간에 나열하고, 
   각 데이터에 index를 부여해놓은 자료구조
 
 *배열특징
 -같은 타입=>배열의 단점
 -연속된 공간=> index. 0부터 1씩 증가
 -배열의 크기는 고정
 
 *배열선언
 타입[] 변수명;     또는        타입 변수명[]
 
 *생성
 타입[] 변수명={ 값1,값2,..,값n};  => 배열크기가 값의 개수만큼.
 타입[] 변수명= new 타입[크기];=> 타입에 따라 자동초기화
 
*/
public class Ex01_p202 {

	public static void main(String[] args) {
		int[] score = {10,100,1000, 'A', 34, 4, 45, 455574,5466}; 
		// 배열명.length 
		int scoreLen = score.length;
		System.out.println("배열명.length"+scoreLen);
		
		// 배열의 길이
		System.out.println(scoreLen);
		
		// 참조변수
		System.out.println(score);
		
		// 인덱스 번호를 이용하여 값 가져오기 문법 > 배열명[인덱스]
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[scoreLen-1]);
		
		// 인덱스 번호를 이용하여 값 설정하기 문법 > 배열명[인덱스]
		score[0] = 20;
		score[1] = 200;
		score[2] = 2000;
		
		//for 문을 사용하여 값 가져오기
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		
		for(int i = 0; i<scoreLen; i++) {
			System.out.println("인덱스"+i+"의 값"+score[i]);
		}
		
		
		char result = Integer.toString(score[0]).charAt(1);  
		String answer = String.valueOf(result);
		System.out.println(result+" "+answer);
	}

}
