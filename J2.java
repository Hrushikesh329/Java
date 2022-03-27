import java.io.*;
import java.util.*;
import java.io.File;

class J2
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		String str;
		System.out.println("enter your file name");
		str=sobj.nextLine();
		try{
			
		File myobj=new File(str);
		if(myobj.createNewFile())
			{
			System.out.println("file created"+myobj.getName());
			}else{
				System.out.println("file already exist");
			}
		}catch(IOException e){
			System.out.println("an error occured");
		}
	}	
}	