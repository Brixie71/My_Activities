public class ArrayDoWhileLoop{
	
		public static void main(String[] args){
			
		int i = 0,j = 0, PrintAge, PrintName;
	 
		PrintName = 5;
		PrintAge = 5;	
		
		String[] Name = {"Student A", "Student B", "Student C", "Student D", "Student E"};
		int Age[] = {16, 20, 17, 18, 17};
		
		
		System.out.println("\n **** Here are the ages of the Five Students  **** ");
		do{System.out.print(Name[j] +" = Age : ");
			System.out.print(Age[i] +", ");
			i++;
			j++;
		}
		while (i < PrintAge && j < PrintName);
	}
}