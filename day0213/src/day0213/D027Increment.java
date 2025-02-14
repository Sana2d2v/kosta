package day0213;

public class D027Increment {

	public static void main(String[] args) {
		String data ="hello";
		char ch;
	
		
		int i;
		i=0;
		boolean flag = true ;//5
		
		while(flag) {
			ch = data.charAt(i);
			System.out.println(ch);
			//i=i+1; 를  i++로 바꿈
			i++;
			//++i 도 가능
			if(i>4){
				flag =false;
			
			}
		}
		
		
	}

}
