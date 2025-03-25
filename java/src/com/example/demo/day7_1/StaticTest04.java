package com.example.demo.day7_1;

import lombok.AllArgsConstructor;

// 정적변수는 객체들이 공유하는 데이터
@AllArgsConstructor
class 국군 {
	String country;
	String name;
	// ....
}
@AllArgsConstructor
class 국군2 {
	// static은 모든 객체가 공유
	static String country ="대한민국";
	String name;
}
public class StaticTest04 {
	public static void main(String[] args) {
		// 모든 국군은 국적이 대한민국이다 -> 굳이 객체마다 저장할 필요가 없다
		// 객체마다 저장할 경우 객체들의 국적이 대한민국이 맞는 지 확인해야 한다
		국군 a = new 국군("대한민국","홍길동");
		국군 b = new 국군("대한민국","아이돌");
		
		국군2 x = new 국군2("홍길동");
		국군2 y = new 국군2("아이돌");
	}
}




