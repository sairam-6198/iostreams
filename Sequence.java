package com.techouts.filehandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Sequence {

	public static void main(String[] args) {
		try{
		FileInputStream fi1=new FileInputStream("D:\\files\\newfile.txt");

		FileInputStream fi2=new FileInputStream("D:\\files\\newfile2.txt");

		SequenceInputStream si=new SequenceInputStream(fi1,fi2);
		int i=0;
		while((i=si.read())!=-1){
			System.out.print(""+(char)i);
		}
		}catch(Exception e){System.out.println(e);}
	}

}
