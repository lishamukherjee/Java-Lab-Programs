import static java.lang.IO.println;
class EvenArray
{
	public static void main(String []args)
	{
		printNumbers();
	}
	static void printNumbers()
	{
		int []a = {10, 15, 20, 25}; 
		for (int x : a)
			{   
		        if (x % 2 == 0) 
                println(x); 
            } 
	}
}
