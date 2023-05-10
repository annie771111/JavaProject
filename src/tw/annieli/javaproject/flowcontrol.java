package tw.annieli.javaproject;
import java.io.Console;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              import java.util.Arrays;

public class flowcontrol {

	
public static void main(String[] args) {
	 Console console = System.console();

	String yourName = console.readLine("PLease Enter Your Name:");
	String yourAge = console.readLine("PLease Enter Your Age:"); 
	char[] yourPwd = console.readPassword("PLease Enter Your Password:"); 
			
	int age = Integer.parseInt(yourAge);
   console.printf("Your Name%s\n", yourName);
   console.printf("Your Age:%s\n", yourAge+1);
   console.printf("Your Age%s\n", yourAge);
   console.printf("Your Password%s\n", Arrays.toString(yourPwd));
   console.printf("Your Age2:%d\n", (age+1));
     
}

}