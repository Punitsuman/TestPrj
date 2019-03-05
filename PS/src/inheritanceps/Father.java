package inheritanceps;

public class Father extends GrandFather{

 int salary;

public Father(int gid, int gage, String gname, String gcity, int salary) {
	super(gid, gage, gname, gcity);
	System.out.println("Father para constructor");
	this.salary = salary;
}

public Father() {
	super();
	System.out.println("Father default constructor");

}

//static method can be overridden
	//@Override
	public static void stadispaly() {
		System.out.println("Static method of Father class");
	}
	
	
	public static void stadispaly(int i) {
		System.out.println("Static parameterized method of Father class");
	}
	
	
}
