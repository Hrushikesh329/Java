//filee write in java

import java.io.*;

class J1
{
	public static void main(String args[])
	{
	try
	{
		FileOutputStream fout =new FileOutputStream("demp.txt");//in c we use creat keyword in java we use fileoutputstream to create file
		String s="Marvellous Infoststem";//this for write in file
			
		byte b[]=s.getBytes();//converting string into bytes array
			
		fout.write(b);
		fout.close();
		System.out.println("success");
	}
	catch(Exception e){System.out.println(e);}
	}	
}	