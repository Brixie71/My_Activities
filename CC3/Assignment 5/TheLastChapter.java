/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brion
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class TheLastChapter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String statement;
		String statement2;
		String statement3;
		
		System.out.println("Chapter 6 and 7 Application");
                System.out.println(" ");
                System.out.println(" Note : You can input any words you want here. "
                        + "        \nbut the 1st statement should be \"Java Programming\","
                        + "        \nthe 2nd should be the word \" Python Programming\" "
                        + "        \nand the 3rd statement should be all caps with the "
                        + "        \nword \"JAVA PROGRAMMING\""
                        + "        \nbut all three Statements or Words can be a random word");
                System.out.println(" ");
                System.out.println("Please input a Word or Statement : ");
                statement = input.nextLine();
                System.out.println("Please input a 2nd Word or Statement : ");
                statement2 = input.nextLine();
                System.out.println("Please input a 3rd Word or Statement in Capital Letters : ");
                statement3 = input.nextLine();
                
                System.out.println("==============================");
                System.out.println("Assignment : ");
                System.out.println(" ");
		System.out.println("==============================");
                
                System.out.println("==========");
                System.out.println(" ");
                System.out.println(" ° toCharArray() method 1.1 ° ");
                System.out.println(" ° Output ° ");
                System.out.println(" ");
                
                System.out.println(" Statement # 1 : " +statement);
                char[] convert = statement.toCharArray();
                System.out.println("Character Array Per Line : ");
                for (int w = 0; w < convert.length; w++){
                    
                    System.out.println(convert[w]+" ");
                    
                }
                System.out.println(" ");
		System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
                
		System.out.println("==============================");
                System.out.println("CHAPTER 6 and 7 Codes for the Last Lesson");
                System.out.println(" ");
		System.out.println("==============================");
                
                // CODE # 1.1
                
                System.out.println("==========");
                System.out.println(" ");
                System.out.println(" ° CharAt() method 1.1 ° ");
                System.out.println(" ° Output ° ");
                System.out.println(" ");
	   
  
                System.out.println("Using Statement 1, ");
                for(int i=0; i<=statement.length()-1;i++){
                    System.out.print("" + statement.charAt(i));
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
		
		System.out.println("==========");
                System.out.println(" ");
                System.out.println(" ° CharAt() method 1.2 ° ");
                System.out.println(" ° Output ° ");
                System.out.println(" ");
	  
                // CODE # 1.2
                System.out.println("Using Statement 1, ");
                for(int i=0; i<=statement.length()-1;i++){
                    System.out.println("" + statement.charAt(i));
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
	
                // CODE # 1.3
                System.out.println("==========");
                System.out.println(" ");
                System.out.println(" ° The CharAt() method 1.3 ° ");
                System.out.println(" ° Output ° ");
                System.out.println(" ");
	    
                System.out.println("Using Statement 1, ");
                char ch1 = statement.charAt(0);
                char ch2 = statement.charAt(3);
                char ch3 = statement.charAt(5);
                char ch4 = statement.charAt(7);
	    
                System.out.println("Character at index 0 is : " +ch1);
                System.out.println("Character at index 3 is : " +ch2);
                System.out.println("Character at index 5 is : " +ch3);
                System.out.println("Character at index 7 is : " +ch4);
                System.out.println(" ");
                System.out.println("==========");
                System.out.println(" ");
	    
		// CODE # 2
                
		System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° equalsIgnoreCase() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
                
		System.out.println(" ");
		System.out.println("Statement 1 is equal to Statement 2 : " +statement.equalsIgnoreCase(statement2));
		System.out.println("Statement 1 is equal to Statement 3 : " +statement.equalsIgnoreCase(statement3));
		System.out.println("Statement 1 is equal to Java Programming :  "+statement.equalsIgnoreCase("Java Programming"));
		System.out.println("Statement 2 is equal to Python Programming : " +statement2.equalsIgnoreCase("Python Programming"));
		System.out.println("Statement 3 is equal to Statement 2 : " +statement3.equalsIgnoreCase(statement2));
		System.out.println("Statement 3 is equal to \"JAVA PROGRAMMING\" : " +statement3.equalsIgnoreCase("JAVA PROGRAMMING"));
		System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
		
		System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° startsWith() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
		
                
                // Code 3
                System.out.println("Statement 1 Starts with the word \"Java\" : "+statement.startsWith("Java"));
                System.out.println("Statement 1 Starts with the word \"Python\" : " +statement.startsWith("Python"));
		System.out.println("Statement 2 Starts with the word \"Python\" : " +statement2.startsWith("Python"));
		System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
		
		System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° endsWith() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
		
                System.out.println("Statement 1 Ends with the word \"Programming\" : "+statement.endsWith("Programming"));
                System.out.println("Statement 2 Ends with the word \"Program\" : " +statement2.endsWith("Program"));
		System.out.println("Statement 3 Ends with the word \"Language\" : " +statement3.endsWith("Language"));
		System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
                
                // CODE # 4
                System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° indexOf() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
               
                System.out.println("Using the 1st Statement, ");
                char stateCh = 'J';
                char stateCh2 = 'P';
                String subStatement = "ming";
                int posOfJ = statement.indexOf(stateCh);
                int posOfP = statement.indexOf(stateCh2);
                int posOfSubstatement = statement.indexOf(subStatement);
                System.out.println(posOfJ);
                System.out.println(posOfP);
                System.out.println(posOfSubstatement);
                System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
                
                // CODE # 5
                System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° toLowerCase() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
                
                System.out.println("Using the 3rd Statement, ");
                System.out.println(statement3.toLowerCase());
                System.out.println(statement3.toLowerCase(Locale.US));
                System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
                
                // CODE # 6
                System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° toUpperCase() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
                
                System.out.println("Using the 1st Statement, ");
                System.out.println(statement.toUpperCase());
                System.out.println(statement.toUpperCase(Locale.US));
                System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
                
                 // CODE # 7
                System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° replace() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
                
                System.out.println("Using the 1st Statement, ");
                System.out.println("Statement 1 after replacing the word \"Java\""
                        + "       \nwith the word \"C++\" : ");
                System.out.println(statement.replace("Java", "C++"));
                
                System.out.println("Statement 2 after replacing the word \"Python\""
                        + "       \nwith the word \"Visual Basic\" : ");
                System.out.println(statement2.replace("Python", "Visual Basic"));
                System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
                
                
                // 2nd to the LAST CODE
                System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° concat() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
                
                System.out.println("The three statements are combined using String Concatenation Method"
                        + "      \nusing the 1st Statement.");
                statement = statement.concat(" cannot be ");
                statement = statement.concat(statement2 +",");
                statement = statement.concat(" but can be " +statement3);
                System.out.println(statement);
                System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
                
                // CODE # LAST CODE
                System.out.println("==========");
		System.out.println(" ");
		System.out.println(" ° replaceAll() method ° ");
		System.out.println(" ° Output ° ");
		System.out.println(" ");
                
                System.out.println("Using the 1st Statement, ");
                System.out.println("Replacing the Word " +statement3 +"'s letter"
                        + "        \n\"A\" With \"U\" : ");
                System.out.println(statement3.replaceAll("A", "U"));
                System.out.println("Replacing the Whole Statement \"" +statement3 +"\" with : ");
                System.out.println(statement3.replaceAll(statement3,"Thank you for Running my Program Sir!"));
                
                System.out.println(" ");
		System.out.println("==========");
		System.out.println(" ");
 
	}
}
