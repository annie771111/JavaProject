package calltestreference;

class TestThreadEx1 implements Runnable{
	@Override
	
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("i=" + i);	
		try {
		Thread.sleep(300);	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		}
	}
}



public class CallTestThreadEx1 {

	public static void main(String[] args) {
		
		TestThreadEx1 Test1= new TestThreadEx1(); 
			Thread thread1 =new Thread(Test1);
			Thread thread2= new Thread(Test1);
			thread1.start();
			thread2.start();
		System.out.println("finished");
	}

}
