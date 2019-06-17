import java.util.Arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = new int[4][2]; 
		data[0][0] = 12;
		data[0][1] = 17;
		data[1][0] = 3;
		data[1][1] = 40;
		data[2][1] = 44;
		data[2][2] = 27;
		int[][] data2 = new int[2][4];
	    int[] data3[] = new int[3][2] ;  
	    int data4[][] = new int[2][2] ; 
	    
	    //2.bi code burdaki sample seklinde 
		  int[] nums1 = new int[] {1,3,5} ; 
		    int[] nums2 = new int[] {1,13} ; 
		    
		    // 2 dimesional array is an array object that store 
		    // 1 dimensional array in each slot 
		    
		    int[][] numsOfnums = new int[2][] ;
		    // length method on an array will always return first dimension length
		    System.out.println( numsOfnums.length );
		    
		    numsOfnums[0] = nums1 ; 
		    numsOfnums[1] = nums2 ; 
		    
		    for (int i = 0; i < numsOfnums.length; i++) {
		      
		      System.out.println( Arrays.toString(numsOfnums[i])  );
		      System.out.println( numsOfnums[i].length  );
		      
		    }
		    

	}

}
