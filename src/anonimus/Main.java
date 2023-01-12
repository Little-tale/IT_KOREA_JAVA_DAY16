package anonimus;

public class Main {

	public static void main(String[] args)
	{
		//ClassA ca = new ClassA();
		
		//ca.printData();
		
		//인터페이스만 사용해서 객체화
		interA a = new interA() 
		{// 클래스 영역 즉 익명 클래스.
			// 오버라이딩
			@Override
			public void printData()
			{
				System.out.println("익명클래스에서 오버라이딩 !");
			}
			
		};
		a.printData();


	}

}
