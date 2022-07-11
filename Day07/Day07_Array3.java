
public class Day07_Array3 {

	public static void main(String[] args) {
		
		
		int[][] arr = { { 20, 30 , 15, 35 }, { 100, 30, 60 }};

		for(int i=0; i<arr.length; i++) {
		    
			for(int j=0; j<arr[i].length; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    
			System.out.println();
		}

	}

}
