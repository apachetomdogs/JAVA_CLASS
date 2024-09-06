package ch03ch04;
//while(p175)
	/*
	 * while(조건){
	 * 조건을 만족하는 동안
	 * 반복실행코드
	 * }
	 */
public class Ex09_while {

	public static void main(String[] args) {
		//1~5까지의 합을 출력하시오.
		int j = 1;
		int sum = 0;
			while(j <= 5) {
				System.out.println(j);
				sum+=j;
				j++;
			}
		System.out.println("총합은 "+sum+"입니다.");
		
		
		// 1~5까지 출력
		System.out.println("\n---1~5출력------------");
		int i = 1;
			while(i <= 5) {
				System.out.println(i);
				i++;
			}
		System.out.println("while밖");

	}

}







