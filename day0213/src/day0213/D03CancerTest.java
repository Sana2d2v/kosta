package day0213;

import java.util.Date;
import java.util.Scanner;

public class D03CancerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		int age;
		int userYear;
		int thisYear = today.getYear()+1900;
		
		System.out.print("이름?");
		name = sc.next();
		System.out.print("출생년도?");
		userYear = sc.nextInt();
		age = thisYear - userYear ;
		
		System.out.println("이름:"+name);
		System.out.println("나이:"+ age);
		if ( age >= 40) {
			System.out.println(name + "님은 무료암검진대상자임" );
		
	}else {
			System.out.println(name +"님 무료 암검진 ㄴㄴ");
}
	}
}