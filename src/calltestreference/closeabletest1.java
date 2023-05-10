package calltestreference;

public class closeabletest1 implements java.lang.AutoCloseable {
   public void excuteResource() {
	   System.out.println("excute Resources ");

}
	@Override
	public void close() throws Exception {
		System.out.println("Resources closed ");
	}

}
