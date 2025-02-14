package day0213;

public class D015ByteTest {

	public static void main(String[] args) {
		byte data;
		data =127;
		
		data = (byte)(data +1) ;//강제 형변환시키면 오류안남
		//바잇이 표현 할 수 있는 가장 작은 수 -128이 되어버림 
		//싸이클처럼 연결되어있기때문 ==> 오버플로우가 발생되었다.
		//양의 범우ㅠㅣ가 넘치는 현상===> overflow
		//음의 범위를 넘치는 현상 ==>underflow
		System.out.println(data);
	}

}
