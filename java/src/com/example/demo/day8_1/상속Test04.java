package com.example.demo.day8_1;

import javax.swing.JButton;
import javax.swing.JFrame;

// GUI를 제공하는 JFrame 클래스를 상속받아 재사용을 통해 빠르게 GUI 구축
// 그런데 JButton은 뭐지?

// 클래스간의 관계
// 1. 상속 관계 - 1:1
// 2. 소유 관계 - 1:다
class MyApp extends JFrame {
	JButton myButton = new JButton("클릭하세요");
	public MyApp() {
		this.add(myButton);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
public class 상속Test04 {
	public static void main(String[] args) {
		new MyApp();
	}
}
