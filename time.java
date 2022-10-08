package JAVA;

  class time {
	  public static void main(String[] args) {
		  time2 time2Object = new time2();
		  System.out.println(time2Object.toMilitary());
		  time2Object.setTime(23, 45, 5);
		  System.out.println(time2Object.toMilitary());
		  System.out.println(time2Object.toString());
	  }

}
