package ch01;

public class MyFirstMain{

	public static void main(String args[]){
		System.out.println("main() method~~~~");
		test();
	}

	public static void test(){
		System.out.println("test() method호출성공!");
		String message = "hello, java";
		System.out.println(message);
	}
}