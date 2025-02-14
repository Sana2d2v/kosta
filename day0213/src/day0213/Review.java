package day0213;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//사용자로 부터 값을 입력받으려면 스캐너 클래스 사용
		int dad, mom , son , all, avg;
		//담을 변수들 선언
		System.out.print("아빠나이를 입력");
		dad = sc.nextInt();
		//정수 이ㅂ력받을것이므로 sc.nextInt
		System.out.print("엄마나이를 입력");
		mom = sc.nextInt();
		System.out.print("아들나이를 입력");
		son = sc.nextInt();
		
		all = dad + mom + son ;
		//합 구하고
		avg = all/3;
		//평균내려소ㅓ
		System.out.println("가족의 평균나이는 "+avg +"입니다.");
		//출력
		
	}

}
