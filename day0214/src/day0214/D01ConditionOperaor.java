package day0214;

import java.util.Scanner;
//if문으 버젼
public class D01ConditionOperaor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, max;
		//입력받을 변수와 큰수를 받을 변수
		 System.out.println("첫번째 수를 입력");
		 a = sc.nextInt();
		 System.out.println("두번째 수를 입력");
		 b = sc.nextInt();
		 
		//맥스를 선택하기위해if를 사용
		 if(a>b) {//a가b보다 크다면 맥스에 에이저장
			 max=a;
		 }else {//아니라면 맥스에 비 저장
			 max=b;
		 }
		 System.out.println("큰수는:"+max);
		 //큰수를 출력
	}

}
