package com.example.demo.day8_1;

import lombok.AllArgsConstructor;

// 06에서는 접근제어자를 생략
// 접근제어자(access modifier)를 적용하자

// 06 예제의 문제점
// 신발 클래스가 스스로 초기화하지 않고, 자식에서 초기화(this.price=price)
// 신발 클래스는 불완전한 클래스

@AllArgsConstructor
class Shoe {
	private int price;
}

class NewBalance extends Shoe {
	private String model;
	
	public NewBalance(int price, String model) {
		// 부모 필드의 초기화는 부모 생성자가 담당
		super(price);
		this.model = model;
	}
}

public class 상속Test07 {
	public static void main(String[] args) {
		NewBalance shoe = new NewBalance(100000, "574");
	}
}
