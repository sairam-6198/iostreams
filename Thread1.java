package com.techouts.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 class Thread1 extends Thread{
 synchronized public void run(){
	 
		try{BufferedReader	br1=new BufferedReader
				 (new FileReader("D:\\files\\fileone.txt"));
		 BufferedWriter bw1=new BufferedWriter
				 (new FileWriter("D:\\files\\filetwo.txt",true));
		
		   String s1="";
		
		   while((s1=br1.readLine())!=null){	
        	  for(int i=0;i<10;i++){
        		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern
  						("yyyy/MM/dd HH:mm:ss");
  				LocalDateTime date=LocalDateTime.now();
  				String fdt = date.format(dtf); 
        		  bw1.write(" "+s1+" "+fdt);Thread.sleep(400);}
        	  }
		bw1.close();
	} catch (Exception e) {e.printStackTrace();	}	 
 }
}
  
 		



 