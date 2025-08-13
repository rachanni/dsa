package comparable;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("A".compareTo("Z"));
		
//		a comes after A in term of ASCII so it should return +ve.
		System.out.println("a".compareTo("A"));
//		all lowercase char come after upper case so it should return +ve 
		System.out.println("a".compareTo("Z"));
		
		System.out.println("Z".compareTo("A"));
		System.out.println("Z".compareTo("Z"));
		
	}
}
