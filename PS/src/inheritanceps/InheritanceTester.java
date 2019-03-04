package inheritanceps;

public class InheritanceTester {
	
	//static Child c = new Child();

	public static void main(String[] args) {
				
		Child c = new Child();
		c.setGid(10);
		System.out.println(c.getGid());
		
		c.setGname("Punit");
		
		System.out.println(c.gname.equals(new String("Punit")));
		

	}

}
