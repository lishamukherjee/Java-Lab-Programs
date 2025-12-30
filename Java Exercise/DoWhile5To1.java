import static java.lang.IO.println;
class DoWhile5To1
{
	public static void main(String []args)
	{
		printNumbers();
	}
	static void printNumbers()
	{
		int i = 5; 
		do {
			   println(i);    
	           i--; 
		}
		while (i >= 1);
}
}
 
