package day0213;

public class D04LoopTest {

	public static void main(String[] args) {
//화면에 비비빅이라는 문자열을 끝없이 채우는것 만들어보기 
		//System.out.println("비비빅");
		//이렇게만 하면 하나만 써지니까 조건식 만들어주기
		
		int i; //2.변수 선언
		i =1;
		
	while (i <= 3) {//3. 조건써주기   반복문의 한 종류 () 안에 조건식을 써 주면 됨
		System.out.println("비비빅");
		i=i+1;// 중괄호 안의 명령을 실행함 
		//참일때까지만 계속 반복? 
		//4.이 조건식을 만족하면 참  아니면 거짓. > D05에서 참거짓뭉ㄴ으로ㅓ 변형
	}
	}

}
