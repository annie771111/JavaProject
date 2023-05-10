package TestOperationTest1;

public class TestNumberSortEx1 {
	public static void main(String[] args) {
	int[] data = { 4, 7, 26, 9, 11 };

	for (int i = 0; i < data.length - 1; i++) {
		for (int j = i + 1; j < data.length; j++) {
			int temp = 0;

			if (data[i] < data[j]) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
	}

	for (int k = 0; k < data.length; k++) {
		System.out.println("data[" + k + "]=" + data[k]);
	}
}

}

	
