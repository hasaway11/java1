package com.example.demo.day9_1;

import java.util.ArrayList;

// 상속을 사용하지 않는 경우 : 클래스의 참조변수는 자기자신만 가리킬 수 있다 
class 말티즈 {}
class 푸들 {}
class 요크셔테리어 {}

// 상속을 사용하는 경우 : 부모로 자식을 가리킬 수 있다
class 고양이 {}
class 쇼트헤어 extends 고양이 {}
class 버미즈 extends 고양이 {}
class 버먼 extends 고양이 {}
public class 상속Test02 {
	public static void main(String[] args) {
		말티즈 a = new 말티즈();
		푸들 b = new 푸들();
		요크셔테리어 c = new 요크셔테리어();
		
		고양이 x = new 쇼트헤어();
		x = new 버먼();
		
		// 고양이만 저장할 수 있는 리스트
		ArrayList<고양이> list = new ArrayList<고양이>();
		list.add(new 쇼트헤어());
		list.add(new 버먼());
	}
}





