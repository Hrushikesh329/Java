import java.util.*;

class String1
{
	public static void main(String arg[])
	{
		StringX sobj=new StringX();
		sobj.Accept();
		sobj.Display();
	}
}	

class StringX
{
	public String Str;//characterists
	
	public void Accept()//getter
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter string");
		Str=sobj.nextLine();
	}
	
	public void Display()//setter
	{
		System.out.println("String is"+Str);
	}	
	
}	