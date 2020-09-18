import java.util.Scanner;
public class Q10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Fareinite:");
		float f=sc.nextFloat();
		
		 double C= 5*(f-32)/9 ;
		 System.out.println("temperature in Celcius:"+C);
		
	}
}