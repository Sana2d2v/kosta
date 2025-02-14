package day0214;

import java.util.Scanner;

public class D10MaxTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b ;
		
		System.out.print("첫번째 수 입력");
		a =sc.nextInt();
		System.out.print("두번째 수 입력");
		b =sc.nextInt();
		
		if(b>a) {
			a = b;  //2. 근데 혹시 b가a보다 크니? 그러면 b를 a에 넣어버리기.
		}
		System.out.println(a);//1. a를 큰수라고 봄.
		
	}

}
