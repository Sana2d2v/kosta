package day0213;

import java.util.Scanner;
import java.util.Date;

public class D048CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		Date today = new Date();
		int userYear ,age;
		int thisYear=today.getYear()+1900;
		
		System.out.print("이름?");
		name = sc.next();
		System.out.print("출생년도?");
		userYear = sc.nextInt();
		age = thisYear - userYear ;
		
		int n;
		n = age;
		
		if( age >= 40 && n % 2 == 1  )	{
			System.out.printf("%s님, 무료암검진 대상자 입니다.",name);
		}else {
			System.out.printf("%s님, 무료암검진 대상자가 아닙니다.", name);			
		}

		
	}

}
