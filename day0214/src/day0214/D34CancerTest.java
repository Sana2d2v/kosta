package day0214;

import java.util.Date;
import java.util.Scanner;

public class D34CancerTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String name;
		int userYear ,age,thisYear, sex ;
		
		System.out.print("이름?");
		name = sc.next();
		System.out.print("성별?남자는 1 여자는 2");
		sex = sc.nextInt();
		System.out.print("출생년도?");
		userYear = sc.nextInt();
		
		Date today = new Date();
		thisYear = today.getDate()+2011;
		age = thisYear - userYear ;
		
		//출생년도로 암검진 대상자를 가르고
		//40세 이상 여자인가 남자인가
		//50세이상 남자인가 여자인가 
		
		int a;//if문 써서 대상자인지 올해인지 아닌지 
		
		if( thisYear % 2 == userYear %2 ) {
			if(age>=40 && age<50){
				a=1;//50 미만인 경우
			}else {
				a=2;//50세 이상인 경우
			}
		}else {//대상이 아닌경우
			a=3;
		} 
		
		//위암 간암 대장암 
		//유방암 자궁암 
		
		
		switch(a) {
		case 3:
		case 1:
		case 2:	
		
		
		
		}

		System.out.printf("%s님은 올해 (%b)년 %b살이며 ",name,thisYear, age );
		
	}

}
