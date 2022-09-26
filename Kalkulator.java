package JAVA;
import java.util.Scanner;
public class Kalkulator {
      public static void main (String args[]) {
    	  Scanner prvi = new Scanner (System.in);
    	  double fnum, snum, tnum, lnum, answer;
    	 System.out.println("Enter fisrt num");
    	 fnum = prvi.nextDouble();
    	 
    	 System.out.println("Enter second num");
    	 snum = prvi.nextDouble();
    	 
    	 System.out.println("Enter third num");
    	 tnum = prvi.nextDouble();
    	 
    	 System.out.println("Enter fourth num");
    	 lnum = prvi.nextDouble();
    	 
    	 answer = (fnum + snum) *(-fnum)*(tnum -lnum);
    	 System.out.println("Answer is "+ answer);
    	 
      }
}
