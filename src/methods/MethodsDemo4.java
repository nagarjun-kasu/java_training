package methods;

public class MethodsDemo4 {
	
	//methods with parameters
	//instance method
	void method1(byte b) {
		System.out.println("byte value: "+b);
	}
	
	void method2(short s) {
		System.out.println("short value: "+s);
	}
	
	void method3(int i) {
		System.out.println("int value: "+i);
	}
	
	void method5(long l) {
		System.out.println("long value: "+l);
	}
	void method4(float f) {
		System.out.println("float value: "+f);
	}
	void method4(double d) {
		System.out.println("double value: "+d);
	}
	
	public static void main(String[] args) {
		MethodsDemo4 obj=new MethodsDemo4();
		obj.method1((byte)100);
		obj.method2((short)200);
		obj.method3(300);
		obj.method4(500);
		
	}

}
/*

byte < short < int < long < float < double

*/