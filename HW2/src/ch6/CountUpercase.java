package ch6;

import java.util.Scanner;	// Scanner Ŭ���� ���

public class CountUpercase {	// Main Ŭ����
	public static void main(String[] args) {	// Main �޼ҵ�
		Scanner in = new Scanner(System.in);	// Scanner Ű���� �Է� ��Ʈ�� ����
		
		String sample = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// �빮�� ���ڿ� ����, ���� �Ǻ��� ���� �� ����
		int count = 0;	// �빮���� ������ ī�����ϴ� ����
		
		while(true){	// �ݺ� ������ ���� while��
		String str = in.next();	// Scanner�� ���� Ű����� ���ڿ� �Է¹��� �� str��ü�� ����
		
		for(int i=0; i<str.length(); i++){	// �Է¹��� ���ڿ��� ���� ��ŭ �ݺ�
			if((sample.indexOf(str.charAt(i))) != -1)	
				// ù ��° ���ں��� ������ ���ڱ����� �ϳ� �� ���Ͽ�, �ش� ���ڰ� sample�� �����ϴ��� �Ǻ�
				// ���� �������� �ʴ´ٸ� -1(�ҹ����� ���)
				// �����Ѵٸ� �������� ����(�빮���� ���)
					count++;	// ���� ������ ���ϵ� ��� if���� ���̹Ƿ�, count++
		}
		
		System.out.println("�빮�� ������ " + count + "�� �Դϴ�.");
		System.out.println();
		count = 0;	// ���� ������ ���� �ʱ�ȭ
		}
	}
}
