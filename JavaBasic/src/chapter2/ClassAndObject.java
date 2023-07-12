package chapter2;

// 클래스
// 특정한 객체에 대한 속성 및 기능을 정의
// 공통적인 속성 혹은 성질을 가진 대상을 정의한 것

// 클래스 선언 방법
// 접근제어자 class 클래스명 { 속성1, 속성2, ..., 기능1, 기능2, ... }

// 메서드 : 클래스가 행할 수 있는 작업 혹은 행동 및 기능을 정의하는 것
// 접근제어자 반환타입 메서드명(매개변수) { 로직 }

// 접근제어자 반환타입 메서드명(매개변수) : 선언부
// { 로직 } : 구현부

// 학생 : 학번, 이름, 나이, 전화번호, 수업, 성적 / 공부하다, 시험치다, 잠을자다
class Student {
	String studentNumber;
	String name;
	int age;
	String telNumber;
	String course;
	String grade;
	
	void study() {
		System.out.println(course + "를 공부한다.");
	}
	
	void test() {
		System.out.println(course + "를 시험친다.");
	}
	
	void sleep() {
		System.out.println("잠을 잔다.");
	}
}

// 수업 : 수업명, 담당교수, 학점, 이수구분 / 수업을 하다.
class Course {
	String courseName;
	String professor;
	int credit;
	String classification;
	
	void giveLecture() {
		System.out.println(professor + "가 " + courseName + "을 수업한다.");
	}
}

public class ClassAndObject {
	
	// method == function
	// x + 2 = f(x) (단, x는 정수) 
	int f(int x) {
		int y = x + 2;
		return y;
	}
	
	double add(double a, double b) {
		double result = a + b;
		return result;
	}
	
	double calculator(double a, String operator, double b) {
		
		double result = 0;
		
		if (operator == null) return result;
		if (!operator.equals("+") && !operator.equals("-") && 
				!operator.equals("*") && !operator.equals("/")) {
			return result;
		}
		
		if (operator.equals("+")) result = a + b;
		if (operator.equals("-")) result = a - b;
		if (operator.equals("*")) result = a * b;
		if (operator.equals("/")) result = a / b;
		
		return result;
	}

	public static void main(String[] args) {
		
	}

}