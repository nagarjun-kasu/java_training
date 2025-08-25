package basics;

public class Operators {
	
	public static void main(String[] args) {
		
		System.out.println("Java Training");
		
		int a=20, b=4;
		System.out.println(a+b); //24
		System.out.println(a-b); //16
		System.out.println(a*b); //80
		System.out.println(a/b); //5
		System.out.println(a%b); //0
		
		a+=5; //a=a+5
		System.out.println(a);//25
		
		a-=10; // a = a-10
		System.out.println(a);//15
		
		a*=2; // a = a*2
		System.out.println(a); //30
		a/=3; // a = a/3
		System.out.println(a);//10
		
		a%=3; // a = a%3
		System.out.println(a);//1
		
		
		int p=15, q=10;
		System.out.println(p==q);//false
		System.out.println(p<q); //false
		System.out.println(p>q); //true
		System.out.println(p<=q);//false
		System.out.println(p>=q);//true
		System.out.println(p!=q); //true
		
		System.out.println(p==q && p>=q);//false
		System.out.println(p==q || p>=q); // true
		System.out.println( p>q && p>=q); //true
		
		System.out.println(!(p==q)); // true      !false = true		!true=false
		System.out.println(!(p>q)); //false
		
		//unary operators ++	--
		//++ increment operator   pre-increment and post-increment
		//-- decrement operator   pre-decrement and post-decrement
		
		int i = 100;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		int j=10;
		System.out.println(j++);
		System.out.println(j);
		
		int k = 10;
		System.out.println(++k);
		
		int r=15; int s=20;
		System.out.println(--r); //14
		System.out.println(s--); //20
		
		System.out.println(s);
		
	}

}


/*
Operators:

Arithmetic operators:
+ - * / %

Assignment operators
= 	+=	-+ 	*=	/=	%=

Relational operators
==	<	>	<=	>=	!=

Logical operators
&& 	||	!

Unary operators
++  
--

*/