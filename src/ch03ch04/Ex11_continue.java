package ch03ch04;

// continue(p.180): 계속하다, 지속하다 <----> 멈추다. 중지하다. break
public class Ex11_continue {
	public static void main(String[] args) {
		System.out.println("--아래는 continue 결과----");
		// 1 2 3 4 5 없어짐 6 7 8 9 10 ? ? ? ? ? ? ? ??
		for(int i = 1; i <= 10 ; i++){
			
			if(i == 5) {
				continue;
			}//if
			System.out.println("i="+i);
		}//for
		
		System.out.println("--아래는 break 결과----");
		// 1 2 3 4에서 멈춤
		for(int i = 1; i <= 10 ; i++){
			
			if(i == 5) {
				break;
			}//if
			System.out.println("i="+i);
		}//for
		
	}//main
}//class
