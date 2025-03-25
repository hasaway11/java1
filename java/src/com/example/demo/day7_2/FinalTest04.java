package com.example.demo.day7_2;

// 범위 상수를 만드는데....과일은 오렌지, 바나나, 사과가 가능하다
class 과일 {
	final static int 오렌지 = 1;
	final static int 바나나 = 2;
	final static int 사과 = 3;
}

// 상수를 정의하는 특수한 클래스
enum Fruit {
	Orange, Banana, Apple;
}

public class FinalTest04 {
	public static void main(String[] args) {
		int choice = 과일.바나나;
		choice++;				// 사과
		//choice++;				?????
		System.out.println(choice + "를 선택하셨습니다");
		
		Fruit 선택 = Fruit.Banana;
		System.out.println(선택.name() + "를 선택하셨습니다");
	}
}



