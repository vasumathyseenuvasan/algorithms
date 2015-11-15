import java.util.ArrayList;
import java.util.Arrays;


public class IntegerMax {

	
	public static void main(String args[]){
	
		int n=37;
		boolean isPrime = true;
			//check if n is a multiple of 2
			if(n==2)
				System.out.println("prime");
			else if(n%2==0)
				System.out.println("prime");	
			//if not, then just check the odds
			for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
			isPrime = false;
			}
			
			if(isPrime)
				System.out.println("prime");
			else
				System.out.println("not prime");
			System.out.println("abs"+Math.abs(-2147483648));
			
			System.out.println("divide by zero "+1.0/0.0);
			
			//if('a'>'b')
				System.out.println("compare char value"+ ('b'>'a'));

				System.out.println("div value"+(13/-2));
				System.out.println("mod value"+(-13%64));
	}
	
	
}
