
public class Day3_Object {

	public static void main(String[] args) {
		
		//클래스명 변수명;
		//변수명 = new 클래스명();
		
		//1. 클래스 작성
		//2. 객체의 생성
		//3. 객체의 사용
		

		class Tv {
			String color;
			boolean power;
			int channel;
			
			void power() {
				power = !power;
			}
			void channelUp() {
				channel++;
				
			}
			void channelDown() {
				channel--;
				
			}
			//메소드
			
		}
		//1. 클래스(설계도) 작성
		
		Tv t;
		t = new Tv();
		//2. 객체의 생성
		
		t.channel =7;
		t.channelDown();
		System.out.println("현재 채널은 " +t.channel + "입니다.");
		//3. 객체의 사용
	}

}
