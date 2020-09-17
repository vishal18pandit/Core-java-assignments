import java.util.Scanner;
public class Q13{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter 3 numbers: ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
		
			/*
			if(a > b){
				if(a > c){
					System.out.println("greatest :"+a);
				}
				else
				{
					System.out.println("greatest :"+c);
				}	
			}
			else if(b > c)
			{
				System.out.println("greatest :"+b);
			}
			else{
				System.out.println("greatest :"+c);
			}
		*/



      
   int greater = (b > c) ? ((b > a) ? b : a)  : ((c > a) ? c : a);
   	System.out.println("greatest :"+greater);
   	

   
	}
}