package anonimous2;

import anonimus.interA;

public class AnonimusTest1 {

	public static void main(String[] args)
	{
		// 주어진 추상 클래스, 인터페이스, 클래스를 이용하여
		// 익명 클래스를 객체화 하기
		
		//Abstract -> a*b 결과 출력 // 추상 클래스 이용한 익명클래스 객체
		// InterB -> a + b 결과 출력 // 인터페이스 이용한 익명클래스 객체화
		// minus -> a - b 결과 출력 // 일반 클래스를 이용한 익명클래스 객체화
		// 호출
		
		
//		
//		Abstract ab = new Abstract()
//		{
//
//			@Override
//			public void plusMode(int a, int b)
//			{
//				System.out.println(a + b);
//				//return super.plusMode(13,2);
//			}
//			
//		};
		
		//ab.plusMode(13, 18);

		Minus m = new Minus();
		m.minusMode(140, 50);
		
		
	}

}
