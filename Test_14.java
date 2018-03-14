package programs;

import java.util.Scanner;

public class Test_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner hari=new Scanner(System.in);
System.out.println("Enter your rows to draw a pattern");
int rows=hari.nextInt();
System.out.println("Here is your pattern");
for (int i=1;i<=rows;i++)
{
	for (int j=1;j<=rows-i;j++)
	{
		System.out.print(1);
	}
	for (int j=1;j<=i;j++)
	{
		System.out.print(i);
	}
	System.out.println();
}
	}

}
