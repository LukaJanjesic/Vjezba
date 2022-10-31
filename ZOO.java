package JAVA;

public class ZOO {
	public static void main(String[] args) {
		Animals[] Mesolist= new Animals [1];
		Animals[] Biljolist= new Animals [1];
		Lion L = new Lion ();
		Zebra Z = new Zebra ();
		
		Mesolist[0]=L;
		Biljolist[0]=Z;
		for(Animals n: Mesolist) {
		n.Name();
		}
		for(Animals f: Mesolist) {
		f.Food();
		}
		for(Animals d: Mesolist) {
		d.Drink();
		}
		for(Animals c: Mesolist) {
		c.Clean();
		System.out.println("  ");
		}
		for(Animals n: Biljolist) {
			n.Name();
		}
		for(Animals f: Biljolist) {
		f.Food();
		}
		for(Animals d: Biljolist) {
		d.Drink();
		}
		for(Animals c: Biljolist) {
		c.Clean();
		}
					
	}
		
}



