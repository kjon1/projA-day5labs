
public class Test {
	
	public static void main(String[]args) {
		A.staticCount = 999;
		System.out.println("class A staticCount is: " + A.staticCount);
		
		
		A a = new A();
		
		System.out.println(a.instanceCount);
		System.out.println(A.staticCount);
		

		A a2 = new A();
		
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		
		a.instanceCount = 99;
		
		System.out.println("object a instancecount is: " + a.instanceCount);
		System.out.println("object a2 instancecount is : " + a2.instanceCount);
		
		System.out.println("class A staticCount is: " + A.staticCount);
	}

}
