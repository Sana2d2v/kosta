package day0212;

import java.util.Scanner;

public class EvenOddTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor , eng, math , all , avg ;
		
		
		System.out.print("이름을 입력");
		name = sc.next();
		
		System.out.print("국어 점수를 입력");
		kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력");
		eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력");
		math = sc.nextInt();
	
		all = kor + eng + math ;
		avg = all/3;
		System.out.println("***성적 처리 결과***");
		
		System.out.println("-------------");
		
		System.out.println("이름:"+ name);
		System.out.println("국어:"+ kor);
		System.out.println("영어:"+ eng);
		System.out.println("수학:"+ math);
		System.out.println("총점:"+ all );
		System.out.println("평균:" +avg);




	
		
		
		
	
	

		}

}
