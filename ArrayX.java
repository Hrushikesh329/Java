


package MarvellousNumbers;

import java.util.*;

public class ArrayX
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