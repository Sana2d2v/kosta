package day0213;

import java.util.Scanner;

//문제 학색의 이름 국어 영어수학을 입력 ㅂ받아서 총점과 평균을 구하여 각각 출력하는데
//단 평균은 소수점 첫째자리까지 출력
public class D025StudentTest {

	public static void main(String[] args) {
		//1 입력받기 
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, all;
		double avg;//평균은 실수값을위해 더블로 선언
		
		System.out.print("이름 입력");
		 name= sc.next();//이름은 넥스트만. 정수엔 인트.
		System.out.print("국어점수를 입력");
		 kor= sc.nextInt();
		 System.out.print("수학점수 입력");
		 math= sc.nextInt();
		 System.out.print("영어점수를 입력");
		 eng= sc.nextInt();
		 all = kor+ math+ eng ;
		//@@@@@@@@@ avg= all/3;	  이렇게하면 안돰 3.0 으로 해줘야함 @@@@@@@@@@
		 avg= all/3.0;
		 System.out.println("*****성적표******");
		 			
		System.out.printf("이름:%s, 국어:%d, 영어:%d,수학:%d,평균:%.1f",name, kor,eng,math,avg);
		
	}

}
