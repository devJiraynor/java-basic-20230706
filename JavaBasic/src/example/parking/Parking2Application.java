package example.parking;

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
		
	}

}
