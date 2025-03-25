package com.example.demo.day7_2;

// static : 클래스에 1개 존재
// final : 객체마다 존재하는 상수
// final static 또는 static final : 모든 객체들이 공유하는 상수
class Sample003 {
	// 객체마다 존재하는 상수 -> 아래처럼 사용하지 말고 생성자에서 초기화 -> 객체마다 값이 다른 상수
	final double 원주율 = 3.14;
	// 객체들이 공유하는 상수
	final static double PI = 3.14;
	// 1년의 날짜수는 365
	int daysOfYear = 365;
	final static int DAYS_OF_YEAR = 365;
}
public class FinalTest03 {

}
