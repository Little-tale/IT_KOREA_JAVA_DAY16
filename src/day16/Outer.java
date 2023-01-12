package day16;

public class Outer
{
	// 필드 
	int var1;
	String var2;
	
	//메소드
	void method()
	{
		class Test
		{
			
		}
	}
	
	
	// 내부 클래스
	class Inner
	{
		public Inner()
		{
			super();
		}
		void innerMethod()
		{
			 var1 =1;
		}
		void method() // 중복 이름 메소드 가능...! //재정의인것인가.
		{
			
		}
		
	}
	
}
