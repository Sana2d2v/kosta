package day0213;

public class D011CharTest {

	public static void main(String[] args) {
		String data ="hello";
		char ch;
//문자열의 인덱스는 0부터 출발  지금 자긴 문자열의 길이는 5 이므로 -1 해 줘야함	
		
		int i;
		i=0;
		boolean flag = true ;
		
		while(flag) {
			ch = data.charAt(i);
			System.out.println(ch);
			i=i+1;
			if(i>data.length()-1){//1.길이 바꿔줌
				flag =false;
			
			}
		}
		
		
	}

}
