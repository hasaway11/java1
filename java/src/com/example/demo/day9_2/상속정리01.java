package com.example.demo.day9_2;

// 생산성 <- 재사용 <- 상속(부모 것은 내것)

class 복사기 {
}
class 팩스 {
}
class 스캐너 {
}

// 자바는 단일 상속만 지원(extends는 1개만 가능)
class 복합기 extends 복사기, 팩스, 스캐너 {
	// 복사기, 팩스, 스캐너 기능은 상속 + 프린터 기능을 추가
	// 상속해서 재사용하고 기능을 확장
}

public class 상속정리01 {

}
