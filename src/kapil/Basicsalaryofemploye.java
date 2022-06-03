package kapil;

import java.util.Scanner;

public class Basicsalaryofemploye {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employe salary");
		double sal=sc.nextDouble();
		double Gs;
		double hra;
		double da;
		if(sal<=10000)
		{
			hra=sal*20/100;
			da=sal*80/100;
			Gs=sal+hra+da;
			System.out.println("gross salary"+Gs);
		}
		else if(sal<=20000)
		{
			hra=sal*25/100;
			da=sal*90/100;
			Gs=sal+hra+da;
			System.out.println("gross salary"+Gs);
		}
		else
		{
			hra=sal*30/100;
			da=sal*95/100;
			Gs=sal+hra+da;
			System.out.println("gross salary"+Gs);
		}
	}

}
