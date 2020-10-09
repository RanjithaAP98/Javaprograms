class Shiftoperator{
	public static void main(String arg[]){
		int a=5;
		System.out.println("The right shift of a:" +(a>>2));
		System.out.println("The left shift of a:" +(a<<1));


		int c=6;
		System.out.println("The right shift of c:" +(c>>1));
		System.out.println("The left shift of c:" +(c<<2));



		//unsigned right shift operator...
		int b= -5;
		System.out.println("The unsigned right shift of b:" +(b>>>2));
	}
}