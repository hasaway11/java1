package com.example.demo.day8_2;

// Test12에 상속을 적용하자 

class Pet {
	public void cry() {
		System.out.println("Pet이 웁니다");
	}
}
class 고양이2 extends Pet {
}
class 강아지2 extends Pet {
}
class 소2 extends Pet {
}

class 동물병원2 {
	// 부모인 Pet 참조변수는 고양이2, 강아지2를 모두 가리킬 수 있다
	// 부모를 파라미터로 하는 메소드는 자식에 대해서도 동작한다
	public void 예방접종(Pet pet) { pet.cry(); }
}

public class 상속Test13 {
	public static void main(String[] args) {
		동물병원2 h = new 동물병원2();
		h.예방접종(new 고양이2());
		h.예방접종(new 강아지2());
		h.예방접종(new 소2());
	}	
}
