package com.example.demo.day8_2;

// 상속을 사용해야 하는 이유.
class 신발 {
}
class 나이키 extends 신발 {
}
class 아디다스 extends 신발 {
}
public class 상속Test11 {
	public static void main(String[] args) {
		// 부모의 참조변수는 자식을 가리킬 수 있다
		// a = 10
		// a = 3.14
		신발 obj = new 나이키();
		obj = new 아디다스();
		
		// 자식의 참조변수는 부모를 가리킬 수 없다
		나이키 nike = new 부모();
		
	}
}
