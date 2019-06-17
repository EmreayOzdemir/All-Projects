import java.util.Arrays;

public class foreachloopmultidimensiol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data2[] = new int[] { 1, 2, 3 };
		int data3[] = new int[] { 8, 1, 5 };
		
		int nums [][] = new int [2][];
		nums[0]= data2;
		nums[1]= data3;
		int total = 0;
		
		
		for(int i=0; i<nums.length; i++) {
			
			System.out.println(Arrays.toString(nums[i]));
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int []row1 : nums) {
			
			for(int column : row1) {
				total+=column;
			}
			
		}
		System.out.println("result is: "+total);
	}

}
