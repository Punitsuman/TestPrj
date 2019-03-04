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

	
}
