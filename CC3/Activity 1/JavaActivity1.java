import java.util.Scanner;

public class JavaActivity1{

		public static void main(String args[]){
		
				String nickname;
				int age;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("What is your nickname?");
				nickname=sc.nextLine();
				
				System.out.println("How old are you?");
				age=sc.nextInt();
			
				System.out.println("==User Information==");
				System.out.println("Name : " +nickname);
				System.out.println("Age  : " +age);
		}
}