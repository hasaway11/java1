package com.example.demo.day9_1;

import lombok.AllArgsConstructor;

// 한국타이어, 금호타이어 클래스를 작성하시오
// 한국타이어나 금호타이어를 낀 자동차 클래스를 작성하시오
// 자동차 객체의 run()을 호출하면 "한국타이어로 운행합니다" 또는 "금호타이어로 운행합니다"라고 출력하시오

// === com.example.tire ============
class Tire { void drive() { }    }
class 한국타이어 extends Tire { void drive() { System.out.println("한국타이어로 운행합니다"); }  }
class 금호타이어 extends Tire{ void drive() { System.out.println("금호타이어로 운행합니다"); }}
// ==================================

// === com.example.car ==========
@AllArgsConstructor
class 자동차 {
	Tire tire;
	void run() { tire.drive(); }
}

public class 상속Test05 {
	public static void main(String[] args) {
		Tire tire = new 한국타이어();
		자동차 car = new 자동차(tire);
		car.run();
	}
}




