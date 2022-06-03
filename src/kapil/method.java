package kapil;

public class method {
public static void main(String args[])
{
	int res=fact(9);
	System.out.println(res);

}
public static int fact(int a)
{
	int res=1;
	while(a>0)
	{
		res=res*a;
		a--;
	}
	return res;
}
}
