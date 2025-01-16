import java.util.Scanner;

public class BrionProgram2{
	
	static String item;
	static int score;
	static Scanner sc = new Scanner(System.in);
	static Scanner scNum=new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("");
		System.out.println("Welcome!, Answer the following Math Problems by Inputting the correct answer");
		System.out.println(" Press Enter to Continue >>>");
		System.out.println("");
		itemInfo1();
		itemInfo2();
		itemInfo3();
	}
	public static void itemInfo1(){
		System.out.print(" 1. 440 + 210 = ");
		item=sc.nextLine();
		if (item.equals("650")){
			System.out.println("Correct!");
		System.out.println("");
		System.out.println("");
		}else{
			System.out.println("Wrong!");
		System.out.println("");
		System.out.println("");
			
		}
	}
	
	public static void itemInfo2(){
		System.out.print(" 2. 938 + 719 = ");
		item=sc.nextLine();
		if (item.equals("1657")){
			System.out.println("Correct!");
		System.out.println("");
		System.out.println("");
		}else{
			System.out.println("Wrong!");
		System.out.println("");
		System.out.println("");
		}
	}
	public static void itemInfo3(){
		System.out.print(" 3. 650 + 781 = ");
		item=sc.nextLine();
		if (item.equals("1431")){
			System.out.println("Correct!");
		System.out.println("");
		System.out.println("");
		}else{
			System.out.println("Wrong!");
		System.out.println("");
		System.out.println("");
		}
	}
}