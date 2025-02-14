package day0213;

public class D010CharTest {

	public static void main(String[] args) {
		String data ="hello";
		char ch;
		//first = data.charAt(0);  < 여기 0자리를 바꿔줘서
		//System.out.println(first); 이 두개의 명령을 반복하고싶음 와일문 써보기
		
		int i;//2.변수를 선언해서 
		i=0;
		boolean flag = true ;//5
		
		while(flag) {//1.0을 변수로 바꿔줘야함
			ch = data.charAt(i);//0을 i로ㅓ 바꿈
			System.out.println(ch);
			i=i+1;//3.식 만들어주기 
			//4.이렇게하면 끝없이 반복되므로 
			if(i>4){//6
				flag =false;
			
			}
		}
		
		
	}

}
