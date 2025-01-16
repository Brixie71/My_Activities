import java.util.Scanner;

public class Grades {

		public static void main(String[] args){
			
		System.out.println("");
		System.out.println("Student List : ");
		System.out.println("");
		String name [] = { "Marco", "Joseph", "Jayson", "Andrew", "Anderson", "Chris", "Peter", "Park", "Alvin", "Brando"};
		System.out.println("");
		for(String n: name){
			System.out.println("Student Name :" +n);
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter Student Name to be Graded : ");
		String s = sc.nextLine();
		
		if(s.equals(name[0])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[0]+" grade "+(d+o+u));
				
		}else if (s.equals(name[1])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[1]+" grade "+(d+o+u)); 
				
		}else if (s.equals(name[2])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[2]+" grade "+(d+o+u)); 
     
		}else if (s.equals(name[3])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade :");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[3]+" grade "+(d+o+u)); 
    
		}else if (s.equals(name[4])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[4]+" grade "+(d+o+u)); 
     
		}else if (s.equals(name[5])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[5]+" grade "+(d+o+u)); 
     
		}else if (s.equals(name[6])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
				System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[6]+" grade "+(d+o+u)); 
     
		}else if (s.equals(name[7])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[7]+" grade "+(d+o+u)); 
     
		}else if (s.equals(name[8])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[8]+" grade "+(d+o+u)); 
     
		}else if (s.equals(name[9])){
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter first grade : ");
				Double d = scan.nextDouble();
				System.out.println("Enter second grade : ");
				Double o = scan.nextDouble(); 
                System.out.println("Enter third grade : ");
				Double u = scan.nextDouble();
				System.out.println(name[9]+" grade "+(d+o+u));
				
		}else{
				System.out.println("Not a Student ");
		}
	}
}