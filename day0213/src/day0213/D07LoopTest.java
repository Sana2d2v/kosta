package day0213;

public class D07LoopTest {

	public static void main(String[] args) {
		
		int i; 
		i =1;
		
		boolean flag = true;
	while (flag) {
		System.out.println("비비빅");
		i=i+1;
		if(i>5) {	//5번만 출력하기 i가 5가 됐을때 그만해. 라고 하기위해 펄스를 저장하기

			flag = false;
		}
	}
	}

}
