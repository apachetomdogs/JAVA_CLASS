package ch01;

/* 기본타입(primitive type) : 값저장
 논리형 : boolean(1) : true, false
 문자    : char(2)
 숫자
  -정수: byte(1)<short(2)<int(기본.4)<long(8)
  -실수: float(4)<double(기본.8)
 */
public class Ex02_p83 {

	public static void main(String[] args) {
		//타입 변수명[=초기값];
		byte n = -128;
		//byte타입 값의 허용범위는 -128~127까지
		System.out.println(n); //-128
		n = 127;
		System.out.println(n);//127
		//n = 128; //에러발생. byte허용범위를 벗어났다
		//Type mismatch: cannot convert from int to byte
		//타입 미스매치: 정수의 기본타입int에서 byte로 형변환을 할 수 없기 때문이다.
		
		n = (byte) 128;  //강제형변환: 큰타입->작은타입. 값의 손실이 발생할 수 있다
		
		double n1 = 3.14;
		System.out.println(n1);  //3.14
		
		int n4 = (int)n1;//n1의 변수값을 정수기본형타입의 변수에 저장하시오
		System.out.println(n4);  //3
		
		long n2 = 3;
		System.out.println( n2);//3

		int n3 = (int)n2;
		//(int)n2 ==> long -> int
		//int n3 = int타입;
		System.out.println( n3);//3
		
		//##################################
		//자동타입변환(p95) :자동으로 타입변환이 일어나는 것을 의미
		//작은->큰타입
		/* 숫자
		  -정수: byte(1)<short(2)<int(기본.4)<long(8)
		  -실수: float(4)<double(기본.8)*/
		byte n5 = 100;
		System.out.println("n5변수의 값:"+n5);
		int n6 = n5;  
		System.out.println("n6:"+n6);
		long n7 = n5;
		System.out.println("n7="+n7);
		
		//정수타입변수 n5의 값을 실수타입변수에 저장 후 출력하시오
		float n8 = n5;
		System.out.println("n8="+n8);//100.0
		
		double n9 = n5;
		System.out.println("n9="+n9);//100.0
	}

}






