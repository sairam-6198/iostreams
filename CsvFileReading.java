package com.techouts.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReading {

	public static void main(String[] args) throws IOException {
		 FileReader fw=new FileReader("D:\\files\\test1.csv");
		  BufferedReader bw=new BufferedReader(fw);
		  String i="";
		  while((i=bw.readLine())!=null){
			  String a[]=i.split("/");
			  System.out.println();
			  for(int j=0;j<a.length;j++)
				  System.out.print(a[j]+" "); }
		  bw.close();
		  fw.close();
	}	
}