package inheritance;

public class Child2 extends Parent2{
	
	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.method1();
		obj.method2();
		
		obj.parent2method1();
		obj.parent2method2();
		
		System.out.println(obj.username+" --- "+obj.password+" --- "+obj.name);
	}

}
