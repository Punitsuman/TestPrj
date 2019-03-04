package innerclasses;

public class InheritedSuperInnerClass extends SuperInnerClassPS {

	public static void main(String[] args) {
		SuperInnerClassPS.main(null);
		
		System.out.println("Calling new methods defined in child class");
		InheritedSuperInnerClass isic = new InheritedSuperInnerClass();
		isic.displayISICI2();
		isic.displayISICI10();

	}
	
	public void displayISICI2(){
		InnerClass2 ic2 = new InnerClass2();
		System.out.println("Default inner class 2 variable accessing from child class: "+ic2.i);
	}

	public void displayISICI10(){
		InnerClass10 ic10 = new InnerClass10();
		System.out.println("final static inner class 10 variable accessing from child class: "+ic10.i);
	}
}
