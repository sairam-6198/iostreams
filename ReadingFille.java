package com.techouts.filehandling;

import java.io.*;

public class ReadingFille {
	public static void main(String []args){
	try {
		FileInputStream fi=new FileInputStream("D:\\files\\newfile2.txt");
		int i=0;
		
		while((i=fi.read())!=-1){
			System.out.print((char)i);
		}
	} catch (Exception e) {
		
		System.out.println(e);
	}
}}
