package ch05Array;
/*배열복사(p217)
 * 배열은 생성 시 지정된 크기를 변경할 수 없다. 
 * 따라서, 더 많은 저장 공간이 필요하다면, 
 * 더 큰 배열을 새로 만들고
 * 이전 배열로부터 '항목 값(=요소,아이템)'들을 복사해야 한다.<= 깊은 복사(Deep Copy)!
 * 또는
 * 이전 배열로부터 '주소'를 복사해야 한다. <= 얕은 복사(Shallow Copy)!
 * 
 */

// 얕은 복사
/*
 * 원본과 사본 배열이 동일한 주소(객체)를 참조한다.
 * 따라서 원본의 값이 변경이 되면 사본 배열의 값도 변경이 된다.
 * 데이터를 공유한다.
 *
 * 
 */ 
// 얕은 복사 실습
public class Ex05_p217 {
	public static void main(String[] args) {
	 //정수배열 arr1에 1,2,3,4,5 값을 저장
		int[] arr1 = {10,20,30,40,50};
		System.out.println("----원본배열 arr1----");
		System.out.println("arr1="+arr1); //[I@512ddf17 스택 영역, 주소지 메모리 값
//		arr1[5]=100; // 오류 발생. 값 변경하려고 하는데 없는 인덱스.
		arr1[4]=60;
		for(int temp:arr1) {
			System.out.print(temp+"\t"); // heap 영역 실제 값
		}//for
		System.out.println("\n");
		//첫 번째 항목 값 복사.
		
		// heap 영역의 arr1[4] 값을 55로 바꿨다. 
		System.out.println("\n----아래는 새 배열 arr2----");
		int[] arr2 = arr1; 
		System.out.println("arr2="+arr2);// 주소지를 넘겨준 것 ??[I@512ddf17가 나올 것인가? 나왔다!!
		arr2[4] = 55;
		for(int temp: arr2) {
			System.out.print(temp+"\t");
		}
		System.out.println("\n");
		
		//55로 바꾸고 난 다음에 다시 arr1[4]을 출력해 보니까 55로 바뀌어 있다. 
		for(int temp:arr1) {
			System.out.print(temp+"\t"); //
		}//for
		System.out.println("\n");
		
		
	}
}
