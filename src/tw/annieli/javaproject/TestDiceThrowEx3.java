package tw.annieli.javaproject;

public class TestDiceThrowEx3 {

	public static void main(String[] args) {
		int yourLuckyNumber = 5;
        int count = 0;
        int times = 0;
        int flag = 3;
        //flag 至少中三次才算贏
		while (true) {
			count++;
			
			int diceNumber = (int) (Math.random() * 6) + 1;
			System.out.println("diceNumber=" + diceNumber);

			if (yourLuckyNumber == diceNumber) {
				times++;
				if(times==flag) {
					System.out.println("you win !!");
					break;
				}				
			} else {
				System.out.println("try again");
			}
		}
		
        System.out.println("total count:" + count + " try again:" + (count-1));
		System.out.println("finished");
	}
	

	}


