package inner;

public class Outer
{// 외부 클래스
//필드
int instaceVar;
static int staticVar;
InstanceInner ii;
StaticInner si;

class InstanceInner{ //내부클래스(인스턴스)
   
}

static class StaticInner{ //스태틱 내부클래스
   void print9()
   {
	   System.out.println("뭐");
   }
}

void instaceMethod() {
   int localVar;
   
   class LocalInner{ //로컬 내부클래스
      
   }
   
   //객체화 작업
   LocalInner li = new LocalInner();
   InstanceInner ii = new InstanceInner();
   StaticInner si = new StaticInner();
}

static void staticMethod() {
   //필드
   int localVar;
//   instanceVar = 30; //스태틱 메소드안에서 인스턴스 변수
   localVar = 30;
   staticVar = 20;
   
   //내부클래스(로컬클래스)
   class LocalInner
   {
      
   }
   
   LocalInner li = new LocalInner();
//   InstanceInner ii = new InstanceInner();
   StaticInner si = new StaticInner();
   
   
}
}

