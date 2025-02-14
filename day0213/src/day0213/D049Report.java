package day0213;

import java.util.Scanner;

public class D049Report {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,result="불합격";
		int kor, eng , math, tot;
		double avg;
		
		System.out.print("학생의 이름");
		name = sc.next();
		System.out.print("국어점수");
		kor = sc.nextInt();
		System.out.print("영어점수");
		eng = sc.nextInt();
		System.out.print("수학점수");
		math = sc.nextInt();

		tot = kor+eng+math; 
		avg = tot/3.0;
		
		if( avg >= 60 && kor >=40 && eng >= 40 && math >= 40) {
			result = "합격";
		}		
		System.out.println("*** 성적 처리 결과 ***");
		System.out.println("결과: "+ result);


	}

}
