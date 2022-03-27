import java.util.*;//

class A2
{
	public static void main(String str[])//main function prototype
	{
		Scanner sobj=new Scanner(System.in);//we can create scanner class obj for giving input output system in means input
		int iNo=0,iNo1=0,iAns=0;
		
		System.out.println("Enter first number");
		iNo1=sobj.nextInt();//nextint used to accept integer 
		
		System.out.println("Enter second number");
		iNo2=sobj.nextInt();
		
		iAns=iNo1+iNo2;
		System.out.println("Addition is :"+iAns);//+means to connect 2 values
	}	
}	

//nextfloat//float type
//next bool,double//bool,double type

//for character  direct used string 