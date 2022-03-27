import java.util.*;

import MarvellousNumbers.ArrayX;

class A11
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		int ilength=0;
		float fRet=0;
		
		System.out.println("enter the number elements");
		ilength=sobj.nextInt();
		
		Marvellous mobj=new Marvellous(ilength);
		
		mobj.Accept();
		mobj.Display();
		
		fRet=mobj.Avg();
		System.out.println("Avg  is"+fRet);
		
	}

}




class Marvellous extends ArrayX
{	
	public Marvellous(int ivalue)
	{
		super(ivalue);//for calling parent class constructor
	}	
	public float Avg()
	{
	int iSum=0,iCnt=0;
	
	for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			iSum=iSum+Arr[iCnt];
		}
		return (iSum/Arr.length);	
	}	
	//return iSum;
}		
		
		