import java.util.*;
class Main
{
	static int getSum(int n)
	{
		return (n* (4*n*n + 6 * n-1)/3);
	}
	public static void main(String[] args)
	{
		int n = 2;
		System.out.println("sum = "+getSum(n));
	}
}
