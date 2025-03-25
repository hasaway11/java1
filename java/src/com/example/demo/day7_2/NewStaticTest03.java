package com.example.demo.day7_2;

// 정적멤버는 정적멤버끼리만 접근가능
// 일반멤버는 모두 접근가능
class Sample03 {
	int 일반필드;
	static int 정적필드;
	public void 일반메소드() {
		System.out.println(정적필드);
		System.out.println(일반필드);
	}
	public static void 정적메소드() {
		System.out.println(정적필드);
//		System.out.println(일반필드);    접근 불가
	}
}
public class NewStaticTest03 {
	public static void main(String[] args) {
		// 정적멤버는 객체없이도 사용가능, 일반멤버는 객체를 new해야 사용가능
		// 정적멤버가 먼저 존재(형, 누나) -
		// 일반멤버는 동생 -> 동생이 태어났을 때 형,누나는 반드시 존재

	}
}
