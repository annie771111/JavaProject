package calltestreference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TestBufferFileStreamCharIOEx2 {

	public static void main(String[] args) throws IOException {
//		FileReader fr1 = new FileReader("c:/temp/test/hello.txt");
//		BufferedReader br1 = new BufferedReader(fr1);
		
		BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/yo.txt"));
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("c:/temp/destination.txt"));
		
		String data;
		while ((data = br1.readLine()) != null) {
			System.out.println(data);
			bw1.write(data);
			bw1.newLine();
		}
		
		bw1.close();
		br1.close();
		//fr1.close();

	}

}
