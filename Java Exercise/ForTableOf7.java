import static java.lang.IO.println;
class ForTableOf7
{
	public static void main(String []args)
	{
		printTable();
	}
	static void printTable()
	{
		for(int i = 1; i <= 10; i++) 
		{ 
           println("7 x " + i + " = " + (7 * i)); 
       }
	}
}	
