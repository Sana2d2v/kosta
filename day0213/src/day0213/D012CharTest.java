package day0213;
/*
 * 사용자 한테 문자열을 입력 받아서 그 입력한 문자열 안에 대문자 A는 모두 몇개 있는지 
 * 판별하여 출력하는 프로그램을 작성하시오.
 * */
import java.util.Scanner;
//1. 문자역을 입력받기위해 변수 선언하고 입력받는거 만드고
//2. 11번을 응용해서 각 문자열을 char에 담아 분리하고
//3. 그 안에서 a가 몇개인지 찾아내는 식 만들기? 
//어떻게? 각 문자열을 A와 같은지 참거짓으로 ? 참이라면 ? 저장?
public class D012CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자로 부터 값을 입력받으려면 스캐너 클래스 사용
		
		String ha;
		char ch;//변수 미리 선언
		System.out.print("문자를 입력");
		ha = sc.next();
		//1. 문자역을 입력받기위해 변수 선언하고 입력받는거 만듬.	
		int i;
		i=0;
		boolean flag = true ;
		while(flag) {
			ch = ha.charAt(i);
			System.out.println(ch);
			i=i+1;
			if(i>ha.length()-1){
				flag =false;
			}
		}//2나눠담는것 까지 만듬
		
		
		int haha, aaa;
		aaa= 'A';
		haha= 0;
		
		if(ch == aaa) {
			haha =haha+1;
		}

		
	}

}
