import static java.lang.IO.println;
class DoWhileEven1To10
{
	public static void main(String []args)
	{
		printEven();
	}
	static void printEven()
	{
		int i = 1;
		do { 
              if (i % 2 == 0) 
                 println(i);
				 i++; 
        } 
		while (i <= 10); 
	}
}
