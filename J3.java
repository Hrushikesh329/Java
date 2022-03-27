import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
class J2
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		String str;
		String strr;
		
		System.out.println("enter your file name");
		str=sobj.nextLine();
		System.out.println("enter data what u write in your file");
		strr=sobj.nextLine();
		
		try{
			
		File myobj=new File(str);//create file
		if(myobj.createNewFile())
			{
			System.out.println("file created"+myobj.getName());//check existing file
		
			}else
			{
				System.out.println("file already exist");
			
			}
			
			
			FileWriter Mywriter=new FileWriter(str);//for writting file data
			Mywriter.write(strr);
			Mywriter.close();
			
			
			
		}catch(IOException e){
			System.out.println("an error occured");
		}
		
		
		
	}	
}	