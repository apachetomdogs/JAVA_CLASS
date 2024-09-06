package ch03ch04;
//do while(p177)
	/*
	 * do while(p177): 조건을 만족하지 않아도 최소 1번은 반드시 실행된다!!!
	 * 
	 * do{
	 * 	반복실행코드
	 * } while(조건);
	 * 
	 * 
	 */
public class Ex10_dowhile {
	public static void main(String[] args) {
	int i = 100;
	
	do {
		System.out.println("do while문="+i);
	}while(i<10);
	
	
	while(i<10) {
		System.out.println("조건을 만족하는구나!"+i);
	}
	System.out.println("~~~");
		
	}
}
