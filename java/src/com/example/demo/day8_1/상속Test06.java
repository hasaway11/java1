package com.example.demo.day8_1;

import lombok.AllArgsConstructor;

// access modifier : protected
// 부모 클래스 vs 자식 클래스
// base 클래스 vs 파생 클래스
// super 클래스 vs sub 클래스
// 추상(abstract) vs 구상(concrete)
class 운동화 {
	int price;
}


class 뉴발란스 extends 운동화 {
	String model;
	public 뉴발란스(int price, String model) {
		this.price = price;
		this.model = model;
	}
}

class 나이키 extends 운동화 {

}

public class 상속Test06 {
	public static void main(String[] args) {
		뉴발란스 shoe = new 뉴발란스(100000, "530");
	}
}



