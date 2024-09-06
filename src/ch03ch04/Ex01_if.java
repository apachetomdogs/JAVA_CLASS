package ch03ch04;

import java.util.Scanner;

//if
/*if(조건){
    	//조건을 만족시 실행코드
    }
  
 
 * if(조건){
    	//조건을 만족시 실행코드
   }else{
 		//조건을 만족x시 실행코드
   }
 
 * if(조건1){
    	//조건1을 만족시 실행코드
   }else if(조건2){
    	//조건2을 만족시 실행코드
   }else if(조건n){
 		//조건n을 만족시 실행코드
   }else{
   	   //모든 조건을 만족x시 실행코드
   }
   
  *비교연산자
  1>10    
  A>B	    A는 B보다 크다.초과
  A>=B	A는 B보다 크거나 같다.이상
  A<B	    A는 B보다 작다.미만
  A<=B	A는 B보다 작거나 같다.이하
   
   *삼항연산자(p147)
   (조건)?조건참:거짓;
   if(조건){조건참}else{거짓}
   
   
 */
public class Ex01_if {

	public static void main(String[] args) {
		//user가 입력한 임의점수가
		//60이상이면     합격, 
		//60미만이면서  점수가 55점이상이면 예비합격
		//그렇지 않으면 불합격
		
		Scanner sc = new Scanner(System.in);  //Scanner클래스의 객체를 생성
		System.out.println("삼항연산자를 이용----------------------------------");
		System.out.println("점수를 입력해주세요.");
		String inputData = sc.nextLine();
		int score = Integer.parseInt(inputData);
		

		String result = (score >= 60) ? "합격" : (score >= 55) ? "예비합격. 대기하세요~": "불합격. 힘내요!";
		
		System.out.println(result);
		
		
		
//		int score = Integer.parseInt(inputData); // convert from String to int
		System.out.println("if else문 이용----------------------------------");
		if(score>=60){
	    	System.out.println("합격");
		}else if( score>=55){
			System.out.println("예비합격. 대기하세요~");
		}else{
	   	   	System.out.println("불합격. 힘내요!");
		}	
		System.out.println("\n");
		System.out.println("삼항연산자를 이용----------------------------------");
		
		System.out.println("점수를 입력해주세요.");
		
		String result2 = (score > 55) ? "합격!" : "불합격!";
		System.out.println(result2);
		
		
		System.out.println("if else문 이용----------------------------------");
		//점수가 60을 포함하여 크면 합격, 그렇지 않으면 불합격
		if(score>=60 ) {  //조건  만족시  실행코드
			System.out.println("합격~~\nㅊㅋㅊㅋ");
		}else{  //조건  만족x시  실행코드
			System.out.println("불합격. 다음 기회에...");
		}//if
		
		System.out.println("\n-----------------------------------------");
		System.out.println("if문밖");
		
//		int x = 3;  // 갑자기 생각나서...
//		int y = 5;
//		int temp=0;
//		
//		temp = x;
//		x = y;
//		y = temp;
//		System.out.println(x+","+y);
		
	}//main

}







