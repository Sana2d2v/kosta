package day0214;


import java.util.Date;
import java.util.Scanner;


/*
사용자 한테 이름, 출생연도, 성별을 입력받아 무료암검진 대상자 인지 
판별하는 프로그램을 작성합니다.


< 처리조건 >
무료암검진 대상자는 나이가 40세 이상이고 그 해가 홀수연도 이면 홀수연도에 태어나고
그 해가 짝수연도 이면 짝수연도에 태어난 사람입니다.
또 성별별로 나이별로 검진항목은 다음과 같습니다.
40세 이상 남자이면 위암,간암
40세 이상 여자이면 위암,간암,유방암,자궁암
50세 이상 남자이면 위암,간암,대장암
50세 이상 여자이면 위암,간암,대장암,유방암,자궁암


< 실행 예 >
이름을 입력하시오==> 임연수
출생연도 ==> 2002
성별[남자:1,여자:2]==>2
임연수님은 올해(2025)년 ___살이며 무료암검진 대상자가 아닙니다.


이름을 입력하시오==> 홍길동
출생연도 ==> 1971
성별[남자:1,여자:2]==>1
홍길동님은 올해(2025)년 ___살이며 무료암검진 대상자입니다.
검진항목은 위암 간암 대장암입니다.
 */


public class D36CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, result="위암 간암";
		String gender;
		int userYear, age, thisYear;
		Date today = new Date();
		thisYear = today.getYear()+1900;
		
		System.out.print("이름을 입력하시오==>");
		name = sc.next();
		System.out.print("출생연도를 입력하시오==>");
		userYear = sc.nextInt();		
		System.out.print("성별을 입력[남자,여자]");
		gender = sc.next();
		
		if(gender.equals("남자") || gender.equals("여자")) {	
			age = thisYear - userYear;
			
			if(age < 40  ||  thisYear % 2  != userYear % 2  ) {
				System.out.printf("%s님은 올해(%d)년 %d살이며 무료암검진 대상자가 아닙니다.",
						name,thisYear,age);
				return;
			}
			
			if(age >= 50) {
				result += " 대장암";					
			}
			
			if(gender.equals("여자")) {
				result += " 유방암 자궁암";
			}
			
			System.out.printf("%s님은 올해(%d)년 %d살이며 무료암검진 대상자입니다.\n",
					name,thisYear,age);
			System.out.printf("검진항목은 %s입니다.",result);
		}
	}
}


