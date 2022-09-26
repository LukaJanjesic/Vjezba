package JAVA;

public class mulitdemarrays {
	public static void main(String[] args) {
		int firstarray [][]= {{1,2,3,4},{5,6,7,8}};
		int secondarray [][]= {{4,3,2,1},{8,7,6,5}};
		
		System.out.println("First array:");
		display(firstarray);
		
		System.out.println("Second array:");
		display(secondarray);
		
	}
	public static void display(int x[][]) {
		for(int row=0;row<x.length; row++) {
			for(int column=0;column<x[row].length;column++) {
				System.out.print(x[row][column]+ "\t");
			}
			System.out.println();
		}
				
	}

}
