package overload;

public class Calculatorex2 {
 public void plus(int x,int y) {
	 System.out.println("1.(x+y)="+ (x+y));
 }
		public void plus(double x, double y) {
			System.out.println("2.x+y=" + (x+y));
		}
		
		public void plus(char x, int y) {
			System.out.println("3.x+y=" + (x+y));
	 
 }
 
 
	public static void main(String[] args) {
		Calculatorex2 casio2= new Calculatorex2 ();
		casio2.plus(3, 7);
		casio2.plus(3.14,6.28);
		casio2.plus(3, 7);
		casio2.plus('a', 6);
		
		
	}

}
