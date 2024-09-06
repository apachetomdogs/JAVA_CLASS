package ch03ch04;

public class Ex07_for {
	public static void main(String[] args) {
		// 1~5의 총합을 출력하시오
		// 1+2+3+4+5
		//타입 sum = 초기값; // 총합을 저장하기 위한 변수
		int sum = 0;
		for(int i=1;i<=5;i++) {
			System.out.println("i="+i);
			sum += i;
		}
		System.out.println("총합="+sum);
	}
}
