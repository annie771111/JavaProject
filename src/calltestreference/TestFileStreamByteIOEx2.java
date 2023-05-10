package calltestreference;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestFileStreamByteIOEx2 {

	public static void main(String[] args) throws IOException, Exception {
		FileInputStream file1=new FileInputStream("C:/temp/yo.txt");
		FileOutputStream fos1 = new FileOutputStream("c:/temp/result.txt");
		//FileOutputStream fos1 = new FileOutputStream("c:/temp/result.txt", true);
     
		
		int data ;
		while((data=file1.read())!=-1) {
			System.out.print((char)data);
			fos1.write(data);
			
		}
		fos1.close();
		file1.close();
		
	}

}
