package com.example.demo.day9_2;

import java.util.ArrayList;

// 부모로 처리할 수 있으면 자식도 처리할 수 있다
// 부모로 저장할 수 있다면 자식도 저장할 수 있다

// 자바는 Object를 통해 모든 클래스를 통제
// 부모가 없는 모든 클래스에 extends Object가 자동 추가
class Sample {
	
}
public class 상속정리02 {
	public static void main(String[] args) {
		// ArrayList는 Object 참조변수를 저장
		ArrayList<Object> list = new ArrayList<>();
		ArrayList list2 = new ArrayList();
		
		// 자바간 기본 타입<-> 객체간에 자동 변환(오토박싱)
		list.add(10);
		list.add(new Integer(10));
		list.add(3.14);
		list.add("hello");	
	}
}
