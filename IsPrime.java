package week1.day1;

public class IsPrime {

public static void main(String[] args) {
	
	int n=6;
	boolean isPrime = true;
	
	for (int i = 2; i < n; i++) {
		
		if(n%i == 0) {
			
			isPrime = false;
			
		}
			}
			
if(isPrime == true) {
	System.out.print(n + "N is  Prime");
}else if (isPrime == false){
	System.out.print(n + "N is Not Prime");
}
}
}
