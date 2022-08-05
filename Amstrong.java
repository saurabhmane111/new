//amstrong number

import java.util.Scanner;

class Amstrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int m=n;
		int count=0;
		while (n>0)
		{
			count++;
			n=n/10;
		}
		int sum=0;
		while (temp>0)
		{
			int a=temp%10;
			sum=sum+(int)Math.pow(a,count);
			temp=temp/10;
		}
		if (sum==m)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not a amstrong number");
		}
	}
}
