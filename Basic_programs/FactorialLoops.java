import java.util.Scanner;

public class FactorialLoops
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int N, factorial = 1;
		N = scan.nextInt();

		for(int i = 2; i <= N; i++)
		{
			factorial = factorial * i;
		}

		System.out.println("Factorial: " + factorial);
	}
}
