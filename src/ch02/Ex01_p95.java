package ch02;

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

//자동형변환 : 작은타입->큰타입으로 자동으로 형변환
//강제형변환 : 큰타입->작타입으로 강제 형변환   문법>(강제형)변수명
public class Ex01_p95 {

	public static void main(String[] args) {
		//리터럴형변환 : L(또는 l), F(또는 f), D(또는 d)
		int n3 = 500;  //4byte
		long n7 = 500L; //리터럴형변환
		float n4 = (float)3.14; //강제형변환
		float n5 = 3.14F;       //리터럴형변환
		double n6 = 3.14D; //리터럴형변환
		
		//#########################################
		int 	a1 = n3;                     //4byte
		long a2 = (long)n6;    //long은  8byte
		System.out.println("a1="+a1); //123
		System.out.println("(long)3.14의 결과="+a2);  //3
		
		//#########################################
//		정수타입의 변수n1에 대하여 초기값100선언
		long n1 = 110;
		System.out.println("n1="+n1);
		
//		실수타입의 변수n2선언  문법>타입 변수명;
		double n2;
//		3.14초기값을 할당           문법> 변수명=값;
		n2 = 3.14;
		System.out.println("n2="+n2);
		n2 = n1;  //long타입의 변수n1의 값이  double타입의 변수n2에 저장
		System.out.println("n2="+n2);
	}

}




