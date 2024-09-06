package ch05Array;

import java.util.Scanner;

// 향상된 for문(p219)
// for(타입 변수명 : 배열명) {
// 실행코드 
// }
public class Ex04_p219 {
	public static void main(String[] args) {
		// 임의의 이름 5개를 저장하는 names 배열 생성 후 출력

		String[] names1 = {"박양지", "철수", "영희", "미미", "제임스"};
		for(int i=0;i<names1.length;i++) {
			System.out.println(names1[i]);
		}
		System.out.println("------------------------");
		String[] names = new String[5];
		
		// 향상된 for문 사용하여 출력
		for(String name:names1) {
			System.out.println(name);
		}
		
		// 내 풀이
		String[] name = new String[5];
		for(int i=0;i<name.length;i++) {
			System.out.println("이름을 입력해주세요!");
			Scanner sc = new Scanner(System.in);
			
			String input = sc.next();
			name[i] = input;
		}
		for(int i=0;i<name.length;i++) {
		System.out.print(name[i]+"\t");
		}
		
//		//for(타입 변수명: 컬렉션명) 
//		String[] name2 = new String[5];
//		for(String temp: name2) {
//			Scanner sc = new Scanner(System.in); // <----- 아 이렇게는 안된대요!!! 넣은 값을 출력하는 건 되는데 스캐너로 넣어서 배열 출력X
//			System.out.println("이름을 입력해 주세요!");
//			String input = sc.next();
//			System.out.println(temp);
//			name2[] = input;
//		}
		
		
		
		}
	}

