///************ GamblingEx 클래스 ************///

package ch6;

import java.io.IOException;	// 입출력 에러 제어 헤더
import java.io.InputStreamReader;	// InputStramReader 클래스 헤더
import java.util.Scanner;	// Scanner 클래스 헤더

public class GamblingEx {	// Main 클래스
	public static void main(String[] args) {	// Main 메소드
		Scanner in = new Scanner(System.in);	// Scanner 객체 생성
		System.out.print("갬블링 첫 번째 참가자 이름>>");
		String name1 = in.next();	// 첫 번째 참가자 이름 입력
		System.out.print("갬블링 두 번째 참가자 이름>>");
		String name2 = in.next();	// 두 번째 참가자 이름 입력
				
		Person a = new Person(name1);	// 첫 번째 참가자 객체 생성, 이름 초기화
		Person b = new Person(name2);	// 두 번째 참가자 객체 생성, 이름 초기화
		
		try{	
		InputStreamReader enterA = new InputStreamReader(System.in);	// 첫 번째 참가자의 엔터 입력을 위한 객체
		System.out.print(a.name + "차례입니다. <Enter> 키 입력>>");
		int turnA = enterA.read();	// 첫 번째 참가자 키 입력
			if(turnA == 13)	// 키가 엔터이면(아스키코드 13번)
				a.rand();	// 난수 발생 메소드 호출
		System.out.println();	
		
		InputStreamReader enterB = new InputStreamReader(System.in);	// 두 번째 참가자의 엔터 입력을 위한 객체
		System.out.print(b.name + "차례입니다. <Enter> 키 입력>>");
		int turnB = enterB.read();	// 두 번째 참가자 키 입력
			if(turnB == 13)	// 키가 엔터이면(아스키코드 13번)
				b.rand(); 	// 난수 발생 메소드 호출
		System.out.println();	

		}catch(IOException e){
			System.out.println("입/출력 에러 발생");
		}
		finally{
			if((a.compareNum() == true) && (b.compareNum() == false))	// 첫 번째 참가자의 난수 3개가 모두 같으면
				System.out.println(a.name + "님이 이겼습니다.");	// 첫 번째 참가자의 승리
			else if((a.compareNum() == false) && (b.compareNum() == true))	// 두 번째 참가자의 난수 3개가 모두 같으면
				System.out.println(b.name + "님이 이겼습니다.");	// 두 번째 참가자의 승리
			else if((a.compareNum() == true) && (b.compareNum() == true))	// 참가자 모두 난수 3개가 같으면
				System.out.println("승자가 없습니다.");	// 승자 없음
			else	// 혹은 참가자 모두 난수가 다르면
				System.out.println("승자가 없습니다.");	// 승자 없음
		}
	}
}
