import static java.lang.IO.println;
class DivisibleBy5
{
	public static void main(String []args)
	{
		printNumbers();
	}
	static void printNumbers()
	{
		for (int i = 1; i <= 50; i++) 
		{     
	        if (i % 5 == 0) 
               println(i); 
        } 
	}
}
