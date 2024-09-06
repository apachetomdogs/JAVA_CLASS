package ch02;

//char타입(p85)
/*하나의 문자를 작은따옴표('')로 감싼 것을 문자 리터럴이라고 한다
 * 문자 리터럴은  유니코드로 변환되어 저장된다. 
 * 유니코드는 세계 각국의 문자를 2byte로 표현할 수 있는 숫자(0~65535)로
 * 매핑한  국제표준규약.
 * 'A'    'a'   '1'  '가'  '호'
 */
public class Ex00_p85 {

	public static void main(String[] args) {
		char c1 = 'A' ; 
		System.out.println("c1에 저장된 'A'="+c1); //A
		int n1 = c1;
		System.out.println("n1에 저장된 'A'="+n1); //65
		c1 = (char)n1;
		System.out.println("변수(char)n1="+c1); //65->A
		
		char c2 = 'a' ; 
		System.out.println("c2에 저장된 'a'="+c2);//a
		int n2 = c2;
		System.out.println("n2에 저장된 'a'="+n2); //97
		
		System.out.println("-------------------------------------------------");
		char c3 = '1' ; 
		System.out.println("c3에 저장된 '1'="+c3);//1
		char c4 = '가'; 
		System.out.println("c4에 저장된 '가'="+c4);//가
		System.out.println("(int)'가'="+(int)c4);     //44032
		
		
		
	}

}


