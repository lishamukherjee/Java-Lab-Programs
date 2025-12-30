import static java.lang.IO.println;
class Fibonacci
{
	public static void main(String []args)
	{
		printSeries();
	}
	static void printSeries()
	{
		int a = 0, b = 1; 
        for (int i = 1; i <= 5; i++) 
		{     
	       println(a);     
		   int c = a + b;     
		   a = b;     
		   b = c; 
        
	    } 
    }
}
