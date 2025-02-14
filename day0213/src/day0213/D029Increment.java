package day0213;

public class D029Increment {

	public static void main(String[] args) {
		int a= 25;
		int b =25;
		
		//다른연산자와 함께 증감연산자 사용해보기
		int i = a++; // 두개의 명령을 하나의 문장으로 표현. a를 i에 저장하고, a를 1 증가시켜라.
					//뒤에 있으면 나중에 증가시키라는 뜻. 
					// 25인a의 값이 i에 저장된 이후에 a가 증가하여 값이 26으로 변함.
		int  j = ++b;// b를 증가시키고 그 증가시킨 b를 j에 저장하라. 
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(i);
		System.out.println(j);
	}
}
