package com.lg;

public class OtherPackageOtherClass {
	private int privateNum = 10;
	int defaultNum = 20;
	public int publicNum = 30;
	
	public void print() {
		// 자신의 클래스 내에서는 모든 접근제한자에 접근 가능
		System.out.println("privateNum : " + privateNum); // O
		System.out.println("defaultNum : " + defaultNum); // O 
		System.out.println("publicNum : " + publicNum); // O
	}
}
