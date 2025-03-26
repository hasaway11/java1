package com.example.demo.day8_1;

// 접근제어자 : protected -> 자식은 접근가능
// 07번 예제 Show 클래스는 price라는 필드를 가지는데, 제대로 설계를 했다면 Show 클래스 개발자가
// "가격은 자식 객체에서 초기화되어야 한다"는 사실을 알것이다

class 신발 {
	// 어차피 자식이 초기화해야돼. 근데 자식의 접근을 왜 막지?
	//private int price;
	protected int price;
}

class Puma extends 신발 {
	String model;
	public Puma(int price, String model) {
		// 자식은 부모의 price에 접근할 수 있다
		this.price = price;
		this.model = model;
	}
}

public class 상속Test08 {
	public static void main(String[] args) {
		Puma 신발 = new Puma(100000, "나이트로3");
	}
}
