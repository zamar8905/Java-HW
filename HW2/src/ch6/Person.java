///************ Person 클래스 ************///

package ch6;

public class Person {	// Person 클래스 구현
	String name;	// 참가자 이름 객체
	private int[] randVal = new int[3];	// 3개의 난수를 저장할 정수배열
	
	public Person(String name){	// 생성자 초기화
		this.name = name;	// 참가자 이름 초기화
	}
	
	public void rand(){	// 난수 생성 메소드
		for(int i=0; i<3; i++){	// 3번 반복
			randVal[i] = (int)Math.round(Math.random()*3);	// 0~3사이 정수 생성 후 배열에 저장
			System.out.print(randVal[i] + " ");	// 배열값 출력
		}
	}
	public boolean compareNum(){	// 난수 비교 메소드
		if((randVal[0] == randVal[1]) 
				&& (randVal[0] == randVal[2])
					&& (randVal[1] == randVal[2]))
			// 3개의 난수가 모두 같으면
			return true;	// 참
		else 
			return false;	// 거짓
	}
}
