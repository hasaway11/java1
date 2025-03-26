package com.example.demo.day8_1;

// ※ 객체지향 프로그래밍의 구성요소
// 1. 캡슐화(encapsulation) : 클래스를 만들어라
// 2. 정보은닉(information hiding) : private
// 3. 상속(inheritance) : 재사용(legacy) vs 설계도
// 4. 다형성(polymorphism)

// ※ 객체지향 프로그래밍 원칙(SOLID)
// 1. 단일책임 원칙(Single Responsibility Principle) : 자기일만 알아서하자(1인분만 하자)
// 2. 개방폐쇄 원칙 (Open-Closed P)
// 3. 리스코프 치환 원칙(Liskov substitution P)
// 4. 인터페이스 분리 원칙(Interface Segregation P)
// 5. 의존 역전 원칙(Dependency Inversion P)

class Parent {
	int money = 1000000;
}
class Child extends Parent {
	int 돈 = 500000;
}
public class 상속Test03 {
	public static void main(String[] args) {
		Child child = new Child();
		// 자식은 부모의 것을 상속받는 기능을 추가한다
		System.out.println(child.money);
	}
}






