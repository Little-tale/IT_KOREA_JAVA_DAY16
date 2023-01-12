package ramda;

public class LamdaTset {

	public static void main(String[] args)
	{
		//람다식 사용 X
		//객체화 (익명 클래스 이용)
		MyInter inter1 = new MyInter() {
			
			@Override
			public void printSum(int num1, int num2)
			{
				System.out.println(num1 + num2);
				
			}
		};
		
		inter1.printSum(10, 30);
		
		// 람다식 이용!!!!
		MyInter inter2 = (num1, num2)
				-> System.out.println(num1 +num2);
				
		inter2.printSum(50, 50);

	}

}
