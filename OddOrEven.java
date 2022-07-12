package week1.day1;

public class OddOrEven {

	public static void main(String[] args) {
		/*
		 * declare a int n with value
		 * declare another variable mod
		 * calculate n%2 and read in mod
		 * compare mod value with 0
		 */
		
		int n=11;
		int mod = n%2;
				
		if( mod == 0)
		{
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
