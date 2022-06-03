package kapil;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		int i=2;
		while(num>0)
		{
			if(num%i==0)
			{
				break;
			}
			i++;
		}
		if(num==i)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}

}
