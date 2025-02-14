package day0213;

import java.util.Scanner;

//종각에 있는 클럽에서 이름과 키를 입력받고 170이하이면 입장 가능을 출력 
public class D034EnterTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int height;
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("키를 입력하시오");
		height = sc.nextInt();
		
		if(height<= 170) {
			System.out.printf("%s님입장이 가능합니다.", name);
		}else {
			System.out.printf("%s님입장이 불가능 합니다.",name);
		}
		
	}

}
