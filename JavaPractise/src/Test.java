
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=153;
		int r,sum=0,t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
			
		}
		n=t;
		if(n==sum) {
			System.out.println("Palidrome number");
		}
		else {
			System.out.println("Not palindrome");
		}
	//	System.out.println(sum);
		
		
		
	}

}
