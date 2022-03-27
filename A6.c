

// Amstrong number 

import java.util.*;


class Marvellous
{
	public boolean CheckAmstrong(int iNo)
	{
		int itemp=0;
		int iSum=0,iDigit=0,iCnt=0,ipower=1,iCnt1=0;
		
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		
		itemp=iNo;
		while(itemp!=0)
		{
			iDigit++;
			itemp=itemp/10;
		}	
	
		itemp=iNo;
		
		while(itemp!=0)
		{
			iCnt=itemp%10;
					
			for(iCnt1=1;iCnt1<=iDigit;iCnt1++)
			{
				ipower=ipower*iCnt;
			}
			iSum=iSum+ipower;
			ipower=1;
			itemp=itemp/10;
		}	
		
		if(iSum==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}	
	
	
	}	
}	
class A6
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		int iValue=0;
		boolean bret=false;
		System.out.println("Enter number");
		iValue=sobj.nextInt();	
		
		Marvellous mobj=new Marvellous();
		bret=mobj.CheckAmstrong(iValue);
		if(bret==true)
		{
			System.out.println("it is Amstrong ");
		}
		else
		{
			System.out.println("it is not Amstrong");
		}	
	}
}	