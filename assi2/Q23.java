import java.util.*;

public class Q23 {

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
			
		 
			
			System.out.println("no. after reversing:");
			for(int i=n-1;i>=0;i--)
			{
				System.out.print(" "+arr[i]);
			}
	
	}
}