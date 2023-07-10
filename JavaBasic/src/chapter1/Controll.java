package chapter1;

// 제어문
// 프로그램의 흐름을 제어하고, 조건에 따라서 코드의 실행 여부를 결정하는 구문
public class Controll {

	public static void main(String[] args) {
		// 조건문
		// 특정 조건에 만족할 때 특정 코드를 실행하도록 하는 구문
		// if, else, switch
		
		// 1. if : 조건을 검사하여 해당 조건의 결과에 따라 실행 여부를 결정
		// if (조건) { 실행할 코드 }
		int age = 10;
		
		if (age > 19) {
			System.out.println("성인입니다.");
		}
		System.out.println("if문 외부");
		
		// 2. else : if문의 조건이 거짓일 경우 특정 코드 실행
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		
		int number = 0;
		if (number > 0)
			System.out.println("양수입니다.");
		else if (number < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
	}

}



