package com.example.demo.day9_2;

// 다형성 : 메소드가 상황에 따라 다르게 동작하는 것
// - overload : 상속과 무관. 이름만 같고 파라미터는 다르다
//              재생버튼 - cd도 음악도 동영상도...삼각형 버튼 누르면 재생
// - override : 부모와 자식이 "똑같은" 메소드

class 계산기 {
	public int sum(int a, int b) { return a+b;   }
	public int sum(int a, int b, int c) { return a+b+c; }
}
public class 상속정리05 {
	public static void main(String[] args) {
	}
}

/*
 *  class Parent {
 *      public void funcA(String param) {  }
 *      public void funcB(String param) {  }
 *  }
 * 
 *  class Child extends Parent {
 *      public void funcA(String param) {  }			// override
 *      public void funcB(int a) {   }					// 부모의 funcB와 overload
 *      public void funcA(int a) {   }					// overload
 *      
 *      // 오버라이드는 부모자식간 동일한 함수, 오버로드는 파라미터가 다르다
 *      public int funcA(String param) {  }				
 *  }
 * 
 */












