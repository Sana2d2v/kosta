package day0213;

import java.util.Scanner;
//이름과 나이, 키 를 입렵받고 나이는 30세 이상이고, 키가 170이하이면 입장가능
public class D035EnterTest {

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
		
		if(height<= 170 && age>=30 ) {
			System.out.printf("%s님입장이 가능합니다.", name);
		}else {
			System.out.printf("%s님입장이 불가능 합니다.",name);
		}
		
	}

}
