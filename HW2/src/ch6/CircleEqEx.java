///************ CircleEqEx Ŭ���� ************///

package ch6;

public class CircleEqEx {	// Main Class
	public static void main(String[] args) {	// Main �޼ҵ�
		Circle a = new Circle(1, 2, 3);	// CircleŸ���� ��ü a����, x/y/radius�� �ʱ�ȭ
		Circle b = new Circle(3, 7, 4);	// CircleŸ���� ��ü b����
		Circle c = new Circle(-1, 6, 3);	// CircleŸ���� ��ü c����
		
		if(a.equals(b))	// ��ü a�� b�� radius ��, ������ true
			System.out.println("a�� b�� �������� ���� ���̴�.");
		else 
			System.out.println("a�� b�� �������� �ٸ� ���̴�.");
		
		if(a.equals(c))	// ��ü a�� c�� radius ��, ������ true
			System.out.println("a�� c�� �������� ���� ���̴�.");
		else 
			System.out.println("a�� c�� �������� �ٸ� ���̴�.");
		
		if(b.equals(c))	// ��ü b�� c�� radius ��, ������ true
			System.out.println("b�� c�� �������� ���� ���̴�.");
		else 
			System.out.println("b�� c�� �������� �ٸ� ���̴�.");
	}
}
