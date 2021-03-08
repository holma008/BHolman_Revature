package march3_wrapper_classes;

public class WrapperClasses {

	public static void main(String[] args) {
		Float f1 = 146.224f;//do these not work the same way as Integers?
		Float f2 = 146.224f;//each has different memory address
		Float f3 = new Float(146.224);
		
		System.out.println("f1 == f2 : " + (f1 == f2));
		System.out.println("f1 == f3 : " + (f1 == f3));
		
		System.out.println("(f1.equals(f2)) : " + (f1.equals(f3)));
		System.out.println("(f1.equals(f3)) : " + (f1.equals(f2)));
		
		System.out.println(System.identityHashCode(f1));
		System.out.println(System.identityHashCode(f2));
		System.out.println(System.identityHashCode(f3));
		
		Double d1 = 146.224;
		Double d2 = 146.224;
		Double d3 = new Double(146.224);
		
		System.out.println("d1 == d2 : " + (d1 == d2));
		System.out.println("d1 == d3 : " + (d1 == d3));
		
		System.out.println("(d1.equals(d2)) : " + (d1.equals(d3)));
		System.out.println("(d1.equals(d3)) : " + (d1.equals(d2)));
		
		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
		System.out.println(System.identityHashCode(d3));
		
		Long l1 = 19l;
		Long l2 = 19l;
		Long l3 = new Long(194);
		
		System.out.println("l1 == l2 : " + (l1 == l2));//a bigger variable causes this to fail
		System.out.println("l1 == l3 : " + (l1 == l3));
		
		System.out.println("(l1.equals(l2)) : " + (l1.equals(l3)));
		System.out.println("(l1.equals(l3)) : " + (l1.equals(l2)));
		
		System.out.println(System.identityHashCode(l1));
		System.out.println(System.identityHashCode(l2));
		System.out.println(System.identityHashCode(l3));
	}
}
