package ch02;

// 출력하기(p112)
//printf(p113)
public class Ex04_p112 {

	public static void main(String[] args) {
		int value = 123;
		String str="살";
		double num =9.9;
		System.out.printf("%f\n",num);
		System.out.printf("%5.2f\n",num);
		System.out.println();//빈줄
		
		System.out.printf("%d\n",value);     //"%d"              정수
		System.out.printf("%5d\n",value);   //"%5d"  5자리정수,왼쪽  빈 자리 공백
		System.out.printf("%7d\n",value);   //"%7d"  7자리정수
		System.out.printf("%-7d\n",value);   //"%7d"  7자리정수, 오른쪽 빈 자리 공백
		
		System.out.println("---------------------------------------------");
		System.out.println("만나이 : "+value+" "+str);
		System.out.printf("만나이 : %d %s\n",value,str);//만나이 : 123 살
		System.out.printf("\n두번째 %d",value);
		
//		System.out.println(value);  //내용을 출력하고 줄바꿈
//		System.out.println(value);
//		System.out.print(value);  //내용을 출력
//		System.out.print(value);
	}

}
