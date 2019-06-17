import java.util.Arrays;

public class deeptostringmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] [] groups = { 
				{"BMW", "Audi" },
				{" Toyota", "Honda", "Hyundai" },
				{ "Spartan", "Horse" } };
		
		
		
		System.out.println(Arrays.deepToString(groups));//hepsini array icinde print edior loopsuz

	}

}
