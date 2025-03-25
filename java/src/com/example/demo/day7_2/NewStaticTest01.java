package com.example.demo.day7_2;

// 클래스의 멤버 : 일반멤버(필드, 메소드)와 정적멤버(필드, 메소드) + 생성자
// 일반 멤버는 객체 소속, 정적 멤버는 클래스 소속으로 객체들이 공유
class Sample {
	int a;
	static int b;
	public void 일반메소드() {
	}
	public static void 정적메소드() {
	}
}
public class NewStaticTest01 {
	public static void main(String[] args) {
		// 정적멤버는 객체가 없어도 클래스 이름으로 사용할 수 있다
		System.out.println(Sample.b);
		Sample.정적메소드();
	}
}
