package calltestreference;

public class TestVarArgsEx1 {
	public void plus(int... values) {
		int sum=0;
		for(int num:values) {
			sum = sum+num;
		}
		System.out.println("sum=" + sum);
	}
		
		public static void main(String[] args) {
			TestVarArgsEx1 varargs1=new TestVarArgsEx1();
			varargs1.plus(null);
			varargs1.plus(1,2,3,4,5,6);
			varargs1.plus(1,2,3,4,5,6,7,8,9,10);
			varargs1.plus(new int[] {1,2,3,4,5});
	}

}
