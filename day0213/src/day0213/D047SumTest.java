package day0213;


//1에서 10까지의 합을 누적하여 출력하는 프로구ㅡ램
public class D047SumTest {

	public static void main(String[] args) {
		int i =1; //
		int sum =0;//합을 누적하여 저장할 변수
		//계속 할건지 말건지 불린의 플래그를 주고 트루로 줌
		boolean flag = true;
		
		while (flag) {
			sum += i;
			i++; //반복문은 썼고 10까지만 작동하도록 만들어야함 
		if(i>10) {
			flag = false;
		}}
        System.out.println(sum);
	}
	
}
