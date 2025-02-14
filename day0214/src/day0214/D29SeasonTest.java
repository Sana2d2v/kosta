package day0214;

import java.util.Scanner;

public class D29SeasonTest {
//사용자한테 월을 입력 받아서 계절명을 출력하는프로그램을 if문으로 작성
	//실행 예   월을 입력하세요 > 2 > 2월은 겨울입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ;//월을 입력받을거
		String sea = "겨울";//계절을 입력
		
		System.out.print("월을 입력하세요");
		a = sc.nextInt();
	
		if(a<1 || a>12) {//예외처리
			System.out.println("잘못 된 입력입니다.");
			return;
		}
		//12,1,2 겨울
		//3,4,5, 봄
		//6,7,8, 여름
		//9,10,11 가을
		
		if(a ==  3||a ==  4||a ==  5) {
			sea="봄";
		}else if(a ==6 ||a ==7||a == 8) {
			sea ="여름";
		}else if(a ==9 ||a ==10 ||a == 11) {
			sea ="가을";
		}else {
			
		}
		System.out.printf("%d월은 %s입니다", a, sea);
	}
	

}
