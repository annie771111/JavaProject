
public class TestDiceThrowEx2 {

	public static void main(String[] args) {
		int yourLuckyNumber=4;
		int count =0;
		while (true) {
			int dicenumber 	=(int)(Math.random()*6)+1;
            System.out.println("dicenumber="+dicenumber);
            
            if (yourLuckyNumber ==dicenumber) {
            	System.out.println("You win !!");
            	break;	
            }else	{
            	System.out.println("try Again");
            	count++;
            	
            }
	}
	 System.out.println("count=" + count);
		System.out.println("finished");

	}
}
