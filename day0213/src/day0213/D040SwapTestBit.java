package day0213;

public class D040SwapTestBit {

	public static void main(String[] args) {
		int a = 3;
		int b =7;
		
		System.out.println("두 변수의 초기값");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		//a와 b 의 코드를 서로 맞바꿔라.

		//아까 사용했던 비트차연산자를 사용하면 임시변수없이 값을 서로 맞바꿀수있다
		//a와 b를 비트차 해서 a에 저장. 
		//a와 b를 비트차 해서 b에 저장
		//a와 b를 비트차 해서 a에 저장
		
		a= a^b;
		b= a^b;
		a= a^b;
		
		System.out.println("두 변수의 값을 서로 변경한 후");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
