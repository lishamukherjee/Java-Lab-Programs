import static java.lang.IO.println;
class CountDigits
{
	public static void main(String []args)
	{
		CountDigits();
	}
	static void CountDigits()
	{
		int num = 12345, count = 0; 
		while (num > 0) 
		{
			count++;
			num/=10;
		}
		println(count);
	}
}