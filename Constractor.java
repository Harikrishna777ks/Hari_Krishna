package program;

public class Constractor {

	// TODO Auto-generated method stub
		//Constructor
		Constractor()
		{
			System.out.println("This is constructor");
		}
		public static void main(String[] args)
		{
			Constractor H = new Constractor();
		}
	}
	//Constructor Overloading
	Constractor(int a)
		{
			System.out.println(a);
		}
	Constractor(int a, int b)
		{
			System.out.println(a+b);
		}
		public static void main(String[] args)
		{
			Constractor H = new Constractor(10);
			Constractor H1= new Constractor(10,20);
		}
		}
	//Constructor Overloading using THIS function
		Constractor(int a)
		{
			System.out.println(a);
		}
		Constractor(int a,int b)
		{
			this(10);
			System.out.println(a+b);
		}
		Constractor(int a,int b,int c)
		{
			this(10,20);
			System.out.println(a+b+c);
		}
		public static void main(String[] args)
		{
			Constractor H=new Constractor(10,20,30);
		}

		
