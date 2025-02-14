package day0213;

public class D024DoubleTest {

	public static void main(String[] args) {
		//키를 178.9 저장해볼거임 타입은 더블이좋겠음
		double height;
		height = 178.76315;
		System.out.println(height);
		//System.out.printf("키:%f", height);
		//에스는문자열 디는 뭐 에프는 실수?를 나타냄 그 뒤에 대응하는 변수를 나열해주면됨
		//소수점 둘째자리까지는 .2f  System.out.println("키:%.2f");
		 System.out.printf("키:%.2f", + height);
		//\n 는 주바꿈(개행) 문자임   ("키:%.2\n")
		int age;
		age = 34;
		System.out.println("나이:"+age);
		System.out.printf("나이:&d",+age);

		
		String name ;
		name = "공우진";
		System.out.println("이름:"+name);
		System.out.printf("이름:");
		
		//아무튼 대응하는거 뒤에 순서대로 넣으라는 말
		
	}

}
