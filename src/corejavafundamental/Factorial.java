package corejavafundamental;

public class Factorial {

	public static void main(String[] args) {
		
		int num=10;
		System.out.println(findFactorialUsingIteration(num));
		System.out.println(findFactorialUsingRecursion(num));
		
	}
	
	public static int findFactorialUsingIteration(int num) {
		
		int factorial =1;
		while(num>0) {
			factorial=factorial*num;
			num--;
		}
		return factorial;
	}
	
	public static int findFactorialUsingRecursion(int num) {
		
//		base case
		if(num==0 || num==1) {
			return 1;
		}
		
//		recursive step
		return num*findFactorialUsingRecursion(num-1);
		
	}
}
