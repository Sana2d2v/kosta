package day0212;

import java.util.Date;
import java.util.Scanner;

public class CancerTest03 {

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
		
		
		boolean flag;
		flag = age >=40;
		//1.플래그 변수를 사용해서 40이상인지 , 이 변수의 자료형은 boolean으로 만들어주ㅠㅁ
		
		
		
		//if ( age >= 40) { 2.이 조건을 미리정해진 판별된 플래그를 가져와서 쓸 수 있음
		if ( flag) {
			System.out.println(name + "님은 무료암검진대상자임" );
		
	}else {
			System.out.println(name +"님 무료 암검진 ㄴㄴ");
}
	}
}