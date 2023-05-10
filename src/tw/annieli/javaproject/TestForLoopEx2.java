package tw.annieli.javaproject;

public class TestForLoopEx2 {

	public static void main(String[] args) {
	long sum=0;	
    for (int i=1;i<10000;i++) {
    sum=sum+1;	
    //System.out.println("i=" + i + " sum=" + sum);	
    }
    System.out.println("sum_total ="+sum);
	}

}
