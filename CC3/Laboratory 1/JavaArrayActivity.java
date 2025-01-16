public class JavaArrayActivity {
	public static void main(String[] args) {
		
		int[] age = new int[5];
		age[0] = 16;
		age[1] = 20;
		age[2] = 17;
		age[3] = 34;
		age[4] = 43;
		System.out.println("First Element is " +age[0]);
		System.out.println("Last Element is " +age[4]);
		
		
		for ( int i : age){
			System.out.println("Age is = " +i);
		}
	}
}