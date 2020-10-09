public class Hikes {

      public static void main(String args[]) {
	int dailywage=4;
	int number_of_days=5;
	int salary= number_of_days++ * --dailywage * dailywage++ * number_of_days--;
	salary=-dailywage;
	System.out.println(dailywage + " " +number_of_days + " " +salary);
	}
}	