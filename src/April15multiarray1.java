import java.util.Scanner;

public class April15multiarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	   String str="Sunday is perfect day to start coding";
	   String reversed="";
	   String [] words=str.split("");
	   for(int i=words.length-1;i>=0;i--) {
		   reversed +=words[i]+"";
	   }
    System.out.println(reversed);
	}

}
