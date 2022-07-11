
public class Day07_Array2 {

	public static void main(String[] args) {
		
		int[] num = {70, 20, 40, 60, 50, 30, 10};

		int min = num[0]; 
		int max = num[0]; 

		for(int s : num) {
		    if(s<min) min = s;
		    if(s>max) max = s;
		}

		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

	}

}
