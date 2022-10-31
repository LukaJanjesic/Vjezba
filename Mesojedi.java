package JAVA;

public class Mesojedi extends Animals {
	private static String Classname;
	public Mesojedi (String cn) {
		Classname=cn;
		System.out.printf("");
		
		}
		public static String Classname () {
			return Classname;
		}
		
	public void Food() {
		System.out.println("Meat");
	}
	public void Drink() {
		System.out.println("Sparkling water");
	}
	public void Clean() {
		System.out.println("Depends on an animal");
	}
}


