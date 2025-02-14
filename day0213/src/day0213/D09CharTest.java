package day0213;

public class D09CharTest {

	public static void main(String[] args) {
		String data ="heelo";
		//Char는 저런 String문자열에서 하나씩만 가져올때 쓰임. 
		//문자열 안에쇼ㅓ 뭐 i이 몇개인지 판별한다던지
		//문자열로부터 어떤 위치에 있는 글자를 가져오는 기능이 있음
		//1.첫번째만 가져와서 저장하는것 해보기.
		char first;
		first = data.charAt(0);//0번째 글자를 가져와서 저장하라는 뜻.
		System.out.println(first);
	}

}
