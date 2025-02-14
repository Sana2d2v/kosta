package day0213;

public class D038BitOperation {
	public static void main(String[] args) {
		int a =3;//3을 2진수로 바꾸면 11 >0011
		int b =7;//7은 0111
		
		int i = a & b; //0011 > 10진수로 3
		int j = a | b;//0111 > 10진수로 7
		int k = a ^ b;//0100 > 10진수로 변환하면 4
		
		System.out.println("i:"+i);
		System.out.println("j:"+j);
		System.out.println("k:"+k);
	}
}
