package com.techouts.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
	class Thread2 extends Thread{
		 synchronized public void run(){
			 try {
				 BufferedReader br2=new BufferedReader
						 (new FileReader("D:\\files\\filetwo.txt"));
					if(this.currentThread() != null){wait();}else{notify();}
				 BufferedWriter	bw2=new BufferedWriter
						 (new FileWriter("D:\\files\\fileone.txt",true));
				String s2="";
				while((s2=br2.readLine())!=null)
				{
				for(int i=0;i<10;i++){
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern
							("yyyy/MM/dd HH:mm:ss");
					LocalDateTime date=LocalDateTime.now();
				    String fdt = date.format(dtf);  
	        	  bw2.write(" "+s2+" "+fdt);Thread.sleep(400);}
				}
				bw2.close();
			}
			 catch (Exception e) {e.printStackTrace();	}
			 
		 }
		}



