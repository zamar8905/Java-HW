package ch6;

import java.util.Scanner;	// Scanner Ŭ���� ���
import java.util.Vector;	// Vector Ŭ���� ���

public class VectorEx {	// Main Ŭ����
	public static void main(String[] args) {	// Main �޼ҵ�
		Scanner in = new Scanner(System.in);	// Scanner ��ü ����
		
		Vector<Integer> v = new Vector<Integer>();	// ���� Vector ��ü ����
		
		int max = 0;	// �ִ� �ʱ�ȭ
		for(int i=0; i<10; i++){	// 	10�� �ݺ� ����
			v.add(in.nextInt());	// �Է¹��� ������ ���ʷ� vector�� ����
			if(v.get(i) > max)	// �ش� ������ ���� �ִ񰪺��� ũ��
				max = v.get(i);	// ���ο� �ִ����� ����
		}
		System.out.println("�ִ��� " + max + "�Դϴ�.");	// �ִ� ���
	}
}