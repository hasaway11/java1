package com.example.demo.day9_1;

// 부모클래스를 만들어야 자식들을 함께 다룰 수 있다
// 의정부에서 인천공항을 간다 : 버스 -> 1호선 -> 공항철도
// 상속을 사용하지 않으면 버스는 버스, 지하철은 지하철, 공항철도는 공항철도 -> 함께 다룰수가 없다
class 탈것2 {
}
class Bus2 extends 탈것2 {
	void run() { System.out.println("버스가 달려갑니다"); }
}
class Taxi2 extends 탈것2 {
	void run() { System.out.println("택시가 달려갑니다"); }
}
public class 상속Test03_2 {
	public static void main(String[] args) {
		탈것2 v = new Bus2();
		// 부모는 자식을 가리킬 수 있다
		// 엄밀히 말하면 부모가 가리키는 것은 자식에 들어있는 "부모" 부분
		// 자식의 고유한 멤버에는 접근 불가능
		v.run();
	}
}
