package program;

import java.util.Scanner;

class Institute 
{
	void name()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to draw a pattern");
		int rows=sc.nextInt();
		System.out.println("Here is your pattern");
		for (int i=1; i<=rows; i++)
		{
			for (int j=i; j>=1; j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
