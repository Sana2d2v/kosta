package day0214;

import java.util.Scanner;

public class D28LastDaySwitch {
//사용자에게 월을 입력 받아 그 월이 몇 일 까지 잉ㅆ는지 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int mon , lastday =31;
		System.out.print("월 입력 ㄱ");
		mon =sc.nextInt();
		//switch를 이용해서 입력받아보기
		if(mon< 1 || mon >12) {
			System.out.println("입력오류");
			return;
		}
		switch(mon) {
		case 2: lastday=28; break;
		case 4:
		case 6:
		case 9:
		case 11:lastday=30; 	
		}

		System.out.printf("%d월은 %d일까지 있어요 ", mon, lastday);
	} 

}
