package day0214;

import java.util.Scanner;

public class D18LastDay {
//사용자에게 월을 입력 받아 그 월이 몇 일 까지 잉ㅆ는지 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int mon , lastday =31;
		System.out.print("월 입력 ㄱ");
		mon =sc.nextInt();
		
		if(mon<1 || mon >12) {
			System.out.println("입력값이 잘못되었습니다");
			return;
		}
	
		if(mon ==2) {
			lastday = 28;
		}else if( mon ==4 ||mon == 6 ||mon == 8||mon == 10 ||mon ==12) {
			//짝 출력
			lastday=30;
		}
		System.out.printf("%d월은 %d일까지 있어요 ", mon, lastday);
	} 

}
