import java.util.*;

public class Q21 {

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("please enter no of elements:");
			
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("please enter elements:");
			for(int i=0;i<=n-1;i++)
			{
				arr[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<=n-1;i++)
			{
				
				sum=sum+arr[i];
			
			}
			double avg=sum/(n-1);
			System.out.println("sum is: " +sum+" Average is: "+avg);
			
	
	}
}