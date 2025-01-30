package FileBasic;

import java.io.File;

public class File02 {
	public static void main(String[] args)  {
		File f=new File("D:/Naresh");
		if(f.renameTo(""))
			
			
		{
			System.out.println("Esz");
		}
		else
		{
			System.out.println("created");
		}
	}

}
