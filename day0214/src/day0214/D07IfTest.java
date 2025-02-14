package day0214;

import java.util.Scanner;

public class D07IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , result;
		
		System.out.print("수를 입력하십시오");
		a = sc.nextInt();
		
		if(a>=0) {
			//System.out.println(a+100);
			result=(a+100);
		}else {
			//System.out.println(a*a);
			result = (a*a);
		}
		System.out.println(result);
		System.out.println("작업종료");
	}

}
