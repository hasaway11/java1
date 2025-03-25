package com.example.demo.day7_1;

// 필드의 초기화 순서
// 1. 인스턴스 초기화 
//    - 밑에 value처럼 필드를 만들면서 바로 값을 준다
//    - 인스턴스 초기화를 하면 모든 객체는 일단 같은 값으로 출발
// 2. 뭔가 있다
// 3. 생성자
class Sample2 {
	// 필드를 0으로 초기화된다
	int count;
	int value = 10;
	Sample2() {
		count++;
	}
}
public class StaticTest02 {
	public static void main(String[] args) {
		Sample2 a = new Sample2();
		System.out.println(a.count);
	}
}
