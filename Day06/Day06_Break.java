
public class Day06_Break{
	
	public static void main(String[] agrs) {
		
		for ( int i=1; i<=50; i++) {
			
			if( i % 37 ==0) {
				break;
			}
			
			System.out.println(i);
			
		}
	}
}

//break문은 만나는 즉시 반복문 전체 탈출