package packagep;

public class punit {
	static int si = 10;
	
	public static void main(String[] args) {
		
		char c='a';
		int i = 1000000000;
		int j = 2147483647;
		long m = 2147483648l;
		long l = 1L;
		double d =0.25d;
		System.out.println(i+j+m+si);
		
		System.out.println(c +"..." + l + "...."+ d  );
		
		boolean a = true;
		boolean b = false;
		System.out.println(a&&b);
		
		Test t = new Test();
		System.out.println("1"+t.ch+"2");
		System.out.println(t.db);
		System.out.println(t.in);
		
		int a1 = 1;
		int b1 = 2;
		int c1 = (a1<b1)? 5:10;
		
		long l1 = a1;
		int a2 = (int) l1;
		
		
		System.out.println(c1);
		
		

	}
	
	}
