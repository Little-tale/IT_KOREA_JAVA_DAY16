package ramda;
@FunctionalInterface
// 어노테이션을통해 함수형 인터페이스
	//함수형 인터페이스는 메소드를 2개이상 선언 하지 못한다.
	//어노테이션을 붙이지 않으면 메소드 2개이상 써진다.

public interface MyInter
{
	//상수
	//추상 메소드
	void printSum(int num1, int num2);
	//void test();
}
