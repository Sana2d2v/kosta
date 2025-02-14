package day0214;

import java.util.Scanner;

public class D16LastDay {
//사용자에게 월을 입력 받아 그 월이 몇 일 까지 잉ㅆ는지 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int mon , lastday;
		String kor;
		
		System.out.print("월 입력 ㄱ");
		mon =sc.nextInt();
		//1 3 5 7 9 11 
		//4 6 8 10 12
		//2
		if(mon ==2) {
			//2월 출력
			lastday = 28;
		}else if(mon %2 == 0) {
			//짝 출력
			lastday=30;
		}else if(mon %2 != 0) {
			//홀수 출력
			lastday=31;
		}
		System.out.println("%d 월은 %d 일 까지 있어요 ", mon, lastday);
	}

}
