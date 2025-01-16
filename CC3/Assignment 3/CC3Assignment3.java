import java.util.Arrays;

public class CC3Assignment3{
			
		public static void main(String[] args){
			
				int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
				int	indexDel = 1;

				System.out.println("");
				System.out.println("         Array Values : " +Arrays.toString(array));
				System.out.println("         Index to be Removed : " + indexDel + ", which contains an Element " + array[1]);
				System.out.println("");
				System.out.println("////////////////////////////////////////////////////////////////////////////////////////");
				System.out.println("");
				System.out.println("         Original Array Values : " +Arrays.toString(array));

				for (int i = indexDel; i < array.length -1; i++){
					
						array[i] = array[i + 1];
				
				}
				System.out.println("         After removing the an Element : " +Arrays.toString(array));
				System.out.println("");         
		}
}