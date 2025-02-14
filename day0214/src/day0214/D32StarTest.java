package day0214;

import java.util.Scanner;

public class D32StarTest {
//사용자에게 이름 생월, 생일을 입력 받아 별자리를 판별하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name ,zodiac="";
		int mon, day ;
		
		System.out.print("이름을 입력하세요");
		name = sc.next();
		System.out.print("태어난 달을 입력하세요");
		mon = sc.nextInt();
		
		if(mon<1 || mon>12) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		
		System.out.println("태어난 일을 입력하세요");
		day = sc.nextInt();
		
		if(day<1 || day>31) {
			System.out.println("잘못된 입력입니다");
		return;
		}
		
			
		switch(mon) {
		case 1: if(day<=19) {zodiac="염소";}else {zodiac="물병";}break;
		case 2: if(day<=18) {zodiac="물병";}else {zodiac="물고기";}break;
		case 3: if(day<=20) {zodiac="물고기";}else {zodiac="양";}break;
		case 4: if(day<=19) {zodiac="양";}else {zodiac="황소";}break;
		case 5: if(day<=20) {zodiac="황소";}else {zodiac="쌍둥이";}break;
		case 6: if(day<=21) {zodiac="쌍둥이";}else {zodiac="게";}break;
		case 7: if(day<=22) {zodiac="게";}else {zodiac="사자";}break;
		case 8: if(day<=22) {zodiac="사자";}else {zodiac="처녀";}break;
		case 9: if(day<=23) {zodiac="처녀";}else {zodiac="천칭";}break;
		case 10: if(day<=22) {zodiac="천칭";}else {zodiac="전갈";}break;
		case 11: if(day<=22) {zodiac="전갈";}else {zodiac="사수";}break;
		case 12: if(day<=24) {zodiac="사수";}else {zodiac="염소";}break;
		}

		System.out.printf("%s님은 %s자리입니다", name, zodiac);
	}

}
