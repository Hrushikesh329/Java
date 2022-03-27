import java.util.*;
class A7
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		int iSize=0,iCnt=0,iRet=0;
		
		System.out.println("Enter number of elements");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
	
		System.out.println("Enter numbers");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++) //input 
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		Marvellous mobj=new Marvellous();
		
		iRet=mobj.Add(Arr);//call by value
		
		System.out.println("Addition is"+iRet);
	}
}	

class Marvellous
{

	public int Add(int Brr[])
	{
		int iSum=0,iCnt=0;
		
		for(iCnt=0;iCnt<Brr.length;iCnt++)
		{
			iSum=iSum+Brr[iCnt];
		}
		return iSum;
	}
	
}