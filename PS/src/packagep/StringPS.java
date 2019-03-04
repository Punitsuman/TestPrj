package packagep;

public class StringPS {
	
	String s1 = "Punit";
	String s2 = "PunitS";
	
	String s3= new String("Punit");
	String s4= new String("PunitS");

	
	public void test(){
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4));
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		StringPS ps = new StringPS();
		
		ps.test();
		

	}

}
