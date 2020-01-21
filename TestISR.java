package com.techouts.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestISR {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\files\\osw.txt");
		InputStreamReader is=new InputStreamReader(f);
		int i=0;
		while((i=is.read())!=-1){
			System.out.print((char)i);}		
			is.close();
			f.close();
	}

}
