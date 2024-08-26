import java.util.Scanner;

public class Ch09 {
	public static void main(String[] args) {
		// 00 반복문
		// 반복적인 실행이 필요할 때 반복문을 사용함
		
		
		// 01 while문의 구조
		// 조건식이 참인 경우 반복적으로 코드를 실행한다.
		
		// while (조건) {
		//    반복 실행 코드;			// 예) 조건이 참이면 코드 실행
									//    조건이 거짓이면 반복문 종료
		// }
		
//		
//		System.out.println("------------------------- while문 예제 01 ------------------------------");
//		// 탈출용 변수
//		int i = 1;
//		
//		// 탈출용 조건식
//		while(i <= 10) {
//			System.out.println("Hello World");
//			i++;		// 탈출을 위한 연산식
//		}
//		
		System.out.println("------------------------ while문 예제 02 --------------------------------");
//		// 1부터 10까지의 합 구하기
//		int i = 1;
//		int sum = 0;
//		while(i <= 10) {
//			System.out.println("i = " + i);
//			sum += i;			// sum = sum + i;
//			i++;				// 후치연산
//		}
//		
//		
//		
//		System.out.println("while 종료 후 i의 값 = " + i);
//		System.out.println("1부터 10까지의 합 = " + sum);


        System.out.println("--------------- while문 예제 03 ---------------");
//      1부터 N(입력한 수)까지의 합 구하기    
//      출력예)
//      1부터 10까지의 합 : 55
        
        
//        int i = 1;      // 탈출용 변수
//        int sum = 0;    // 누적용 변수
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("정수 입력: ");
//        int num = scanner.nextInt();
//
//        while (i <= num) {
//            System.out.println("i의 값: " + i);
//            sum += i;
//            i++;
//        }
//
//        System.out.println("1부터 " + num + "까지의 합: " + sum);
        
		
        System.out.println("--------------- while - if문 문제 01 ---------------");
        //입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자를 입력해 주세요: ");
//        int num = sc.nextInt(); // num = 7
//        
//        int i = 1;
//        int sum = 0;
//        
//        while(i <= num) {
//        	if(i % 3 == 0) {
//        		sum += i;
//        	}
//        	i++;
//        }
//        System.out.printf("1부터 %d까지의 3의 배수의 합은 %d입니다.", num, sum);
        
        
      //문제 
        System.out.println("——————— while - if문 문제 02 ———————");
        //-1을 입력하기전까지 계속 정수를 받습니다
        // 그리고 입력한 수중의 짝수의합과 홀수의 합을 따로 구해서 출력
        
//        Scanner sc = new Scanner(System.in);
//        
//        int evenSum = 0;
//        int oddSum = 0;
//        
//        while(true) {
//        	System.out.print("정수를 입력해 주세요: ");
//        	int num = sc.nextInt();
//        	if(num == -1)
//        		break;
//        	if(num % 2 == 0) {
//        		evenSum += num;
//        	}
//        	else {
//        		oddSum += num;
//        	}
//        }
//        System.out.println("짝수의 합은 "+evenSum+"입니다.");
//        System.out.println("홀수의 합은 "+oddSum+"입니다.");
        
        //1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다.
        
//        int i = 1;
//        while(i <= 100) {
//        	if(i % 3 == 0 && i % 4 == 0) {
//        		System.out.println(i);
//        	}
//        	i++;
        
        System.out.println("——————— while - if문 문제 04 ———————");
        // 소수를 판별하는 코드를 만드세요
        // 소수 : 1과 자기자신으로만 나누어떨어지는 수 , % 연산자사용합니다)
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();
        
        int i = 1;
        int cnt = 0;
        while(i <= num) {
        	if(num % i == 0){
        		cnt++;
        	}
        	i++;
        }
        if(cnt == 2) {
        	System.out.println(num+"는 소수입니다.");
        }
        else {
        	System.out.println(num+"는 소수가 아닙니다.");
        }
        
        
        // 05 continue 예약어
        System.out.println("------------while - continue 예제 -----------");
        // 1부터 10까지의 수 중에 3의 배수를 제외하고 출력
        int i = 1;
        while(i<=10) {
        	if(i%3==0) {
        		i++;
        		continue;
        	}
        	System.out.println("i =" +i);
        	i++;
        }
        
        
        
       
	}

}
