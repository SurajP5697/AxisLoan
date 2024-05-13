package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fi=new FileInputStream("New.txt");
		
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		Student student=(Student)oi.readObject();
		
		student.display();
		
	}
}
