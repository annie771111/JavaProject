package calltestreference;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferFileStreamByteIOEx1 {

	public static void main(String[] args) {
		//FileInputStream file1= FileInputStream("C:/temp/yo.txt");
		//BufferedInputStream bis1=new BufferedInputStream(file1);
			
		
		BufferedInputStream bis1;
		try {
			bis1 = new BufferedInputStream(new FileInputStream("C:/temp/yo.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		int data;
		try {
			while((data = bis1.read())!=-1) {
				System.out.print((char)data);
				
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bis1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fis1.close();
}
}
