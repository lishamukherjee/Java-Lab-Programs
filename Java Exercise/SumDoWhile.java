import static java.lang.IO.println;
class SumDoWhile
{
	public static void main(String []args)
	{
		calculateSum();
	}
	static void calculateSum()
	{
		int num = 123, sum = 0;
		do {
			sum += num % 10;
			num /= 10; 
        }
		while (num > 0); 
            println(sum); 
	}
}	