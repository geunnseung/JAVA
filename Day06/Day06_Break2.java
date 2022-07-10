
public class Day06_Break2 {

	public static void main(String[] args) {
		
		
		int sum =0;
		
		while(true) {
			if(sum > 50) {
				break;
			}
			
			System.out.println(sum);
			sum++;
			System.out.println(sum);
		}
		
		
		System.out.println(sum);
		
	}
}
