package com.example.demo.day8_2;

// 상속예제 11에 이어서 부모없이 작업할 때 문제점
// 1. 동물병원을 고양이 예방접종, 강아지 예방접종을 따로 작성한다
// 2. 코드의 변경이 다른 클래스의 변경을 요구한다 -> 전염병처럼 연속적으로 변경될 수 있다 -> 13번

// =====================================================
class 고양이3 {
	public void cry() { System.out.println("냐옹"); }
}
class 강아지3 {
	public void bark() { System.out.println("멍멍"); }
}
// 동물쪽에 소를 추가
class 소3 {
	public void cry() { System.out.println("음메~~~~"); }
}
//=====================================================



//=====================================================
class 동물병원3 {
	public void 예방접종(고양이3 cat) { cat.cry(); }
	public void 예방접종(강아지3 dog) { dog.bark(); }
	// 동네사람이 소를 샀다 -> 병원쪽에서 기능을 업데이트해야 한다 -> 매우 바람직하지 않다
}
//=====================================================

public class 상속Test14 {
	public static void main(String[] args) {
		동물병원3 h = new 동물병원3();
		h.예방접종(new 고양이3());
		h.예방접종(new 강아지3());
	}
}
