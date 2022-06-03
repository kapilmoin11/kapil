package kapil;

public class meth1 {

	public static void main(String[] args) {
		System.out.println("main method start");
		int i=1;
		while(i<=10)
		{
			even(i);
			i++;
		}
		System.out.println("main method end");
		

	}
	public static void even(int a)
	{
	if(a%2==0)
		System.out.println("even"+a);

}
}