package calltestreference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.stream.Stream;

public class TestByteConvertCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		System.out.println("please Enter your name:(Use Qor q to finished))");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		Stream<String> stream = br1.lines();
		Iterator<String> i1 = stream.iterator();
		while (i1.hasNext()) {
			String data = i1.next();
			if ("Q".equalsIgnoreCase(data)) {
				break;
			}
			System.out.println("data2:" + data);
		}
		System.out.println("finished");
		
		
		stream.close();
		br1.close();
	}

}
