package ch6;

import java.util.Scanner;	// Scanner 클래스 헤더
import java.util.Vector;	// Vector 클래스 헤더

public class VectorEx {	// Main 클래스
	public static void main(String[] args) {	// Main 메소드
		Scanner in = new Scanner(System.in);	// Scanner 객체 생성
		
		Vector<Integer> v = new Vector<Integer>();	// 정수 Vector 객체 생성
		
		int max = 0;	// 최댓값 초기화
		for(int i=0; i<10; i++){	// 	10번 반복 수행
			v.add(in.nextInt());	// 입력받은 정수를 차례로 vector에 저장
			if(v.get(i) > max)	// 해당 정수가 현재 최댓값보다 크면
				max = v.get(i);	// 새로운 최댓값으로 지정
		}
		System.out.println("최댓값은 " + max + "입니다.");	// 최댓값 출력
	}
}