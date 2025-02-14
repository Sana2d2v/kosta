package day0214;

public class D33StringPlus {

	public static void main(String[] args) {
		String data = "";
		data = data+"hello";//복합치환연산자
		System.out.println(data);
		data+= " korea";//문자열을 누적할 땐 앞에 빈공간을 주는게 좋음
		System.out.println(data);
	}

}
