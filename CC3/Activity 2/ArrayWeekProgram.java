public class ArrayWeekProgram{
		
	public static void main(String[] args){
			
			String OneWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
			System.out.println("\n **** Output  **** ");
			for(int i = 0; i < OneWeek.length; i++){
					OneWeek[4] = OneWeek[4].replace("Friday", "TGIF");
					System.out.println(OneWeek[i]);
			}
	}	
}
