package com.example.demo.day9_3.taxi;

import com.example.demo.day9_3.tire.HankukTire;
import com.example.demo.day9_3.tire.KumhoTire;
import com.example.demo.day9_3.tire.NexenTire;

public class Taxi {
	private HankukTire t1;
	private KumhoTire t2;
	private NexenTire t3;
	// 구상 타이어 클래스를 사용하려면 셋 중의 2타이어는 null이니까 말도 안되게 객체 생성
	// Taxi taxi = new Taxi(new HankukTire(), null, null);
	public Taxi(HankukTire t1, KumhoTire t2, NexenTire t3) {	
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
}
