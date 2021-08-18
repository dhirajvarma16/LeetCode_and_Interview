package LeetCode_Practices;

import java.util.Scanner;

public class NearestPrimeNumber
{
	public boolean isPrime(int number)
	{
		int i, flag = 1;
		for (i = 2; i < number/2; i++)
		{
			if (number % i == 0)
			{
				flag = 0;
				break;
			}
			}
		if (flag == 1)
			return (true);
		else
			return (false);
	}
	public static void main(String args[])
	{
      Scanner in = new Scanner(System.in);
		NearestPrimeNumber ob = new NearestPrimeNumber();
		int i, m, num, temp = 0;
		System.out.println("Enter a number");
		num = in.nextInt();
		for (i = num - 1; i >= 1; i--)
		{
			if (ob.isPrime(i))
			{
				temp = i + 2;
				if (ob.isPrime(temp))
				{
					System.out.println("nearest prime pair is");
					System.out.println(temp);
					break;
				}
			}
		}
		for (i = num;; i++)
		{
			if (ob.isPrime(i))
			{
				m = i - 2;
				if (ob.isPrime(m))
				{
					if (temp != i) {
						System.out.println(m);
						break;
					}
					else
					{
						break;

					}
				}
			}
		}
	}
}
