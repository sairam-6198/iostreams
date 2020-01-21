package com.techouts.filehandling;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialisation {

	public static void main(String[] args) throws Exception {
 ObjectOutputStream ob=new 
    		 ObjectOutputStream(new FileOutputStream("D:\\files\\ser.txt"));
     Student s1=new Student("ram",459);
     ob.writeObject(s1);
     ob.flush();
     ob.close();
	}

}
