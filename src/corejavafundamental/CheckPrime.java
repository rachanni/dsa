package corejavafundamental;

public class CheckPrime {

	public static void main(String[] args) {
		
		int num=90;
		System.out.println(isPrime(num));
		System.out.println(isPrimeEffective(num));
		System.out.println(isPrimeMostEffective(num));
	}
	
//	problem with this approach is we are checking factor upto num -1
//	which is unnecessary b/c factor exists in pair
//	90 ->   (2,45), (3,30), (5,18), (6,15), (9,10)  
//	        after this they will repeat (10,9), (15,6), ...........
//	repetation start after 9 
//	is there any relation b/w 9 and 90 yes 
//	square root of 90 is 9. something 
//	so check till 9 only
	public static String isPrime(int num) {
		
		if(num ==1 || num==0) {
			return "Not Prime";
		}
		
		for(int i=2; i<num; i++) {
			
			if(num % i == 0) {
				return "Not Prime";
			}
		}
		return "Prime";
	}
	
//	problem with this approach is ->
//	1. as we know 2 is only even prime so why check for even number, we need to check only odd number
//	2. if we need to check only odd number then start by 3 and increment by 2
//	   this will significantly reduce number of iteration
//	3. square root return double but we need only integer part so typecast
	
public static String isPrimeEffective(int num) {
		
		if(num == 1 || num==0) {
			return "Not Prime";
		}
		
		double squareRoot= Math.sqrt(num);
		for(int i=2; i<squareRoot; i++) {
			
			if(num % i == 0) {
				return "Not Prime";
			}
		}
		return "Prime";
	}



	public static String isPrimeMostEffective(int num) {
		
		if(num == 1 || num==0) {
			return "Not Prime";
		}
		
		if(num == 2) {
			return "Prime";
		}
		
		if(num % 2 ==0) {
			return "Not Prime";
		}
		
		int squareRoot= (int)Math.sqrt(num);
		for(int i=3; i<=squareRoot; i=i+2) {
			
			if(num % i == 0) {
				return "Not Prime";
			}
		}
		return "Prime";
	}
}
