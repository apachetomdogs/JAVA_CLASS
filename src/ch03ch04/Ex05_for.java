package ch03ch04;

public class Ex05_for {

	public static void main(String[] args) {

	//1 2 3 ... 10	
	//for(타입변수=초기값;조건식;증감식) {
	for(int i=1;i<=10;i++) { 
		// 반복실행코드, 여기서 조건식을 누락시키면 무한루프가 됨
		System.out.println(i);
	}
	
	System.out.println("-------------------");
	
	int i = 1;
	for(;;) {
		System.out.println(i); // 1 2 3 ... 10
		i=i+1; // 2 i = 3, i= 4, ... , i = 11
		if(i==11) {
		break; // 반복문 종료
		}
	}
	
	System.out.println("-------------------");
	
	int k = 1;
	while(k <= 10) {
		System.out.println(k);
		k++;
	}
	
	System.out.println("-------------------");
	// 1~10까지 정수출력
	// 1부터 1씩 증가하여 10까지 출력하시오
	int h = 1;
	while(h < 11) {
		System.out.println(h);
		h = h+1;
		if(h==11) {
			break; // 반복문 종료
		}
	}
	
	System.out.println("-------------------");
	
	for(int j=1;j<11;j=j+1) {
		//반복실행코드
		System.out.println(j);
	}

	}
	
	}
