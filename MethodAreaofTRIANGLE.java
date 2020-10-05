
public class MethodAreaofTRIANGLE {
	public void area(double b, double h){
		double a=0.5*b*h;
	    System.out.println("area of rectangle is =" +a);
      }
	public static void main(String args[]){
        System.out.println("pgrm to find area of triangle");
        MethodAreaofTRIANGLE ar = new MethodAreaofTRIANGLE();
        ar.area(3.00, 6.50);
        
	}
}
