package com.example.demo.day8_1;

class Human {
	
}

class SmartPhone {
	
}

// 상속(is_a 관계) : A는 B다 -> A is_a B. 1:1 
//		학생은 사람이다, 사람은 학생이다
// 소유(has_a) : 학생은 스마트폰을 가진다. 1:다
class Student extends Human {
	private SmartPhone 공용폰;
	private SmartPhone 비밀폰;
}
public class 상속Test05 {

}
