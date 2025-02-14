package day0213;

public class D043BitlogicalDiff {

	public static void main(String[] args) {
		int age1 = 28;
		int age2=29;
		//이 두사람이 모두 내년에 30대가 되는지 판별하기.
		if(++age1 >= 30 & ++age2>= 30) {
			System.out.println("두 사람 모두 내년에 30대 입니다.");
		}else {
			System.out.println("두 사람 모두 내년에 30대가 아닐 수 있다.");
		}
	
		System.out.println("age1:"+age1);
		System.out.println("age2:"+age2);
		
	}

}
