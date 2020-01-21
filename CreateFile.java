package com.techouts.filehandling;

import java.io.*;


public class CreateFile {
	public static void main(String args[])  {
		try {
			FileOutputStream f=new FileOutputStream("D:\\files\\newfile.txt");
			f.write(35);
			System.out.println(f.getFD());
			f.close();
		} catch(Exception e){
			System.out.println(e);
			} 
		
	}

}
