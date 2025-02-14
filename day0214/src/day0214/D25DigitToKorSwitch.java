package day0214;

import java.util.Scanner;

public class D25DigitToKorSwitch {
//사용자에게 0~9사이의 정수를 입력받아 한글 표기식 출력하는 프로그램을 다중if문 사용해서
	//실행 예  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String kor;
		System.out.print("0~9사이의 정수를 입력해");
		a = sc.nextInt();
	//kor이라는 변수에 넣어서츌력
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
		//만약 사용자가 입력한 값이 5 라면 case5 부터 끝까지 모두 동작함.
		//모두 동작시키지 않고 해당 case만 동작 시키고자 한다면 각각의 case문 끝에 
		// break를 써야함!!!!
	}

}
