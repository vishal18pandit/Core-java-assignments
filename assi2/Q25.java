import java.util.*;
class Q25{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int n = sc.nextInt();
		System.out.println("Enter elements in array");
		int ar[] = new int[n];
		int sumOdd=0;
		int sumEven=0;
		for(int i = 0; i<=n-1;i++)
		{
			ar[i] = sc.nextInt();
		}
		for(int i = 0; i<=n-1;i++)
		{
			if(ar[i]%2==0)
			{
				sumEven = sumEven + ar[i];
			}
			else
			{
				sumOdd = sumOdd + ar[i];
			}
		}
		System.out.println("Sum of Even Numbers = "+sumEven);
		System.out.println("Sum of Odd Numbers = "+sumOdd);
		
	}
}
