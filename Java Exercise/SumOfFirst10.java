import static java.lang.IO.println;
class SumOfFirst10
{
	public static void main(String []args)
	{
		calculateSum();
	}
	static void calculateSum()
	{
		int i=1, sum=0;
		while (i<=10)
		{
			sum +=i;
			i++;
		}
		println("Sum ="+sum);
	}

}