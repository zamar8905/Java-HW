package ch6;

public class CircleEqEx {	// Main Class
	public static void main(String[] args) {	// Main 메소드
		Circle a = new Circle(1, 2, 3);	// Circle타입의 객체 a생성, x/y/radius로 초기화
		Circle b = new Circle(3, 7, 4);	// Circle타입의 객체 b생성
		Circle c = new Circle(-1, 6, 3);	// Circle타입의 객체 c생성
		
		if(a.equals(b))	// 객체 a와 b의 radius 비교, 같으면 true
			System.out.println("a와 b는 반지름이 같은 원이다.");
		else 
			System.out.println("a와 b는 반지름이 다른 원이다.");
		
		if(a.equals(c))	// 객체 a와 c의 radius 비교, 같으면 true
			System.out.println("a와 c는 반지름이 같은 원이다.");
		else 
			System.out.println("a와 c는 반지름이 다른 원이다.");
		
		if(b.equals(c))	// 객체 b와 c의 radius 비교, 같으면 true
			System.out.println("b와 c는 반지름이 같은 원이다.");
		else 
			System.out.println("b와 c는 반지름이 다른 원이다.");
	}
}
