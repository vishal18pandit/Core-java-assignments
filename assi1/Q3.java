public class Q3{
	public static void main(String args[]){
	
		int x=5;
		
		int y = x^2 + 3*x - 7;
		System.out.println("value of y="+y);
		
		y = x++ + ++x ;
		System.out.println("value of x="+x +" "+"value of y="+y);
		
		int z = x++ - --y - --x  +  x++;
		System.out.println("value of x="+x+" "+"value of y="+y+" "+"value of z="+z);
		
		boolean p=true;
		boolean q=false;
		boolean r=p && q || !(p || q);
	   System.out.println("r="+r);
	   }
}