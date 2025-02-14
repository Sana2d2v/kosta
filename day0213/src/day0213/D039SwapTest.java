package day0213;

public class D039SwapTest {

	public static void main(String[] args) {
		int a = 3;
		int b =7;
		
		System.out.println("두 변수의 초기값");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		//a와 b 의 코드를 서로 맞바꿔라.
		
		int c; //새 빈 변수 추가 
		
		c= a;
		a= b;
		b= c;
		System.out.println("두 변수의 값을 서로 변경한 후");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
