package toy;

public class Main {

	public static void main(String[] args)
	{
		Company seoul = new Company("서울");
		Company busan = new Company("부산");
		
		seoul.register(new Dog());
		
		// Toy 인터페이스 객체화
		// " 오늘도 열심히 공부한다. "자바","오늘날짜"
//		Toy toy = new Toy() 
//				{
//
//					@Override
//					public String[] speakList() {
//						String[] list =
//							{"오늘도 열심히 공부한다.","자바","날짜"};
//						return list;
//					}
//
//					@Override
//					public void pushBtn(String speak) {
//						System.out.println(speak);
//						
//					}
//				
//				};
//				
//				toy.pushBtn("안녕하다.");
//				
		
		seoul.register(new Toy() {

			@Override
			public String[] speakList()
			{
				String[] list =
						{"오늘도 열심히 공부한다.","자바","날짜"};
					return list;
				
			}

			@Override
			public void pushBtn(String speak)
			{
				System.out.println(speak);				
			}		
		} );
		
		
		
		
				
	}

}
