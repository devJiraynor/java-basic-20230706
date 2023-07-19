package chapter3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Collection Framework
// 데이터를 저장하는 구조를 제공하는 표준화된 인터페이스 및 클래스
// 저장, 검색, 수정, 삭제에 대한 기능을 제공
// [List, Set, Map], Queue, Stack

public class CollectionFramework {

	public static void main(String[] args) {
		
		// List 인터페이스
		// 순서가 있고 중복을 허용하는 데이터 저장 구조를 표현할 때 사용
		
		// 1. ArrayList 구현체
		// 내부적인 인덱스를 사용하여 요소를 저장 - 인덱스로의 접근이 빠름
		List<Integer> arrayList = new ArrayList<Integer>(); // []
		
		// list에 데이터 추가 - add();
		arrayList.add(10); // [10]
		arrayList.add(12); // [10, 12]
		arrayList.add(1, 13);	// [10, 13, 12]
		// arrayList.add("10");
		System.out.println(arrayList);
		
		// list에 요소 불러오기 - get();
		System.out.println(arrayList.get(2));
		
		// list에 요소 수정하기 - set();
		arrayList.set(1, 100);	// [10, 100, 12]
		System.out.println(arrayList);
		// arrayList.set(4, 100);
		// System.out.println(arrayList);
		
		// list에 요소 삭제하기 - remove();
		arrayList.remove(0);
		System.out.println(arrayList);
		
		Integer element = 100;
		arrayList.remove(element);
		System.out.println(arrayList);
		
		// 2. LinkedList 구현체
		// 내부적인 이중 연결 리스트(요소와 요소의 관계가 맺어져있음)를 사용하여 요소를 저장 - 데이터 추가, 삭제가 빠름, 인덱스로의 접근이 느림
		List<Integer> linkedList = new LinkedList<>();
		
	}

}


