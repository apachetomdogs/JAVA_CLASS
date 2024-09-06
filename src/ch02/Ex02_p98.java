package ch02;

//정수 연산에서의 자동 타입 변환p98 
//1+1  10-0  * / %

/* 기본타입(primitive type) : 값저장
논리형 : boolean(1) : true, false
문자    : char(2)
숫자
 -정수: byte(1)<short(2)<int(기본.4)<long(8)
 -실수: float(4)<double(기본.8)
 
 p95
 정수<실수
 byte(1)<short(2)<int(기본.4)<long(8)<float(4)<double(기본.8)
*/
public class Ex02_p98 {

	public static void main(String[] args) {
		char c1 = 'A';  //65
		int i1 = 10;  //
		//c1 + i1   
		//char+int  
		//int    +int
		//65+10 //75
		System.out.println("c1 + i1의 결과="+(c1 + i1));//75
		/*(c1 + i1)    65+10    75   <=     +가  더하기연산자
		 * "c1 + i1의 결과="+75   <=     +가 문자열 연결연산자
		 * "c1 + i1의 결과="+"75"
		 * "c1 + i1의 결과=75"
		 * */
		
		System.out.println("c1 + i1의 결과="+c1 + i1);//A10
		//+는 문자열 연결연산자
		/* "c1 + i1의 결과="+"A"
		 * "c1 + i1의 결과=A"
		 * "c1 + i1의 결과=A" + "10"
		 * "c1 + i1의 결과=A10"
		 */
		
		//#########################		
		byte   n6 = 10;
		short n7 = 9;
		// byte타입을 int로 변환 -> int n6
		// short타입을 int로 변환> int n7
		//n6*n7 -> int*int
		//byte result3 = n6*n7;//cannot convert from int to byte
		//short result3 = n6*n7;//cannot convert from int to short
		//int result3 = n6*n7;
		long result3 = n6*n7;
		System.out.println("byte*short의 결과="+result3); //?
		//#########################
		
		long n4 = 40;
		long n5 = 50;
		//long result2 = 0;
		//long result2 = n4 + n5;  //long+long 
		//float result2 = n4 + n5;  //long+long      //long->float타입으로     자동형변환
		//double result2 = n4 + n5;  //long+long //long->double타입으로 자동형변환
		int result2 = 0;
		//result2 = (int)n4 + (int)n5;  //int+int
		result2 = (int) (n4 +n5);  //long+long // (int) long
		System.out.println("long + long의 결과="+result2); //90
	  
		//#########################
		int n1;
		n1 = 10;
		int n2 =  2;
		int n3 = 3;
		int result;  //변수선언문법>  타입 변수명;
		result = n1/n2;
		System.out.println(result); //몫 5
		
		result = n1%n2;//0
		System.out.println(result); //나머지 0
		
		result = n1%3;
		System.out.println(result); //나머지 1 
		
		
	}

}
