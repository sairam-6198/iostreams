package com.techouts.filehandling;
import java.io.*;
public class TestFileWriter {
	public static void main(String args[]) throws IOException{
	FileWriter f=new FileWriter("D:\\files\\neww.txt");
	BufferedWriter b=new BufferedWriter(f);
	String s="abcdefghijklmno";
	b.write(s);
	b.close();
	f.close();
	
	}
}
