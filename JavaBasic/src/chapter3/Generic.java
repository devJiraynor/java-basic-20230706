package chapter3;

class Result<Type> {
	int code;
	String message;
	String name;
	Type age;
	
	void print() {
		System.out.println("안녕");
	}
}

public class Generic {

	public static void main(String[] args) {
		Result<String> result = new Result<String>();

		result.age = 23;
		result.age = "23";
		
		
		
		
		
		
		
		
		
		
		
		
		
		int age = (Integer) result.age;
		System.out.println(age + 10);
	}

}
