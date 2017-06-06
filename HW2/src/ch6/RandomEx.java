package ch6;

import java.util.Scanner;	// Scanner 클래스 헤더

public class RandomEx {	// Main 클래스
	public static void main(String[] args) {	// Main 메소드
		Scanner in = new Scanner(System.in);	// Scanner 클래스 생성
		
		while(true){
			int MyNum = 0;	// 나의 가위, 바위, 보 변수
			int ComNum = 0;	// 컴퓨터의 가위, 바위, 보 변수
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>>");
			MyNum = in.nextInt();	// Scanner 객체를 통한 정수 입력
			if(MyNum == 4){	// 만약 입력받은 숫자가 4이면,
				System.out.println("P/G을 종료합니다.");	
				break;	// 반복문 나가기
			}
			
			ComNum = (int)Math.round((Math.random()*2)+1);
			// 난수 생성 (컴퓨터의 가위, 바위, 보 변수 값 저장)
			// random()매소드를 통해 1.0~2.99999의 실수를 얻어내고,
			// 이후 round()메소드를 통해 반올림하여 1~3 사이의 정수를 만들어낸다.
			
			if((MyNum == 1) && (ComNum == 2)){	// 나 : 가위, 컴 : 바위
				System.out.println("컴퓨터는 바위를 냈습니다.");	// 바위
				System.out.println("당신이 졌습니다.");	// 컴퓨터의 승리
			}
			if((MyNum == 1) && (ComNum == 3)){	// 나 : 가위, 컴 : 보
				System.out.println("컴퓨터는 보를 냈습니다.");	// 보
				System.out.println("당신이 이겼습니다.");	// 나의 승리
			}
			if((MyNum == 2) && (ComNum == 1)){	// 나 : 바위, 컴 : 가위
				System.out.println("컴퓨터는 가위를 냈습니다.");	// 가위
				System.out.println("당신이 이겼습니다.");	// 나의 승리
			}
			if((MyNum == 2) && (ComNum == 3)){	// 나 : 바위, 컴 : 보
				System.out.println("컴퓨터는 보를 냈습니다.");	// 보
				System.out.println("당신이 졌습니다.");	// 컴퓨터의 승리
			}
			if((MyNum == 3) && (ComNum == 1)){	// 나 : 보, 컴 : 가위
				System.out.println("컴퓨터는 가위를 냈습니다.");	// 가위
				System.out.println("당신이 졌습니다.");	// 컴퓨터의 승리
			}
			if((MyNum == 3) && (ComNum == 2)){	// 나 : 보, 컴 : 바위
				System.out.println("컴퓨터는 바위를 냈습니다.");	// 바위
				System.out.println("당신이 이겼습니다.");	// 나의 승리
			}
			if(MyNum == ComNum)	// 나와 컴이 낸 숫자가 같으면
				System.out.println("서로 비겼습니다.");	// 서로 비김
				
			System.out.println();
		}
	}
}
