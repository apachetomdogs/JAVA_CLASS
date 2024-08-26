import java.util.*;
public class Java_Day5_Review {
	
	public static void main(String[] args) {
		
		
//		### **문제**
//
//		다음은 사용자로부터 나이를 입력받아 그 나이에 따라 사용자의 범주를 분류하는 자바 프로그램의 일부입니다. 사용자의 나이에 따라 "성인입니다", "취학 아동입니다", 또는 "미취학 아동입니다"를 출력하는 프로그램을 완성하세요.
//
//		**요구사항:**
//
//		1. 사용자에게 나이를 입력하라는 메시지를 출력합니다.
//		2. 입력받은 나이를 기준으로 사용자를 다음과 같이 분류해 출력합니다:
//		    - 20세 이상: "성인입니다"
//		    - 8세 이상 20세 미만: "취학 아동입니다"
//		    - 8세 미만: "미취학 아동입니다"
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();
//		
//		if(age >= 20) {
//			System.out.println("성인입니다.");
//		}
//		else if(age >= 8) {
//			System.out.println("취학 아동입니다");
//		}
//		else {
//			System.out.println("미취학 아동입니다.");
//		}
		
// else - if 문 문제 01)
//시험 점수를 입력받아 90 ~ 100점은 A,
//80 ~ 89점은 B, 70 ~ 79점은 C,
//60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

// score >= 90 A
// score >= 80 B
// score >= 70 C
// score >= 60 D
// 그외 F
		

        
        
//        
//        System.out.println("--------------- while문 예제 03 ---------------");
////      1부터 N(입력한 수)까지의 합 구하기    
////      출력예)
////      1부터 10까지의 합 : 55
//        
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자를 입력해주세요: ");
//        int num = sc.nextInt();
//        
//        int i = 1;
//        int sum = 0;
//        
//        while(i <= num) {
//        	sum += i;
//        	i++;
//        }
//        
//        System.out.printf("1부터 %d까지의 값은 %d입니다.", num, sum); 
//        
//        
//        
//        
//        
//        
//        
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        
        
        
        
        
        //문제
        System.out.println("--------------- while문 문제 01 ---------------");
        //정수 두개를 입력 받아(n,m) n부터 m까지의 합을 구하세요
        //이때 받는 수는 n이 m보다 작아야 합니다(제약조건)
        
        
     //   Scanner sc = new Scanner(System.in);  // Scanner로 입력받기
        System.out.println("두 수를 입력하세요.(이 때, 첫 번째 수가 두 번째 수보다 작아야 합니다.)"); // 사용자에게 입력 형식을 안내함
        int n = sc.nextInt(); //첫 번째 값, 정수 타입의 n 변수 입력 받기
        int m = sc.nextInt();// 두 번째 값, 정수 타입의 m 변수 입력 받기 
        
        if(n < m) {  // 만약 n이 m 보다 작다는 조건이 '참'이라면 조건을 실행하세요.
        	int i = 0;  // while문으로 반복을 시작하기 전, 숫자를 1씩 증가해줄 변수를 i로 설정하고 초기값을 0으로 설정해줌.
        				//while문의 조건인 (n+i < m)의 첫 시작에서 i가 0이어야 n < m이라는 제약 조건이 참이 될 수 있음. 
        	int sum = 0; // while문으로 반복을 시작하기 전, n부터 m까지의 합을 담을 변수를 sum으로 설정하고 초기값을 0으로 설정해줌.
        				// n부터 m까지의 합을 구할 때, 밑의 while문 안에 sum += (n+i);에서 i=0이므로 sum에 n을 대입하게 되어 n부터의 합을 구할 수 있게 됨. 
        	while(n+i <= m) { // (n+i) <= m이 참인 한 식을 계속하여 실행하여라. n 부터 m까지의 합은 n <= m까지 반복해야 얻을 수 있음.         
        		sum += (n+i); // sum에 n+i를 대입함. i=0일 때 n을, i=1일 때 n+1을, i=2일 때 n+2를 대입하여 n+i=m일 때까지 대입한다. 
        					 // 즉, sum = (n+0) + (n+1) + (n+2) + (n+3) + ... + m임.
        		i++; //i에 1을 더하고 다시 while조건문으로 돌아가 n+i <= m을 비교한다. 
        	} 
        	System.out.printf("%d부터 %d까지의 합은 %d 입니다.", n, m, sum); // print"f"를 사용해서 n부터 m까지의 합 sum을 대입받아 출력.
        } // if문의 끝
        else { // if문의 조건을 만족하지 않는다면 나머지 case들은 else 문 괄호 안에 해당하는 명령 실행
        	System.out.println("두 수를 다시 입력하세요."); // n < m이라는 제약 조건을 만족하지 않으므로 두 수를 다시 입력하라는 문구를 출력. 
        }// else문의 끝
        
        
        // 02 do-while문의 구조
        
        // while문은 조건식이 거짓이면 실행 X
        // do-while문은 무조건 한 번 실행 후 조건식 판별
//        
//        do {							// 일단 해라. 
//        	조건식 판별 전 실행할 코드;		// 조건식 상관없이 실행
//        	반복적으로 실행될 코드;			// 조건식에 따라 실행							
//        } while(조건);
//        
//        
//        System.out.println("-------do-while문 예제-------");
//        Scanner sc = new Scanner(System.in);
//        int number;
//        do {
//        	System.out.println("양수를 입력 >> ");
//        	number = sc.nextInt();
//        	
//        	if (number <= 0) {
//        		System.out.println("잘못된 입력입니다. 다시 시도하세요.");
//        	}
//        }while (number <= 0);
//        System.out.println("입력한 양수 : "+ number);
//        
//        // 03 while - 무한 루프 이용하기
//        System.out.println("------while - 무한 루프 예제--------");
//        // 값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자!!
//        // 값이 -1이라면 프로그램 종료 !!
//        
//        Scanner sc = new Scanner(System.in);
//        
//        int sum = 0;
//        int num;
//        while(true) {
//        	System.out.println("정수 입력 (종료는 -1입니다!) : ");
//        	num = sc.nextInt();
//        	
//        	if (num == -1) {
//        		break;
//        	}
//        	sum = sum + num;
//        }
//        System.out.println("누적된 총합: "+sum);
        	
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

		
		}

	}
	
	

