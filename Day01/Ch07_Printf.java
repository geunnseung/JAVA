
public class Ch07_Printf {

	public static void main(String[] args) {
		
		//println()의 단점
		//출력형식 지정불가
		//1. 실수 자리수 조절불가
		//2. 10진수로만 출력
		System.out.println(10/3);
		//정수 / 정수 = 정수
		System.out.println(10.0/3);
		
		//printf()로  출력형식 지정가능
	
		System.out.printf("%.2f", 10.0/3);
		
		//지시자
		//정렬
	}

}
