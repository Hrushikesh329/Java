
import java.util.*;

class String6
{
	public static void main(String arg[])
	{
		Marvellous mobj=new Marvellous();
		int iRet=0;
		
		mobj.Accept();
		mobj.Display();
		
		String s=mobj.ReverseX();
		System.out.println(""+s);
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

class Marvellous extends StringX//inheritance
{
	public String ReverseX() 
	{
		char Arr[]=Str.toCharArray();
		int iStart=0,iEnd=Arr.length-1;
		char temp;	
		
		while(iStart<iEnd)
		{
			temp=Arr[iStart];
			Arr[iStart]=Arr[iEnd];
			Arr[iEnd]=temp;
			iStart++;
			iEnd--;
		}
		return new String(Arr);
	}	
}
	
	
	
	
	
	