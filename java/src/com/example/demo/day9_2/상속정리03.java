package com.example.demo.day9_2;

// 전통적인 상속
// 1. 부모를 extends
// 2. 부모로 통제해서 중복을 제거
class 도형 {
	// 뭔가 들었다고 치자
}
class 삼각형 extends 도형 {
	public void 출력() { System.out.println("삼각형을 그립니다"); }
}
class 사각형 extends 도형 {
	public void display() { System.out.println("사각형을 그립니다"); }
}
public class 상속정리03 {
	public static void main(String[] args) {
		// 삼각형, 사각형을 함께 다룰 수가 없다 -> 부모로 통제하자
		삼각형 ob1 = new 삼각형();
		사각형 ob2 = new 사각형();
		
		//
		도형 v1 = new 삼각형();
		v1.출력();
		// 부모의 참조변수는 자식이 확장한 기능을 사용할 수 없다(목표 1과 2가 서로 상충)
	}
}







