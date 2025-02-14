package day0214;

import java.util.Scanner;

public class D31SeasonTest {
//사용자한테 월을 입력 받아서 계절명을 출력하는프로그램을 if문으로 작성
	//실행 예   월을 입력하세요 > 2 > 2월은 겨울입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ;//월을 입력받을거
		String sea = "겨울";//계절을 입력
		
		System.out.print("월을 입력하세요");
		a = sc.nextInt();
	
		if(a<1 || a>12) {
			System.out.println("잘못 된 입력입니다.");
			return;
		}
	//스위치문으로 쓰기 
		switch(a) {
			case 3: case 4 : case 5 :sea="봄";  break;
			case 6 :case 7 :case 8 : sea="여름";break;
			case 9 :case 10 :case 11 : sea="가을";break;
		}
		System.out.printf("%d월은 %s입니다", a, sea);
	}
	

}
