package com.example.demo.day8_1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Phone {
	String tel;
}

class Saram {
	Phone phone;
	public Saram(Phone phone) {
		this.phone = phone;
	}
	public Saram(String tel) {
		this.phone = new Phone(tel);
	}
}

public class 상속Test02 {

}
