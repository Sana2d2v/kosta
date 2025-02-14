package day0214;

import java.util.Scanner;

public class D14MaxTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b ,c ;
		System.out.print("첫번째수를 입력");
		a = sc.nextInt();
		System.out.print("두번째수를 입력");
		b = sc.nextInt();
		System.out.print("세번째수를 입력");
		c = sc.nextInt();
		if(b>a) {
			if(c>b){
				a=c;
			}else {
				a=b;
			}
		}else {
			a =a;
		}
		System.out.println(a);
	}

}
