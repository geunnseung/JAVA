import java.util.Scanner;
public class Ch08_Scanner {

	public static void main(String[] args) {
		//Scanner
		//화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
		//import문 추가
		//import java.util.*;
		//Scanner 객체의 생성
		//Scanner scanner = new Scanner(System.in);
		//Scanner 객체의 사용
		//int num = scanner.nextInt();
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		System.out.println(num);
		
		String input = scanner.nextLine();
		int num2 = Integer.parseInt(input);
		
		System.out.println(num2);
		

	}

}
