package day0213;

import java.util.Scanner;

public class D026RectTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a,b,c; 더블로 받음
		double a,b,c;
		 double tot;
		System.out.print("가로를 입력");
		 a= sc.nextInt();
		 System.out.print("세로를 입력");
		 b= sc.nextInt();
		 System.out.print("높이를 입력");
		 c= sc.nextInt();
		 
		//상자의 면적 구하기 
		 tot= ((a+b)+(b+c)=(c+a))*2;
		
		System.out.println("****상자의면적은 ***");
		System.out.printf("상자면적:%.2f", tot);
		//아 면적이 아니라 사각형 넓이 구하기였음
		 
	}

}
