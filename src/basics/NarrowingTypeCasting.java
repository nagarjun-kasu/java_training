package basics;

public class NarrowingTypeCasting {
	public static void main(String[] args) {
		 double d= 12.75;
		
		float f = (float)d;
		
		long l = (long)d;
		int i = (int)d;
		short s = (short)d;
		byte b = (byte)d;
		
		System.out.println("double value: "+d);
		System.out.println("float value: "+f);
		System.out.println("long value: "+l);
		System.out.println("int value: "+i);
		System.out.println("short value: "+s);
		System.out.println("byte value: "+b);
		
		char ch = 'a';
		short sh = (short)ch;
		byte bt = (byte)ch;
		System.out.println("short value: "+sh);
		System.out.println("byte value: "+bt);
		
	}

}
