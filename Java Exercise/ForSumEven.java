import static java.lang.IO.println;
class ForSumEven
{
	public static void main(String []args)
	{
		printSum();
	}
	static void printSum()
	{
		int sum = 0; 
		for (int i = 1; i <= 20; i++) 
		{     
	        if (i % 2 == 0)        
				sum += i; 
        } 
        println(sum); 
	}
}
