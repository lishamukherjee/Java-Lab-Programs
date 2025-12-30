import static java.lang.IO.println;
class Even1To20
{
	public static void main(String []args)
	{
		printEven();
	}
	static void printEven()
	{
		int i=1;
		while (i<=20)
		{
			if (i%2==0)
				println(i);
			i++;
		}
	}
}