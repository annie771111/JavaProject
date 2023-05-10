package calltestreference;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileStreamCharIOEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fr1= new FileReader("c:/temp/yo.txt");
		
		
		int data;
		while((data = fr1.read())!=-1){
			System.out.print((char)data);
		}
		fr1.close();
	}
	

}

