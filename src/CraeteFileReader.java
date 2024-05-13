import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CraeteFileReader {

		public static void main(String[] args) throws IOException {
			File file=new File("C:\\Sample.txt");
		//	file.createNewFile();
			FileReader fr=new FileReader(file);
			FileWriter fw=new FileWriter(file);
			//fw.write("Hi Suraj");
			//fw.close();
			
			
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Good Day");
			bw.close();
			BufferedReader br=new BufferedReader(fr);
			System.out.println(br.readLine());
			
		}
}
