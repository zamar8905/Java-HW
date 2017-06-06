///************ GamblingEx Ŭ���� ************///

package ch6;

import java.io.IOException;	// ����� ���� ���� ���
import java.io.InputStreamReader;	// InputStramReader Ŭ���� ���
import java.util.Scanner;	// Scanner Ŭ���� ���

public class GamblingEx {	// Main Ŭ����
	public static void main(String[] args) {	// Main �޼ҵ�
		Scanner in = new Scanner(System.in);	// Scanner ��ü ����
		System.out.print("���� ù ��° ������ �̸�>>");
		String name1 = in.next();	// ù ��° ������ �̸� �Է�
		System.out.print("���� �� ��° ������ �̸�>>");
		String name2 = in.next();	// �� ��° ������ �̸� �Է�
				
		Person a = new Person(name1);	// ù ��° ������ ��ü ����, �̸� �ʱ�ȭ
		Person b = new Person(name2);	// �� ��° ������ ��ü ����, �̸� �ʱ�ȭ
		
		try{	
		InputStreamReader enterA = new InputStreamReader(System.in);	// ù ��° �������� ���� �Է��� ���� ��ü
		System.out.print(a.name + "�����Դϴ�. <Enter> Ű �Է�>>");
		int turnA = enterA.read();	// ù ��° ������ Ű �Է�
			if(turnA == 13)	// Ű�� �����̸�(�ƽ�Ű�ڵ� 13��)
				a.rand();	// ���� �߻� �޼ҵ� ȣ��
		System.out.println();	
		
		InputStreamReader enterB = new InputStreamReader(System.in);	// �� ��° �������� ���� �Է��� ���� ��ü
		System.out.print(b.name + "�����Դϴ�. <Enter> Ű �Է�>>");
		int turnB = enterB.read();	// �� ��° ������ Ű �Է�
			if(turnB == 13)	// Ű�� �����̸�(�ƽ�Ű�ڵ� 13��)
				b.rand(); 	// ���� �߻� �޼ҵ� ȣ��
		System.out.println();	

		}catch(IOException e){
			System.out.println("��/��� ���� �߻�");
		}
		finally{
			if((a.compareNum() == true) && (b.compareNum() == false))	// ù ��° �������� ���� 3���� ��� ������
				System.out.println(a.name + "���� �̰���ϴ�.");	// ù ��° �������� �¸�
			else if((a.compareNum() == false) && (b.compareNum() == true))	// �� ��° �������� ���� 3���� ��� ������
				System.out.println(b.name + "���� �̰���ϴ�.");	// �� ��° �������� �¸�
			else if((a.compareNum() == true) && (b.compareNum() == true))	// ������ ��� ���� 3���� ������
				System.out.println("���ڰ� �����ϴ�.");	// ���� ����
			else	// Ȥ�� ������ ��� ������ �ٸ���
				System.out.println("���ڰ� �����ϴ�.");	// ���� ����
		}
	}
}
