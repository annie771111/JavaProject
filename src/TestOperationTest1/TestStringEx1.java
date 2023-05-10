package TestOperationTest1;

public class TestStringEx1 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2=new String ("Hello");
		String str3="hello";
		
		System.out.println(str1+ ",Annie");
		
		System.out.println("(str1==str2)"+(str1==str2));
		System.out.println("str1.equals(str2)="+str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2)=" + str1.equalsIgnoreCase(str2));
        
        System.out.println("(str1==str3)=" + (str1==str3));
        System.out.println("str1.equals(str3)=" + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3)=" + str1.equalsIgnoreCase(str3));
		

	}

}
