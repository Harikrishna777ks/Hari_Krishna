package programs;

import java.util.Scanner;

public class Test_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner hari=new Scanner(System.in);
System.out.println("Enter the rows to draw a pattern");
int rows=hari.nextInt();
System.out.println("Here is your pattern");
for (int i=1;i<=rows;i++)
{
	for (int j=1;j<=i;j++)
	{
		if (j%2==0)
		{
		System.out.print(0+" ");
	}
		else
		{
	System.out.print(1+" ");
}
	}
System.out.println();
}
	}
}
