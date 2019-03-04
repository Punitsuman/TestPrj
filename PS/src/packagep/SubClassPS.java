package packagep;

public class SubClassPS extends ClassesPS2{
	
	int id;
	
	public SubClassPS(int id){
		super(id);
	}
	
	public SubClassPS(){
		super();
	}

	
	
	public static void main(String[] args) {
		System.out.println(i);
		
		SubClassPS p = new SubClassPS(1001);
		SubClassPS q = new SubClassPS(1002);
		p.i = 5; 
		
		
		System.out.println(i);
		
		System.out.println(p.hashCode());
		System.out.println(p.equals(q));

	}

}