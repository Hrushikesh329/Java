import java.util.*;


class Marvellous
{
	public boolean CheckPrime(int iNo)
	{
		//boolean bA=true;
		int iCnt=0;
		for(iCnt=2;iCnt<=iNo/2;iCnt++)
		{
			if(iNo%iCnt==0)
			{
				//bA=false;
				break;
			}
		}
		if(iCnt>iNo/2)
		{
			return true;
		}
		else
		{
			return false;
		}	
	//return bA;	
	}
}	
class A5
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		int iValue=0;
		boolean bret=false;
		System.out.println("Enter number");
		iValue=sobj.nextInt();	
		
		Marvellous mobj=new Marvellous();
		bret=mobj.CheckPrime(iValue);
		if(bret==true)
		{
			System.out.println("it is prime ");
		}
		else
		{
			System.out.println("it is not prime");
		}	
	}
}	