package calltestreference;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestByteConvertCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
//		InputStream is = System.in;
//		InputStreamReader isr1 = new InputStreamReader(is);   //byte->char
//		BufferedReader br1 = new BufferedReader(isr1);  //buffer
		
		System.out.println("please input your Name:(use Qor q to exit) ");
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));

		
		String data;
		while((data=br1.readLine())!=null) {
			if("Q".equalsIgnoreCase(data)) {
				break;
		}
		System.out.println("data=" + data );
	}
      System.out.println("finfished");
		
     br1.close();
     }
}
