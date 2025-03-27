package com.example.demo.day9_1;
// 1. 부모를 만들어라
// 2. 메소드는 부모에 비어있는 채로 작성 - 부모는 메소드의 이름을 정한다
// 3. 자식은 부모의 메소드를 재정의(오버라이드) - 자식은 그 메소드를 정의한다
class Pet {
	void cry() {}
}
class Cat extends Pet {
	void cry() { System.out.println("냐옹"); }
}
class Dog extends Pet {
	void cry() { System.out.println("멍멍"); }
}
// 소추가
class Cow extends Pet {
	void cry() { System.out.println("음메");
}

// ==========================
class 병원 {
	void 예방접종(Pet pet) {
		pet.cry();
	}
}
public class 상속Test04 {
	public static void main(String[] args) {
		Pet pet = new Dog();
		병원 병원 = new 병원();
		병원.예방접종(pet);
	}
}
