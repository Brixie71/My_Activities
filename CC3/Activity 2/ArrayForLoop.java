public class ArrayForLoop{
	
		public static void main(String[] args){
			
			String [] Name = {"Student A", "Student B", "Student C", "Student D", "Student E"};
			int [] Age = {16, 20, 17, 18, 17};
			
			System.out.println("\n **** Here are the ages of the Five Students  **** ");
			for(int i = 0; i < Name.length; i++){
				System.out.print(Name[i] +" = Age : " +Age[i] + "," + "\t");
			}	
		}
}