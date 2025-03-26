package com.example.demo.day8_1;

import lombok.AllArgsConstructor;

// 클래스간의 관계
// - A는 B를 사용한다 : ex) 사람은 스마트폰을 사용한다
//   A는 B에 의존한다
//   A는 B에 dependency를 가진다
// - A는 B다 : ex) 학생은 사람이다

@AllArgsConstructor
class 스마트폰 {
	String tel;
}

@AllArgsConstructor
class 사람 {
	스마트폰 phone;
}
public class 상속Test01 {
	public static void main(String[] args) {
		사람 하연 = new 사람(new 스마트폰("010-1111-2222"));
		
		스마트폰 phone = new 스마트폰("010-1111-3333");
		사람 효재 = new 사람(phone);
	}
}
	



