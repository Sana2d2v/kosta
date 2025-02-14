package day0213;

public class D014ByteTest {

	public static void main(String[] args) {
		byte data;
		data =127;//바잇이 표형 할 수있는 가장 큰 값 저장하기 
		//거기에 +1 하면 어떻게 되나 해보기 
		
		data = data +1 ; //C언어에선 오류가 안나고 돌아감. java는 그냥 오류남 
		//data +1의 결과는 byte의 범위를 넘기 때문에 오류가 발생한다
		System.out.println(data);
	}

}
