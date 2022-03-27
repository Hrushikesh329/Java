import java.util.*;

class String6
{
	public static void main(String arg[])
	{
		Marvellous mobj=new Marvellous();
		boolean iRet;
		
		mobj.Accept();
		mobj.Display();
		
		//boolean bRet;
		
		iRet=mobj.checkpallindrome();
		if(iRet==true)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("no present");
		}	
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
	public boolean checkpallindrome() 
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
		String newStr=new String(Arr);
		boolean bret=newStr.equals(Str);
		return bret;
	}	
}
	
	
	
	
	
	