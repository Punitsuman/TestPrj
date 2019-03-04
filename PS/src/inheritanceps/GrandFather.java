package inheritanceps;

public class GrandFather {
	
	int gid;
	int gage;
	String gname;
	String gcity;
	
	public GrandFather(int gid, int gage, String gname, String gcity) {
		
		
		super();
		
		System.out.println("GrandFather parameterized constructor");
		this.gid = gid;
		this.gage = gage;
		this.gname = gname;
		this.gcity = gcity;
	}

	public GrandFather() {
		super();
		System.out.println("GrandFather default constructor");
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public int getGage() {
		return gage;
	}

	public void setGage(int gage) {
		this.gage = gage;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGcity() {
		return gcity;
	}

	public void setGcity(String gcity) {
		this.gcity = gcity;
	}
	

}
