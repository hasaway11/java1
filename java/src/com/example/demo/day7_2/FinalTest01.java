package com.example.demo.day7_2;

// final : 변경금지 -> 필드, 메소드, 클래스 모두 사용가능
//                   필드에 사용하면 상수(변경금지)

// 리터럴하고는 뭐가 다르지? 리터럴은 이름없는 상수, final은 이름있는 상수

class 해병 {
	// final 변수는 반드시 값을 줘야 한다
	final int fullHP;
}
public class FinalTest01 {
	public static void main(String[] args) {
		해병 a = new 해병();
		해병 b = new 해병();
		// a.fullHP, b.fullHP가 따로 있다
		System.out.println(a.fullHP);
		System.out.println(b.fullHP);
	}
}
