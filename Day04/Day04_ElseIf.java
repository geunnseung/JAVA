
public class Day04_ElseIf {
	public static void main(String[] args) {
		
		int kg = 77;
		if(kg>=60 && kg<70){	
			
			System.out.println("정상체중");
		
		}else if(kg<60){	
			
			System.out.println("저체중");
		}else{
			
			System.out.println("비만");
		}
	}
}
