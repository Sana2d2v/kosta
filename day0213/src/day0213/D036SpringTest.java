package day0213;

import java.util.Scanner;

//사용자한테 출생월을 받아서 봄에 태어났는지 판별 후 적절한 메세지를 출력하는프로구ㅡ램
public class D036SpringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String a;
		//3을 입력할지 3월을 입력항지 몰라서 스트링으로 받았는데 이경우 어떻게 해야할지 모르겠음
		//썜 해답지 보고 쉬운거 익히기
		int a;
		System.out.println("태어난 달을 입력하세요");
		a = sc.next();
		//1. 3이거나 4이거나 5인지 물어보기  a가 인트일경우
		//2.
		if( a==3||a==4||a==5) {
			System.out.println("따뜻한 봄에 태어나셨군요~ ");
		}else {
			System.out.printf("%s 에 태어나셨군요~", a);
		}
	}
}
