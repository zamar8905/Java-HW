///************ Person Ŭ���� ************///

package ch6;

public class Person {	// Person Ŭ���� ����
	String name;	// ������ �̸� ��ü
	private int[] randVal = new int[3];	// 3���� ������ ������ �����迭
	
	public Person(String name){	// ������ �ʱ�ȭ
		this.name = name;	// ������ �̸� �ʱ�ȭ
	}
	
	public void rand(){	// ���� ���� �޼ҵ�
		for(int i=0; i<3; i++){	// 3�� �ݺ�
			randVal[i] = (int)Math.round(Math.random()*3);	// 0~3���� ���� ���� �� �迭�� ����
			System.out.print(randVal[i] + " ");	// �迭�� ���
		}
	}
	public boolean compareNum(){	// ���� �� �޼ҵ�
		if((randVal[0] == randVal[1]) 
				&& (randVal[0] == randVal[2])
					&& (randVal[1] == randVal[2]))
			// 3���� ������ ��� ������
			return true;	// ��
		else 
			return false;	// ����
	}
}
