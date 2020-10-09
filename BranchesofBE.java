class BranchesofBE{
      public static void main(String args[]){
              String branch="ece";

		switch(branch){
			case "cse":
				System.out.println("the full form is computer science and engr");
				break;
			case "ise":
				System.out.println("the full form is information science and engr");
				break;
			case "ece":
				System.out.println("the full form is electronics and communications");
				break;
			case "cv":
				System.out.println("the full form is civil");
				break;
			case "mech":
				System.out.println("the full form is mechanical");
				break;
			default :
				System.out.println("enter the valid branch");
				break;
	}
}
}