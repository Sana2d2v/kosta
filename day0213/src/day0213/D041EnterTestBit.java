package day0213;

import java.util.Scanner;
//bit연산자를 논리연산자로 사용할 수 있어요.
public class D041EnterTestBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age, height;
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("나이를 입력하시오");
		age = sc.nextInt();
		System.out.println("키를 입력하시오");
		height = sc.nextInt();
		
		//if(height<= 170 && age>=30 ) 에서 비트곱을 논리곱으로 활용가능하다.
			if(height<= 170 & age>=30 ) {	
			System.out.printf("%s님입장이 가능합니다.", name);
		}else {
			System.out.printf("%s님입장이 불가능 합니다.",name);
		}
		
	}

}
