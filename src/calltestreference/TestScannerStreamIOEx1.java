package calltestreference;
import java.util.Scanner;
public class TestScannerStreamIOEx1 {

	public static void main(String[] args) {
		System.out.println("enter your favorite fruit:(use Q or q to exit)");
		Scanner s1= new Scanner (System.in);
		
		while(s1.hasNext()) {
			String fruit =s1.next();
			
			if("Q".equalsIgnoreCase(fruit)) {
				break;
				
			}
			System.out.println("fruit:" + fruit);
		}
		System.out.println("finished");
		s1.close();
	}

}
