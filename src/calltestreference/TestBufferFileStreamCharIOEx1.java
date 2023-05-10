package calltestreference

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class TestBufferFileStreamCharIOEx1 {

	public static void main(String[] args) {
		//FileReader fr1= new FileReader("c:/temp/yo.txt");
		
		//BufferedReader br1 =new BufferedReader(fr1);
		
		BufferedReader br1 =new BufferedReader(new FileReader("c:/temp/yo.txt"));
		
		
		String data;
		while((data=br1.readLine())!=null);{
		System.out.println(data);
		
	}
		br1.close();
		//fr1.close();
	}
}
