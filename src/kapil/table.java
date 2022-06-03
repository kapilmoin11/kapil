package kapil;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(i+"*"+i+"="+(num*i));
}
	}

}
