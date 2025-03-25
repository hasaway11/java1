package com.example.demo.day7_2;

class 계산기 {
	public int sum(int a, int b) {
		return a+b;
	}
}

class 계산기2 {
	// private 생성자로 객체 생성을 금지
	private 계산기2() {}
	public static int sum(int a, int b) {
		return a+b;
	}
}
public class NewStaticTest04 {
	public static void main(String[] args) {
		// 계산기 클래스의 객체를 만들어야 할까? 똑같은 객체가 여러개 있으면 안된다
		계산기 c1 = new 계산기();
		계산기 c2 = new 계산기();
		System.out.println(c1.sum(10, 20));
		System.out.println(c2.sum(10, 20));
		
		// 정적 메소드로 만들면 new없이 사용가능 
		System.out.println(계산기2.sum(10, 20));
	}
}
