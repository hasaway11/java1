package com.example.demo.day7_2;

// 처리 클래스에서 static을 사용하면 객체를 생성하지 않고 작업할 수 있다
// 객체를 아예 안만드는 것도 문법적 제약이 있어 -> 객체를 1개만 만들자

class SingletonClass {
	// 1. 생성자는 private -> 객체 생성 금지
	//    싱글톤은 객체가 1개는 있어야 한다 -> 사용자는 못만든다 -> 내부에서 만들자
	private SingletonClass() { }
	// 2. 스스로 자신의 객체를 생성한다
	private static SingletonClass obj = new SingletonClass();
	// 3. 객체를 빌려주는 메소드를 추가
	public static SingletonClass getInstance() {
		return obj;
	}
}

public class SingletonTest02 {
	public static void main(String[] args) {
		
	}
}
