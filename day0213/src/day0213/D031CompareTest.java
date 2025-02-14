package day0213;

import java.util.Scanner;

//두사람의 나이를 입력받아 서로 같은지 판별
public class D031CompareTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int age1, age2;
		
		System.out.println("첫번째 사람의 나이를 입력");
		age1= sc.nextInt();
		System.out.println("두번째 사람의 나이를 입력");
		age2= sc.nextInt();
		
		if(age1== age2) {
			System.out.println("두사람의 나이가 같아요");
		}else {
			System.out.println("두사람의 나이가 달라요");
		}
	}

}
