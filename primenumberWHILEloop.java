
public class primenumberWHILEloop {
	public static void main(String[] args) 
	{ 
		int num=7, i=2;
		boolean flag=false;
		while(i<=num/2)
		{
			if(num%1==0) {
				flag=true;
				break;
			}
			i++;
		}
		if(!flag)
				System.out.println( num+ "is not prime number");
			else 
				System.out.println( "The number" + num + " is prime number");
					
				}
		}

