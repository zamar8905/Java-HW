///************ Circle Ŭ���� ************///

package ch6;

public class Circle {	// Circle Ŭ���� ����
	int x, y, radius;	// �ʵ� x,y,radius ����
	
	public Circle(int x, int y, int radius){	// Circle ������ ����
		this.x = x;	// �� �ʵ尪�� �Ű������� �ʱ�ȭ
		this.y = y;
		this.radius = radius;
	}
	
	public boolean equals(Circle o){	// equals�޼ҵ� ������
		if(radius == o.radius)	// �� ��ü�� radius�� ���� ������
			return true;	// ��
		else
			return false;	// ����
	}
}
