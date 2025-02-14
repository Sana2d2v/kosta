package day0213;

public class D019DoubleFloatTest {

	public static void main(String[] args) {
		double data1;
		data1 = 26.7;
		System.out.println(data1);
		
		float data2;
		//data2 = 26.7 ;이 더블형의 값을 형변환 시켜주면 됨
		//data2 =(float) 26.7 ;
		data2 =26.7f ;//플롯으로 처리해주ㅠㅓ, 의 다른 방법
		System.out.println(data2);
		
		float data3;
		//data3 = data1; 도 안됨. 더블을 플롯으로 변환해서 넣어 야함.
		data3 = (float)data1;
		System.out.println(data3);
		

	}

}
