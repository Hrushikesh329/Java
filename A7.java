import java.util.*;

class A7
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		int iSize=0,iCnt=0;
		
		System.out.println("Enter number of elements");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
	
		System.out.println("Enter numbers");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++) //input 
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		System.out.println("enter elements are");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}	
		
	}
}	