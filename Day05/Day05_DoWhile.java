public class Day05_DoWhile {
	public static void main(String[] args) {
		
		
		int i=1; 
		
		do {
			int j = 1; 
			do {
				System.out.print(i+"*"+j+"="+i*j+"\n"  );
				j++; 
			} while (j<=9); 
				i++; 
				
				System.out.println();
		} while (i<=9); 
	}
}