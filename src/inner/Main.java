package inner;

//import inner.Outer.InstanceInner;

public class Main
{ public static void main(String[] args)

{
	Outer o = new Outer();
    
    Outer.InstanceInner ii = o.new InstanceInner();
    Outer.InstanceInner ii2 = new Outer().new InstanceInner();
    Outer.StaticInner si = new Outer.StaticInner();
   
    StaticInner si2 = new StaticInner();
    
    
  //  InstanceInner ii2 = new InstanceInner();
    
	
	
	
}

}
