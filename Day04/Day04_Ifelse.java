
public class Day04_Ifelse {
	public static void main(String[] args) {
		
		
		int a = 5, b = 10, c = 3;
		int max;
		
		if (a > b && a > c) {  
			max = a;  
		} else {  
			if (b > c) {
				max = b; 
			} else {
				max = c; 
			}
		}
		System.out.println("최댓값은 " + max);
	}
}
