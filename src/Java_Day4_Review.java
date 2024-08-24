// (2) 삼항연산자 사용
import java.util.Scanner;

public class Java_Day4_Review {
public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.println("숫자를 입력해주세요");
   int num = sc.nextInt();
   
   String result = (num % 2 == 1 && num % 5 == 0) ? "홀수이자 5의 배수입니다." : "홀수이자 5의 배수인 수가 아닙니다.";
   System.out.println(result);
}
}
	

