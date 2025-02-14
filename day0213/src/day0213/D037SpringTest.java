package day0213;

import java.util.Scanner;

//사용자한테 출생월을 받아서 봄에 태어났는지 판별 후 적절한 메세지를 출력하는프로구ㅡ램
public class D037SpringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("태어난 달을 입력하세요");
		a = sc.nextInt();
		//3보다 크커나 같고 5보다 같거나 작냐 를 물어보기  논리곱&&쓰기
		if( a>=3 && a<=5) {
			System.out.println("따뜻한 봄에 태어나셨군요~ ");
		}else {
			System.out.printf("%s월에 태어나셨군요~", a);
		}
	}
}
