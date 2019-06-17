import java.util.Arrays;
import java.util.Scanner;

public class Arraysortingapril131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int [] nums= {1,2,3,4,5};
     int index=Arrays.binarySearch(nums, 5);//binarysearch it takew your array and search for the index Array object must be sorted before using this method.
     System.out.println(index);
     Arrays.sort(nums);
     System.out.println( Arrays.toString(nums) );
     // ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
     int index1 = Arrays.binarySearch(nums, 5) ;
     System.out.println(index1);
     
	}

}
