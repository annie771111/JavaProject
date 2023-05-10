package TestOperationTest1;

import java.util.Arrays;
import java.util.Comparator;

public class TestNumberSortEx3 {

	public static void main(String[] args) {
		Integer[] data = { 4, 7, 28, 11, 14};
		
		//Arrays.sort(data);
		
		Arrays.sort(data, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		for (int k = 0; k < data.length; k++) {
			System.out.println("data[" + k + "]=" + data[k]);
	}

}
}

