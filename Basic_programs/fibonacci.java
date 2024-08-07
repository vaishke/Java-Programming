import java.util.Scanner;

public class fibonacci
{
	public static void main(String[] args)
	{
		int a = 0, b = 1;
		int N;
		int sum;
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		
		for(int i = 1; i <= N - 2; i++)
		{
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}

	}
}
