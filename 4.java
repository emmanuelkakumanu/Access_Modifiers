
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

	 void fun()
	{
		
		A obj=new A();
		System.out.println("a : "+obj.a);
		System.out.println("b : "+obj.b);
		obj.fun1();
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone o=new Ideone();
		o.fun();
	}
}
class A
{
	 public int a=7;
	 public int b=78;
	 public void fun1()
	{
		System.out.println("This is a protected method.");
	}
}
