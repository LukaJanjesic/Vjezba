package JAVA;

public class Static {
	public static void main (String[] args) {
		StaticConstructor member1= new StaticConstructor ("Megan","Fox");
		StaticConstructor member2= new StaticConstructor ("Mila","Kunis");
		StaticConstructor member3= new StaticConstructor ("Elsa","Jane");
		
		System.out.println(StaticConstructor.getMembers());
		
		
		
	}
}
