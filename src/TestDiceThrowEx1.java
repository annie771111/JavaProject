import java.util.Random;

public class TestDiceThrowEx1 {

	public static void main(String[] args) {
		int yourLuckyNumber = 5;
		
		int diceNum = (int)(Math.random()*6+1);
        System.out.println("diceNum:" + diceNum);
        
        if(yourLuckyNumber==diceNum) {
        	System.out.println("You Win !!");
        }else {
        	System.out.println("try again");
        }
        
        System.out.println("keep alive");
}
}