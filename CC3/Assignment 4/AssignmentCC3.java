/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentcc3;

/**
 *
 * @author Brion
 */
import java.util.Scanner;

public class AssignmentCC3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name[] = new String[3];
        Scanner sc = new Scanner(System.in);
        
        for(int employees = 0; employees < 3; employees++){
                
                System.out.println("Enter Name : " +employees+1);
                name[employees] = sc.next();
        }
        
        sc.close();
        System.out.println("");
        System.out.println("Sorted Employee List : ");
        for(int employees = 0; employees < 3; employees++){
                System.out.println(name[employees]);
        }
        
        System.out.println("");
        System.out.println("Reversed Employee List : ");
        for(int i = name.length - 1; i >= 0; i--){
            System.out.println(name[i]);
        }
    }
    
}
