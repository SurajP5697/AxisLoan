package Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StarterSerialize{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student st=new Student(1,"Rajani",123);
		
		File file=new File("New.txt");
		file.createNewFile();
		
		FileOutputStream fo=new FileOutputStream(file);
		
		ObjectOutputStream out=new ObjectOutputStream(fo);
		out.writeObject(st);
		
		out.close();
		fo.close();
		System.out.println("Object into byte stream");

	}

}
