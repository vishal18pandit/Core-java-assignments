

import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lower limit & upper limit= ");

        int low = sc.nextInt();
		int high =sc.nextInt();

        while (low < high) {
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) 
			{
              
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}