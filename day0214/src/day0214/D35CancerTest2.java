package day0214;


import java.util.Date;
import java.util.Scanner;


public class D35CancerTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, result="위암 간암",  gender;// gender를 스트링으로받는 방법
		int userYear, age, thisYear;
		Date today = new Date();
		thisYear = today.getYear()+1900;
		
		System.out.print("이름을 입력하시오==>");
		name = sc.next();
		System.out.print("출생연도를 입력하시오==>");
		userYear = sc.nextInt();				
		System.out.print("성별을 입력[남자,여자]");
		gender = sc.next();
		
		//!아니고의 의미. 성별이 남자도 아니고 여자도 아닌것.
		if(!gender.equals("남자") && !gender.equals("여자")) {
			System.out.println("잘못된 입력");
			return;
		}		
		age = thisYear - userYear;
		
		if(age < 40  ||  thisYear % 2  != userYear % 2  ) {
			System.out.printf("%s님은 올해(%d)년 %d살이며 무료암검진 대상자가 아닙니다.",
					name,thisYear,age);
			return;
		}
		
		if(age >= 50) {
			result += " 대장암";					
		}
		//gender.equals("여자") 성별부분 이퀄즈써서 스트링 비교로 바꿔줌
		if(gender.equals("여자")) {
			result += " 유방암 자궁암";
		}
		
		System.out.printf("%s님은 올해(%d)년 %d살이며 무료암검진 대상자입니다.\n",
				name,thisYear,age);
		System.out.printf("검진항목은 %s입니다.",result);
	}
}




