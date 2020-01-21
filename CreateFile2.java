package com.techouts.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateFile2 {
	public static void main(String args[]){
		try {
			FileOutputStream f=new FileOutputStream("D:\\files\\newfile2.txt");
			String s="cricket is everything";
			byte b[]=s.getBytes();
			f.write(b);
			f.close();
		} catch (Exception e) {
			
			System.out.println(e);
		}

		
	}

}
