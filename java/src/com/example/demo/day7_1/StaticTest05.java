package com.example.demo.day7_1;

// 정적 변수 사용하기
public class StaticTest05 {
	public static void main(String[] args) {
		국군 a = new 국군("대한민국", "홍길동");
		System.out.println(a.country);
		
		국군2 x = new 국군2("홍길동");
		// 정적멤버는 객체 소속이 아니라 클래스 소속
		// 객체이름으로 정적멤버를 사용하면 경고가 출력
		System.out.println(x.country);
		
		// 정적멤버는 클래스 이름으로 접근한다
		// 정적멤버는 객체를 만들기 전에도 사용이 가능하다
		System.out.println(국군2.country);
	}
}
