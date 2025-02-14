package day0212;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("이름?");
		name = sc.next();
		System.out.print("나이?");
		age = sc.nextInt();
		System.out.println("이름:"+name);
		System.out.println("나이:"+ age);
		if ( age >= 40) {
			System.out.println(name + "님은 무료암검진대상자임" );
		
	}else {
			System.out.println(name +"님 무료 암검진 ㄴㄴ");
}
	}
}