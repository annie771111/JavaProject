package Array;

public class Test1DimRefArrayEx1 {

	public static void main(String[] args) {
		String[] fruit= new String[3];
		
		fruit[0]="guava";
	    fruit[1]="durian";
	    fruit[2]="watermelon";
		
       for(int i=0;i>=fruit.length;i++) {
	  System.out.println("fruit [" + i +  " ] ="+ fruit[i]);
  }
	}

}
