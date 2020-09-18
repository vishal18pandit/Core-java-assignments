import java.util.*;
public class Q7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter marks of five subject=");
		int marks[]=new int[5];
		for(int i=0;i<5;i++){
			marks[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=marks[i];
		}
		System.out.println("total marks="+sum);
		double per=sum/5;
		System.out.println("percentage of marks ="+per+"%");
		
	}
}