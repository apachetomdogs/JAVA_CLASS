package ch05Array;

import java.sql.Date; // 동일 패키지일 때는 import 안해줘도 됨!!!!!

import ch03ch04.Ex01_if;

//배열(Array)-p204
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
public class Ex02_p204 {

	public static void main(String[] args) {
		// new 연산자로 배열 생성(p204)
		// 타입에 따라 자동 초기화  
		// 정수(byte, short, int, long) 
		// 실수 (float, double) -> 0.0
		// 논리형(true, false) -> false
		// 문자(char) 		-> 공백
		// 클래스(String, Date 등) -> null */
		// 타입[] 변수명 = new 타입[크기];
		// 클래스(String Date 등) -> null
		Ex01_if[] arr = new Ex01_if[3];
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
		
		
		Date[] dateArr = new Date[3]; // import 해줘야 함. 
		for(int i=0;i<dateArr.length;i++) {
			System.out.println(i+"번째 인덱스 = "+ dateArr[i]+"\t");
		}
		System.out.println(); // 줄바꿈
		
		String[] stringArr = new String[3];
		for(int i=0;i<stringArr.length;i++) {
			System.out.println(i+"번째 인덱스 = " + stringArr[i]+"\t");
		}
		System.out.println(); // 줄바꿈
		
		
		byte[] byteArr = new byte[3];
		System.out.println(byteArr);// 배열값 출력
		int byteArrLen = byteArr.length; // length: 속성(필드)
		for(int i=0;i<byteArrLen;i++) {
			System.out.print(i+"번째 인덱스 = "+byteArr[i]+"\t");
		}
		
		double doubleArr[] = {10.0, 1234.1, 2315.2, 4323.3, 429139.4};
		System.out.println(doubleArr);
		double sum = 0.0;
		for(int j=0;j<doubleArr.length;j++) {
			System.out.println(j+"번째 인덱스는 = "+doubleArr[j]+"\t");
			sum += doubleArr[j];
		}
		System.out.println("총합은 = "+sum);
		
		// 논리형(true, false)의 배열은 ??으로 초기화
		boolean[] booleanArr = new boolean[3];
		for(int k=0;k<booleanArr.length;k++) {
			System.out.println(booleanArr[k]+"\t");
		}
		System.out.println();
			
		//문자(char)의 배열은 ??으로 초기화
		
		char charArr[] = new char[3];
		for(int m =0 ; m < charArr.length; m++) {
			System.out.println(m + "번째 인덱스 = \'"+ charArr[m]+"\'");
		}
		
	}

}
