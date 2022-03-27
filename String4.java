
import java.util.*;

class String1
{
	public static void main(String arg[])
	{
		Marvellous mobj=new Marvellous();
		int iRet=0;
		
		mobj.Accept();
		mobj.Display();
		
		iRet=mobj.CountVowels();
		System.out.println("number of Vowels"+iRet);
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
	public int CountVowels()
	{
		char Arr[]=Str.toCharArray();//to string convert character array
		int iCnt=0,i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]=='a'||Arr[i]=='e'||Arr[i]=='i'||Arr[i]=='o'||Arr[i]=='u')
			{
				iCnt++;
			}	
		}
		return iCnt;
	}	
}
	
	
	
	
	
	