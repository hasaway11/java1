package com.example.demo.day8_1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 클래스 : 정적필드, 정적메소드, 일반필드, 일반메소드, 생성자

// 저장 클래스(Value Object) : 필드 중심 -> 객체가 여러개
// 처리 클래스 : 메소드 중심 -> 싱글톤 -> 프레임워크야. 니가 생성해.

// 우리 은행의 모든 적금 계좌의 기본 금리는 2%다
// 적금가입자가 청년이면 특별우대금리가 1%, 노인도 1%다.
// 가입시 카드를 사용한다든지...우대조건에 동의하면 우대금리가 1%다.
enum 세대분류 {
	청년, 일반, 노인;
}

@ToString
class 적금계좌 {
	final 세대분류 분류; 
	final static double 기본금리 = 0.02;
	final double 우대금리;
	final double 특별우대금리;
	final double 금리;
	public 적금계좌(double 우대금리, 세대분류 분류) {
		this.우대금리 = 우대금리;
		this.분류 = 분류;
		this.특별우대금리 = (분류==세대분류.청년 || 분류==세대분류.노인)? 0.01 : 0;
		this.금리 = 기본금리 + 우대금리 + 특별우대금리;
	}
}
public class 복습Test {
	public static void main(String[] args) {
		적금계좌 account = new 적금계좌(0, 세대분류.청년);
		System.out.println(account);
	}
}


