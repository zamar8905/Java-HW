package ch6;

import java.util.ArrayList;	// ArrayList 클래스 헤더
import java.util.Scanner;	// Scanner 클래스 헤더

public class ArrayListEx {	// Main 클래스
	public static void main(String[] args) {	// Main 메소드
		Scanner in = new Scanner(System.in);	// Scanner 객체 생성
		
		ArrayList<String> a = new ArrayList<String>();	// ArrayList 생성
		
		System.out.print("5개의 학점을 빈칸으로 분리하여 입력(A/B/C/D/F)>>");
		for(int i=0; i<5; i++){	// 5번 반복 수행
			a.add(in.next());	// 학점 입력후 저장
		}
		
		float[] score = new float[5];	// 숫자로 환산된 점수 배열
		
		int indexA = a.indexOf("A");	// A가 있는 인덱스 저장
			if(indexA != -1)
				score[indexA] = 4;	// 해당 인덱스에 4점 저장
		
		int indexB = a.indexOf("B");	// B가 있는 인덱스 저장
			if(indexB != -1)
				score[indexB] = 3;	// 해당 인덱스에 3점 저장
			
		int indexC = a.indexOf("C");	// C가 있는 인덱스 저장
			if(indexC != -1)
				score[indexC] = 2;	// 해당 인덱스에 2점 저장
			
		int indexD = a.indexOf("D");	// D가 있는 인덱스 저장
			if(indexD != -1)
				score[indexD] = 1;	// 해당 인덱스에 1점 저장

		int indexF = a.indexOf("F");	// F가 있는 인덱스 저장
			if(indexF != -1)
				score[indexF] = 0;	// 해당 인덱스에 0점 저장
		
		float sum = 0;
		for(int i=0; i<5; i++){	// 5번 반복수행
			System.out.print(score[i] + " ");	// 환산된 점수 출력
			sum += score[i];	// 점수 합산
		}
		
		System.out.println();
		System.out.println("평균 점수 : " + sum/5);	// 평균 도출
	}
}
