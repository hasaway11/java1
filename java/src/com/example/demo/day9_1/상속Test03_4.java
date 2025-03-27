package com.example.demo.day9_1;

// 1. 부모로 자식을 다루자
// 2. 자식이 아닌 부모가 가진 메소드만 실행할 수 있다 
// -> 모든 자식들에 적용가능한 메소드를 어떻게 만들지? 못 만든다
//    지금도 "버스가 달려갑니다", "택시가 달려갑니다" -> "달려갑니다"
class 탈것4 {
	void run() { System.out.println("달려갑니다"); }
}
class Bus4 extends 탈것4 {
}
class Taxi4 extends 탈것4 {
}
class Airplane4 extends 탈것4{
}
public class 상속Test03_4 {
	public static void main(String[] args) {
		탈것4 v1 = new Bus4();
		탈것4 v2 = new Taxi4();
		v1.run();
		v2.run();
	}
}
