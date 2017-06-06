///************ Circle 클래스 ************///

package ch6;

public class Circle {	// Circle 클래스 구현
	int x, y, radius;	// 필드 x,y,radius 선언
	
	public Circle(int x, int y, int radius){	// Circle 생성자 구현
		this.x = x;	// 각 필드값을 매개변수로 초기화
		this.y = y;
		this.radius = radius;
	}
	
	public boolean equals(Circle o){	// equals메소드 재정의
		if(radius == o.radius)	// 두 객체간 radius가 서로 같으면
			return true;	// 참
		else
			return false;	// 거짓
	}
}
