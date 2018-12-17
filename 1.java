
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	private int a=10;
	private int b=100;
	private void fun1()
	{
		System.out.println("This is a private method.");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Ideone o=new Ideone();
		System.out.println("private int a : "+o.a);
		System.out.println("private int b : "+o.b);
		o.fun1();
	}
}
