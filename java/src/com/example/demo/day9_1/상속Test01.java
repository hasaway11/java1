package com.example.demo.day9_1;

import java.util.ArrayList;

// 부모의 참조변수로 자식을 가리킬 수 있다
// 부모로 작업을 하자
public class 상속Test01 {
	public static void main(String[] args) {
		// 자바는 순수한 객체지향언어를 목표
		// 그런데 int, double같은 기본타입이 존재 -> 쓰지마세요. 저희가 Integer, Double...이런거 제공하니까 사용하세요
		
		// ArrayList도 원래 객체들의 리스트. 그런데 사람들이 기본 타입을 계속 사용
		// 개발자님이 기본 타입을 사용하시면 자바가 객체로 바꿔드릴께요(auto-boxing)
		
		// 타입들이 다른 데 어떻게 저장하지?
		ArrayList list = new ArrayList();
		list.add(10);				// Integer
		list.add(3.14);				// Double
		list.add("hello");			// String
	}
}
