import java.util.Scanner;

public class Q8{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principle amount:");
		int p=sc.nextInt();
			System.out.println("Enter rate of interest:");
		float i=sc.nextFloat();
			System.out.println("Enter time in years:");
		float t=sc.nextFloat();
		
		double si=p*i*t/100;
			System.out.println("simple interest:"+si);
	
		
	}
}