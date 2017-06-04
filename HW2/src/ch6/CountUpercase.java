package ch6;

import java.util.Scanner;	// Scanner 클래스 헤더

public class CountUpercase {	// Main 클래스
	public static void main(String[] args) {	// Main 메소드
		Scanner in = new Scanner(System.in);	// Scanner 키보드 입력 스트림 생성
		
		String sample = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// 대문자 문자열 저장, 이후 판별을 위한 비교 가능
		int count = 0;	// 대문자의 개수를 카운팅하는 변수
		
		while(true){	// 반복 수행을 위한 while문
		String str = in.next();	// Scanner를 통해 키보드로 문자열 입력받은 후 str객체에 저장
		
		for(int i=0; i<str.length(); i++){	// 입력받은 문자열의 개수 만큼 반복
			if((sample.indexOf(str.charAt(i))) != -1)	
				// 첫 번째 문자부터 마지막 문자까지의 하나 씩 비교하여, 해당 문자가 sample에 존재하는지 판별
				// 만약 존재하지 않는다면 -1(소문자일 경우)
				// 존재한다면 양의정수 리턴(대문자일 경우)
					count++;	// 양의 정수가 리턴될 경우 if문이 참이므로, count++
		}
		
		System.out.println("대문자 개수는 " + count + "개 입니다.");
		System.out.println();
		count = 0;	// 다음 수행을 위한 초기화
		}
	}
}
