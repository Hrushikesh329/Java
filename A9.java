import java.util.*;

class A9
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		int ilength=0,iRet=0;
		
		System.out.println("enter the number elements");
		ilength=sobj.nextInt();
		
		Marvellous mobj=new Marvellous(ilength);
		
		mobj.Accept();
		mobj.Display();
		
		iRet=mobj.Add();
		System.out.println("Addition is"+iRet);
		
	}

}

class ArrayX
{
	public int Arr[];
	
	
		public ArrayX(int iSize)//constructor (parameter constructor)
		{
		Arr=new int[iSize];
		}

		public void Accept()
		{	int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("enter element");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
			{
			Arr[iCnt]=sobj.nextInt();
			}	
		}

		public void Display()
		{	int iCnt=0;
		System.out.println("Elements are");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
			{
			System.out.println(Arr[iCnt]);
			}	
		}
		
}	


class Marvellous extends ArrayX
{	
	public Marvellous(int ivalue)
	{
		super(ivalue);//for calling parent class constructor
	}	
	public int Add()
	{
	int iSum=0,iCnt=0;
	
	for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			iSum=iSum+Arr[iCnt];
		}
		return iSum;	
	}	
	//return iSum;
}		
		
		