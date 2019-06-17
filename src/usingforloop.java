import java.util.Arrays;
import java.util.Random;

public class usingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] numbersTable = new int[4][5];    

		    //fill the array with random numbers
		    Random rand = new Random();
		    for (int i = 0; i < numbersTable.length; i++) {
		      for (int j = 0; j < numbersTable[i].length; j++) {
		        numbersTable[i][j] = rand.nextInt(20);
		      }
		    }
		    
		    //print the array
		    System.out.println("Table of random numbers:");
		    for (int[] numbers : numbersTable) {
		      System.out.println(Arrays.toString(numbers));
	}

}
}
