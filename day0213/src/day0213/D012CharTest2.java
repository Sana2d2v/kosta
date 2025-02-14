package day0213;
//해답

import java.util.Scanner;

public class D012CharTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ha;
		char ch;
		System.out.print("문자를 입력");
		ha = sc.next();
	
		int i,cnt=0; ;
		
		i=0;
		boolean flag = true ;
		
		while(flag) {
			ch = ha.charAt(i);
			System.out.println(ch);
			//2나눠담는게 아니라 맞다면
			if(ch =='A'){
				 //카운트가 증가 하도록 만듬
				cnt = cnt +1;
				//출력은 와일문이 끝나고 출력하도록 하는게 좋을것같음
			}
			
			i=i+1;
			if(i>ha.length()-1){
				flag =false;
			}
		}
		
		//여기
		System.out.println("대문자 A의개수는 "+cnt+"입니다.");
		
	}

}
