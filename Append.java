package com.techouts.filehandling;

import java.io.*;

public class Append {
public static void main(String args[]) throws IOException{
	
	BufferedWriter b=new BufferedWriter(new FileWriter("D:\\files\\neww.txt",true));
	String s="pqrstuvwxyz";
	b.write(s);
	b.close();
	BufferedReader b1=new BufferedReader(new FileReader("D:\\files\\neww.txt"));
	
//    int i=0;
//    while((i=b1.read())!=-1)
//    	System.out.print((char)i);
	String str;
	while((str=b1.readLine())!=null)
		System.out.println(str);

	
}
}