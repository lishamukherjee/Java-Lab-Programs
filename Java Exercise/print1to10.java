import static java.lang.IO.println;
class Print1To10
{
	public static void main(String []args)
	{
		printNumbers();
	}
	static void printNumbers()
	{
		int i=1;
		while (i<=10)
		{
			println(i);
			i++;
		}
	}
}