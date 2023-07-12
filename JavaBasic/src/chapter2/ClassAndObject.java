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
		
		// 객체
		// 클래스로 생성된 실체, 클래스에서 정의한 필드와 메서드를 가기고 있음
		// 특정 클래스로 생성된 객체를 '특정 클래스의 인스턴스'라고 부름
		// 클래스로 생성된 각각의 인스턴스는 서로 다른 속성 값을 가지고 있음
		
		// 객체 (인스턴스) 생성 방법
		// 생성하고자하는 형태의 클래스로 참조변수를 선언하고
		// 해당 참조변수에 new 클래스(); 를 이용하여 생성한 인스턴스의 주소를 저장
		
		// 클래스명 참조변수명 = new 클래스명();
		Student gildong = new Student();
		gildong.studentNumber = "1223020";
		gildong.name = "홍길동";
		gildong.age = 24;
		gildong.telNumber = "010-1111-1111";
		gildong.course = "경영학";
		gildong.grade = "A+";
		
		gildong.study();
		gildong.test();
		gildong.sleep();
		
		Student chulsoo = new Student();
		chulsoo.studentNumber = "2323110";
		chulsoo.name = "김철수";
		chulsoo.age = 20;
		chulsoo.telNumber = "010-2222-2222";
		chulsoo.course = "회계원리";
		chulsoo.grade = "B+";
		
		chulsoo.test();
		
		System.out.println(gildong.name);
		System.out.println(chulsoo.name);
		
		// 각각의 인스턴스는 독립적인 속성을 가지고 있음
		// 독립적인 속성 : 인스턴스 변수
		gildong.name = "홍동길";
		System.out.println(gildong.name);
		System.out.println(chulsoo.name);
		
	}

}








