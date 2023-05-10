
public class TestBreakNContinueEx4 {

	public static void main(String[] args) {
		int i=1;
		while ( i<=10){
			if (i==5 ){
				System.out.println("execute continue");
				continue;	
			}
			System.out.println("i="+ i);
			i++;
			System.out.println("finished");
			
		}

	}

}
