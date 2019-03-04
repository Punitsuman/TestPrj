package packagep;

public class ClassesPS {
 public static void main(String[] args){
	 
	 InstanceOfPS iops = new InstanceOfPS();
	 System.out.println(iops.toString());
	 System.out.println(iops.j);
	 System.out.println(iops.c);
	 String[] arg={};
	 System.out.println("PSVM");
	 ClassesPS3.main(arg);
	 ClassesPS5.main(arg);
	 
	 SuperClassPS superclassps = new SuperClassPS();
	 T1 t1 = new T1();
	 T2 t2 = new T2();
	 
	 ClassesPS2.i = 5;
	 
	 
 }
	
}

 class ClassesPS2 {
	 
	 int id;
		
		public ClassesPS2(int id){
			this.id = id;
		}
		
		public ClassesPS2(){
			this.id = 1;
		}

	 
	 static int i = 10025;
public int hasCode(){
			return id;
			
		}

public boolean equals(ClassesPS2 cp)
{
  if (this.id - cp.id == 0)
	  return true;	
  return false;
}
}

 class ClassesPS3 {
	
	public static void main(String[] args){
		 System.out.println("PSVM + final class");
		 
	 }


}

abstract class ClassesPS4 {

}
abstract class ClassesPS5 {
	 public static void main(String[] args){
		 System.out.println("PSVM + abstract class");
		 
	 }

}
