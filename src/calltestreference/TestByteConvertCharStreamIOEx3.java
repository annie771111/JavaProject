package calltestreference;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class TestByteConvertCharStreamIOEx3 {

	public static void main(String[] args) throws Exception {
		System.out.println("please input your name:(use Q or q to exit)");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/screct.txt");
//		OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
//		BufferedWriter bw1 = new BufferedWriter(osw1);
		
		BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/screct.txt")));
		String data;
		while((data = br1.readLine())!=null) {
			if("Q".equalsIgnoreCase(data)) {
				break;
			}
			System.out.println("data=" + data);
			bw1.write(data);
			bw1.newLine();
			
		}
		bw1.flush();		
		System.out.println("finished");
		
		bw1.close();
		br1.close();
	
	
	
	}
	
	

}
