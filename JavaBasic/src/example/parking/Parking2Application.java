package example.parking;

import java.util.Scanner;

// 주차장 관리 프로그램

// 여유 공간 확인
// 입차
// 주차 확인
// 출차

// 데이터
// 차량번호, 차종, 주차공간, 층수, 입차 시간, 출차 시간, 요금

// 층수 10층, 층 당 30대, 경차: 1000, 중대형: 1500, SUV: 2000

// 장애인(임산부, 노약자, 유공자), 차량높이, 장기주차, 전기차, 주차시간당 할인, 제휴할인
class ParkingSpace {
	String registerNumber;
	int getInTime;
	String type;
}

public class Parking2Application {
	
	static final int LIGHT_FARE = 1000;
	static final int HEAVY_FARE = 1500;
	static final int SUV_FARE = 2000;
	
	static final ParkingSpace[][] PARKING_SPACES = new ParkingSpace[10][30];

	public static void main(String[] args) {
		
		while(true) {
			
			// -1 : 잘못된 값 / 0~5 : 정상
			int selectedMethod = input();
			if (selectedMethod == -1) continue;
			
			if (selectedMethod == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			if (selectedMethod == 1) {}
			if (selectedMethod == 2) {}
			if (selectedMethod == 3) {}
			if (selectedMethod == 4) {}
			if (selectedMethod == 5) {}
		}
		
	}
	
	static int input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("작업을 선택하세요. (1. 전체 주차공간 확인, 2. 층별 주차공간 확인, 3. 입차, 4. 차량확인, 5.출차, 0. 종료) : ");
		
		int selectedMethod = -1;
		try {
			selectedMethod = scanner.nextInt();
		} catch (Exception exception) {
			System.out.println("잘못된 입력입니다.");
			return -1;
		}
		
		boolean validInput = selectedMethod < 0 || selectedMethod > 5;
		if (validInput) {
			System.out.println("잘못된 입력입니다.");
			return -1;
		}
		
		return selectedMethod;
	}
	
	static void getAllFreeSpace() {
		// todo : 전체 여유공간 출력
	}
	
	static void getFloorFreeSpace() {
		// todo : 층별 여유공간 출력
	}
	
	static void enterCar() {
		// todo : 입차 처리
	}
	
	static void checkParking() {
		// todo : 주차 확인 
	}
	
	static void outCar() {
		// todo : 출차 처리
	}

}








