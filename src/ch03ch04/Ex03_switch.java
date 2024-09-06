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
 
 *swicth문
 switch(조건){
 	case 값1 :  실행코드;
 						[break;]
 	case 값2 :  실행코드;
 						[break;]
 	case 값n:  실행코드;
 						[break;]
 	default :  실행코드;
 						[break;]
 }
 */
public class Ex03_switch {

	public static void main(String[] args) {
		//주사위(1~6) 굴려서 나온 수를 출력하시오
		System.out.println("1~6사이의 랜덤한 정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);  //Scanner클래스의 객체를 생성
		int num = sc.nextInt();  //입력받은 값을  int로 반환받는다.
		
		int n = 0;
	    switch(num){   
		 	case 1 :  n  = num;   
		 						break;
		 	case 2 :  n  = num;  
		 						break;
		 	case 3 :  n  = num; 
		 						break;
		 	case 4 :  n  = num;   
		 						break;
		 	case 5 :  n  = num;  
		 						break;
		 	case 6 :  n  = num; 
		 						break;
		 	default :  n  = 0;
		 						break;
	    }
		
		System.out.println(n+"칸 앞으로 전진");
	}

}
