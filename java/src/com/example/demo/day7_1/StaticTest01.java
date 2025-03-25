package com.example.demo.day7_1;

// 클래스 : 객체의 설계도
// 객체를 생성하면 클래스를 복사뜬다
class Sample {
	int count;
	int 개수;
	Sample() {
		// 객체의 개수를 알고싶다
		개수++;
	}
}

public class StaticTest01 {
	public static void main(String[] args) {
		Sample a = new Sample();
		Sample b = new Sample();
		
		// 각 객체는 자신만의 필드를 가진다
		a.count = 10;
		b.count = 20;
		
		System.out.println(a.개수);		// 1
		System.out.println(b.개수);		// 1   개수를 셀 수가 없다
	}
}
