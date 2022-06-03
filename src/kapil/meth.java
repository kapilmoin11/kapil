package kapil;

public class meth {

	public static void main(String[] args) {
		System.out.println("main method start");
		add(10,20);
		add(90,20);
		System.out.println("main method end");
		

	}
	public static void add(int a,int b)
	{
		System.out.println("Add method ");
		System.out.println(a+b);
	}

}
