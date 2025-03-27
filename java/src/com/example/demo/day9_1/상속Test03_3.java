package com.example.demo.day9_1;

// override (오버라이드)
// 1. 부모로 자식을 다루자
// 2. 자식이 아닌 부모가 가진 메소드만 실행할 수 있다 
// 3. 부모의 메소드를 자식이 재정의하면 자식의 메소드가 실행되다
//    자식은 상속받은 부모의 run()과 자신의 run()을 가진다 -> 이때 자식의 run이 실행
class 탈것3 {
	void run() { System.out.println("부모의 run"); }
}
class Bus3 extends 탈것3 {
	void run() { System.out.println("버스가 달려갑니다"); }
}
class Taxi3 extends 탈것3 {
	void run() { System.out.println("택시가 달려갑니다"); }
}
class Airplane3 extends 탈것3{
	void run() { System.out.println("비행기가 날아갑니다"); }
}
public class 상속Test03_3 {
	public static void main(String[] args) {
		탈것3 v1 = new Bus3();
		탈것3 v2 = new Airplane3();
		v1.run();
		v2.run();
	}
}
