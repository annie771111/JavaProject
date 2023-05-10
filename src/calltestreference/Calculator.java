package calltestreference;

class caculator1 {
	public void plus(int x1,int y1) {
		System.out.println("x1+y1"+(x1+y1));
	}
	
	public void minus(int x2,int y2) {
		System.out.println("x2-y2"+(x2-y2));
	}
}


public class Calculator {

	public static void main(String[] args) {
		caculator1 casio=new caculator1 ();
		casio.plus(0, 0);
	    casio.minus(5,3);
	System.out.println("finished");
	
	
	}

}
