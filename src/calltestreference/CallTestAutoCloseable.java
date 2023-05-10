package calltestreference;

public class CallTestAutoCloseable {

	public static void main(String[] args) {
		try(closeabletest1 test1 =new closeabletest1()){
			test1.excuteResource();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
