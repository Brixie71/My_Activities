import java.util.Scanner;

public class BrionProgramV1{
	
	public static void main(String args[]){
		
		// Any Username can be inputted
		// The Password is = TSU1908
	
		String username, password;
		
		Scanner sc = new Scanner(System.in);
		
		password = "TSU1908";
		
		int count = 0;
		
		while (count <=4){
		
			System.out.println("Please Enter your Username and Password");
			System.out.println("///////////////////////////////////////");
			System.out.print("Enter Your Username : ");
			username=sc.nextLine();
			System.out.print("Enter Password : ");
			password=sc.nextLine();
			
			if(password.equals("TSU1908")){
				
				System.out.println("//////////////////////");
				System.out.println("Welcome " +username+"!");
			break;
			
			}else{
				
				System.out.println("//////////////////////");
				System.out.println("Wrong Password!");
			count++;
			
			}
		}

		if (count > 4){
			System.out.println("////////////////////////");
			System.out.println("Account Has been Locked!");
			System.exit(0);
			
		}
	}
}