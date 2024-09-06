package ch03ch04;

// 증감연산자(p.134)
/* -> 증가연산자(++): 피연산자의 값을 1 증가시킨다.
 * -> 감소연산자(--): 피연산자의 값을 1 감소시킨다.
 * 
 * 전위형 j = ++i; ++i; j = i; 값이 참조되기 전에 증가시킨다.
 * 후위형 j = i++; j=i; i++; 값이 참조된 후에 증가시킨다.*/
 
public class Ex00_p134 {
	public static void main(String[] args) {
		int x = 10;
		int y = 50;
		int z;
		System.out.println("초기값x="+x); //10
		System.out.println("초기값y="+y); //50
		
		y--;
		System.out.println("1번째 y="+y); //49
		--y;
		System.out.println("2번째 y="+y); //48
		
		x++;
		System.out.println("1번째 x="+x); //11
		++x;
		System.out.println("2번째 x="+x); //12
		
//		z=x;
//		System.out.println("1번째 z="+z); // 12
		z=++x;
		System.out.println("1번째 z="+z); // 13
		System.out.println("3번째 x="+x); // 13
		
		//z=x++;
		//System.out.println("2번째 z="+z); // 13
		//z = y++;
		//System.out.println("3번째 z="+z); // 48

		z = x++ + y++;
		// x++ 13
		// y++ 48
		// x++ 결과 y++ 결과를 더하시오 61
		// z= 더한결과 61
		System.out.println("4번째 z="+z); // x++은 13, y++은 48, z는 61
		System.out.println("마지막 x="+x); //14
		System.out.println("마지막 y="+y); //49
		
		
	}
}
