package inheritanceps;

public class InheritanceTester {
	
	//static Child c = new Child();

	public static void main(String[] args) {
				
		Child c = new Child();
		c.setGid(10);
		System.out.println(c.getGid());
		System.out.println(c.getGname());
		c.setGname("Punit");
		
		System.out.println(c.gname.equals(new String("Punit")));
		
		InheritanceTester it = new InheritanceTester();
		it.varags(1,2,3,4,5);
		it.varags();

	}
	
	public void varags(int... nos){
		System.out.println(nos.length);
		for(int i:nos)
			System.out.println(i);
		
	}

}
