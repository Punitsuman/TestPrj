package innerclasses;

import com.sun.jna.platform.unix.X11.Display;

public class SuperInnerClassPS {
	
	int i = 23;
	int j = 31;
	static int staint = 1001;
	
	public void displaySIC(){
		InnerClass1 i1 = new InnerClass1(); // No need to create SuperInnerClass obj as InnerClass is member of it.
						
		System.out.println("Inner class static z :"+InnerClass1.z);
		System.out.println("Inner class k :"+ i1.k);
		
		System.out.println("Super class i :"+i);
		System.out.println("Super class j :"+j);
		System.out.println("Super class staint :"+ staint);
		
		
	}
	

	public static void main(String[] args) {
		SuperInnerClassPS sp = new SuperInnerClassPS();
		
		InnerClass1 in1 = sp.new InnerClass1();
		
		in1.display();
		
		System.out.println("Method of super inner class");
		
		sp.displaySIC();
				

	}
	
	class InnerClass1{
		int i = 1;
		int k = 5;
		static final int z = 8;
		public void display(){
			System.out.println("Inner class i :"+this.i);
			System.out.println("Super class i :"+i); //SuperInnerClass i is overridden here
			System.out.println("Super class j :"+j);
			System.out.println("Super class staint :"+ staint);
		}
			
	}
	
	class InnerClass2{
		int i = 2;
		
	}

	public class InnerClass3{
		int i = 1;
		
	}

	
	public class InnerClass4{
		int i = 1;
	}
	
	protected class InnerClass5{
		int i = 1;
	}
	
	protected class InnerClass6{
		int i = 1;
	}

	private class InnerClass7{
		int i = 1;
	}

	
	private class InnerClass8{
		int i = 1;
	}
	
	public abstract static class InnerClass9{
		int i = 1;
	}

	
	public final static class InnerClass10{
		int i = 10;
	}
	

}
