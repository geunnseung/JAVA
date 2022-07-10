
public class Day06_Continue{
	
	public static void main(String[] agrs) {
		
		for ( int i=1; i<=50; i++) {
			if( i % 5 ==0) {
				continue;
			}
			
			System.out.println(i);
			
		}
	}
}

//continue문은 만나면 해당 반복부분 탈출 후 다음반복을 실행