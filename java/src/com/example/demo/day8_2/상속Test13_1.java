package com.example.demo.day8_2;

import java.util.ArrayList;
import java.util.List;

// 자바에서 참조변수는 항상 추상적인 부모
public class 상속Test13_1 {
	public static void main(String[] args) {
		// ArrayList의 참조변수가 ArrayList 객체를 가리킨다 -> 바람직하지 않다
		ArrayList ar = new ArrayList();
		
		// 부모인 List의 참조변수를 자식인 ArrayList를 가리키게 하자
		// 그래서 이점이 뭔데? 원래 자바는 그렇게 한다고...
		List list = new ArrayList();
	}
}




