package com.techouts.filehandling;

import java.io.*;  
class TestDeserialization{  
 public static void main(String args[]){  
  try{  
  ObjectInputStream in=new
		  ObjectInputStream(new FileInputStream("D:\\files\\ser.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name);  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  
