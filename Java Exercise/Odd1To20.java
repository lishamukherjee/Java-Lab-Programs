import static java.lang.IO.println;
class Odd1To20
{
	public static void main(String []args)
	{
		printOdd();
	}
	static void printOdd()
	{
		int i=1;
		while (i<=20)
		{
			if (i%2!=0)
				println(i);
			i++;
		}
	}
}