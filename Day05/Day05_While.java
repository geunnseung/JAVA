public class Day05_While {
	public static void main(String[] args) {
		
		
		int sum_total = 0, sum_odd = 0, sum_even = 0; 
		
		int i = 1; 
		while (i <= 50) { 
			sum_total += i; 
			
			if (i % 2 == 0) { 
				sum_even += i; 
			} else {
				sum_odd += i;
			}
			
			i++;
		}
		
		
		System.out.println("1부터 50까지 합 = " + sum_total); 
		System.out.println("1부터 50까지 짝수만의 합 = " + sum_even); 
		System.out.println("1부터 50까지 홀수만의 합 = " + sum_odd); 
	}
}