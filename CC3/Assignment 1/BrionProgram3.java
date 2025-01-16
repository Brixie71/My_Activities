import java.util.Scanner;

public class BrionProgram3{
	
		public static void main(String args[]){
				
			String name, school;
		int age;

		Scanner sc=new Scanner(System.in);
		Scanner scNum=new Scanner(System.in);
		System.out.print("Name : ");
		name=sc.nextLine();
		System.out.print("Age : ");
		age=scNum.nextInt();
		System.out.print("School : ");
		school=sc.nextLine();
		
		System.out.println("");
		display(name, school, age);
		display(age, school, name);
		display(school, age, name);
		}
		
		public static void display(String name, String school, int age){
			System.out.println("=======================");
			System.out.println("Name : " +name);
			System.out.println("School : " +school);
			System.out.println("Age : " +age);
		}
		public static void display(int age, String school, String name){
			System.out.println("=======================");
			System.out.println("Name :" +name);
			System.out.println("Age : " +age);
			System.out.println("School : " +school);
		}
		public static void display(String school, int age, String name){
			System.out.println("=======================");
			System.out.println("Age : " +age);
			System.out.println("School : " +school);
			System.out.println("Name : " +name);
			System.out.println("=======================");
		
	}
}