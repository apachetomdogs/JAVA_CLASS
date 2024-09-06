package ch03ch04;

// while(조건) {
// 반복실행코드
// }

// 대입연산자(p) = += -+ *= /=
// 연산자의 순위에서 가장 마지막에!!!!
// a = 1;
// a += 5; // 1+5 a= 6

// 증감연산자
// 1씩 증가:++
// 1씩 감소:--



public class Ex06_for {
	public static void main(String[] args) {
		// 1~5 출력
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		// 1~5 출력
		int i=1;
		for(;;) {
			System.out.println(i);
			i += 1;
			if(i == 6) {
				break;
			}
		}
		System.out.println("------------------");
		
		// 5~1 출력
		for(int m=5;m>=1;m--) {
			System.out.println(m);
		}
		
		System.out.println("------------------");
		
		// 5~1 출력
		int m = 5;
		for(;;) {
			System.out.println(m);
			m -= 1;
			if(m == 0) {
				break;
			}
		}
		
		System.out.println("------------------");
		
		// 5 3 1 출력
		for(int n=5;n>=1;n-=2) {
			System.out.println(n);
		}
		System.out.println("------------------");
		
		// 5 3 1 출력
		int n = 5;
		for(;;) {
			System.out.println(n);
			n -= 2;
			if(n < 1) {
				break;
			}
		}
		System.out.println("------------------");
		
		
		// 구구단 출력
		for(int dan=2;dan<=9;dan++) {
			for(int j=1;j<=9;j++) {
				System.out.println(dan+"x"+j+"="+dan*j);
			}
			System.out.println("--------------------");
		}
		
		
		// 별찍기
		// *
		// **
		// ***
		// ****
		for(int k=1;k<=4;k++) {
			for(int h=1;h<=k;h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

		
		
		
	}
}
