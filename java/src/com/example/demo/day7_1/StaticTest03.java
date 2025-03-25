package com.example.demo.day7_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Sample3 {
	String name;
	int nai;
	public void 자기소개() {
		// this : 객체 자기 자신
		System.out.println(this.name + "입니다");
	}
}

public class StaticTest03 {
	public static void main(String[] args) {
		Sample3 a = new Sample3("홍길동", 20);
		Sample3 b = new Sample3("아이돌", 25);
		a.자기소개();
		b.자기소개();
	}
}
