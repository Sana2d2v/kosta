package day0214;

import java.util.Scanner;

public class D26DigitToKorSwitch {
//사용자에게 0~9사이의 정수를 입력받아 한글 표기식 출력하는 프로그램을 다중if문 사용해서
	//실행 예  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String kor="";	//디폴트를 안쓰고 싶다면 이렇게 하면 됨

		
		
		System.out.print("0~9사이의 정수를 입력해");
		a = sc.nextInt();
		
		if(a <0 || a >9) {//입력범위를 넘으면 중지시켜주는거 만들어보기
			System.out.println("입력값이 잘못되었습니다");
			return;
		}
		
		switch(a) {
		case 0: kor="영";break;
		case 1: kor="일";break;
		case 2: kor="이";break;
		case 3: kor="삼";break;
		case 4: kor="사";break;
		case 5 :kor="오";break;
		case 6: kor="육";break;
		case 7: kor="칠";break;
		case 8: kor="팔";break;
		case 9: kor="구";break;
		default:
			System.out.println("범위초과");
			
		}
		System.out.println(kor);
		System.out.println("작업완료");
	
	}

}
