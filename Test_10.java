package programs;

import java.util.Scanner;

public class Test_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the rows to draw a pattern");
int rows=scanner.nextInt();
System.out.println("Here is your pattern");
for (int i=1;i<=rows;i++)
{
	for (int j=1;j<i;j++)
	{
		System.out.print(" ");
	}
	for (int j=i;j<=rows;j++)
	{
		System.out.print(j);
	}
	System.out.println();
}
	for (int i=rows-1;i>=1;i--)
		{
		for (int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		{
			for (int j=i;j<=rows;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		}
		}

}
