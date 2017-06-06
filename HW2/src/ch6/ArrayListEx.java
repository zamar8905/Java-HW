package ch6;

import java.util.ArrayList;	// ArrayList Ŭ���� ���
import java.util.Scanner;	// Scanner Ŭ���� ���

public class ArrayListEx {	// Main Ŭ����
	public static void main(String[] args) {	// Main �޼ҵ�
		Scanner in = new Scanner(System.in);	// Scanner ��ü ����
		
		ArrayList<String> a = new ArrayList<String>();	// ArrayList ����
		
		System.out.print("5���� ������ ��ĭ���� �и��Ͽ� �Է�(A/B/C/D/F)>>");
		for(int i=0; i<5; i++){	// 5�� �ݺ� ����
			a.add(in.next());	// ���� �Է��� ����
		}
		
		float[] score = new float[5];	// ���ڷ� ȯ��� ���� �迭
		
		int indexA = a.indexOf("A");	// A�� �ִ� �ε��� ����
			if(indexA != -1)
				score[indexA] = 4;	// �ش� �ε����� 4�� ����
		
		int indexB = a.indexOf("B");	// B�� �ִ� �ε��� ����
			if(indexB != -1)
				score[indexB] = 3;	// �ش� �ε����� 3�� ����
			
		int indexC = a.indexOf("C");	// C�� �ִ� �ε��� ����
			if(indexC != -1)
				score[indexC] = 2;	// �ش� �ε����� 2�� ����
			
		int indexD = a.indexOf("D");	// D�� �ִ� �ε��� ����
			if(indexD != -1)
				score[indexD] = 1;	// �ش� �ε����� 1�� ����

		int indexF = a.indexOf("F");	// F�� �ִ� �ε��� ����
			if(indexF != -1)
				score[indexF] = 0;	// �ش� �ε����� 0�� ����
		
		float sum = 0;
		for(int i=0; i<5; i++){	// 5�� �ݺ�����
			System.out.print(score[i] + " ");	// ȯ��� ���� ���
			sum += score[i];	// ���� �ջ�
		}
		
		System.out.println();
		System.out.println("��� ���� : " + sum/5);	// ��� ����
	}
}
