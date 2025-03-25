package com.example.demo.day7_2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

// design pattern : 반복적으로 등장하는 문제들의 해결책을 패턴화
//                  singleton, facade, command, builder, factory.....
@AllArgsConstructor
@Builder
@ToString
class 배송지 {
	String 이름;
	String 우편번호;
	String 도로명주소;
	String 상세주소;
}
public class SingletonTest01 {
	public static void main(String[] args) {
		// 객체 생성은 난해하다 -> 왜? 필드는 String 아니면 int
		// 배송지는 String 4개로 초기화할 때 순서가 헷갈린다 -> Builder 패턴
		배송지 a = new 배송지("매소홀로663", "태승빌딩 5층", "직장", "11200");
		
		// 롬복이 제공하는 builder 객체를 이용한 배송지 생성
		배송지 b = 배송지.builder().이름("집").우편번호("11200").상세주소("태승빌딩 5층")
				.도로명주소("매소홀로663").build();
		
		배송지 c = 배송지.builder().이름("회사").build();
		System.out.println(c);
	}
}











