package TestOperationTest1;

public class TestStringEX2 {

	public static void main(String[] args) {
	String data=("abcdefghij");
	System.out.println("Length"+ data.length());
	System.out.println("charAt(3):"+ data.charAt(3));
	System.out.println("data.substing(3,5):" + data.substring(3, 5));
	System.out.println("data.substing(3):" + data.substring(3));
	System.out.println("data.toUpperCase():" + data.toUpperCase());
    System.out.println("data.IndexOf('de'):"+ data.indexOf("de"));
    System.out.println("data.startsWith('abc'):" + data.startsWith("cba"));
	}

}
