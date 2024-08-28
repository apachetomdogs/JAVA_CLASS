//import java.util.*;
//public class Java_Day6_Review {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
				
			
//		    System.out.println("----------------- while - 무한 루프 예제 --------------------");
//		    // 값을 사용자로부터 입력받아 모두 더하는 프로그램을 만들어보자!!
//		    // 값이 -1이라면 프로그램 종료  !!
//		    Scanner sc = new Scanner(System.in);
//		    int sum =0;
//		    
//		    while(true) {
//		        System.out.println("값을 입력해주세요.");
//		        int num = sc.nextInt();
//
//		    	
//		    	if(num == -1) {
//		    		break;
//		    	}
//		    	sum += num;
//		    	}
//		    System.out.println(sum);
		
		// 중첩 while문
		// 예제 01)
		// 가위, 바위, 보 중에서 고르세요!
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		while(true) {
//			System.out.println("가위, 바위, 보 중에서 고르세요! ");
//			String gbb[] = new String[]{"가위", "바위", "보"};
//			Random random = new Random();
//			String choice = sc.next();
//			
//			if(choice.equals([random.nextInt(3)])) {
//				break;}
//			}
//	}
//}
		
//		import java.util.Random;
//		import java.util.Scanner;
//
//		public class Java_Day6_Review {
//
//		    public static void main(String[] args) {
//		        Scanner sc = new Scanner(System.in);
//		        Random random = new Random();
//		        String[] gbb = {"가위", "바위", "보"};
//
//		        while (true) {
//		            System.out.println("가위, 바위, 보 중에서 고르세요! ");
//		            String userChoice = sc.next();
//
//		            // 무작위로 선택된 값
//		            String computerChoice = gbb[random.nextInt(3)];
//		            System.out.println("컴퓨터 선택: " + computerChoice);
//
//		            // 사용자 선택과 컴퓨터 선택 비교
//		            if (userChoice.equals(computerChoice)) {
//		                System.out.println("무승부입니다. 프로그램 종료.");
//		                break;
//		            	}									 
//		            else if(userChoice.equals("가위") ){
//		            		if(computerChoice.equals("바위")) {
//		                       System.out.println("졌습니다.");
//		                       break;}
//		            		else if(computerChoice.equals("보")) {
//		            			System.out.println("이겼습니다.");
//		            			break;}
//		            		}							
//		            else if(userChoice.equals("바위") ){
//	            		if(computerChoice.equals("보")) {
//	                       System.out.println("졌습니다.");
//	                       break;}
//	            		else if(computerChoice.equals("가위")) {
//	            			System.out.println("이겼습니다.");
//	            			break;}
//		                   }
//			      else {
//		            	if(computerChoice.equals("가위")) {
//		                  System.out.println("졌습니다.");
//		                   break;}
//		            	else if(computerChoice.equals("바위")) {
//		            	  System.out.println("이겼습니다.");
//		            	 break;}
//	            		}							
//		        }
//
//		    }
//		}

import java.util.*;

import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] gbb = {"가위", "바위", "보"};
        String userChoice;

        while (true) {
            System.out.println("가위, 바위, 보 중에 고르세요! 끝내려면 '끝'을 입력하세요.");
            userChoice = sc.next();

            if (userChoice.equals("끝")) {
                System.out.println("게임을 종료합니다.");
                break; // '끝'을 입력하면 루프를 종료합니다
            }

            if (userChoice.equals("가위") || userChoice.equals("바위") || userChoice.equals("보")) {
                String computerChoice = gbb[random.nextInt(3)];
                System.out.println("컴퓨터 선택: " + computerChoice);

                if (userChoice.equals(computerChoice)) {
                    System.out.println("무승부입니다. 다시 시도하세요.");
                } else if ((userChoice.equals("가위") && computerChoice.equals("바위")) ||
                           (userChoice.equals("바위") && computerChoice.equals("보")) ||
                           (userChoice.equals("보") && computerChoice.equals("가위"))) {
                    System.out.println("졌습니다...");
                } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
                           (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                           (userChoice.equals("보") && computerChoice.equals("바위"))) {
                    System.out.println("이겼습니다! 야호!");
                }
            } else {
                System.out.println("가위, 바위, 보 중 하나를 입력하세요. 다시 입력하세요.");
            }
        }

        sc.close(); // Scanner를 닫습니다
    }
}


