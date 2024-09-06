package ch02;

// 변수 사용 범위 - 지역변수, 전역변수
/*지역변수(local variable) - ()  
    - 중괄호{} block내에서 선언되고 사용
    - ()내에서 선언되고 중괄호{} block내에서 사용
    
    참고>전역변수(global variable)
 */
public class Ex0_p76 {

	//static int a; //전역변수 a를 선언. 변수타입에 따라 자동초기화
	//여기에서는 int이므로 정수타입은 0으로 초기화된다
	
	public static void main(String[] args) {
		
		/*int a;//지역변수는 반드시 초기화해야한다
		//The local variable a may not have been initialized*/
		
		int a = 100;  //a라는 이름의 지역변수를 선언 및 100초기값 할당
		System.out.println("a="+a);
		
		a = 10; //변수a에 10을 저장
		
		if(a==10) {
			System.out.println("a는 10과 동일하다");
			a = 100; 
			System.out.println("if문 안의 a="+a);	//100?	
		
			double  b = 3.14; //변수 b는 지역변수로서 if{}블럭 내부에서만 인식된다.
			System.out.println("if문 안의 b="+b);	//3.14
		}
		//if{}외부에서는   지역변수b를 사용할 수  없다
		//b cannot be resolved to a variable
		//b= 99.9;//에러발생
		//System.out.println("if문 밖의 b="+b);	//에러발생
		
		a = 11; //변수a에 11을 저장
		System.out.println("if문 밖 a="+a);
	}//main method끝

}



