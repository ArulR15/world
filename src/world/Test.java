package world;


public class Test {

	public String reverse(String input) {
		String rev="";

		for (int i = input.length()-1;i>=0;  i--) {
			
		char c = input.charAt(i);
		rev = rev+c;
		
		}
		return rev;
		
	}

	public static void main(String[] args) {
		Test t = new Test();
		String r = t.reverse("arul");
		
		System.out.println(r);
		String r1 = t.reverse("madam");
		
		System.out.println(r1);
		
		String r2 = t.reverse("JARVIS");
		System.out.println(r2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


