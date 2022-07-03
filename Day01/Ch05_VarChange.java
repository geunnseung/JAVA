
public class Ch05_VarChange {

	public static void main(String[] args) {
		
		//int x = 10, y = 20;
		// x = y;
		// y = x;
		// x = 20 ; y =20;
		
		int x = 10, y = 20;
		int tmp;
		
		
		System.out.println(x);
		System.out.println(y);

		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
