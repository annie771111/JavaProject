package TestOperationTest1;

public class TestDimArrayEx3 {

	public static void main(String[] args) {
		int[][]data =new int[2][3];
		data[0][0]=1;
		data[0][1]=2;
	    data[0][2]=3;
	    
	    
	    data[1][0]=4;
	    data[1][1]=5;
	    data[1][2]=6;

		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				System.out.println("data[" + i + "]["+ j + "]=" + data[i][j]);
			}
				//for-each loop
				for(int[] myArray: data) {
					for(int value: myArray) {
						System.out.println("value:" + value);
				}
	}

	}
		}
	}
	
		
	
