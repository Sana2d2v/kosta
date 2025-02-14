package day0214;

import java.util.Scanner;

public class D05IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ;
		
		System.out.print("수를 입력하십시오");
		a = sc.nextInt();
		
		if(a>=0) {
			
			System.out.println(a+100);
		}else {
			
			System.out.println(a*a);
		}
	}

}
