package com.xworkz.innerclass;

public class LocalInnerClass {
	
	//A local inner class is defined within a method, and the usual scope rules apply to it. 
	//It is only accessible within that method, therefore access restrictions (public, protected, package) do not apply.
	
	int outerVariable = 10000;
    static int staticOuterVariable = 2000;
     
    public static void main(String[] args) {
        LocalInnerClass outer = new LocalInnerClass();
        System.out.println(outer.run());
    }
     
    Object run() {
        int localVariable = 666;
        final int finalLocalVariable = 300;
         
        class LocalClass {
            int innerVariable = 40;
             
            int getSum(int parameter) {
                // Cannot access localVariable here
                return outerVariable + staticOuterVariable + 
                       finalLocalVariable + innerVariable + parameter;
            }       
        }
        LocalClass local = new LocalClass();
        System.out.println(local.getSum(5));
        return local;
    }

}
