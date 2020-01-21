package com.techouts.filehandling;
import java.lang.String;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFile {

	public static void main(String[] args) throws IOException {
  FileWriter fw=new FileWriter("D:\\files\\csvfile10.csv");
  BufferedWriter bw=new BufferedWriter(fw);
  String s1="name|id";
  String s2="ram|222";
  bw.write(s1);
  bw.newLine();
  bw.write(s2);
  bw.close();
  fw.close();
	}

}
