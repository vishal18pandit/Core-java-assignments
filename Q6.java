import java.util.*;
public class Q6{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter radius:");
		double r = sc.nextDouble();
		double area= 3.14*r*r;
		System.out.println("area of circle="+area);
		double circum= 2*3.14*r;
		System.out.println("circumference of circle="+circum);
	}
}