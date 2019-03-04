package packagep;
import java.io.Serializable;


 class InstanceOfPS extends Throwable implements Serializable, Runnable {

	private static final long serialVersionUID = 2L;
	static Integer i = new Integer("10");
	static String  s = new String("Punit");
	static Object  obj= new String("Pushkar");
	static Object  obj1= new Double("1002d");
	
	 int j;
	char c;
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(i.toString());
		sb.append(s);
		sb.append(obj.toString());
		sb.append(obj1.toString());
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
			
		
		if( i instanceof Integer)
		System.out.println("Integer");

		if( s instanceof String)
		System.out.println("String");

		if( obj instanceof String)
		System.out.println("Object");
		
		if(obj1 instanceof Double)
		System.out.println("Object");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
