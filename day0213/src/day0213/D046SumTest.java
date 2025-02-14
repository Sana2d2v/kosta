package day0213;

public class D046SumTest {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		//sum = sum +i; 아래와 같이 쓰기 가능 sum더하기i의 결과를 썸에 저장하라. 
		sum += i;
		i = i +1; 
		
		sum += i; 
		//i = i +1;
		i++;
		
		sum += i;
		System.out.println("i:"+i);
		System.out.println("sum:"+sum);
	}

}
