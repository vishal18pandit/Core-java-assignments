import java.util.Scanner;
public class Q11{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers to be swapped:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers After swapping :"+a+" "+b);
		
	}
}