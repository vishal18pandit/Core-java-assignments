import java.util.*;
public class Q15{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter your gender (m/f) :");
			char g=sc.next().charAt(0);
			System.out.println("Enter your age : ");
			int age=sc.nextInt();
			if(age>=18 && (g=='F'||g=='f'))
			{
					System.out.println(" you are eligible for marriage");
			}
			else if(age>=21 && (g=='M'||g=='m'))
			{
					System.out.println(" you are eligible for marriage");
			}
			else{
					System.out.println(" you are not eligible for marriage");
			
			}
	} 
}