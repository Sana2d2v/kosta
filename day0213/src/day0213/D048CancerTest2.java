package day0213;

import java.util.Scanner;
import java.util.Date;

public class D048CancerTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int userYear ,age,thisYear ;
		
		System.out.print("이름?");
		name = sc.next();
		System.out.print("출생년도?");
		userYear = sc.nextInt();
		
		Date today = new Date();
		thisYear = today.getDate()+2011;
		age = thisYear - userYear ;
		
		if(age>=40 && thisYear % 2 == userYear %2 ) {
			System.out.printf("%s님(나이:%d) 올해 (%d)에 무료 암검진 대상자입니다", name, age,thisYear);
		}else {
			System.out.printf("%s님(나이:%d) 올해 (%d)에 무료 암검진 대상자가 아닙니다", name, age,thisYear);
		}
		
	
	}

}
