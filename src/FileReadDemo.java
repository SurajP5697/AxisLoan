

 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
 
public class FileReadDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] array = new byte[1000];
 
		try {
			//Providing relative path
			//InputStream input = new FileInputStream("..\\..\\..\\input.txt");
 
			//Providing absolute path
			InputStream input = new FileInputStream("C:\\Sample.txt");
			
			System.out.println("Available bytes in the file: " + input.available());
 
			// Read byte from the input stream
			input.read(array);
			System.out.println("Data read from the file: ");
 
			// Convert byte array into string
			String data = new String(array);
			System.out.println(data);
 
			// Close the input stream
			input.close();
		} catch (IOException e) {
			System.out.println("Exception details :" + e.getMessage());
		}
	}
 
}