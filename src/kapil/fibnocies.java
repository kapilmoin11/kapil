package kapil;

import java.util.Scanner;

public class fibnocies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();
	int a1=0;
	System.out.println(a1);
	int a2=1;
	for(int i=0;i<num;i++)

	{
		int res=a1+a2;
		System.out.println(res);
		a2=a1;
				a1=res;
		}
	}

}
