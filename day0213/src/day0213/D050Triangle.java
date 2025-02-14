package day0213;

import java.util.Scanner;

public class D050Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wide, height;
		
		System.out.print("가로의 면적을 입력하시오");
		wide = sc.nextInt();
		System.out.print("세로의 면적을 입력하시오");
		height = sc.nextInt();
		
		double area;
		area = wide*height*1/2;
		//면적 실수처리,, 
		
		System.out.printf("면적은:%.2f 입니다", area);
		
		

	}

}
