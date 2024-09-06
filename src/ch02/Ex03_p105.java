package ch02;

//문자열을 기본 타입으로 강제 타입 변환(p105)
public class Ex03_p105 {

	public static void main(String[] args) {
		String str1 = "100";
		System.out.println(str1+1);//1001
		// +는 문자열 연결연산자 이다
		// "100"+"1"
		//"1001"
		
		//String -> int :  Integer.parseInt(문자열값)
		int i1 = Integer.parseInt(str1);
		System.out.println( i1+1 );  //101
		
		//강제형변환 : 큰타입->작타입으로 강제 형변환   문법>(강제형)변수명
		//short = int : int      ->short      (short)변수명
		short n1 = (short)Integer.parseInt(str1);
		System.out.println( n1+1 );  //101
		
		float n2 = Float.parseFloat(str1);
		System.out.println( n2+1 );  //101.0		
	}

}





