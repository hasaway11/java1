package com.example.demo.day7_2;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

// 1. 생성자를 private으로
@NoArgsConstructor(access=AccessLevel.PRIVATE)
class 계산기3 {
	// 2. 자기자신의 객체를 생성
	private static 계산기3 obj = new 계산기3();
	// 3. 빌려주는 메소드를 추가
	public static 계산기3 getInstance() {
		return obj;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
}
public class SingletonTest03 {
	public static void main(String[] args) {
		계산기3 계산기 = 계산기3.getInstance();
		int result = 계산기.sum(10, 20);
		System.out.println(result);
	}
}
