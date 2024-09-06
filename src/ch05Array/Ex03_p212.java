package ch05Array;

public class Ex03_p212 {
	

	
	public static void main(String[] args) {
		// ########################################
	// 100, 100, 100 정수 3개의 값을 저장하는 배열 arr1을 생성한 후 값을 출력!
		
		int[] arr1 = {100, 100, 100};
		int sum1 = 0;
		for(int i=0; i<arr1.length;i++) {
			System.out.printf("%d번째 배열 : %5d\n",i+1, arr1[i]);
			
			sum1 += arr1[i];
			
		}
		System.out.println();
		System.out.println("총합 : " + sum1+"\n\n");
		
		// ########################################
		// 1번째 학생 3과목 점수 100, 100, 100을 저장하는 배열 arr1을 생성한 후 값을 출력!
		// 2번째 학생 3과목 점수 90, 90, 90을 저장하는 배열 arr1을 생성한 후 값을 출력!
		// 3번째 학생 3과목 점수 80, 80, 80을 저장하는 배열 arr1을 생성한 후 값을 출력!
		// 4번째 학생 3과목 점수 70, 70, 70을 저장하는 배열 arr1을 생성한 후 값을 출력!
		
		// 다차원 배열(p212)
		int[][] arr2 = {
					 {100, 100, 100},
					 {90, 90, 90, 1234,1324,1324},
					 {80, 80, 80},
					 {70, 70, 70}
					 };
					 
		System.out.println("arr2 = "+arr2);
		System.out.println("arr2.length = "+arr2.length+"명");
		int sum2 = 0;
		for(int i=0; i<arr2.length;i++) {// 행수만큼 => 현재는 4줄
//			System.out.println(arr2[i]); // 주소값 210번지부터 240번지까지 출력
			for(int k=0;k<arr2[i].length;k++) {//k=0 1 2 칸수만큼 => 현재는 3칸(arr2[i].length)
				System.out.print("\t"+arr2[i][k]);
			}
			System.out.println();
		}
		
		
		
		System.out.println("arr2[0].length="+arr2[0].length); // 1행의 주소
		System.out.println("arr2[1].length="+arr2[1].length);
		System.out.println("arr2[2].length="+arr2[2].length);
		System.out.println("arr2[3].length="+arr2[3].length);
		System.out.println();

	}
}
