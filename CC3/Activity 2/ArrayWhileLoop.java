import java.util.Scanner;

public class ArrayWhileLoop{
	
		private static Scanner sc;
		public static void main(String[] args){
			
		int i = 0,j = 0, PrintAge, PrintName;
		sc = new Scanner(System.in);
	 
		PrintName = 5;
		PrintAge = 5;	
		
		String[] Name = {"Student A", "Student B", "Student C", "Student D", "Student E"};
		int Array[] = {16, 20, 17, 18, 17};
		
		System.out.println("\n **** Here are the ages of the Five Students  **** ");
		while (i < PrintAge && j < PrintName)
		{
			System.out.print(Name[j] +" = Age : ");
			System.out.print(Array[i] +", ");
			j++;
			i++;
		}
	}
}