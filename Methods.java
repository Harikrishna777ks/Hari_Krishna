package program;

public class Methods {
//Method 
	int a = 10, b = 20;
	
	void display()
	{
		System.out.println("Hari");
	}
		
	public static void main(String[] args) {
	
		Methods H = new Methods();
		
		H.display();
		System.out.println(H.a);
		System.out.println(H.b);
	}
//Method Overloading using different data type
		void display(int a,int b)
		{
			System.out.println(a+b);
			
		}
		void display(String a)
		{
			System.out.println(a);
			
		}
		void display(int a, String b)
		{
			System.out.println(a+" "+b);
			
		}
		public static void main(String[] args)
		{
			Methods H= new Methods();
			H.display(10, 20);
			H.display("Hari");
			H.display(10,"Hari");
		}
	}
}
//Method Overloading
 void add(int a ,int b)
 {
	 System.out.println(a+b);
 }
 void add(int a ,int b, int c)
 {
	 System.out.println(a+b);
 }
 public static void main (String [] args)
 {
	 Methods H = new Methods();
	 
	 H.add(11, 16);
	 H.add(10, 20, 30);
 }
}
//Method Overloading using main Method
public static void main (int a,String b)
{
	System.out.println(a+" "+b);
}
	public static void main (String[] args)
	{
		main(10, "Hari");
	}
}
//Method using Anonymous object
	int a=100, b=100;
	void display()
{
	System.out.println(a+b);
}
	public static void main(String[] args)
{
	Methods H=new Methods();
	System.out.println(new Methods().a);
	System.out.println(new Methods().b);	
}
}
