package ch6;

import java.util.Scanner;	// Scanner Ŭ���� ���

public class RandomEx {	// Main Ŭ����
	public static void main(String[] args) {	// Main �޼ҵ�
		Scanner in = new Scanner(System.in);	// Scanner Ŭ���� ����
		
		while(true){
			int MyNum = 0;	// ���� ����, ����, �� ����
			int ComNum = 0;	// ��ǻ���� ����, ����, �� ����
			System.out.print("����(1), ����(2), ��(3), ������(4) �� �ϳ��� �����ϼ���>>");
			MyNum = in.nextInt();	// Scanner ��ü�� ���� ���� �Է�
			if(MyNum == 4){	// ���� �Է¹��� ���ڰ� 4�̸�,
				System.out.println("P/G�� �����մϴ�.");	
				break;	// �ݺ��� ������
			}
			
			ComNum = (int)Math.round((Math.random()*2)+1);
			// ���� ���� (��ǻ���� ����, ����, �� ���� �� ����)
			// random()�żҵ带 ���� 1.0~2.99999�� �Ǽ��� ����,
			// ���� round()�޼ҵ带 ���� �ݿø��Ͽ� 1~3 ������ ������ ������.
			
			if((MyNum == 1) && (ComNum == 2)){	// �� : ����, �� : ����
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");	// ����
				System.out.println("����� �����ϴ�.");	// ��ǻ���� �¸�
			}
			if((MyNum == 1) && (ComNum == 3)){	// �� : ����, �� : ��
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");	// ��
				System.out.println("����� �̰���ϴ�.");	// ���� �¸�
			}
			if((MyNum == 2) && (ComNum == 1)){	// �� : ����, �� : ����
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");	// ����
				System.out.println("����� �̰���ϴ�.");	// ���� �¸�
			}
			if((MyNum == 2) && (ComNum == 3)){	// �� : ����, �� : ��
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");	// ��
				System.out.println("����� �����ϴ�.");	// ��ǻ���� �¸�
			}
			if((MyNum == 3) && (ComNum == 1)){	// �� : ��, �� : ����
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");	// ����
				System.out.println("����� �����ϴ�.");	// ��ǻ���� �¸�
			}
			if((MyNum == 3) && (ComNum == 2)){	// �� : ��, �� : ����
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");	// ����
				System.out.println("����� �̰���ϴ�.");	// ���� �¸�
			}
			if(MyNum == ComNum)	// ���� ���� �� ���ڰ� ������
				System.out.println("���� �����ϴ�.");	// ���� ���
				
			System.out.println();
		}
	}
}
