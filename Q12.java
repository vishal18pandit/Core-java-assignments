import java.util.Scanner;
	public class Q12{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary:");
		double basic=sc.nextDouble();
		double hra;
		double da;
		
		if(basic < 10000){
			hra=0.1*basic;
			da=0.9*basic;
		}else
		{
			hra=2000;
			da=0.98*basic;
		}
		double gs= basic+hra+da;
			System.out.println("Gross salary : "+gs);
		
		
		
	}
}





















