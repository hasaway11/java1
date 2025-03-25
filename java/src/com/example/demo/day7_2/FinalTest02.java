package com.example.demo.day7_2;

// final 상수는 객체마다 존재 -> 값이 다를 수 있다 -> 생성자에서 초기화가능
class 예금 {
	final double 금리;
	예금(double 금리) {
		this.금리 = 금리;
	}
}
public class FinalTest02 {
	public static void main(String[] args) {
		예금 지난달통장 = new 예금(0.04);
		예금 이번달통장 = new 예금(0.03);
	}
}
