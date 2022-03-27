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
		
		try{
			
		FileReader FR=new FileReader(str);
		
		BufferedReader br=new BufferedReader(FR);
		while((strr=br.readLine())!=null)
		{
			System.out.println(strr);
		}	
			
		br.close();	
		}catch(IOException e){
			System.out.println("an error occured");
		}
		
		
		
	}	
}	