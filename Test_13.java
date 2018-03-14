package programs;

import java.util.Scanner;

public class Test_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner hari=new Scanner(System.in);
System.out.println("Enter a number to draw a pattern");
int rows=hari.nextInt();
System.out.println("Here is your pattern");
for (int i=1;i<=rows;i++)
	{
	int num;
		if(i%2 == 0)
		{
			num=0;
			 for (int j=1;j<=rows;j++)
		{
			System.out.print(num);
			num=(num==0)?1:0;
		}
	}
else
{
	num=1;
	for (int j=1;j<=rows;j++)
	{
		System.out.print(num);
		num=(num==0)?1:0;
	}
}
		System.out.println();
	}
}
}
