package com.example.demo.day7_1;

// main은 왜 static?
public class StataicTest06 {
	public static void main(String[] args) {
		// 자바의 모든 함수는 클래스 소속이다 -> 자바에서는 함수와 메소드가 같다
		// 그런데 메소드를 실행하려면 객체를 만들어야 한다
		String str = "hello";
		System.out.println(str.length());
		
		// 즉 main 메소드를 실행하려면 StaticTest06의 객체를 만들어야 한다
		// StaticTest06 ob = new StaticTest06();
		// ob.main();
		
		// main의 역할을 프로그래을 시작하는 역할
		// 따라서 main이 실행되야 12, 13라인을 실행할 수 있다
		
		// main을 실행하려면 객체를 만들어야해. 그런데 객체를 만드려면 main이 실행되야해
		// ex) 닭이 먼저? 달걀이 먼저?
		
		// static을 붙이면 객체없이 StaticTest06.main()으로 실행할 수 있다
	}
}
