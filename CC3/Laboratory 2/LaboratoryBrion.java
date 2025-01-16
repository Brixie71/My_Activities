
import java.util.Scanner;
import java.util.Arrays;

public class LaboratoryBrion {
        
        public static void main(String[] args){
            
                String name;
                String confirmName;
                String finalization;
                int n = 4;
                int i = 1;
                Scanner input = new Scanner(System.in);
                
                System.out.println("==== The Handsomeness Progam ====");
                System.out.println("Please Confirm if This Person is Handsome");
                
                
                System.out.println("Name : ");
                name = input.nextLine();
                    
                System.out.println("Confirm Name : ");
                confirmName = input.nextLine();
                
                System.out.println("Enter Name or Nickname : ");
                finalization = input.nextLine();
                
                while(i <= n){
                    
                    if(name.equals(confirmName)){
                        String[] handsome = {" is Handsome and a Good Person"," is not Handsome, But a Good Person with a Heart"};
                        String Statement;
                        System.out.println("Name Confirmed!" );
                        System.out.println("is he handsome? YES or NO (Note : should be Capital!)");
                        Statement = input.nextLine();
                        if(Statement.equals("YES")){
                            System.out.println(confirmName.concat(handsome[0]));
                            System.out.println(name.equals(confirmName) + "\n");
                            System.out.println(name.equals(finalization));
                        }else if(Statement.equals("NO")){
                            System.out.println(confirmName.concat(handsome[1]));
                            System.out.println(name.equals(confirmName) + "\n");
                            System.out.println(name.equals(finalization));
                        }
                    break;    
                    }else{
                        System.out.println("Name Denied!");
                        System.out.println("Please Re-enter the Name!");
                        System.out.println("");
                    i++;
                    }
                    if(name.equalsIgnoreCase(confirmName)){
                        String[] handsome = {" is Handsome and a Good Person"," is not Handsome, But a Good Person with a Heart"};
                        String Statement;
                        System.out.println("Name Confirmed!" );
                        System.out.println("is he handsome? YES or NO (Note : should be Capital!)");
                        Statement = input.nextLine();
                        if(Statement.equals("YES")){
                            System.out.println(confirmName.concat(handsome[0]));
                            System.out.println(name.equals(confirmName) + "\n");
                            System.out.println(name.equals(finalization));
                        }else if(Statement.equals("NO")){
                            System.out.println(confirmName.concat(handsome[1]));
                            System.out.println(name.equals(confirmName) + "\n");
                            System.out.println(name.equals(finalization));
                        }
                    break;
                    }else{
                        System.out.println("Name Denied!");
                        System.out.println("Please Re-enter the Name!");
                        System.out.println("");
                    i++;    
                    }
                }
                if(i > 4){
                    System.out.println("You have entered a wrong Name 5 times!");
                    System.out.println("We will now terminate the Program...");
                    System.out.println("Thank you!");
                    System.exit(0);
                }
        }
}
