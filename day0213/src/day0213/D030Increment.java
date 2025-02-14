package day0213;

public class D030Increment {

	public static void main(String[] args) {
		int a= 25;
		
		System.out.println(a+1); //이건 a에 1을 더한것을 출력하라는 뜻. a자신은 변동이 없음
		System.out.println(a);// 그러므로 a를 출력해도 여전히 25임
		
		int b =25;
		System.out.println(++b);//이건 b에 연산을 실행한 후에 b에 저장하여 출력. 
		System.out.println(b);// 바뀐 b 가 출력됨. 
	}
}
