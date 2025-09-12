package wrapperclasses;

import java.util.ArrayList;

public class WrapperClasses {
	
	public static void main(String[] args) {
		//ArrayList<Integer> al = new ArrayList<>();
		
		int a = 10;
		Integer in = a; //Integer.valueOf(a)
		System.out.println("primitive value: "+a);
		System.out.println("Integer object value: "+in);
		
		double d = 12.75;
		Double dblObj = d; //Double.valueOf(d)
		System.out.println("primitive value: "+d);
		System.out.println("Double obj value: "+dblObj);
		
		//Unboxing
		int i1 = a; //Integer.valueOf(a);
		System.out.println("primitive value: "+i1);
		
		long l = 12345;
		Long lObj = l;
		
		long lpr = lObj;
		
		String id = "12345";
		Integer idn = Integer.valueOf(id);
		
		int intPrim = Integer.parseInt(id);
		
		System.out.println(Integer.max(10, 30));
		
		//byte b = null;
		Byte bObj = null;
	}

}


/*
wrapper classes:
Wrapper classes are used to convert primitive data types into objects.


Primitive_datatypes				wrapper_class
byte							Byte
short							Short
int								Integer
long							Long
float							Float
double							Double
char							Character
boolean							Boolean


ArrayList<Integer> al =new ArrayList<>();

Auto Boxing:The process of converting primitive type of values into it's corresponding wrapper class object is called auto boxing.

Unboxing: The process of converting wrapper class object into it's corresponding primitive type is called unboxing.




*/