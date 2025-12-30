import static java.lang.IO.println;
class ReverseDoWhile
{
	public static void main(String []args)
	{
		printReverse();
	}
	static void printReverse()
	{
		int num = 123, rev = 0;
		do {
  			rev = rev * 10 + (num % 10);
			num /= 10; 
        }
		while (num > 0); 
          println(rev); 
	}
}
