
public class Ch10 {
	public static void main(String[] args) {
		// 중첩 while문
		// 예제 01)
		// 구구단 2단 출력
		
//		System.out.println(2 + " X " + 1 + " = " + 2 * 1);
//		System.out.println(2 + " X " + 2 + " = " + 2 * 2);
//		System.out.println(2 + " X " + 3 + " = " + 2 * 3);
//		System.out.println(2 + " X " + 4 + " = " + 2 * 4);
//		System.out.println(2 + " X " + 5 + " = " + 2 * 5);
		

		
		
		int dan = 2;
		while (dan <= 9) {
			System.out.println("---------------- " + dan + "단 ------------------");
			int i = 1;
			while(i <= 9) {
				System.out.println(dan + " x " + i + " = " + dan * i);
				i++;
			}
			System.out.println("-------------------------------------------------------");
			System.out.println();
			dan++;
		}
		
		
		
		
	
		
	}

}


