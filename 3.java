
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

	static void fun()
	{
		
		A obj=new A();
		System.out.println("a : "+obj.a);
		System.out.println("b : "+obj.b);
		obj.fun1();
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		fun();
	}
}
class A
{
	 protected int a=7;
	 protected int b=78;
	 protected void fun1()
	{
		System.out.println("This is a protected method.");
	}
}
