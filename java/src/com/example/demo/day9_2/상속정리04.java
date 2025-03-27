package com.example.demo.day9_2;

import java.util.ArrayList;

// Liskov 치환원칙 : 부모와 자식은 항상 치환가능해야한다
// 부모와 자식은 똑같이 생겨야 한다. 왜? 부모하고 자식이니까
// 부모는 메소드를 정해준다 -> 자식은 그 메소드를 구현한다
class 도형2 {
	public void 출력() {}
}
class 삼각형2 extends 도형2 {
	public void 출력() { System.out.println("삼각형을 그립니다"); }
}
class 사각형2 extends 도형2 {
	public void 출력() { System.out.println("사각형을 그립니다"); }
}
public class 상속정리04 {
	public static void main(String[] args) {
		ArrayList<도형2> list = new ArrayList();
		list.add(new 삼각형2());
		list.add(new 사각형2());
		list.add(new 삼각형2());
		
		// 향상된 반복문 : list에서 원소를 하나씩 꺼낸다. 파이썬의 for in
		// 부모에 없는 자식의 메소드는 부모 참조변수로 보이지가 않는다
		// 부모와 자식에 똑같은 메소드가 있으면 부모 참조변수로 실행하면 자식의 메소드가 실행된다(override)
		for(도형2 v:list) {
			v.출력();
		}
	}
}












