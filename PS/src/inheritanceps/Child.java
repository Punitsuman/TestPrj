package inheritanceps;

public class Child extends Father{
	
int schoolfee;

public Child(int gid, int gage, String gname, String gcity, int salary,
		int schoolfee) {
	super(gid, gage, gname, gcity, salary);
	System.out.println("Child para constructor");
	this.schoolfee = schoolfee;
}

public Child() {
	super();
	System.out.println("Child default constructor");
}


	
}
