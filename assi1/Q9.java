import java.util.Scanner;
public class Q9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of days:");
			int days=sc.nextInt();
			int years=days/365;
			int rdays=days%365;
			int months=rdays/30;
			int redays=rdays%30;
			System.out.println(years+" Years  "+months+" Months  "+redays+" Days");
			
		
		
	}  
}