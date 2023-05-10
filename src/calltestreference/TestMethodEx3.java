package calltestreference;

public class TestMethodEx3 {
 public int f(int x) {
	 return 2* x+1;
 }

	public static void main(String[] args) {
		TestMethodEx3 test3 = new TestMethodEx3();
		int y = test3.f(5);
		System.out.println("y=" + y);

	}

}
