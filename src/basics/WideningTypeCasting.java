package basics;

public class WideningTypeCasting {
	public static void main(String[] args) {
		
		byte b = 10;
		
		short s = b;
		int i = b;
		long l = b;
		float fl = b;
		double db = b;
		System.out.println("byte value: "+b);
		System.out.println("short value: "+s);
		System.out.println("int value: "+i);
		System.out.println("long value: "+l);
		System.out.println("float value: "+fl);//10.0
		System.out.println("double value: "+db);
		
		char ch='A';
		int in = ch;
		System.out.println("int value:"+in);
		
		double d=ch;
		System.out.println("double value: "+d);//65.0
		
		
		
		
	}

}

/*
ASCII code:
a --> 97
b --> 98
c--> 99

A --> 65
B --> 66
C --> 67

*/