package calltestreference;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferFileStreamByteIOEx2 {

	public static void main(String[] args) {
//		FileInputStream file1 = new FileInputStream("c:/temp/test/hello.txt");
//		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		
		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("c:/temp/yo.txt"));
		
//		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/result.txt");
//		BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
		
		BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("c:/temp/result.txt"));
		
		//FileOutputStream fos1 = new FileOutputStream("c:/temp/test/result.txt", true);

		int data;
		while((data=bis1.read())!=-1) {
			System.out.print((char)data);
			bos1.write(data);
		}
		
		bos1.close();
//		fos1.close();
		bis1.close();
//		file1.close();

	}

}
