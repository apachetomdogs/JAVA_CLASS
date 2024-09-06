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
 */
public class Ex02_if {

	public static void main(String[] args) {
		//주사위(1~6) 굴려서 나온 수를 출력하시오
		System.out.println("1~6사이의 랜덤한 정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);  //Scanner클래스의 객체를 생성
		int num = sc.nextInt();  //입력받은 값을  int로 반환받는다.
		
		int n = 0;
		if(num == 1) {
			n  = num;
		} else if(num == 2) {
			n  = num;
		} else if(num == 3) {
			n  = num;
		} else if(num == 4) {
			n  = num;
		} else if(num == 5) {
			n  = num;
		} else if(num == 6) {
			n  = num;
		} //if
		
		System.out.println(n+"칸 앞으로 전진");
	}

}
