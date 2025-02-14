package day0214;

import java.util.Scanner;

public class D23DigitToKorSwitch {
//사용자에게 0~9사이의 정수를 입력받아 한글 표기식 출력하는 프로그램을 다중if문 사용해서
	//실행 예  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("0~9사이의 정수를 입력해");
		a = sc.nextInt();
		//각 case의 명령어들을 한줄에 표현하여 간결하게 가능
		//또 각case에 값의 크기순서는 상관 없음 
		switch(a) {
		case 0: System.out.println("영");break;
		case 1: System.out.println("일");break;
		case 2: System.out.println("이");break;
		case 3: System.out.println("삼");break;
		case 4: System.out.println("사");break;
		case 5: System.out.println("오");break;
		case 6: System.out.println("육");break;
		case 7: System.out.println("칠");break;
		case 8: System.out.println("팔");break;
		case 9: System.out.println("구");break;
		default:
			System.out.println("범위초과");
			
		}
		System.out.println("작업완료");
		//만약 사용자가 입력한 값이 5 라면 case5 부터 끝까지 모두 동작함.
		//모두 동작시키지 않고 해당 case만 동작 시키고자 한다면 각각의 case문 끝에 
		// break를 써야함!!!!
	}

}
