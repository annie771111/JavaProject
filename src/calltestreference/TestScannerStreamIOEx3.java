package calltestreference;

import java.util.Scanner;
public class TestScannerStreamIOEx3 {

	public static void main(String[] args) {
		try {
		
		System.out.println("input your number");
		Scanner s1= new Scanner(System.in);
		
		int num1=s1.nextInt();
		System.out.println("(num1+1)=" + (num1+1));
		
        int num2=s1.nextInt();
        System.out.println("(num2+2=)" + (num2+2));
        
        s1.close();
		}catch(Exception e) {
			System.out.println("please input your correct number");
		}
		
	}

}
