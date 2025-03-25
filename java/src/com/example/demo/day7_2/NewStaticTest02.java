package com.example.demo.day7_2;

// 객체는 크게 데이터를 저장하는 객체(Value Object)와 데이터를 처리하는 객체
// 데이터를 저장하는 객체는 여러개 존재한다
// 데이터를 처리하는 클래스는 보통 여러개 필요없다
class Sample02 {
	private Sample02() { }
}
public class NewStaticTest02 {	
	public static void main(String[] args) {
		// 처리하는 클래스는 객체를 만들지 말고 클래스 상태로 사용하자
		System.out.println(Math.floor(3.7));
		System.out.println(Math.random());
	}
}
