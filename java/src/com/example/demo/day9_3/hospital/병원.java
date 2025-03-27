package com.example.demo.day9_3.hospital;

import com.example.demo.day9_3.animal.Pet;

public class 병원 {
	// animal 패키지의 구상(concrete) 클래스에 의존하면 강결합이 된다
	// animal이 변경되면 hospital쪽도 변경해야 한다 -> 개방폐쇄 위반
	//	public void 예방접종(Cat cat) { }
	//	public void 예방접종(Dog dog) { }
	
	// animal 패키지에 외부에 동물을 대표하는 Pet 클래스를 공개한다
	// Pet가 animal부서와 pet부서 간의 계약 -> 계약을 지키는 한 각 부서는 각자 작업한다
	// pet부서는 animal 부서 변경에 대해 폐쇄되어 있다
	// animal부서도 pet 부서를 신경쓰지 않고 동물들을 마음대로 추가, 삭제, 변경할수 있다
	public void 예방접종(Pet pet) {
		pet.cry();
	}
}
