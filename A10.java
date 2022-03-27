import java.util.*;

import MarvellousNumbers.ArrayX;

class A10
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
		
		