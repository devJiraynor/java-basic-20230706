package example.parking;

import java.util.Scanner;

// 주차장 관리 프로그램
// 주차 등록
// 주차 확인
// 출차

// 데이터
// 차량번호, 차종, 주차공간, 층수, 입차 시간, 출차 시간, 요금, 차량수

// 층수 10층, 층 당 30대, 경차: 1000, 중대형: 1500, SUV: 2000
// 장애인(임산부, 노약자, 유공자), 차량높이, 장기주차, 전기차, 주차시간당 할인, 제휴할인
public class ParkingApplication {
	
	public static void main(String[] args) {
		
		// 주차 공간
		boolean[][] parkingSpaces = new boolean[10][30];
		// 주차한 차량 번호
		String[][] registerNumberes = new String[10][30];
		// 입차 시간
		int[][] getInTimes = new int[10][30];
		// 차종
		String[][] types = new String[10][30];
		
		// 전체 여유 공간
		int totalFreeSpace = 0;
		for (boolean[] layer: parkingSpaces) {
			for (boolean space: layer) {
				if (!space) totalFreeSpace++;
			}
		}
		
		System.out.println("여유 공간 : " + totalFreeSpace);
		
		// 층별 여유 공간
		int[] layerFreeSpaces = new int[10];
		for (int layer = 0; layer < parkingSpaces.length; layer++) {
			for (boolean space: parkingSpaces[layer]) {
				if (!space) layerFreeSpaces[layer]++;
			}
		}
		
		for (int layer = 0; layer < layerFreeSpaces.length; layer++) {
			System.out.println(layer + 1 + "층 여유 공간 : " + layerFreeSpaces[layer]);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		// 입차
		
		System.out.print("차량 번호 : ");
		String registerNumber = scanner.nextLine();
		
		System.out.print("차종 : ");
		String type = scanner.nextLine();

		System.out.print("입차 시간 (0 ~ 24) : ");
		int getInTime = scanner.nextInt();
		
		System.out.print("주차 층 (0 ~ 9) : ");
		int parkingLayer = scanner.nextInt();
		
		System.out.print("주차 공간 (0 ~ 29) : ");
		int parkingSpace = scanner.nextInt();
	}

}



