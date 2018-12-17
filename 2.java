
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		A obj=new A();
		System.out.println("a : "+obj.a);
		System.out.println("b : "+obj.b);
		obj.fun1();
		
	}
}
class A
{
	 int a=7;
	 int b=78;
	 void fun1()
	{
		System.out.println("This is a default method.");
	}
}
