import static java.lang.IO.println;
class DoWhile1To5
{
	public static void main(String []args)
	{
		printNumbers();
	}
	static void printNumbers()
	{
		int i = 1; 
		do{
			println(i);
			i++; 
		}
		 while (i <= 5); 
	}
}
    

