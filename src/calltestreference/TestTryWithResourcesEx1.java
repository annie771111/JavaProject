package calltestreference;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class TestTryWithResourcesEx1 {

	public static void main(String[] args) {
		File file1=new File("C:/temp/yo.txt");
		try(FileInputStream fis1 = new FileInputStream(file1)){
			int data;
			while((data = fis1.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}


