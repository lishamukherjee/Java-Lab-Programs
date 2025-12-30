import static java.lang.IO.println;
class ForMultipleOf3
{
	public static void main(String []args)
	{
		printMultiple();
	}
	static void printMultiple()
	{
		for(int i = 1; i <= 10; i++) 
		{ 
           println(3 * i); 
        } 
	}
}
