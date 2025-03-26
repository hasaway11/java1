package com.example.demo.day8_2;

// 부모없이 작업할 때 문제점
// 1. 동물병원을 고양이 예방접종, 강아지 예방접종을 따로 작성한다 

class 고양이1 {
	public void cry() { System.out.println("냐옹"); }
}
class 강아지1 {
	public void bark() { System.out.println("멍멍"); }
}

class 동물병원1 {
	public void 예방접종(고양이1 cat) { cat.cry(); }
	public void 예방접종(강아지1 dog) { dog.bark(); }
}

public class 상속Test12 {
	public static void main(String[] args) {
		동물병원1 h = new 동물병원1();
		h.예방접종(new 고양이1());
		h.예방접종(new 강아지1());
	}
}
